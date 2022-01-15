import java.util.Scanner;
public class prueba
{
  public static void main (String [] args)
  {
    String palabra = "Hola como estás";
    String palabra2= palabra.substring(2,6);
    System.out.println(palabra2);
    String palabra3= palabra.replace(" ","");
    System.out.println(palabra3);
    Scanner sc=new Scanner (System.in);
    char caracter = sc.next().charAt(0);
    System.out.println(caracter);
  }
}