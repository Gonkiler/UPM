import java.util.Scanner;
public class CalculadoraReales
{
  public static void main(String[] args)
  {
    System.out.println("Introduce dos números");
    double numero1 = sc.nextDouble();
    double numero2 = sc.nextDouble();
    System.out.println("Calculadora");
    System.out.println("1. Sumar");
    System.out.println("2. Restar");
    System.out.println("3. Multiplicar");
    System.out.println("4. Dividir");
    Scanner sc=new Scanner(System.in);
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
          System.out.println( (numero1) +" / "+ (numero2)+ " = " +((double) numero1/numero2) ); // hago una concatenación de int a double solo en un valor. para hacerlo mas facil podría cambiar los int por double's.
        else
          System.out.println("ERROR");
        break;
      default:
        System.out.println("ERROR");
        break;
    }
  }
}
