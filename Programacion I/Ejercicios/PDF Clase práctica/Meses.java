import java.util.Scanner;
public class Meses
{
  public static void main(String[] args)
  {
    System.out.println("Introduce un mes en número: ");
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
        System.out.println("Este mes tiene 31 días");
        break;
      case 4:
      case 6:
      case 9:
      case 11:
        System.out.println("Este mes tiene 30 días");
      break;
      case 2: // Aquí hay que tener en cuenta si febrero es bisiesto o no, es decir, hay que preguntar el año
      {System.out.println("Tu mes es Febrero, en que año te quieres basar?");
        int año=sc.nextInt();
      if (año%4==0 || año%100==0 || ((año%4==0) && (año%100==0) && !(año%400==00))) //condicion para que no sea bisiesto
      {
        System.out.println("Este mes tiene 28 días");
          break;
      }
      else
      {
        System.out.println("Este mes tiene 29 días, ¡es de un año bissiesto!");
          break;
      }
      }
      default: System.out.println("No hay un mes asociado a ese número");
    }
  }

}