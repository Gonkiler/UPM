import java.util.Scanner;
public class Ejercicio1ConFuncion
{
  public static void main (String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println(factorial(n));
  }
  public static int factorial (int numero){
    int factorial=1;
    for(int i=1; i<=numero; i++) // usamos el i++
    {
      factorial=factorial*i; //tambien se puede poner como factorial*=i;
    }
    return factorial;
  }
}