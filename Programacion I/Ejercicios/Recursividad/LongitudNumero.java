public class LongitudNumero
{
  public static void main(String[] args)
  {
    int n=121;
    System.out.println("Longitud del numero "+ n+ " es --> "+longitudNumero(n));
  }
  public static int longitudNumero(int numero)
  {
    return longitudAuxiliar(numero<0?-numero:numero,0);
  }
  public static int longitudAuxiliar(int numero, int res)
  {
    if (numero!=0)
    {
      return longitudAuxiliar(numero/10,res+1);
    }
    else
    {
      return (res);
    }
  }
}