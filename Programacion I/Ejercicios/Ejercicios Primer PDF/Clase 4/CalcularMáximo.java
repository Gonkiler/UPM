import java.util.Scanner;
public class CalcularM�ximo
{
  public static void main (String[] args)
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Dame 2 numeros enteros: ");
   int numeroA=sc.nextInt();
   int numeroB=sc.nextInt();
   int maximo=numeroB;
   if (numeroA>numeroB)
     maximo=numeroA;
   System.out.println("El valor m�ximo es: "+maximo);
  }
}