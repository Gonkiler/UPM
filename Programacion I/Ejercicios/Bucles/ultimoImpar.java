import java.util.Scanner;
public class ultimoImpar
{
  public static void main (String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println(ultimoImpar(n));
  }
  public static int ultimoImpar(int n)
  {
    int numero=0;
    for (int i=0; i<=n; i++)
    {
      if (i%2!=0)
        numero=i;
    }
    return numero;
  }
}