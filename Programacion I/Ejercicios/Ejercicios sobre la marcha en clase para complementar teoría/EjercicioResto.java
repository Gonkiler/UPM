//Dadas 2 variables de tipo entero x e y, vamos a sacar por pantalla un texto que diga "el resultado de aplicar el operador tanto porciento (resto) sobre dichas variables es "
public class EjercicioResto
{
  public static void main (String[] args)
  {
   int x= 8;
   int y= 3;
   System.out.println("El resultado de aplicar el operador tanto porciento (resto) sobre dichas variables es: " + (x%y));
   // Ahora poner si el resto es 0 y poner true o false dependiendo de si se cumple la igualdad
   System.out.println("El resultado es 0? " + (x%y==0));
  }
}
