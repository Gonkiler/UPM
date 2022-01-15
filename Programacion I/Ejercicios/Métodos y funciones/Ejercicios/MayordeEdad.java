
import java.util.Scanner;
public class MayordeEdad
{
  public static int rangoEdad (int x)//x es edad
  {
    int res=0;
    if ((x<18)&&(x>=0))
      res=1;
    else if ((x>=18)&&(x<65))
      res=2;
    else if (x>65)
      res=3;
    return res;
      
  }
  public static void main(String[] args)
  {
    System.out.println("1 es menor de edad");
    System.out.println("2 es mayor de edad");
    System.out.println("3 es jubilado");
    System.out.println("0. ERROR");
    System.out.println("----------------------");
    System.out.println("La edad de 15 corresponde con: " +(rangoEdad(15)) );
    System.out.println("La edad de 18 corresponde con: " +(rangoEdad(18)) );
    System.out.println("La edad de 35 corresponde con: " +(rangoEdad(35)) );
    System.out.println("La edad de 0 corresponde con: " +(rangoEdad(0)) );
    System.out.println("La edad de -5 corresponde con: " +(rangoEdad(-5)) );
  }
}