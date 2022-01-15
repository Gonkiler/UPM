import java.util.Scanner;
public class Arrays6
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
    System.out.println("Introcude un numero que quieras buscar:");
    int elem=sc.nextInt();
    System.out.println(contar(elem,array1));
  }
  public static int contar(int elem, int[] array)
  {
   int ocurr=0;
   for(int i=0; i<array.length; i++)
   {
    if (array[i]==elem)
      ocurr++;
   }
   return ocurr;
  }
}