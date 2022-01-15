import java.util.Scanner;
public class Fibonacci
{
  public static int fibonacci (int posicion)
  {
    if (posicion==0)
    {
      return 0;
    }
    else if (posicion==1)
    {
      return 1;
    }
    else
    {
      return  (fibonacci(posicion-1)+ fibonacci(posicion-2));
    }
  }
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Introduce la posicion del valor de los numeros de Fibonacci");
    int numero=sc.nextInt();
    System.out.println(fibonacci(numero));
  }
}