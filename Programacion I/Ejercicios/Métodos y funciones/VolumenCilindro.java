import java.util.Scanner;
public class VolumenCilindro
{
  public static double volumenCilindro (double radio, double altura)
  {
    return altura*Math.PI*radio*radio; //areaCíruclo(radio)
  }
  public static void main (String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Introduce el valor del radio del cilindro: ");
    double radio=sc.nextDouble();
    System.out.println("Introduce el valor de la altura del cilindro: ");
    double altura=sc.nextDouble();
    System.out.println("El valor del volumen del cilindro es: " + volumenCilindro (radio, altura));
  }
}