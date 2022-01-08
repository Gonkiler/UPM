#! /bin/bash

#vemos que si el numero de arguemntos es menos de 1, entonces da error
if [ $# -lt 1 ]; then
	echo "minientrega.sh: Error(EX_USAGE), uso incorrecto del mandato. "Success"" >&2;
	echo "minientrega.sh+ El script ha sido invocado sin argumento" >&2;
	exit 65

fi

#si el numero de argumentos que se pasan es mayor a 1, entonces da error
if [ $# -gt 1 ]; then
	echo "minientrega.sh: Error(EX_USAGE), uso incorrecto del mandato. "Success"" >&2;
        echo "minientrega.sh+ El script ha sido invocado con más de un argumento" >&2;
 	exit 65

fi
#Ambos errores de argumentos, salen por la salida 65, aunque divido los casos en 2 (mayor y menor que 1) para mandar mensajes distintos en el error
#se podría hacer en un único comando con -ne, pero no tiene del todo sentido ya que así damos mejores mensajes de error

#opcion de ayuda del programa. Salida ESTANDAR terminación 0.
if [[ $1 == '-h' || $1 == "--help" ]]; then
	echo "minientrega.sh: Uso: el mandato deberá ser minientrega.sh seguido de ID_PRACTICA "
	echo "minientrega.sh: Este programa entrega un programa con nombre ID_PRACTICA si se cumplen ciertas condiciones"
	exit 0
fi


#vamos a comprobar que MINIENTREGA_CONF está definida antes de ejecutar el script
#el -d es para ver si es un directorio
if [[ ! -d $MINIENTREGA_CONF ]]; then
	echo "minientrega.sh: Error, no se pudo realziar la entrega" >&2
	echo "minientrega.sh+ no es accesible el directorio \"$MINIENTREGA_CONF\"" >&2
	#Hago uso del \" para poder sacar lo que es la variable en sí, en vez del nombre de la variable del comentario
	exit 64
fi


#ver si el fichero del directorio es accesible
#vamos a guardarlo en una variable por si pasamos este error
ID_PRACTICA="$MINIENTREGA_CONF/$1"

#El -f es para ver si es un fichero
#Usamos el -r para ver si es legible el fichero
if [[ ! -f  $ID_PRACTICA || ! -r $ID_PRACTICA ]]; then
	echo "minientrega.sh: Error, no se pudo realizar la entrega" >&2
	echo "minientrega.sh+ no es accesible el fichero \"$1\"" >&2
	exit 66
fi

#Hay que cargar las variables del fichero de ID_PRACTICA

#Vamos a ver que dentro de la lista de ficheros a entregar que tiene MINIENTREGA_FICHEROS,
#estos estén en el directorio, que esistan y sean legibles.
#En caso contratio salida de ERROR, status 66

source $ID_PRACTICA

for FILE in $MINIENTREGA_FICHEROS; do
	if [ ! -r $FILE ]; then
		echo "minientrega.sh: Error, no se pudo realiazr la entrega" >&2
		echo "minientrega.sh+ no es accesible el fichero \"$FILE\"" >&2

	fi
done

#comprobar que podemos crear un directorio destino, para ello tenemos que mirar el usuario.
DESTINACION="$MINIENTREGA_DESTINO/${USER}"

#empieza el proceso de 'entrega

#en caso de que el directorio no exista o no pueda crearse, ERROR, exit 73
if [ ! -d $MINIENTREGA_DESTINO ] || ! mkdir  "$DESTINACION" >/dev/null 2>&1 ; then 
	echo "minientrega.sh: Error, no se pudo realizar la entrega" >&2
	echo "minientrega.sh+ no se pudo crear el subdirectorio de entrega en \"$MINIENTREGA_DESTINO\"" >&2
	exit 73
fi


#copiamos los archivos

for FILE in $MINIENTREGA_FICHEROS; do
	cp $FILE "$DESTINACION"
done

#salida correcta del programa
exit 0
