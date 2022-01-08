#include <stdio.h>
#include <stdlib.h>


//n=argv[1] proporciona el número de líneas

//los siguientes n argumentos, proporcionan el número de floats en cada línea

int main(int argc, char *argv[]){

	int n, i;
	float **a;
//obtener n y comprobar que hay argumentos necesarios
//	int n = atoi(argv[1]);	está mal porque lo llamamos sin argumentos falla
	if(argc>1){
		n=atoi(argv[1]); //aquí funciona porque sabemos uqe existe 
	}
	else{
		fprintf(stderr, "tiene que tener argumentos\n");
		exit(1);	
	}
	if(argc!=n+2){
		fprintf(stderr, "nnumero de argumentos no válido\n");
		exit(2);
	}
//parte principal
	a=(float**) calloc(n,sizeof( float*));
	
// comprobar que hemos obtenido la memoria 

//ejercicio
//comprobar que es distinto de null, sino mandar un error

	for(i=0; i<n; i++){
		
		a[i] = (float*)malloc(atoi(argv[i+2] * sizeof(float)));
		//ya podemos usar, falta comprobar memoria
		
		//un uso cómodo 	*(a[i] + j)
	}




//Liberar Memoria	primero free (a[i]) luego free(a)

exit(0);

}



