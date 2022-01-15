import java.util.Scanner;
public class MayorDeEdadSwitch
{
  public static void main (String[] args)
  {
   Scanner sc=new Scanner(System.in);
   System.out.print("Introduzca su edad: ");
   int edad=sc.nextInt();
   System.out.print("Estado: ");
   String estado ="Jubilado"; //establezco la variable de la edad que voy a cambiar a medida que se cumplan las condiciones de edad.
   Switch (edad)
   {
     case 1:
     case 2:
     case 3:
     case 4:
     case 5:
     case 6:
     case 7:
     case 8:
     case 9:
     case 10:
     case 11:
     case 12:
     case 13:
     case 14:
     case 15:
     case 16:
     case 17:
     case 18:
     case 19:
     case 20: //y así hasta el infinito.....
   }
  }
}