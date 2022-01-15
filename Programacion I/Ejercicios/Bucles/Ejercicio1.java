import java.util.Scanner;
public class Ejercicio1
{
  public static void main (String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int factorial=1;
    for(int i=n; i>0; i--) //usamos el i--
    {
      factorial=factorial*i;
    }
    System.out.println(factorial);
  }
}