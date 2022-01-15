import java.util.Scanner;
public class EjercicioExtra
{
  public static void main (String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println(esPrimo(n)); //para ver si es primo
    nPrimos(n);
  }
  public static boolean esPrimo(int n){
    boolean res=false;
    for (int i=1; i<=n; i++)
    {
      if ((n%1==0)&&(n%i==0)&&(i!=1))
      {
        if (i==n)
          res=true;
        else
        {
          res=false;
          i=n+1;
        }
      }
      else
        res=false;
    }
    /*
     boolean encontrado=true;
     int n=2;
     while (encontrado && (i<n)){
     if (n%1)!=0
     encontrado=false;
     i++;
     }
     return encontrado;
     */ 
    return res;
  }
  public static void nPrimos(int n)
  {
    for (int i=2; i<n; i++)
    {
      if (esPrimo(i))
        System.out.println(i);
    }
  }
}