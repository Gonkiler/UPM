public class EjercicioEnHoja3
{
  public static void main (String[] args)
  {
    int numero1=360;
    int numero2=12;
    System.out.println(multiplo(numero1,numero2));
    int a= 2;
    System.out.println("valor de a="+a);
    cambiar(a);
    System.out.println("valor de a="+a);
  }
  public static boolean multiplo (int x, int y)
  {
    boolean res=false;
    if (x%y==0)
      res=true;
    
    return res;
  }
  public static void cambiar (int a)
  {
    a=50;
    System.out.println("Valor de a="+a);
  }
}