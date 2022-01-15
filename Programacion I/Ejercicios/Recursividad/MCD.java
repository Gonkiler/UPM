import java.util.Scanner;
public class MCD
{
  public static int mcd (int numero1, int numero2)
  {
    if (numero2==0)
   return numero1;
   else
   return mcd (numero2,numero1%numero2);
  }
  
  /*if (b==0)
   return a;
   else
   return mcd (b,a%b)
   */
  public static void main (String[] args)
  {
    System.out.println(mcd(15,0));
  }
}