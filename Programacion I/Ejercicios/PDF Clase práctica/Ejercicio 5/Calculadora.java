import java.util.Scanner;
public class Calculadora
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Introduce dos n?meros");
    int numero1 = sc.nextInt();
    int numero2 = sc.nextInt();
    System.out.println("Calculadora");
    System.out.println("1. Sumar");
    System.out.println("2. Restar");
    System.out.println("3. Multiplicar");
    System.out.println("4. Dividir");
    int menu = sc.nextInt();
    switch (menu)
    {
      case 1: // +
        System.out.println( (numero1) +" + "+ (numero2)+ " = " +(numero1+numero2) );
        break;
      case 2: // -
        System.out.println( (numero1) +" - "+ (numero2)+ " = " +(numero1-numero2) );
        break;
      case 3: // *
        System.out.println( (numero1) +" * "+ (numero2)+ " = " +(numero1*numero2) );
        break;
      case 4: // /
        if(numero2!=0)
          System.out.println( (numero1) +" / "+ (numero2)+ " = " +((double) numero1/numero2) ); // hago una concatenaci?n de int a double solo en un valor. para hacerlo mas facil podr?a cambiar los int por double's.
        else
          System.out.println("ERROR");
        break;
      default:
        System.out.println("ERROR");
        break;
    }
  }
}
