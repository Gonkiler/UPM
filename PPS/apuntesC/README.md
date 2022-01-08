# Intro a C

Tipos básicos C
----------------

Char -> 1 byte -> 'a'
int -> enero -> 11,-12	sizeof(int)
float -> 4 bytes
double -> 8 bytes

-> void
----------------

Modificaciones

long/short --> int
ej: long double
singed/unsigned --> char/int

long long

-> Ámbito, visibilidad (scope) 
-> Modificadores 

	IMPORTANTE -> 1 0 1 1 [] [] [] []	el signed/unsigned da valores a los bits de los números

signed char 
unsigned char 

ej: 
unsigned int i;
	i=30;
	while (i>=0){
		i=15;
	}


Para iniciar en C, miramos los comandos, operaciones y asignaciones principales del lenguajes

Operadores Aritméticos:

+ - * / %

Ejemplos

Char, int   /   7/3 -> 2
	    /   7%3 -> 1

float double	7.0/3.0 -> 2.333...

float x
int a=7, b=3;

x=a/b; -> x vale 2.00

x=a/3.0; -> x vale 2.333...

MEJOR:  x=float(a)/3.0; /* CASTING */

Todos se pueden combinar con una asignación :=
x-=20; <=> x=x-2;
saber más operadores bit a bit.

Operadores de Comparación:

(Cuidado con comparar tipos (modificadores) diferentes)
Debemos comparar cosas del mismo tipo
	== igualdad
	!= distinto
	< menor
	<= menor igual
	> mayor
	>= mayor igual

(a<b)
7<3 -> 0
7>3 -> 1

No hay variables booleanas como tal, devuelven 1 o 0 si es cierto o no.
Se pueden almacenar en variables: a=(7<3);

Operadores Lógicos:

	&& y
	|| o
	! no

algo distinto a 0 -> verdadero
algo igual a 0 -> falso

parsimariosos, siempre comparan 2 elementos

(XXX)&&(XXX) si la primera expresión es = 0, entonces pasaría.

Si poner ! delante de un número, te devuelve 0;
!7 = 0.  !0 = 1

IF

if(condición){
	sentencia
}

if(){
	......
}else{
	......
}

ej: if (a=5) sentencia; -> devuelve verdadero como una asignación, pero la idea sería hacer a ==5, ya que al ser una asignación, daría verdadero siempre y sería un bucle infinito.

while()sentencia;
while(expresión)
	{	};
	mira si la expresión da 0 o distinto de 0.
	Con a=5 -> bucle infinito
	
do{	}while(expresión):

for (expresión1; expresión2; expresión3)
	{	}
	
	expresión1 -> se ejecuta la primera
	expresión2 -> se ejecuta la segunda
	expresión3 -> se ejecuta la tercera

Con los bucles existe
	continue -> deja de realizar las sentencias del cuerpo del bucle y nos lleva a la condición del bucle
	break -> termina el bucle
	
Punteros:
	int a,b 	a memoria
			[	]
			^posición de la memoria
			&a es la posición de memoria que ocupa la variable a
	int *c; -> dirección de un puntero, le espera que el valor de c sea una dirección de memoria.
		c=&a;
	---------
	
	int *c;	hemos hecho c=&a;
	c=&a;
	a=5;
	printf("%d\n",*c); imprime 5
		
		* y & -> interpreta lo que esté guardado en la dirección de memoria y lo usa como el tipo de la variable de la cual es puntero
		*&a -> saca un int que es del tipo a.
		
	*c +=3;
	printf("%d\n", a) Imprime 8
	
Funciones:

->nombre()
->Prototipo
	---> tipos devueltos siempres o void o un puntero (tipoSimple)
	tipoDevuelto nombre(tipos de argumentos);
-> Tipo devuelto nombre(	,	,	)
	{
		Cuerpo de función código
	}
-> Las variables son locales
-> Los argumentos se pasan por valor, no se puede por referencia.
	nombre(), aunque lleve argumentos

/*tenemos a y b, intercambiar sus valores*/
int a,b;
intercambiar(a,b);

No se habrían cambiado los valores de a y b.
--------------------------------------------

void intercambiar (int x, int y){
	int z;
	z=x, x=y, y=z;
}

Hay que pasarlos por referencia -> pasar los punteros.

void intercambiar(int *x, int *y){
	int z;
	z=*x; *x=*y; *y=z;
}

y en la llamada, habría que poner:
	intercambiar (&a,&b);
			dirección de memoria como puntero
-> Todos los punteros ocupan lo mismo, tienen el mismo tamaño.
No se puede int *c; *c=7;
	declarar puntero y asignar un valor. Antes de usar un puntero habrá que darle una dirección, y luego se puede asignar y operar.
	
	float x;
	int* c=&x;

olvido de antes
---------------

operadores ++ y --

a++ postincremento
++a preincremento
a-- postdecremento
--a predecremento

int a =3
    a++;
se puede ejecutar con int y char.
---------------

Punteros:

puntero p
p+1	p++
p-2	p--

int *p; p=________;
p+3 -> p+3 sizeof(int)

-> se pueden comprar punteros (del mismo tipo)
	p++ incrementaría el sizeof(---) del tipo de p

Arrays:

Es un tipo derivado
-> agrupar "cosas" del mismo tipo
la declaración:
	float x[numero] = {0.1, 3.1, 2.1};
	tipo  nombre variable  corchetes
	(solo se puede declarar el array en el inicio del array, como ahora, pero sino no se podría)
si no se inicializa, podría ser el contenido cualquier cosa

	x[0]=0.1
	x[1]=3.1
	x[2]=2.1

arrays múltiples -> a[3][6]

int a[4]={0, 1, 2, 3}
a es un puntero(constante)
	*(a+1) = a[1]
a[300]	puede ser que el programa no tenga acceso a esa posición de memoria.

int y[];
char c[] -> inamovible, cte.
chat *d -> se puede cambiar.	(son iguales)

Cadenas o Strings: punteros de char

char c[10]={'H','o','l','a',0} -> el caracter 0 ó '\0' es un caracter que siempre es 0 y significa fin de cadena.
^
|	iguales
|
v
char c[10]="Hola";
printf("%c\n,c[2]");
	imprime un único caracter, en este caso c[2]=1
printf("%s\n",c);
	imprime un string, desde el primer caracter hasta que llegue el fin de cadena
char *a; también es una cadena o string, con el mismo funcionamiento

olvidado:
---------
char a = 'f';	(%c caracter %d digito)
	printf("%c %c\n", a+3, a+255);
		%d %d 
switch case
int **p;


Memoria dinámica
-----------------

->	int a[30],x; estática
