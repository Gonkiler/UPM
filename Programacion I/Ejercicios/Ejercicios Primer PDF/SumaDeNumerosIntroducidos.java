import java.util.Scanner;
public class SumaDeNumerosIntroducidos
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Introduce el valor para el primer numero: ");
    int Numero1=sc.nextInt();
    System.out.println("Introduce el valor para el segundo numero: ");
    int Numero2=sc.nextInt();
    System.out.println("La suma de los numeros introducidos es: " + (Numero1+Numero2));
  }
}