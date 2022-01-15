import java.util.Scanner;
public class Areacírculo
{
  public static double areaCírculo (double radio)
  {
    return Math.PI*radio*radio;
  }
  public static double volumenCilindro (double radio, double altura)
  {
    return altura*Math.PI*radio*radio; //areaCíruclo(radio)
  }
  public static void main (String[] args)
  {
    System.out.println("Introduce el valor del radio del círculo: ");
    Scanner sc=new Scanner(System.in);
    double radio=sc.nextDouble();
    System.out.println("El valor del area del círculo es: " + areaCírculo (radio));
    System.out.println("Introduce el valor de la altura del cilindro: ");
    double altura=sc.nextDouble();
    System.out.println("El valor del volumen del cilindro es: " + volumenCilindro (radio, altura));
  }
}