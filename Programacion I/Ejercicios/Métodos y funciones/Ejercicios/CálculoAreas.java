import java.util.Scanner;
public class CálculoAreas
{
  public static double calculaAreaCirculo(int r)
  {
    return (Math.PI*r*r);
  }
  public static double calculaAreaTriangulo(int b, int h)
  {
    return ((b*h)/2);
  }
  public static double calculaAreaRectangulo(int lado1, int lado2)
  {
    return (lado1*lado2);
  }
  public static void main(String[] args)
  {
    System.out.println("1. Calcular el área del círculo");
    System.out.println("2. Calcular el área del triángulo");
    System.out.println("3. Calcular el área del rectángulo");
    System.out.println("Introduzca su opción: ");
    Scanner sc=new Scanner(System.in);
    int eleccion=sc.nextInt();
    switch (eleccion)
    {
      case 1:
      {
        System.out.print("Introduce el valor del radio");
        int radio=sc.nextInt();
        if (radio<=0)
          System.out.println("ERROR, opción no válida");
        else
        {
          System.out.print("El valor del area es " + calculaAreaCirculo (radio));
        }
        break;
      }
      case 2:
      {
        System.out.print("Introduce el valor de la base");
        int base=sc.nextInt();
        System.out.print("Introduce el valor de la altura");
        int altura=sc.nextInt();
        if ((base<=0)||(altura<=0))
          System.out.println("ERROR, opción no válida");
        else
        {
          System.out.println("El valor del area es "+calculaAreaTriangulo (base,altura));
        }
        break;
      }
      case 3:
      {
        System.out.print("Introduce el valor del primer lado");
        int lado1=sc.nextInt();
        System.out.print("Introduce el valor del segundo lado");
        int lado2=sc.nextInt();
        if ((lado1<=0)||(lado2<=0))
          System.out.println("ERROR, opción no válida");
        else
        {
          System.out.println("El valor del area es "+calculaAreaRectangulo (lado1,lado2));
        }
        break;
      }
      default:
        System.out.println("ERROR, opción no válida");
        break;
    }
  }
}