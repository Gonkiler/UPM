import java.util.Scanner;
public class Arrays9
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
    int[] array2=new int[5];
    array2=invertir(array1);
    imprimir(array2);
  }
  public static int[] invertir(int[] array)
  {
    int[] array1=new int[5];
    for (int i=0; i<array.length; i++)
    {
      array1[i]=array[array.length-1-i];
    }
    return array1;
  }
  public static void imprimir (int[] array2)
  {
    System.out.println("El array inverso es: ");
    for (int i=0; i<array2.length; i++)
    {
      System.out.print(array2[i]+" ");
    }
  }
}