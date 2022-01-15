import java.util.Scanner;
public class ComprobarFechas
{
  public static void main (String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Introduce los siguientes datos: ");
    System.out.print("Día:");
    int dia = sc.nextInt();
    System.out.print("Mes:");
    int mes = sc.nextInt();
    System.out.print("Año:");
    int anyo = sc.nextInt();
    System.out.println("Comprobación del año...." + comprobarAnyo(anyo));
    System.out.println("Es bisiesto...." + esBisiesto(anyo));
    System.out.println("Comprobación del mes...." + comprobarMes(mes));
    System.out.println("Comprobación del dia...." + comprobarDia(dia,mes,anyo));
  }
  public static boolean comprobarAnyo (int anyo)
  {
    return (anyo>0);
  }
  public static boolean comprobarMes (int mes)
  {
    return ((mes>0)&&(mes<=12));
  }
  public static boolean esBisiesto (int anyo)
  {
    return (((anyo%4==0)&&(anyo%100!=0))||(anyo%400==0));
  }
  public static boolean comprobarDia (int dia, int mes, int anyo)
  {
    int resultado=0;
    switch(mes)
    {
      case 1:case 3:case 5:case 7:case 8:case 10:case 12: //31 días
      {
        if((dia>0)&&(dia<=31))
          resultado=1;
        else
        {
          resultado=0;
        }
        break;
      }
      
      case 4:case 6:case 9:case 11: //30 días
      {
        if((dia>0)&&(dia<=30))
          resultado=1;
        else
        {
          resultado=0;
        }
        break;
      }
      
      case 2:
      {
        if (esBisiesto(anyo))
       {
         if((dia>0)&&(dia<=29))
           resultado=1;
         else
        {
          resultado=0;
        }
        break;
       }
       else
       {
         if((dia>0)&&(dia<=28))
           resultado=1;
         else
         {
           resultado=0;
         }
         break;
       }
      }
    }
    return ((resultado!=0));
  }
}