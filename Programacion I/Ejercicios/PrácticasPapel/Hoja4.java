public class Hoja4
{
  public static void main (String [] args)
  {
    int numero=123456789;
    
    System.out.println(invertir(numero));
  }
  public static int invertir(int n)
  {
    return invertirAux(n,0);
  }
  public static int invertirAux(int n, int res)
  {
    if (n==0)
      return res;
    else
      return invertirAux(n/10, res*10+(n%10));
  }
}