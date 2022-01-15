import java.util.Scanner;
public class InicioDeSesion2
{
  public static void main (String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Introduzca una acción: ");
    System.out.println("1) Inicio de Sesión ");
    System.out.println("2) Crear una cuenta ");
    int codigo=sc.nextInt();
    menu(codigo);
  }
  public static void menu(int codigo)
  {
    Scanner sc=new Scanner(System.in);
    String contraseña = "Hola"; //placeholders para pruebas
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
          //crearCuenta(contraseña, usuario);
          System.out.println("EN DESARROLLO");
          codigo=0407;
          break;
        }
        default:
        {
          System.out.println("Error de accion! ");
          System.out.println("Introduzca una acción: ");
          System.out.println("1) Inicio de Sesión ");
          System.out.println("2) Crear una cuenta ");
          codigo=sc.nextInt();
          break;
        }
      }
    }
  }
  public static void inicioSesion(String contraseña, String usuario);
  {
    Scanner sc=new Scanner(System.in);
    String comprobadorContraseña="placeholder";
    while(comprobadorContraseña=="placeholder")
    {
      System.out.println("Introduzca su nombre de Usuario: ");
      usuario=sc.nextLine();
      System.out.println("Introduzca su contraseña: ");
      contraseña=sc.nextLine();
      System.out.println("Confirme su contraseña: ");
      comprobadorContraseña=sc.nextLine();
      if (contraseña.equals(comprobadorContraseña))
      {
        System.out.println("Usuario creado; redirigiendo al inicio de sesión.");
      }
      else
      {
        comprobadorContraseña="placeholder";
        System.out.println("Las contraseñas no coinciden");
      }
    }
    System.out.println("EN DESARROLLO");
  }
    /*public static String crearCuenta(String contraseña, String usuario);
  {
    System.out.println("EN DESARROLLO");
  } */
}
    