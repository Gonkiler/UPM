import java.util.Scanner;
public class Meses
{
  public static void main(String[] args)
  {
    System.out.println("Introduce un mes en n�mero: ");
    Scanner sc=new Scanner(System.in);
    int mes=sc.nextInt();
    switch (mes)
    {
      case 1:
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12:
        System.out.println("Este mes tiene 31 d�as");
        break;
      case 4:
      case 6:
      case 9:
      case 11:
        System.out.println("Este mes tiene 30 d�as");
      break;
      case 2: // Aqu� hay que tener en cuenta si febrero es bisiesto o no, es decir, hay que preguntar el a�o
      {System.out.println("Tu mes es Febrero, en que a�o te quieres basar?");
        int a�o=sc.nextInt();
      if (a�o%4==0 || a�o%100==0 || ((a�o%4==0) && (a�o%100==0) && !(a�o%400==00))) //condicion para que no sea bisiesto
      {
        System.out.println("Este mes tiene 28 d�as");
          break;
      }
      else
      {
        System.out.println("Este mes tiene 29 d�as, �es de un a�o bissiesto!");
          break;
      }
      }
      default: System.out.println("No hay un mes asociado a ese n�mero");
    }
  }

}