import java.util.Scanner;
public class EsMultiplo
{
  public static boolean esMultiplo (int dividendo, int divisor)
  {
    boolean veracidad;
    if ((dividendo%divisor)==0)
      veracidad= true;
    else
      veracidad=false;
    return veracidad;
    //esto sepuede poner solamente como return dividendo%divisior==0;
  }
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Introduce el valor del dividendo");
    int dividendo=sc.nextInt();
    System.out.println("Introduce el valor del divisor");
    int divisor=sc.nextInt();
    if (divisor==0)
      System.out.println("ERROR: no se puede dividir.");
    else
    {
      if (esMultiplo(dividendo, divisor)== true)
        System.out.println("X es múltiplo de Y");
      else
        System.out.println("X no es múltiplo de Y");
    }
  }
}