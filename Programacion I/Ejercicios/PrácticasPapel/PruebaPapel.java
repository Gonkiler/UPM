import java.util.Scanner;
public class PruebaPapel
{
  public static void main (String [] args)
  {
    int valor1=10;
    int valor2=20;
    System.out.println(valor1);
    System.out.println(valor2);
    valor1+=3;
    valor2-=12;
    int valor3= valor1+valor2;
    System.out.println(valor3);
    Scanner sc=new Scanner(System.in);
    String frase=sc.nextLine();
    System.out.println(frase);
    int maximo, x, y ,z;
    x=sc.nextInt();
    y=sc.nextInt();
    z=sc.nextInt();
    if ((x>y)&&(x>z))
      maximo=x;
    else if ((y>x)&&(y>z))
      maximo=y;
    else if ((z>x)&&(z>y))
      maximo=z;
    else
      maximo=z;
    System.out.println(maximo);
  }
}