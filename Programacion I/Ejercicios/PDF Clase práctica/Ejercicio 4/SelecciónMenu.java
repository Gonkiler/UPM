import java.util.Scanner;
public class SelecciónMenu
{
  public static void main(String[] args)
  {
    System.out.println("REFRANES POPULARES");
    System.out.println("1. Para hacer las cosas con calma");
    System.out.println("2. Para dar ánimos");
    System.out.println("3. Experiencia");
    Scanner sc=new Scanner(System.in);
    int menu = sc.nextInt();
    switch (menu)
    {
      case 1:
        System.out.println("No por mucho madrugar amanece más temprano");
        break;
      case 2:
        System.out.println("A darle que es mole de olla");
        break;
      case 3:
        System.out.println("Más sabe el diablo por viejo que por diablo");
        break;
      default:
        System.out.println("ERROR, valor introducido no válido");
    }
  }
}
