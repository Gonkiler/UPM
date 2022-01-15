import java.util.Scanner;
public class SuperficieAreaCilindro
{
  public static double areaCirculo (double radio)
  {
    return Math.PI*radio*radio;
  }
  public static double areaRectangulo (double base, double altura)
  {
    return base*altura;
  }
  public static double longitudCircunferencia (double radio)
  {
    return Math.PI*radio*2;
  }
  public static double superficieCilindro (double radio, double altura)
  {
    return 2*areaCirculo (radio)+ areaRectangulo (longitudCircunferencia (radio) ,altura);
  }
  public static void main (String [] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Introduce el valor del radio");
    double radio=sc.nextDouble();
    System.out.println("Introduce el valor de la altura");
    double altura=sc.nextDouble();
    System.out.println(superficieCilindro(radio, altura));
  }
}