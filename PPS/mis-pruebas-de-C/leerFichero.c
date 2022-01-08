#include <stdio.h>
#include <stdlib.h>

void mostrar_fichero(FILE*); /* Prototipo de funcion */

int main(int argc, char * argv[]){
	int i;
	FILE * paf;
	
	//parte mostrando stdin
	
	if(argc == 1) mostrar_fichero(stdin);



	exit(0);
}
void mostrar_fichero(FILE *paf)
{
	char linea[81];
	while( fgets(linea,81,paf) != NULL){
		fputs(linea,stdout);
	
	}

}
