import java.util.Scanner;
public class InvertirPalabra
{
  public static void main(String[] args)
  {
    //Scanner sc=new Scanner(System.in);
    System.out.println("Introduce un caracter: ");
    String palabra = "Hola";
    System.out.println(invertir(palabra));
  }
  public static String invertir(String palabra)
  {
    String res; //creo variable string
    int longitud=palabra.length(); // cogemos la longitud para jugar con las posiciones de las letras
    if (longitud!=0)
    {
      res= palabra.charAt(longitud-1)+invertir(palabra.substring(0,longitud-1));
    }
    else
      res=palabra;
    return res;
  }
}