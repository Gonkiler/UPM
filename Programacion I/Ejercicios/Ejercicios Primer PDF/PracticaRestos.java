import java.util.Scanner;
public class PracticaRestos
{
  public static void main(String[] args)
  {
    int dato, dato2, resto;
    Scanner sc=new Scanner(System.in);
    dato = sc.nextInt();
    dato2 = sc.nextInt();
    resto= dato%dato2;
    System.out.println("El resto es: " + resto);
      System.out.println("El valor del resto es par?: " + ((resto%2)==0));
  }
}