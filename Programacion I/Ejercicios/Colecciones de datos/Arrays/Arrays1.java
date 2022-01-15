import java.util.Scanner;
public class Arrays1
{
  public static void main(String[] args)
  {
   Scanner sc=new Scanner(System.in);
    int[] array1=new int[4];
    for (int i=0; i<4; i++)
    {
      array1[i]=sc.nextInt();
    }
    System.out.println(aTexto(array1));
    int n=sc.nextInt();
    System.out.println(esta(n, array1));
  }
  public static String aTexto(int[] array)
  {
    String res="";
    int longitud= array.length;
    for (int i=0; i<longitud; i++)
    {
        res+=array[i];
      if (i!=longitud-1)
        res+=", ";
      
    }
    return res;
  }
  public static boolean esta(int elem, int[] array)
  {
    boolean res=false;
    int longitud= array.length;
    for (int i=0; (i<longitud)&&(!res); i++) //la condición dice que estará en le bucle hasta que termine o hasta que se encuentre el elemento
    {
      if (elem==array[i]){
        res=true;
      }
    }
      return res;
  }
}