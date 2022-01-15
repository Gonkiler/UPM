import java.util.Scanner;
public class MenorNumero
{
  public static double menor (double numero1, double numero2)
  {
    if (numero1<numero2)
      
      return numero1;
  }
  public static void main (String[] args)
  {
    System.out.println("Introduce el valor del primer numero: ");
    Scanner sc=new Scanner(System.in);
    double numero1=sc.nextDouble();
    System.out.println("Introduce el valor del segundo numero: ");
    double numero2=sc.nextDouble();
    boolean extra;
    if ((menor(numero1, numero2)) == numero1)
      System.out.println(numero1 + " es menor que " + numero2);
    else
      System.out.println(numero1 + " es mayor que " + numero2);
  }
}