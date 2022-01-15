import java.util.Scanner;
public class Ordenación
{
  public static void main (String[] args)
  {
    System.out.println("Introduce 3 valores para ");
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int y=sc.nextInt();
    int z=sc.nextInt();
    if ((x>y)&&(x>z))
    {
      if ((y>z))
        System.out.println(x + ", " + y + ", "+ z);
      else
        System.out.println(x + ", " + z + ", "+ y);
    }
    else
    {
      if ((y>z)&&(y>x))
      {
        if(z>x)
          System.out.println(y + ", " + z + ", "+ x);
        else
          System.out.println(y + ", " + x + ", "+ z);
      }
      else
      {
        if (y>x)
          System.out.println(z + ", " + y + ", "+ x);
        else
          System.out.println(z + ", " + x + ", "+ y);
      }
    }
  }
}