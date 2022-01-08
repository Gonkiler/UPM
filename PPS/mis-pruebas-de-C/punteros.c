/* librería estándar de entrada salida */
#include <stdio.h>
/* para usar atoi, atof aunque es mejor usar strtod*/
#include <stdlib.h>	
int main(int argc, char *argv[])
{
	int i, k;
	float j; // cambiar tipo a double, cambiar más para ver otros tipos.
	unsigned char * p; //*p='a'; //no se puede poner
	p = (unsigned char *) &j;
	for(i = 1; i < argc; i++)
	{
		j = atof(argv[i]); // cambiar ato
		for(k=0;k<sizeof(j);k++) printf(" %02x",p[k]);//p[k] es lo mismo que *(p+k)
		printf("\n");
	}
	/*	aritmética de punteros*/
	printf("Aunque &j = %p y p = %p son iguales\n",&j,p);
	printf("se tiene &j + 1 = %p y p +1 = %p NO son iguales\n",&j + 1,p+1);
/*	curiosidad*/
	j=7.0; p[1]=8;printf("ahora j vale %f\n",j);
	exit(0);
}
/* ejercios:
   Cambiar tipos, float a double.
   Usar strtod para comprobar si los argumentos son números correctos y strings cualesquiera. man strtol
   Hacer que al compilar no dé warnings
   Dependiendo de la arquitectura de la máquina, es mejor recorrer el for en el otro sentido
   Quien quiera saber más, puede sacar los bits. Se deben mirar, entonces, las operaciones de bits & | ~ >> << ^ que funcionan muy bien con números sin signo
*/

/* char **c; c+5 es valor de c + 5sizeof(char *)
*c + 5 es valor de c + 5sizeof(char) */

