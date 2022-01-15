import java.util.Scanner;
public class Arrays5
{
  public static void main(String[] args)
  {
   Scanner sc=new Scanner(System.in);
    int[] array1=new int[4];
    System.out.println("Introcude "+array1.length+" numeros:");
    for (int i=0; i<array1.length; i++)
    {
      array1[i]=sc.nextInt();
    }
    System.out.println(cuentaImpares(array1));
  }
  public static int cuentaImpares(int[] array)
  {
    int suma=0;
   for(int i=0; i<array.length; i++)
   {
    if (array[i]%2!=0)
      suma++;
   }
   return suma;
  }
}