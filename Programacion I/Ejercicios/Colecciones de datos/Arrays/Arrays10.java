import java.util.Scanner;
public class Arrays10
{
  public static void main(String[] args)
  {
   Scanner sc=new Scanner(System.in);
    int[] array1=creacion();
    int[] array2=creacion2();
    int[] array3=suma(array1, array2);
    System.out.println("El array suma es: ");
    for (int i=0; i<array3.length; i++)
    {
      System.out.print(array3[i]+" ");
    }
  }
  public static int[] suma (int[] array1, int[] array2)
  {
    int longitud=array1.length;
    if (array1.length<array2.length)
      longitud=array2.length;
    int[] array3=new int[longitud];
    int[] array4=new int[longitud];
    for(int i=0; i<longitud;i++)
    {
      if (i>=array1.length)
        array3[i]=0;
      array3[i]=array1[i];
    }
    for(int i=0; i<longitud;i++)
    {
      if (i>=array2.length)
        array4[i]=0;
      array4[i]=array2[i];
    }
    int[] array=new int[longitud];
    for (int i=0; i<array.length; i++)
    {
      array[i]=array3[i]+array4[i];
    }
    return array;
  }
  public static int[] creacion ()
  {
    Scanner sc=new Scanner(System.in);
    int[] array=new int[5];
    System.out.println("Introcude "+array.length+" numeros:");
    for (int i=0; i<array.length; i++)
    {
      array[i]=sc.nextInt();
    }
    return array;
  }
  public static int[] creacion2 ()
  {
    Scanner sc=new Scanner(System.in);
    int[] array=new int[4];
    System.out.println("Introcude "+array.length+" numeros:");
    for (int i=0; i<array.length; i++)
    {
      array[i]=sc.nextInt();
    }
    return array;
  }
}