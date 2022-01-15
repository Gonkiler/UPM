import java.util.Scanner;
public class Ordenación
{
  public static String orden (int x, int y, int z)
  {
    int numero1=0, numero2=0, numero3=0;
    if ((x>=y)&&(x>=z))
    {
      numero1=x;
      if ((y>=z))
      {
        numero2=y;
        numero3=z;
      }
      else
      {
        numero2=z;
        numero3=y;
      }
    }
    if ((y>=x)&&(y>=z))
    {
      numero1=y;
      if ((x>=z))
      {
        numero2=x;
        numero3=z;
      }
      else
      {
        numero2=z;
        numero3=x;
      }
    }
    if ((z>=y)&&(z>=x))
    {
      numero1=z;
      if ((y>=x))
      {
        numero2=y;
        numero3=x;
      }
      else
      {
        numero2=x;
        numero3=y;
      }
    }
    String t = (""+numero1 + ", " + numero2 + ", " + numero3);
    return t;
  }
  public static void main(String[] args)
  {
    System.out.println("El orden de mayor a menor de los numeros (20, 5, 10) es: " + orden(20,5,10));
    System.out.println("El orden de mayor a menor de los numeros (5, 5, 0) es: " +orden(5,5,0));
  }
}