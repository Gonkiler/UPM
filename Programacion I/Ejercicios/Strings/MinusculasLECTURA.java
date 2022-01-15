//importmos paquete
import java.util.Scanner;
public class MinusculasLECTURA
{
  public static void main(String[] args)
  {
    //declaración de variables
    char caracter;
    //creamos objeto
    Scanner sc=new Scanner(System.in);
    System.out.println("Introduce un caracter: ");
    caracter = sc.next().charAt(0);
    System.out.println("Caracter introducido: "+ caracter);
  }
}