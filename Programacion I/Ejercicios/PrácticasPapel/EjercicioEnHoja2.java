import java.util.Scanner;
public class EjercicioEnHoja2
{
  public static void main (String [] args)
  {
    Scanner sc=new Scanner(System.in);
    int numero=sc.nextInt();
    int valorabs;
    if (numero>=0)
      valorabs=numero;
    else
      valorabs=-numero;
    System.out.println(valorabs);
    char letra='a';
    switch(letra)
    {
    case 'a':
      System.out.println('1');
      break;
    case 'b':
      System.out.println('2');
      break;
    case 'c':
      System.out.println('3');
      break;
    case 'd':
      System.out.println('4');
      break;
    case 'e':
      System.out.println('5');
      break;  
    }
  }
}