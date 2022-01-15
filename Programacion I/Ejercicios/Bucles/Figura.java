import java.util.Scanner;
public class Figura
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for (int i=0; i<n;i++)
    {
      for (int i2=0;i2<=i;i2++)
      {
        System.out.print(".");
      }
      System.out.println("");
    }
  }
}