import java.util.Scanner;
public class EjercicioPrueba
{
  public static void main (String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int[] array1=new int[4];
    //Dos tipos de asignación de arrays
/*
 int[] array1=new int[4];   
      array1[0]=34;
      array1[1]=5;
      array1[2]=2;
      array1[3]=17;
*/

//int[] array1={34,5,2,17};
    
//   Meter por pantalla datos en el array.
    for (int i=0; i<array1.length; i++)
    {
      array1[i]=sc.nextInt();
    } 
    
    for (int i=0; i<array1.length; i++)
    {
      System.out.print(array1[i]+" ");
    }
  }
}