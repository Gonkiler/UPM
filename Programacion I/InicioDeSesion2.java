import java.util.Scanner;
public class InicioDeSesion2
{
  public static void main (String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Introduzca una acci�n: ");
    System.out.println("1) Inicio de Sesi�n ");
    System.out.println("2) Crear una cuenta ");
    int codigo=sc.nextInt();
    menu(codigo);
  }
  public static void menu(int codigo)
  {
    Scanner sc=new Scanner(System.in);
    String contrase�a = "Hola"; //placeholders para pruebas
    String usuario = "Usuario"; // placeholders para pruebas
    while (codigo!=0407)
    {
      switch (codigo)
      {
        case 1:
        {
          //inicioSesion("", "");
          System.out.println("EN DESARROLLO");
          codigo=0407;
          break;
        }
        case 2:
        {
          //crearCuenta(contrase�a, usuario);
          System.out.println("EN DESARROLLO");
          codigo=0407;
          break;
        }
        default:
        {
          System.out.println("Error de accion! ");
          System.out.println("Introduzca una acci�n: ");
          System.out.println("1) Inicio de Sesi�n ");
          System.out.println("2) Crear una cuenta ");
          codigo=sc.nextInt();
          break;
        }
      }
    }
  }
  public static void inicioSesion(String contrase�a, String usuario);
  {
    Scanner sc=new Scanner(System.in);
    String comprobadorContrase�a="placeholder";
    while(comprobadorContrase�a=="placeholder")
    {
      System.out.println("Introduzca su nombre de Usuario: ");
      usuario=sc.nextLine();
      System.out.println("Introduzca su contrase�a: ");
      contrase�a=sc.nextLine();
      System.out.println("Confirme su contrase�a: ");
      comprobadorContrase�a=sc.nextLine();
      if (contrase�a.equals(comprobadorContrase�a))
      {
        System.out.println("Usuario creado; redirigiendo al inicio de sesi�n.");
      }
      else
      {
        comprobadorContrase�a="placeholder";
        System.out.println("Las contrase�as no coinciden");
      }
    }
    System.out.println("EN DESARROLLO");
  }
    /*public static String crearCuenta(String contrase�a, String usuario);
  {
    System.out.println("EN DESARROLLO");
  } */
}
    