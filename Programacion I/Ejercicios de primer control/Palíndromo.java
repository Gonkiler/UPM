public class Palíndromo
{
  public static void main (String [] args)
  {
    System.out.println(esPalindromo("Hola"));
    System.out.println(esPalindromo("somos"));
    System.out.println(esPalindromo("Somos"));
    System.out.println(esPalindromo("La ruta natural"));
  }
  public static boolean esPalindromo(String frase)
  {
    boolean res=false;
    if ((frase).equalsIgnoreCase(inverso(frase)))
      res= true;
    return res;
  }
  public static String inverso (String frase)
  {
    char res;
    String frasecorta= frase.trim();
    if (frasecorta.length()==1)
    {
      res=frasecorta.charAt(0);
    }
    else
    {
      res= inverso(frasecorta.substring(0,frasecorta.length()-1)).concat(frasecorta.charAt(frasecorta.length()-1));
    }
    return res;
  }
}