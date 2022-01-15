import java.util.Scanner;
public class AreaTriangulo
{
  public static double areaTriangulo (double base, double altura)
  {
    return (base*altura)/2;
  }
  public static void main(String[] args)
  {
    System.out.println("Introduce el valor de la base del traingulo: ");
    Scanner sc=new Scanner(System.in);
    double base=sc.nextDouble();
    System.out.println("Introduce el valor de la altura del triángulo: ");
    double altura=sc.nextDouble();
    System.out.println("El valor del area del triangulo es: " + areaTriangulo (base, altura));
  }
}