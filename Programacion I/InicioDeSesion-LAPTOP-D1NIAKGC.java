import java.util.Scanner;
public class InicioDeSesion
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("�Qu� quieres hacer?");
    System.out.println("1) Crear una cuenta");
    System.out.println("2) Iniciar Sesi�n");
    int accion = sc.nextInt();
    switch (accion)
    {
      case 1:
      {
        double contrase�a1=1, contrase�a2=2;
        System.out.println("WORK IN PROGRESS");
        while ((contrase�a1)!=(contrase�a2))
       //   String hola = "hola";
       // hola.equals("adios");
        {
        System.out.println("Introduce tu numero de matricula");
        double usuario = sc.nextDouble();
        System.out.println("Introduce tu contrase�a");
        contrase�a1=sc.nextDouble();
        System.out.println("Vuelve a introducir tu contrase�a");
        contrase�a2=sc.nextDouble();
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
          System.out.println("Vuelve a introducir el valor de acci�n:");
          System.out.println("1) Crear una cuenta");
          System.out.println("2) Iniciar Sesi�n");
          accion = sc.nextInt();
        }
      }
      
    }
  }
}
    