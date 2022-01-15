import java.util.Scanner;
public class SumaRecursiva
{
  public static void main (String[] args)
  {
    System.out.println("La suma de los dígitos de 15 es: " + sumaRecursiva(158686));
    System.out.println("La suma de los dígitos de 18 es: " + sumaRecursiva(18));
    System.out.println("La suma de los dígitos de 35 es: " + sumaRecursiva(35));
    System.out.println("La suma de los dígitos de 0 es: " + sumaRecursiva(0));
    System.out.println("La suma de los dígitos de -5 es: " + sumaRecursiva(-5));
    System.out.println("La suma de los dígitos de -15 es: " + sumaRecursiva(-15));  // prueba para numeros negativos menores de -10
  }
  public static int sumaRecursiva (int n)
  {
    n=n<0?-n:n; //operador ternario ? = a un if y : = a un else. (Si n menor que 0, devuelve -n, sino devuelve n)
    System.out.print( " [ suma ("+n+") = ");
    int res;
    if ((n<10)&&(n>-10)){
      res =  n;
      System.out.print( n);
    }
    else
    {
      System.out.print( (n%10) + " + ");
      res = (n%10)+sumaRecursiva(n/10);
    }
    System.out.print( "  ] ");
    return res;
  }
}