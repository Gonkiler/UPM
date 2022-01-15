import java.util.Scanner;
public class InicioDeSesion
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("¿Qué quieres hacer?");
    System.out.println("1) Crear una cuenta");
    System.out.println("2) Iniciar Sesión");
    int accion = sc.nextInt();
    switch (accion)
    {
      case 1:
      {
        double contraseña1=1, contraseña2=2;
        System.out.println("WORK IN PROGRESS");
        while ((contraseña1)!=(contraseña2))
       //   String hola = "hola";
       // hola.equals("adios");
        {
        System.out.println("Introduce tu numero de matricula");
        double usuario = sc.nextDouble();
        System.out.println("Introduce tu contraseña");
        contraseña1=sc.nextDouble();
        System.out.println("Vuelve a introducir tu contraseña");
        contraseña2=sc.nextDouble();
        }
        break;
      }
      case 2:
      {
        System.out.println("WORK IN PROGRESS");
      }
      default:
      {
        while (accion<1 || accion>2) //Bucle para cambiar a valor
        {
          System.out.println("ERROR");
          System.out.println("Vuelve a introducir el valor de acción:");
          System.out.println("1) Crear una cuenta");
          System.out.println("2) Iniciar Sesión");
          accion = sc.nextInt();
        }
      }
      
    }
  }
}
    