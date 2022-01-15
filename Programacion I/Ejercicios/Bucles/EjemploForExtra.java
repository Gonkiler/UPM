import java.util.Scanner;
public class EjemploForExtra
{
  public static void main (String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    forl(n);
    System.out.println(forl(n));
  }
  public static int forl(int n)
  {
    int suma=0;
    for (int i=1; i<=n; i++)
    {
      suma=suma+i;
    }
    return suma;
  }
}