import java.util.Scanner;
public class FibonacciSimplificado
{
  public static int fibonacci (int posicion)
  {
    int res;
    if ((posicion==0)||(posicion==1))
    {
      res = posicion;
    }
    else
    {
      res =  (fibonacci(posicion-1)+ fibonacci(posicion-2));
    }
    return res;
  }
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Introduce la posicion del valor de los numeros de Fibonacci");
    int numero=sc.nextInt();
    System.out.println(fibonacci(numero));
  }
}