public class Hola{
  public static void main (String[] args)
  {
    int[] array1 = {1,2,3,2};    
    int[] array2 = {1,8,3,2,7,8,8};

    System.out.println(alMenosDos(array1,2));
    System.out.println(alMenosDos(array1,3));
    System.out.println(alMenosDos(array2,8));
  }
/*  public static boolean alMenosDos(int[] numero, int n)
  {
    boolean res=false, uno=false, dos=false;
    for (int i=0; ((i<numero.length)||((!uno)&&(!dos))); i++)
    {
      if ((numero[i]==n)&&(!uno))
        uno=true;
      else if ((numero[i]==n)&&(uno))
        dos=true;
    }
    if ((uno)&&(dos))
      res=true;
    return res;
  }
  */
  public static boolean alMenosDos(int[] numero, int n)
  {
    boolean res=false;
    int c=2;
    int i=0;
    while((i<numero.length)&&(c>0))
    {
      if (numero[i]==n)
        c--;
      
      i++;
    }
    if (c==0)
      res=true;
    
    return res;
  }
}