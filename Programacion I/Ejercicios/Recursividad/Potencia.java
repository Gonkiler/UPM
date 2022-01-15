import java.util.Scanner;
public class Potencia
{
  public static double potencia (double base, double exponente)
  {
    double res;
    if (exponente<0)
    {
      res= ((1/base)*(potencia(base,exponente+1)));
    }
    else if (exponente==0)
    {
      res=1;
    }
    else
    {
      res= base*potencia(base,exponente-1);
    }
    return res;
  }
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Introduce la potencia que desea calcular: ");
    double exponente=sc.nextDouble();
    System.out.print("Introduce el numero de la base de la potencia a calcular: ");
    double base=sc.nextDouble();
    System.out.println(potencia(base,exponente));
  }
}