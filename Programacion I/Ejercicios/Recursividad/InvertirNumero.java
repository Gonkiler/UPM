import java.util.Scanner;
public class InvertirNumero
{
  public static void main (String[] args)
  {
    invertir(15);
    System.out.println("");
    invertir(18);
    System.out.println("");
    invertir(35);
    System.out.println("");
    invertir(0);
    System.out.println("");
    invertir(-5);
    System.out.println("");
    invertir(10);
    //System.out.println("El inverso de los dígitos de -15 es: " + invertir(-15)); // prueba para numeros negativos menores de -10
  }
  public static int invertir (int n)
  {
    n=n<0?-n:n; //operador ternario ? = a un if y : = a un else. (Si n menor que 0, devuelve -n, sino devuelve n)
    if ((n<10)&&(n!=0))
    {
      System.out.print((n));
      return n;
    }
    else if (n==0)
    {
      System.out.print((n));
      return n;
    }    
    else
    {
      System.out.print((n%10));
      return((n%10)+invertir(n/10));
    }
  }
}