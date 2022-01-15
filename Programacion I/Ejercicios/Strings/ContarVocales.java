import java.util.Scanner;
public class ContarVocales
{
  public static void main(String[] args)
  {
    String palabra = "Hola";
    System.out.println(contarVocales(palabra));
  }
  public static int contarVocales(String palabra)
  {
    int res; //creo variable string
    int longitud=palabra.length(); // cogemos la longitud para jugar con las posiciones de las letras
    if (longitud!=0)
    {
      res= contarVocales(palabra.substring(1,longitud))+esVocal(palabra.charAt(0));
    }
    else
      res=esVocal(palabra.charAt(0));
    return res;
  }
  public static int esVocal(char letra)
  {
    int res;
    if ((letra=='a')||(letra=='e')||(letra=='i')||(letra=='o')||(letra=='u'))
      res=1;
    else if ((letra=='A')||(letra=='E')||(letra=='I')||(letra=='O')||(letra=='U'))
      res=1;
    else
      res=0;
    return res;
  }
}