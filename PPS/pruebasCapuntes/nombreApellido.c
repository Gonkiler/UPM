#include <stdio.h>
#include <string.h>
char completo[80];
char nombre[32]="Gonzalo";
char apellido[32]="Poza Gonzalez";

int main(){
	strcpy(completo,nombre);
	strcat(completo, " ");
	strcat(completo, apellido);
	printf("El nombre completo es: %s\n",completo);

return 0;
}
