import java.util.Scanner;
public class SumaPares
{
  public static void main (String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println(sumaPares(n));
  }
  public static int sumaPares(int n)
  {
    int suma=0;
    for (int i=0; i<=n; i++)
    {
      if (i%2==0)
        suma=suma+i; //suma+=i; es lo mismo que suma=suma+i;
      else //el ese sobra
        suma=suma+0;
    }
    return suma;
  }
}