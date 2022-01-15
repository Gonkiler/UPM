public class UsoDeString
{
   public static String cifrado (String palabra, int desplazamiento)
  {
    String res;
    char caracter = palabra.charAt(0);
    char digito = (char)(caracter + desplazamiento); 
    if (palabra.length()==1)
      res = digito + "";
    else
    {
      res= digito + cifrado (palabra.substring(1,palabra.length()));
    }
    return res;
  } 
    
  public static void main (String[] args) {
    String a="Hola";
    int n=2;
    char res = 'a'+3;
    System.out.println('a'+7);
    System.out.println((char)('a'+7));
    System.out.println(res);
    System.out.println(a.charAt(0));
    //cifrado (a,n);
  }

}