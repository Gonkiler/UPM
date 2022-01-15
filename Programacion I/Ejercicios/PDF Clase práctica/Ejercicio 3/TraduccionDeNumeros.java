import java.util.Scanner;
public class TraduccionDeNumeros
{
  public static void main(String[] args)
  {
    System.out.println("Inseta un número menor de 10");
    Scanner sc=new Scanner(System.in);
    int numero=sc.nextInt();
    if (numero>=10)
    {
      System.out.println("ERROR");
    }
    else
    {
      switch (numero)
      {
        case 1: System.out.println("Uno");
        break;
        case 2: System.out.println("Dos");
        break;
        case 3: System.out.println("Tres");
        break;
        case 4: System.out.println("Cuatro");
        break;
        case 5: System.out.println("Cinco");
        break;
        case 6: System.out.println("Seis");
        break;
        case 7: System.out.println("Siete");
        break;
        case 8: System.out.println("Ocho");
        break;
        case 9: System.out.println("Nueve");
        break;
        default: System.out.println("ERROR");
      }
    }
  }
}
