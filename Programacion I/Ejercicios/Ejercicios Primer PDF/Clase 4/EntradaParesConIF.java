import java.util.Scanner;
  public class EntradaParesConIF
{
  public static void main(String[] args)
  {
    System.out.print("Introduce un numero entero: ");
   Scanner sc=new Scanner(System.in);
   int numero=sc.nextInt(); //establecer en variable el dato introducido
   if ((numero%2)==0) //si el numero es par, lo imprimo por pantalla
   {
     System.out.print("Tu número es par y es: ");
     System.out.println(numero);
   }
   else // si el numero es impar, lo multiplico por 2 y lo imprimo
   {
     System.out.print("Tu número es impar y su doble es: ");
     System.out.println(numero*2);
   }
  }
}