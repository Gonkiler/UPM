import java.util.Scanner;
public class ArraysMulti1
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("De que tamaño quieres que sea tus matrices (fila y luego columna):");
    int x=sc.nextInt(); 
    int y=sc.nextInt(); 
    System.out.println("Primera Matriz:");
    double [][] matriz3=leerMatriz(x,y);
    System.out.println("Segunda Matriz:");
    double [][] matriz4=leerMatriz(x,y);
    double [][] matriz1={{7,5},{4,9}};
    double [][] matriz2={{1,2},{3,4}};
    double [][] sumatriz= suma(matriz1, matriz2);
    System.out.println(matrizATexto(matriz3));
    System.out.println(matrizATexto(matriz4));
    System.out.println(matrizATexto(matriz1));
    System.out.println(matrizATexto(matriz2));
    System.out.println("Suma de las matrices creadas por el sistema:");
    System.out.println(matrizATexto(sumatriz));
    System.out.println("Suma de las matrices introducidas:");
    System.out.println(matrizATexto(suma(matriz4, matriz3)));
  }
  public static double[][] suma(double[][]a, double[][]b)
  {
    if(a.length!=b.length || a[0].length!=b[0].length){
      return new double[][] {{0}};
    }
    double [][] suma=new double [a.length][a[0].length];
    for (int i=0; i<2; i++)
    {
      for (int j=0; j<2; j++)
      {
        suma[i][j]=a[i][j]+b[i][j]; 
      }
    }
    return suma;
  }
  public static String matrizATexto(double[][]a)
  {
    String texto="";
    for(int i=0; i<a.length; i++)
    {
      for (int j=0; j<a[i].length; j++)
      {
        texto+=a[i][j]+"\t";
      }
      texto+="\n";
    }
    return texto;
  }
  public static  double[][] leerMatriz(int x,int y)
  {
    Scanner sc=new Scanner(System.in);
    double [][] matrix=new double[x][y];
    for (int i=0; i<x; i++)
    {
      for (int j=0; j<y; j++)
      {
        System.out.print("Introduce el dato de la matriz en la posición:"+i+ ", "+j);
        matrix[i][j]=sc.nextDouble();
      }
    }
    return matrix;
  }
}