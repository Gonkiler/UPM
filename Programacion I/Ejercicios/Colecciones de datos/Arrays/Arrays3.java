import java.util.Scanner;
public class Arrays3
{
  public static void main(String[] args)
  {
   Scanner sc=new Scanner(System.in);
    int[] array1=new int[4];
    System.out.println("Introduce 4 valores para el array:");
    for (int i=0; i<array1.length; i++)
    {
      array1[i]=sc.nextInt();
    }
    System.out.println("La suma de las posiciones pares del array es:");
    System.out.println(sumaPosPares(array1));
  }
  public static int sumaPosPares(int[] array)
  {
    int suma=0;
    for (int i=0; i<array.length; i+=2) // el incremento es una asignacion en verad, i++ es i=i+1; por ello podemos ponerlo como i+=2 que sería i=i+2, teniendo solo los pares.
    {
      suma+=array[i];
    }
    return suma;
  }
}