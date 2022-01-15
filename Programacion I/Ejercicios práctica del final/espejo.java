public class espejo{
  public static void main (String[] args)
  {
    int [] array1 = {1,2};
    int [] array2 = {1,2,6,7,6};
    int [] array3= {2};
    int [] array4 = imagenEspejo(array1);
    for (int i=0; i<array4.length; i++)
      System.out.print(array4[i]+" ");
    System.out.print("\n");
    array4 = imagenEspejo(array2);
    for (int i=0; i<array4.length; i++)
      System.out.print(array4[i]+" ");
     System.out.print("\n");
    array4 = imagenEspejo(array3);
    for (int i=0; i<array4.length; i++)
      System.out.print(array4[i]+" ");
     System.out.print("\n");
  }
  public static int [] imagenEspejo (int[] a)
  {
    int [] res= new int [a.length*2];
    int c=0;
    for (int i=0; i<a.length; i++)
    {
      res[i]=a[i];
      c++;
    }
    for (int i=a.length-1; i>=0; i--)
    {
      res[c]=a[i];
      c++;
    }
    return res;
  }
}