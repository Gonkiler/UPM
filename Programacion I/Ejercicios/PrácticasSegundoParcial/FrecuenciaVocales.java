public class FrecuenciaVocales
{
  public static void main (String[] args)
  {
    
    
    System.out.println("EL numero de vocales que contiene la palabra:");
      System.out.println("a) Hola Mundo");
    String a="Hola Mundo";
    int[]array=frecuenciaVocales(a);
    for (int i=0; i<array.length;i++)
    {
      System.out.print(array[i]);
    }
    System.out.println("");
    System.out.println("b) CasA");
    a="CasA";
    array=frecuenciaVocales(a);
    for (int i=0; i<5;i++)
    {
      System.out.print(array[i]);
    }
    System.out.println("");
    System.out.println("c) Murciélago");
    a="Murciélago";
    array=frecuenciaVocales(a);
    for (int i=0; i<5;i++)
    {
      System.out.print(array[i]);
    }
    System.out.println("");
    System.out.println("c) Murciélago");
    a="Murciélago";
    String ab=frecuenciaVocales2(a);
      System.out.println(ab);
    System.out.println("");
  }
  
  public static String frecuenciaVocales2 (String palabra){ //método mío
    int a=0, e=0, i=0, o=0, u=0;
    String resultado="";
    for(int cont=0; cont<palabra.length(); cont++){
      if ((palabra.charAt(cont)=='a')||(palabra.charAt(cont)=='A'))
        a++;
      if ((palabra.charAt(cont)=='e')||(palabra.charAt(cont)=='E'))
        e++;
      if ((palabra.charAt(cont)=='i')||(palabra.charAt(cont)=='I'))
        i++;
      if ((palabra.charAt(cont)=='o')||(palabra.charAt(cont)=='O'))
        o++;
      if ((palabra.charAt(cont)=='u')||(palabra.charAt(cont)=='U'))
        u++;
    }
    resultado="["+a+", "+e+", "+i+", "+o+", "+u+"]";
    return resultado;
  } 
  
  public static int[] frecuenciaVocales (String palabra){ //método profesor
    int vocales[] = new int [5];
    String textoI = palabra.toLowerCase();
    for(int cont=0; cont<palabra.length(); cont++){
      char c = textoI.charAt(cont);
      switch(c)
      {
        case 'a':
          vocales [0]+=1;
          break;
        case 'e':
          vocales [1]+=1;
          break;
        case 'i':
          vocales [2]+=1;
          break;
        case 'o':
          vocales [3]+=1;
          break;
        case 'u':
          vocales [4]+=1;
          break;
      }
    }
    return vocales;
  }
}