import java.util.Scanner; // SIN TERMINAR
public class InvertirNumeroIdeal
{
  public static void main (String[] args)
  {
    System.out.println("El inverso de los dígitos de 15 es: " + invertir(15));
    System.out.println("El inverso de los dígitos de 18 es: " + invertir(18));
    System.out.println("El inverso de los dígitos de 35 es: " + invertir(35));
    System.out.println("El inverso de los dígitos de 0 es: " + invertir(0));
    System.out.println("El inverso de los dígitos de -5 es: " + invertir(-5));
    
    //System.out.println("El inverso de los dígitos de -15 es: " + invertir(-15)); // prueba para numeros negativos menores de -10
  }
  public static int invertir (int n)
  {
    return invertirAux(n,0);
  }
  public static int invertirAux(int numero, int res)
  {
    if (numero==0)
      return res;
    else
      return invertirAux(numero/10,(numero%10)+res*10);
  }
}