  public class Ejercicio5
  {
    public static void main(String[] args)
    {
      int numeroA=12, numeroB=15;
      boolean distinto, igual, mayor, menor;
      distinto= numeroA != numeroB;
      igual= numeroA == numeroB;
      mayor= numeroA > numeroB;
      menor= numeroA < numeroB;
      System.out.println("El numero A es distinto del B? " + distinto);
      System.out.println("El numero A es igual del B? " + igual);
      System.out.println("El numero A es mayor del B? " + mayor);
      System.out.println("El numero A es menor del B? " + menor);
    }
  }