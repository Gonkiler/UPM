import java.util.Scanner;
public class ContarVocalesBienHecho
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
    if (longitud==0)
    {
      res=0;
    }
    char letra=palabra.cahrAt(0);
    if ((letra=='a')||(letra=='e')||(letra=='i')||(letra=='o')||(letra=='u'))
      res++;
    else res= res+contarVocales(palabra.substring(1,longitud));
    return res;
  }
 /* public static int esVocal(char letra)
  {
    int res;
    if ((letra=='a')||(letra=='e')||(letra=='i')||(letra=='o')||(letra=='u'))
      res=1;
    else if ((letra=='A')||(letra=='E')||(letra=='I')||(letra=='O')||(letra=='U'))
      res=1;
    else
      res=0;
    return res;
  }*/
}