import java.util.Scanner;
public class emails
{
  public static void main (String [] args)
  {
    Scanner sc=new Scanner (System.in);
    int n=sc.nextInt();
    Scanner teclado = new Scanner (System.in);
    String[] correos = new String[n];
    for (int i=0; i<n; i++)
      correos[i]=teclado.nextLine();
    
    System.out.println(funcionmail(correos));
  }
  public static int funcionmail (String [] correos)
  {
    int c=0;
    for (int i=0; i<correos.length; i++){
      if (correos[i].endsWith("gmail.com"))
        c++;}
    return c;
  }
}