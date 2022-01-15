import java.util.Scanner;
public class MultiplodeOtro
{
  public static double multiplo (double numero1, double numero2)
  {
   return numero1%numero2;
  }
  public static void main (String[] args)
  {
    System.out.println("Introduce el valor del primer numero: ");
    Scanner sc=new Scanner(System.in);
    double numero1=sc.nextDouble();
    System.out.println("Introduce el valor del segundo numero: ");
    double numero2=sc.nextDouble();
    if ((multiplo(numero1, numero2))==0)
      System.out.println(numero1 + " es multiplo de " + numero2);
    else
      System.out.println(numero1 + " no es multiplo de " + numero2);
  }
}