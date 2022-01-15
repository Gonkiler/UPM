public class DecodificarTexto
{
  public static void main (String[] args)
  {
    int [] array={1,2,2,2,2,3};
    System.out.println(estaOrdenado(array));
  }
  public static String decodificarTexto (char [] letras, int [] array){
    String resultado="";
    boolean error=true;
    int numero=0;
    for (int i=0; ((i<array.length-1)||(error)); i++)
    {
      if (a[i]-a[i+1]<0);
        error=false;
      else if()
      resultado+=letras[numero+a[i]];
      numero+=a[i];
    }
    return resultado;
  }
}