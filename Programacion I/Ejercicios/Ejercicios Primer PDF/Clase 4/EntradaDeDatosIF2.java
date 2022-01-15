import java.util.Scanner;
public class EntradaDeDatosIF2
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int numero=sc.nextInt();
    if ((numero%2)==0)
      {
      System.out.print("El número es par:");
      System.out.print(numero);
       }
    else
    {
      if ((numero%3)==0)
      {
        System.out.print("El numero es multiplo de tres:");
        System.out.print(numero/3);
      }
      else
      {
        System.out.print("El numero no es par y no es multiplo de 3: ");
        System.out.print(numero*2);
      }
    }
  }
}
  