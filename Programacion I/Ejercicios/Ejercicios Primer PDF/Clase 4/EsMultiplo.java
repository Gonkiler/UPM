import java.util.Scanner;
public class EsMultiplo
{
  public static void main (String[] args)
  {
   Scanner sc=new Scanner(System.in);
   int numero=sc.nextInt(), divisor=sc.nextInt();
   String no=" NO es";
   if ((numero%divisor)==0)
   {
     no=" es";
   }
   System.out.println(numero + no + " multiplo de " + divisor);
  }
}