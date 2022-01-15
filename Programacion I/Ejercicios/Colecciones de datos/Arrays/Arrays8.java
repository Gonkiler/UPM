import java.util.Scanner;
public class Arrays8
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
    System.out.println("El máximo del array es:");
    System.out.println(maximo(array1));
  }
  public static int maximo(int[] array)
  {
    int max=0;
    for (int i=0; i<array.length; i++)
    {
      if (array[i]>max)
        max=array[i];
    }
    return max;
  }
}