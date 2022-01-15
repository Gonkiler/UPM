import java.util.Scanner;
public class PracticaIncrementos
{
  public static void main(String[] args)
  {
    int dato, dato2;
    Scanner sc=new Scanner(System.in);
    System.out.println("Introduce el valor para el numero: ");
    dato = sc.nextInt();
    dato2=++dato;                    //el preincremento tiene preferencia sobre la asignacion, pero el postincremento tiene menos preferencia que la asignación.
      System.out.println("Su numero incrementado es: " + (dato2));
      System.out.println("Su numero incrementado es: " + (dato));
  }
}