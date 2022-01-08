#include <stdio.h>

int main(int argc, char*argv ){
	int x=3, i=0;
	for(i=0; i<5; i++){
	printf("x=%d\n",x);
	x++;
	if(x==5){
		printf("Hemos llegado al valor de 5\n");
	}
	
	}
return(0);
}

