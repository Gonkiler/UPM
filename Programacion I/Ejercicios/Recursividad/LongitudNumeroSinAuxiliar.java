public class LongitudNumeroSinAuxiliar
{
  public static void main(String[] args)
  {
    int n=154855;
    System.out.println("Longitud del numero "+ n+ " es --> "+longitudNumero(n));
  }
   public static int longitudNumero(int numero)
  {
    if ((-numero<=numero)&&(numero<=9))
      return 1;
    else
      return 1+longitudNumero(numero/10);
  }
}