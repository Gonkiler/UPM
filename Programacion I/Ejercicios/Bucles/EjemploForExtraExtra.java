import java.util.Scanner;
public class EjemploForExtraExtra //sin usar for
{
  public static void main (String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    sumaN(n);
    System.out.println(sumaN(n));
  }
  public static int sumaN (int n)
  {
    int res;
    if(n==1)
      res = n;
    else
      res = n + sumaN(n-1);
    return res;
  }
}