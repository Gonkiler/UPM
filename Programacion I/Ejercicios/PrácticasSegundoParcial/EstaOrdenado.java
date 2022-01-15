public class EstaOrdenado
{
  public static void main (String[] args)
  {
    int [] array={1,2,2,2,2,3};
    System.out.println(estaOrdenado(array));
  }
  public static boolean estaOrdenado (int [] array){
    boolean resultado=true;
    if (array.length==1)
      resultado=false;
    for (int i=0; (i<array.length-1)&&(resultado); i++)
    {
      if (array[i]>array[i+1])
        resultado=false;
    }
    return resultado;
  }
}