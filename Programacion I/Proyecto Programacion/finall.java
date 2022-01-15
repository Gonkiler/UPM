import java.util.Scanner;
public class finall{ 
  public static void main (String [] args)
  {
    Scanner sc=new Scanner(System.in);
    int opcion;
    
    do
    {
      System.out.println("");
      //Menu de modo
      System.out.println("Bienvenidos a SUDOKU"); 
      System.out.println("Seleccione la dificultad:");
      //Seleccionar en el menu la dificultad o las instrucciones
      System.out.println("1) Facil");
      System.out.println("2) Intermedio");
      System.out.println("3) Dificil");
      System.out.println("4) Para los más atrevidos ;) ");
      System.out.println("Si desea consultar las instrucciones:");
      System.out.println("5) Intrucciones");
      opcion=sc.nextInt();
      if (opcion==5)
        instrucciones();
    }
    while ((opcion>4)||(opcion<1)); // como tenemos esta condiciÃ³n si selecciona las instrucciones se repetirÃ¡ el do hasta seleccionar una dificultad
    
    int nivel;
    int ayuda;
    int rendirse;
    if (opcion==4)
    {
      int x=1;
      int [] aleatorio= arrayrandom(9);
      int [][]tabla = sudoku(opcion, 1, 1, aleatorio);
      int [][]solucion = sudoku(opcion, 1, 0, aleatorio);
      ensenarMatrizDoble(tabla);
      while(x>=0)
      {
        x=sc.nextInt();
        if (x!=0)
        {
          asignarNum(tabla,x);
          boolean comp=true;
          for (int j=0; j<15; j++)
          {
            if ((j==6)||(j==7)||(j==8))
            {
              for (int j2=0; j2<15; j2++)
              {  
                if(tabla[j][j2]==0)
                comp = false;
              }
            }
       
            else
            {
              for (int j2=0; j2<9; j2++)
              {
                if(tabla[j][j2]==0)
                comp = false;
              }
            }
          }
          if (comp)
          {
            comprobar(tabla,solucion,opcion); //meter que cuando termine compruebe, si estÃ¡ mal que pueda meter mas numero, si estÃ¡ bien que termine
            x=-1;
          }
          ensenarMatrizDoble(tabla);
        }
        else
        {
          //rendirse
          System.out.println("¿Estas seguro de que quieres rendirte?");
          System.out.println("Pulsa 0 para confirmar o 1 para cancelar");
          rendirse=sc.nextInt();
          if(rendirse==0)
          {
            System.out.println("Sabia que no lo ibas a conseguir");
            ensenarMatrizDoble(solucion);
            x=-1;
          }
          else
          {
            System.out.println("Menos mal");
            ensenarMatrizDoble(tabla);
          }
        }
        
      }
    }
    else
    {
      do
      {
        //Este menu es similar al anterior pero con los niveles
        System.out.println("Seleccione el nivel");
        System.out.println("Nivel 1");
        System.out.println("Nivel 2");
        System.out.println("Nivel 3");
        System.out.println("Nivel 4");
        nivel=sc.nextInt();
      }
      while ((nivel>4)||(nivel<1));
      
      System.out.println("Nivel "+nivel);
      int x=1;
      int pista=0;
      int probar=0;
      int [] aleatorio= arrayrandom(9);
      int [][]tabla = sudoku(opcion, nivel, 1, aleatorio);
      int [][]solucion = sudoku(opcion, nivel, 0, aleatorio);
      ensenarMatriz(tabla,pista,probar);
      
      while(x>=0)
      {
        x=sc.nextInt();
        if (x!=0)
        {
          asignarNum(tabla,x);
          boolean comp=true;
          for (int i =0; i<9; i++)
          {
            for(int j=0; j<9;j++)
            {
              if(tabla[i][j]==0)
                comp = false;
              
            }
          }
          if (comp)
          {
            comprobar(tabla,solucion,opcion); //meter que cuando termine compruebe, si está mal que pueda meter mas numero, si está bien que termine
            x=-1;
          }
          ensenarMatriz(tabla,pista,probar);
        }
        else
        {
          ayudas();
          ayuda=sc.nextInt();
          switch(ayuda)
          {
            case 1:
              //pista
              if(pista<3)
            {
              tabla=pista(tabla,solucion);
              pista++;
            }
              ensenarMatriz(tabla,pista,probar);
              break;
              
            case 2:
              //comprobar
              if(probar<3)
            {
              probar++;
              if(comprobar(tabla,solucion,opcion))
              {
                System.out.println("Todas las casillas son correctas");
              }
              else
              {
                System.out.println("Alguna casilla contiene un numero que no es correcto");
              }
            }
              ensenarMatriz(tabla,pista,probar);
              break;
              
            case 3:
              //rendirse
              System.out.println("¿Estas seguro de que quieres rendirte?");
              System.out.println("Pulsa 0 para confirmar o 1 para cancelar");
              rendirse=sc.nextInt();
              if(rendirse==0)
              {
                System.out.println("Sabia que no lo ibas a conseguir");
                ensenarMatriz(solucion,pista,probar);
                x=-1;
              }
              else
              {
                System.out.println("Menos mal");
                ensenarMatriz(tabla,pista,probar);
              }
              break;
              
            default:
              System.out.println("Introduce las coordenadas del numero que quieres cambiar");
              //nada para salir del menu
          }
          
        }
      }
    }
  }
  
  public static void ensenarMatriz(int[][] matriz,int x,int y)
  {
    for(int i=0; i<9; i++) //filas
    {
      if(((i)%3==0)) // filas de guiones
      {
        for (int k=0; k<13;k++)
        {
          if ((k==0)||(k==4)||(k==8)||(k==12)) // donde hay intersecciones poner un + en vez de -
          {
            System.out.print("+ ");
          }
          else
            System.out.print("- ");
        }
        System.out.println(""); 
      }
      for (int j=0; j<9;j++)
      {
        if (((j)%3==0))
          System.out.print("| "); //poner | para dividir los bloques
        System.out.print(matriz[i][j]+" ");
      }
      System.out.println("| ");
    }
    for (int k=0; k<13;k++) //es 13 porque hacmos barras para los numeros y las esquinas, Ãºltima fila de -1 //tapa de abajo
    {
      if ((k==0)||(k==4)||(k==8)||(k==12))
      {
        System.out.print("+ ");
      }
      else
        System.out.print("- ");
    } 
    System.out.println(""); 
    System.out.println("Pistas restantes: " + (3-x));
    System.out.println("Puedes comprobar lo que llevas " + (3-y) + " veces mas");
    int cont=0;
    for(int i=0;i<9;i++)
    {
      for(int j=0;j<9;j++)
      {
        if(matriz[i][j]==0)
        {
         cont++;
         }
        }
      }
    System.out.println("Te faltan "+ cont +" casillas por rellenar");
        System.out.println("Numeros restantes: ");
        System.out.print("{ ");
    for(int i=0;i<9;i++)
    {
      if(contar(matriz,i+1)==9)
           {}
      else
      System.out.print((i+1)+" ");
       
     }
    System.out.println("}");
    System.out.print("\n");
  }
  
  public static int[] arrayrandom(int t) //t es el tamaÃ±o raiz del array 
  {
    int i=0;
    int [] array=new int[t];
    array[i]=numeroAleatorio();
    for (int j=1; j<t;j++) //j= contador a partir del 1 para poder hacer j-- sin tener error
    {
      array[j]=numeroAleatorio();
      for (int k=0; k<j; k++) //k para recorrer el array
      {
        if(array[j]==array[k])
          j--;
      }
    }
    return array;
  }
  public static int numeroAleatorio ()
  {
    int numero= (int)(Math.random()*9+1);
    return numero;
  }
  public static int[] separarNum(int y,int t,int[] x)
  {  //Esta funcion separa un numero en cifras y las guarda en una matriz
    if (y<10){
      x[x.length-1-t]=y;
      return x;
    }
    else
    {
      x[x.length-1-t]=y%10;
      return separarNum(y/10,t+1,x);}}
  public static int[][] asignarNum(int a[][], int x)
  {
    Scanner sc=new Scanner(System.in);
    int[] h=new int[3];
    int[]coords = separarNum(x, 0, h);
    if(h[0]==0)
    {
      a[coords[1]-1][coords[2]-1]=sc.nextInt();
    }
    else
    {
      System.out.println("Columna o fila de dos cifras");
      System.out.println("c/1 f/0");
      int y=sc.nextInt();
      if(y==1)
      a[coords[0]-1][(coords[1]*10)+coords[2]-1]=sc.nextInt();
      else
       a[(coords[0]*10)+coords[1]-1][coords[2]-1]=sc.nextInt();
                         }
    return a;
  }
  public static boolean comprobar(int[][]a, int[][]b,int opcion) //a serÃ­a la matriz en la que escribe y b serÃ­a la matriz resuelta
  {
    boolean res=true;
    int f=0;
    if(opcion==4)
    {
      while((f<12)&&(res)) 
      {
        int c=0;
        if ((f==6)||(f==7)||(f==8))
        {
          while ((c<15)&&(res))
          {  
            if((a[f][c]!=b[f][c])&&(a[f][c]!=0))
              res=false;
            c++;
          }
          f++;
        }
        
        else
        {
          while ((c<15)&&(res))
          {
          if((a[f][c]!=b[f][c])&&(a[f][c]!=0))
            res=false;
          c++;
          }
          f++;
        }
      }
    }
    else
    {
      while((f<9)&&(res))
      {
        int c=0;
        while ((c<9)&&(res))
        {  
          if((a[f][c]!=b[f][c])&&(a[f][c]!=0))
            res=false;
          c++;
        }
        f++;
      }
    }
    return res;
  }
  public static int[][] sudoku (int opcion, int nivel, int ejercicio, int [] vec)
  {     
    int a=vec[0],b=vec[1],c=vec[2],d=vec[3],e=vec[4], f=vec[5],g=vec[6],h=vec[7],i=vec[8];
    //[dificultad][num sudoku][solucion/ejercicio][fila][columna]
    //Esta matriz guarda todos los sudokus que tiene guardados en cinco dimensiones
    //Cada fila es un sudoku y juntando dos filas obtienes un sudoku y su solucion
    //Agrupando de cuatro en cuatro sudokus con su solucion tienes los que estan agrupados en cada dificultad
    int [][][][][] sudokus =
    {{{{{i,f,c,a,g,d,b,e,h},{a,g,h,c,b,e,f,d,i},{b,e,d,f,h,i,g,c,a},{h,b,a,d,c,g,e,i,f},{d,i,f,h,e,b,c,a,g},{g,c,e,i,f,a,h,b,d},{e,h,i,g,a,c,d,f,b},{c,a,g,b,d,f,i,h,e},{f,d,b,e,i,h,a,g,c}},
                           {{0,f,0,a,0,d,0,e,0},{0,0,h,c,0,e,f,0,0},{b,0,0,0,0,0,0,0,a},{h,0,0,d,0,g,0,0,f},{0,0,f,0,0,0,c,0,0},{g,0,0,i,0,a,0,0,d},{e,0,0,0,0,0,0,0,b},{0,0,g,b,0,f,i,0,0},{0,d,0,e,0,h,0,g,0}}},
      {{{b,g,a,h,f,c,i,d,e},{c,e,d,a,b,i,h,f,g},{h,f,i,g,d,e,a,c,b},{g,i,f,b,e,a,c,h,d},{a,c,b,d,i,h,g,e,f},{e,d,h,f,c,g,b,i,a},{a,h,c,e,a,b,f,g,i},{f,b,g,i,h,d,e,a,c},{i,a,e,c,g,f,d,b,h}},
                           {{0,g,0,h,0,c,0,0,0},{c,0,0,0,0,0,h,f,0},{0,0,i,g,d,e,0,c,0},{g,0,f,0,e,0,c,0,0},{a,c,b,d,0,0,g,0,f},{e,0,h,0,0,g,b,0,0},{0,h,c,0,0,b,0,0,i},{0,0,g,0,h,0,e,0,c},{0,0,e,c,0,0,d,b,h}}},
      {{{f,a,i,b,g,e,d,c,h},{g,d,e,c,h,a,b,i,f},{b,c,h,f,d,i,g,a,e},{a,b,c,g,e,f,i,h,d},{h,i,f,a,b,d,e,g,c},{d,e,g,h,i,c,a,f,b},{i,g,b,e,f,h,c,d,a},{c,f,d,i,a,b,h,e,g},{e,h,a,d,c,g,f,b,i}},
                           {{0,a,0,b,g,0,0,0,0},{0,d,0,c,0,0,b,0,f},{b,0,0,f,0,i,0,0,0},{a,b,c,0,0,f,0,h,0},{0,0,0,0,0,d,e,g,0},{0,0,0,0,0,c,0,0,b},{0,g,0,0,f,0,c,d,a},{0,0,d,i,0,b,0,e,g},{e,0,0,0,0,g,f,0,0}}},
      {{{g,i,e,c,b,h,d,f,a},{h,f,d,i,g,a,c,b,e},{b,c,a,e,d,f,i,g,h},{a,b,c,g,e,d,f,h,i},{f,d,i,h,a,c,g,e,b},{e,g,h,f,i,b,a,d,c},{d,h,g,b,c,i,e,a,f},{c,a,b,d,f,e,h,i,g},{i,e,f,a,h,g,b,c,d}},
                           {{0,0,0,c,0,0,0,f,0},{0,f,d,0,0,a,0,b,0},{0,0,0,e,0,0,0,0,0},{0,b,c,0,e,0,f,0,0},{0,0,i,h,0,c,g,0,0},{0,0,h,0,i,0,a,d,0},{0,0,0,0,0,i,0,0,0},{0,a,0,d,0,0,h,i,0},{0,e,0,0,0,g,0,0,0}}}},
     {{{{d,g,b,i,e,f,a,h,c},{h,i,e,b,a,c,d,f,g},{a,f,c,d,h,g,b,i,e},{f,e,h,a,g,b,i,c,d},{i,b,a,c,d,h,g,e,f},{g,c,d,f,i,e,h,a,b},{b,h,f,g,c,i,e,d,a},{c,d,i,e,b,a,f,g,h},{e,a,g,h,f,d,c,b,i}},
                           {{0,g,b,0,0,f,0,h,0},{h,0,0,0,0,0,d,f,g},{0,0,0,0,h,0,0,0,0},{f,e,h,a,0,b,0,0,0},{i,0,0,c,0,0,0,0,0},{0,0,0,0,0,0,0,0,b},{0,h,0,g,c,0,e,d,0},{c,d,0,e,b,0,f,g,0},{e,0,0,0,0,0,c,b,i}}},
      {{{d,e,c,h,f,i,g,b,a},{a,i,g,e,b,c,d,f,h},{h,f,b,a,g,d,e,c,i},{e,h,a,i,c,g,b,d,f},{b,d,i,f,e,a,c,h,g},{c,g,f,d,h,b,a,i,e},{g,b,h,c,a,f,i,e,d},{i,c,e,g,d,h,f,a,b},{f,a,d,b,i,e,h,g,c}},
                           {{0,e,0,h,f,0,0,0,0},{0,i,g,e,0,0,0,0,0},{0,0,0,0,0,0,e,c,i},{e,h,0,0,0,0,0,d,0},{0,d,0,f,0,0,0,h,0},{c,g,0,d,h,b,0,i,e},{0,0,h,c,a,f,0,0,0},{i,0,0,0,0,0,0,0,b},{0,0,0,0,i,0,0,0,c}}},
      {{{h,f,g,e,i,a,b,c,d},{d,a,e,c,h,b,i,f,g},{i,b,c,f,g,d,a,h,e},{a,i,b,h,d,c,e,g,f},{g,c,d,a,f,e,h,i,b},{f,e,h,i,b,g,c,d,a},{b,h,i,g,a,f,d,e,c},{e,d,f,b,c,h,g,a,i},{c,g,a,d,e,i,f,b,h}},
                           {{0,f,g,0,0,0,0,0,d},{d,0,0,0,0,0,0,0,0},{i,b,0,0,0,0,0,0,e},{0,0,0,0,0,0,0,0,f},{0,c,d,0,0,e,h,0,b},{0,0,h,0,b,g,0,0,0},{b,h,i,g,0,0,0,e,0},{0,0,0,b,c,0,g,0,i},{c,g,0,d,0,i,f,b,0}}},
     {{{h,g,e,b,c,d,a,f,i},{c,d,b,f,i,a,e,h,g},{f,a,i,e,g,h,b,d,c},{d,h,g,i,e,b,c,a,f},{e,i,c,a,h,f,d,g,b},{b,f,a,c,d,g,h,i,e},{g,b,d,h,f,e,i,c,a},{a,c,f,d,b,i,g,e,h},{i,e,h,g,a,c,f,b,d}},
                           {{0,0,0,b,0,0,0,0,i},{c,d,b,0,0,a,0,0,0},{0,a,i,0,0,h,0,0,0},{0,0,g,i,0,b,0,a,0},{0,0,0,a,h,0,0,0,0},{0,0,0,0,d,g,h,0,e},{g,0,0,0,0,e,0,0,0},{a,c,f,0,0,0,g,0,0},{i,e,0,0,0,c,f,0,d}}}},
     {{{{h,i,d,e,b,a,g,f,c},{b,c,a,f,d,g,h,e,i},{g,e,f,c,h,i,d,b,a},{d,f,b,h,i,c,e,a,g},{i,h,e,g,a,b,c,d,f},{a,g,c,d,e,f,b,i,h},{f,a,g,b,c,e,i,h,d},{e,d,i,a,g,h,f,c,b},{c,b,h,i,f,d,a,g,e}},
                           {{0,0,0,0,0,0,0,0,0},{0,0,a,0,d,0,0,e,i},{0,0,f,c,0,i,0,0,0},{0,f,0,0,0,c,0,0,g},{i,0,0,0,0,b,0,d,0},{0,0,0,0,0,0,b,0,h},{f,a,0,0,0,0,0,h,0},{0,d,0,0,g,h,0,c,0},{c,b,0,0,0,0,a,0,e}}},
      {{{i,f,c,g,d,a,b,e,h},{a,e,b,c,i,h,f,g,d},{h,g,b,d,f,e,c,i,a},{c,d,e,h,g,b,a,f,i},{b,a,h,i,e,f,g,d,c},{f,i,g,a,c,d,h,b,e},{g,b,a,d,h,i,e,c,f},{e,h,i,f,b,c,d,a,g},{b,c,f,e,a,g,i,h,b}},
                           {{i,f,c,0,0,0,0,0,0},{a,0,0,0,0,h,0,0,0},{0,0,0,d,0,e,0,0,0},{0,d,0,h,0,0,0,0,0},{0,a,0,0,0,0,g,0,0},{0,0,0,0,c,0,0,b,e},{g,0,0,0,0,0,0,c,0},{0,0,i,0,b,0,d,0,g},{0,0,0,0,0,0,i,0,0}}},
      {{{d,a,c,e,h,g,i,f,b},{h,f,i,b,c,d,a,g,e},{b,e,g,f,a,i,d,c,h},{i,h,f,g,b,e,c,a,d},{g,b,a,h,d,c,f,e,i},{e,c,d,i,f,a,h,b,g},{c,d,h,a,e,b,g,i,f},{a,g,b,d,i,f,e,h,c},{f,i,e,c,g,h,b,d,a}},
                           {{0,a,0,0,0,g,0,0,0},{h,0,0,0,c,0,0,0,e},{0,0,g,0,0,0,d,0,0},{i,0,0,0,0,0,0,0,0},{0,0,a,0,d,0,0,e,0},{0,c,d,0,0,a,0,0,0},{0,0,h,a,e,0,0,0,f},{0,0,b,0,i,0,0,0,c},{0,0,0,c,g,0,0,d,0}}},
      {{{i,a,h,b,e,g,f,c,d},{g,f,e,a,d,c,h,b,i},{b,d,c,i,h,f,a,g,e},{f,i,b,d,g,a,e,h,c},{e,g,a,h,c,b,d,i,f},{h,c,d,e,f,i,g,a,b},{d,b,g,f,i,h,c,e,a},{c,e,i,g,a,d,b,f,h},{a,h,f,c,b,e,i,d,g}},
                           {{0,0,0,b,0,0,0,0,d},{0,0,0,0,d,0,h,b,0},{0,0,0,0,0,f,a,0,0},{f,0,0,0,g,0,e,0,c},{0,0,0,0,0,b,0,0,f},{0,0,d,e,0,i,0,0,0},{d,0,0,0,0,h,0,e,a},{c,e,0,0,0,d,b,0,0},{0,h,0,c,b,e,0,d,g}}}},
    {{{{e,g,b,f,i,a,h,d,c},{d,a,h,e,c,b,f,g,i},{f,c,i,d,h,g,b,e,a},{c,b,a,i,d,e,g,h,f},{g,f,e,h,a,c,d,i,b},{i,h,d,b,g,f,a,c,e},{h,d,c,a,b,i,e,f,g,i,b,d,c,a,h},{b,i,e,g,f,h,c,a,d,e,h,g,f,b,i},{a,f,g,c,e,d,i,b,h,c,a,f,e,g,d},{a,i,e,g,f,h,d,c,b},{h,c,f,b,d,i,g,e,a},{d,g,b,a,e,c,h,i,f},{g,d,i,h,c,b,a,f,e},{f,e,c,d,i,a,b,h,g},{b,h,a,f,g,e,i,d,c}},
                           {{0,0,0,f,0,0,h,0,c},{d,0,0,0,c,b,0,g,0},{f,c,0,d,0,g,0,0,0},{c,b,0,0,0,0,0,h,0},{g,f,e,0,0,0,d,0,b},{i,0,d,0,0,0,0,c,e},{0,0,c,0,b,0,e,0,g,0,0,0,c,a,0},{b,0,0,0,0,0,0,0,d,0,h,g,0,0,0},{0,0,0,c,e,d,i,0,h,0,a,0,0,g,0},{0,0,0,g,0,0,d,0,b},{0,c,0,b,0,0,0,0,a},{d,0,b,0,e,0,h,i,f},{g,0,0,0,0,0,a,0,0},{f,0,0,0,i,a,0,h,g},{0,0,a,f,g,0,i,0,c}}}}};
    //Los sudokus estan compuestos por variables en vez de por numeros para asi hacer aleatoriamente la disposicion de estos y que tengas un sudoku con numeros diferentes pero con el mismo modelo
    //Finalmente con un bucle extraemos el sudoku que queramos usar
    int [][] res;
    if(opcion==4)
    {
      int[][] solucion={{0,0,0,f,0,0,h,0,c},{d,0,0,0,c,b,0,g,0},{f,c,0,d,0,g,0,0,0},{c,b,0,0,0,0,0,h,0},{g,f,e,0,0,0,d,0,b},{i,0,d,0,0,0,0,c,e},{0,0,c,0,b,0,e,0,g,0,0,0,c,a,0},{b,0,0,0,0,0,0,0,d,0,h,g,0,0,0},{0,0,0,c,e,d,i,0,h,0,a,0,0,g,0},{0,0,0,g,0,0,d,0,b},{0,c,0,b,0,0,0,0,a},{d,0,b,0,e,0,h,i,f},{g,0,0,0,0,0,a,0,0},{f,0,0,0,i,a,0,h,g},{0,0,a,f,g,0,i,0,c}};
      for (int j=0; j<15; j++)
     {
       if ((j==6)||(j==7)||(j==8))
       {
         for (int j2=0; j2<15; j2++)
         {  
           solucion [j][j2]= sudokus[opcion-1][nivel-1][ejercicio][j][j2];
         }
       }
       
       else
       {
         for (int j2=0; j2<9; j2++)
         {
           solucion [j][j2]= sudokus[opcion-1][nivel-1][ejercicio][j][j2];
         }
       }
     }
      res=solucion;
    }
    else
    {
      int [][] solucion= new int[9][9];
      for (int j=0; j<9; j++)
      {
        for (int j2=0; j2<9; j2++)
        {
          solucion [j][j2]= sudokus[opcion-1][nivel-1][ejercicio][j][j2];
        }
      }
      res=solucion;
    }
    return res;
  }
  
  public static int[][] pista (int [][]a, int [][]b)
  {
    int cont=0;
    for (int c=0; c<9; c++)
    {
      for (int j=0; j<9; j++)
      {
        while(((a[c][j]==0)||(a[c][j]!=b[c][j]))&&(cont<1))
        {
          a[c][j]=b[c][j];
          cont++;
        }
      }
       System.out.println("");
    }
     return a;
   }
   public static void instrucciones()
  {
    System.out.println("Intrucciones del Sudoku:");
    System.out.println("");
    System.out.println("En cuanto al sudoku convencional, es un juego matemático que puede llegar a alcanzar una gran complegidad, a pesar de esto, no cuenta con un gran número de reglas");
    System.out.println("El sudoku se presenta normalmente como una tabla de 9 × 9, compuesta por subtablas de 3 × 3 denominadas regiones o bloques. Algunas celdas ya contienen números");
    System.out.println("El objetivo es rellenar las celdas vacías, con un número en cada una de ellas, de tal forma que cada columna, fila y región contenga los números 1–9 solo una vez.");
    System.out.println("");
    System.out.println("En este programa se te pedirá elegir una dificultad, ya sea facil, media o dificil. Al elegirla, dispondrás de de cuatro niveles y podrás escoger el que gustes");
    System.out.println("Cuando elijas un nivel, se te creará un Sudoku con algunos números como dato.Los 0s simbolizan las celdas vaías.");
    System.out.println("Para intoducir un numero en la posición deseada deberás darlo en coordenadas, es decir, si deseas introducir por ejemplo un dos en en la esquina inferior izquierda,");
    System.out.println("deberás introducir por teclado un 91, donde el nueve hace referencia ala fila nueve y el uno a la columna uno. Posteriormente pulsas enter e introduces el número ");
    System.out.println("deseado, en este caso el dos.");
    System.out.println("");
    System.out.println("PISTAS:");
    System.out.println("En el caso de que quieras pedir una pista se hace introduciendo un 0 en las coordenadas. Pero tienes un máximo de 3 pistas por partida. ");
    System.out.println("Las pistas funcionan de la siguiente manera: ");
    System.out.println("Cambia el primer 0 que tengas (pasando fila por fila) o Te cambia el primer numero que hayas introducido erroneamente.");
  }
   public static void ayudas()
  {
    System.out.println("Estas son las ayudas:");
    System.out.println("");
    System.out.println("1. Pista");
    //pista
    System.out.println("2. Comprobar solucion:");
    //comprobar soluciÃ³n
    System.out.println("3. Rendirse (y ver solucion):");
    System.out.println("0. Salir del menu:");
    }
     public static void ensenarMatrizDoble(int[][] tabla)
   {
     //fila de arriba
     System.out.println("+ - - - + - - - + - - - +");
     //blucle de matriz
     for (int i=0; i<15; i++)
     {
       if ((i==6)||(i==7)||(i==8))
       {
         if ((i==6))
         {
           System.out.println("+ - - - + - - - + - - - + - - - + - - - +");
         }
         for (int j=0; j<15; j++)
         {
           if (j==0)
             System.out.print("|");
           // la barra de inicio al empezar una linea
           System.out.print(" "+tabla[i][j]);
           // despues del tercer n?mero pone otra barra
           if(((j+1)%3==0))
             System.out.print(" |"); 
         }
       }
       else
       {
         if ((i==9))
         {
           System.out.println("+ - - - + - - - + - - - + - - - + - - - +");
         }
         if ((i==3))
         {
           System.out.println("+ - - - + - - - + - - - +");
         }
         if ((i==12))
         {
           System.out.println("                + - - - + - - - + - - - +");
         }
         if((i>=9))
           System.out.print("                ");
         for (int j=0; j<9; j++)
         {
           if ((j==0))
             System.out.print("|");
           // la barra de inicio al empezar una l?nea
           System.out.print(" "+tabla[i][j]);
           if(((j+1)%3==0))
             System.out.print(" |"); 
           //barra de separaci?n para las cajas cada 3
         }
       }
       System.out.println("");
       //salto de linea al final de cada linea
     }
     //ultima linea del borde de abajo
     System.out.println("                + - - - + - - - + - - - +");
     System.out.println(""); 
     int cont=0;
     int z;
      for(int i=0;i<15;i++)
       {
           if(i==6||i==7||i==8)
             z=15;
           else
             z=9;
         for(int j=0;j<z;j++)
         {
         if(tabla[i][j]==0)
         {
           cont++;
         }
       }
     }
     System.out.println("Te faltan "+ cont +" casillas por rellenar");
     System.out.println("Numeros restantes: ");
     System.out.print("{ ");
     for(int i=0;i<9;i++)
     {
       if(contar(tabla,i+1)==15)
       {}
       else
         System.out.print((i+1)+" ");
       
     }
     System.out.println("}");
     System.out.print("\n");
     }
     public static int contar(int[][] tabla,int x)
     {
       int y=0;
       int z=0;
       if(tabla[8].length>10)
       {
         for(int i=0;i<15;i++)
       {
           if(i==6||i==7||i==8)
             z=15;
           else
             z=9;
         for(int j=0;j<z;j++)
         {
           if(tabla[i][j]==x)
           {
           y++;
           }
           }
         }
         }
         else
         {
       for(int i=0;i<9;i++)
       {
         for(int j=0;j<9;j++)
         {
           if(tabla[i][j]==x){
           y++;
           }
         }
       }
       }
       return y;
     }
}