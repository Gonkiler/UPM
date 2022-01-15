public class ConversiónVariables
{
  public static void main(String[] args)
  {
    long x=3528;
    byte y;
    y=(byte)x;
    System.out.println("El valor del y es " + y);
  }
  //Sale un resultado raro ya que el long tiene 8 bytes de espacio minetras que el byte solo 1; por ello se pierde una gran cantidad de memoria.
}