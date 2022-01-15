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
    
    
    if (accion==1)
    {
      System.out.println("WORK IN PROGRESS");
    }
    if (accion==2)
    {
      System.out.println("WORK IN PROGRESS");
    }
    else
    {
      while (accion<1 || accion>2) //Bucle para cambiar a valor
      {
      System.out.println("ERROR");
      System.out.println("Vuelve a introducir el valor de acción:");
      System.out.println("1) Crear una cuenta");
      System.out.println("2) Iniciar Sesión");
      accion = sc.nextInt();
      }
      if (accion==1)
      {
        System.out.println("WORK IN PROGRESS");
      }
      if (accion==2)
      {
        System.out.println("WORK IN PROGRESS");
      }
    }
  }
}
    