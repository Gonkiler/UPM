import java.util.Scanner;
public class MáximodeNumerosOperadorTernario
{
  public static int maximo (int a, int b)
  {
    return a>b?a:b; //(Operador ternario)
    // devolver si a es mayor que b, a , y sino b.
  }
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Introduce el valor del primer numero");
    int numero1=sc.nextInt();
    System.out.println("Introduce el valor del segundo numero");
    int numero2=sc.nextInt();
    System.out.println("Introduce el valor del tercer numero");
    int numero3=sc.nextInt();
    System.out.println("Introduce el valor del cuarto numero");
    int numero4=sc.nextInt();
    System.out.println("El numero máximo es: " + maximo(maximo(numero1,numero2),maximo(numero3,numero4)));
        
    }
}