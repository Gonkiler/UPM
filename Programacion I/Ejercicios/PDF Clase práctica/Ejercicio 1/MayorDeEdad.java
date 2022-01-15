import java.util.Scanner;
public class MayorDeEdad
{
  public static void main (String[] args)
  {
   Scanner sc=new Scanner(System.in);
   System.out.print("Introduzca su edad: ");
   int edad=sc.nextInt();
   System.out.print("Estado: ");
   String estado ="Jubilado"; //establezco la variable de la edad que voy a cambiar a medida que se cumplan las condiciones de edad.
   if (edad<18)
   {
     estado= "Menor de edad";
   }
   else if ((edad>18)&&(edad<65))
   {
     estado= "Mayor de edad";
   }
    System.out.println(estado);
  }
}