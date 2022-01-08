/* Basado en C Pocket Reference  Editorial O'REILLY     */

/* Lee las primeras líneas de un fichero de texto y las muestra por la salida estándar *
*  Uso: leyendounfichero fichero                                                       */

#include <stdio.h>
#define LINEAS	20   /* Directivas de preprocesado.    */

void mostrar_pagina(FILE *); /* Prototipo de función */

int main(int argc, char *argv[]) /* int main siendo función principal, se pasan como parámetros un caracter char y un int.  */
{
	FILE *paf; int codigo_salida = 0; /* declaración de variables con una asignación*/
	
	if(argc != 2)
	{
		fprintf(stderr,"Uso: leyendounfichero nombredefichero\n");
		/*fprintf es una manera de sacar por pantalla mediante una sentencia compuesta, es igual que printf pero tiene mas posibilidades de hacer cosas
		stderr siginifica que se imprime el mensaje por el terminal */
		codigo_salida = 1;
	}
	else if( ( paf = fopen(argv[1],"r") ) == NULL  ) /*viendo si el caracter es le que es*/
	{
		fprintf(stderr,"Error abriendo el fichero\n");
		codigo_salida = 2;
	}
	else
	{
		mostrar_pagina(paf); /*llamadas a funciones mostrar pagina, y a fclose*/
		fclose(paf);
	}
	return codigo_salida;
}
void mostrar_pagina(FILE *paf)
{
	/*variables locales*/
	int cuenta = 0;
	char linea[81];
	
	while(cuenta < LINEAS && fgets(linea,81,paf) != NULL )
	{
		fputs(linea,stdout); /*saca el fichero por la fuente de salida estandar*/
		cuenta++;
	}
}

