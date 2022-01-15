import java.util.Scanner;
public class EjercicioPrueba2
{
  public static void main (String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int[] array1={1,5,2,17};
    imprimirArray(array1);
   //Dos tipos de asignación de arrays
/*
 int[] array1=new int[4];   
      array1[0]=1;
      array1[1]=5;
      array1[2]=2;
      array1[3]=17;
*/
//int[] array1={1,5,2,17};
  }
  public static void imprimirArray(int[] array1)
  {
    for (int i=0; i<4; i++)
    {
      System.out.print(array1[i]+" ");
    }
  }
}