import java.util.Scanner;
public class Arrays7
{
  public static void main(String[] args)
  {
   Scanner sc=new Scanner(System.in);
    int[] array1=new int[5];
    System.out.println("Introcude "+array1.length+" numeros:");
    for (int i=0; i<array1.length; i++)
    {
      array1[i]=sc.nextInt();
    }
    System.out.println("Está ordenado el array?");
    System.out.println(estaOrdenado(array1));
  }
  public static boolean estaOrdenado(int[] array) 
  {
   boolean orden=true;
   for(int i=1; ((i<array.length)&&(orden)); i++)
   {
    if (array[i]<array[i-1])
      orden=false;
   }
   return orden;
  }
}