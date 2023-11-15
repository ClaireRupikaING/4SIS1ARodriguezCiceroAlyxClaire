<<<<<<< HEAD
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;
=======
//Vamos a crear un programa mediante el cual debemos tener un menú
//de selección para elegir alguna de las 14 opciones sig:
//1: Bono o descuento por edad
//2: Convertir números decimales a binarios
//3: Convertir temperaturas
//4: Número de positivos y negativos
//5: Tiendita
//6: Área y Perímetro
//7: Tabla
//8: Factorial
//9: Dibujitos
//10: Figura Hueca
//11: Patrón
//12: Diamante
//13: Calculadora
//14: Salir

// Declarar son las librerías que vamos a ocupar
//Se debe estructurar el tipo de dato acorde a su entrada
// Si es entero obtenerlo como entero, si es char, obtenerlo como char

>>>>>>> 9371a9f4fe4ffa0a175e31f943868aef76c83cec
import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import com.sun.java.swing.*;
import com.sun.java.swing.table.*;
import com.sun.java.swing.event.*;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;


class EstructuraControl extends JPanel{
   BufferedImage image;
   Graphics2D g2d;

   public EstructuraControl(){
      super();
      init();
   }
    //si declaramos aqui las variables son globales
     //metodo pricipal

     private void init(){
      setBackground(Color, BLACK);
      image = new BufferedImage(640, 480, BufferedImage, TYPE_INT_RGB);
      g2d = image.createGraphics();
      g2d.setColor(Color.RED);
      g2d.setStroke(new BasicStroke(2));
      MouseAdapter mouseHandler = new MouseAdapter(){
         public void MousePressed(MouseEvent e){
         curtPoint.setLocation(e,getPoint());
         }
         public void mouseDragged(MouseEvent e){
            g2d.drawLine(curtPoint.x, curtPoint.y, e.getX(), e.getY());
            curtPoint.setLocation(e.getPoint());
            repaint();
         }
        };
      addMouseListener(mouseHandler);
      addMouseMotionListener(mouseHandler);
     }

     protected void paintComponent(Graphics g){
      super.paintComponent(g);
      g.drawImage(image, 0, 0, null);
     }

     private static EstructuraControl mMonitor;

     private Monitor(){ }

     public synchronized static Monitor getMonitor(){
      if(mMonitor == null){
         mMonitor = new Monitor();
      }
      return mMonitor;
     }

     public static void main(String[] args){
       
        Scanner entrada = new Scanner(System.in);
        
        int t, numFilasRombos, opcion, numbinario, total, cantidadproducto, num1, edad, n, n1 = 0, n2 = 0, n3 = 0, n4 = 0;
        double res = 0, total, volumen, r, b, h, l1, l2, l3, perimetro, area, volumen, gradosC, gradosF, gradosR, gradosK,factorial =1, compra1 =math.random();
        float precio, resultado = 0, compra = 0;
        String nombreproducto;
        String binario = "";
        String operacion;
        char letra ;
        boolean numeroCorrecto = false, comprobar = false;              
        do {
            //aqui va todo el programa 
            System.out.println ("Bienvenido al programa:3");
            System.out.println ("Elije alguna opcion deseada");
            System.out.println ("1- Descuento por edad ");
            System.out.println ("2- Covertir nuemro decimal a binario");
            System.out.println ("3- Covertir Temperaturas");
            System.out.println ("4- numeros positivos y negativos ");
            System.out.println ("5- tiendita");
            System.out.println ("6- Area y Perimetro");
            System.out.println ("7- tabla");
            System.out.println ("8- Factorial");
            System.out.println ("9- Dibujito");
            System.out.println ("10- Figura Hueca");
            System.out.println ("11- Patrones de Codigo");
            System.out.println ("12- Diamante ");
            System.out.println ("13- calculadora");
            System.out.println ("14- Salir");      
   
            opcion = entrada.nextInt();
   
            //menu
            switch(opcion){
               case 1: 
               System.out.println("El Total de su Compra es: "+ compra1);
               System.out.println("Se Aplica un Descuento si es Mayor de Edad o Socio");
               System.out.println("Ingrese su Edad: ");
               edad = entrada.nextInt();
               System.out.println("Ingrese el Nombre de la Persona");
               letra = entrada.nextline();
               
               if( edad <= 21 ){
                  System.out.println("Los Padres del Cliente son Socios ?");
                  System.out.println("(1) Si");
                  System.out.println("(2) No");
                  opcion = entrada.nextInt();

                  if(opcion == 1){
                     System.out.println("El Cliente: "+ letra+" Se le Aplica el Descuento del 45%");
                     total = compra1 * 0.45;
                     System.out.println("Su Total con Descuento es: "+total);
                  }else if(opcion == 2){
                     System.out.println("Los Padres del Cliente: "+letra+" No son Socios");
                     System.out.println("Por lo cual solo se Aplicara el Descuento del 25%");
                     total = compra1 * 0.25;
                     System.out.println("Su Total con Descuento es: "+total);
                  }
               }else if(edad <= 65){
                  System.out.println("Al Cliente: " + letra + " Se le Aplicara un Descuento del 40%");
                  total = compra1 * 0.40;
                  System.out.println("Su Total con Descuento es: "+total);

               }else if(edad > 21 && edad < 65){
                  System.out.println("Es Socio o tiene un Familiar que sea Socio ?");
                  System.out.println("(1) Si");
                  System.out.println("(2) No");
                  opcion = entrada.nextInt();

                  if(opcion == 1){
                     System.out.println("El Cliente: "+ letra+" Se le Aplica el Descuento del 45%");
                     total = compra1 * 0.45;
                     System.out.println("Su Total con Descuento es: "+total);
                  }else if(opcion == 2){
                     System.out.println("Los Padres del Cliente: "+letra+" No son Socios");
                     System.out.println("Por lo cual solo se Aplicara el Descuento del 25%");
                     total = compra1 * 0.25;
                     System.out.println("Su Total con Descuento es: "+total);
                  }
               }
               break;

               case 2:
                  //decimal a binario
                  System.out.println("Ingresa un Numero Positivo Entero que Desee Convertir a Binario");
                  numbinario = entrada.nextInt();
                  //primero tengo que saber que sea positivo
                  if(numbinario > 0){
                     //se cuantas veces el numero se va a dividir entre 2?
                     while (numbinario%2 == 0){
                        if(numbinario%2 == 0);{
                           binario = "0" + binario;
                        }
                        {
                           binario = "1" + binario;
                        }
                        numbinario = (int)numbinario/2;
                     }
   
                  }else if(numbinario == 0 ){
                      binario = "0" + binario;
                  }else if(numbinario <= 0){
                     binario = "No se puede convertir un  numero negativo solo positivo");
                  } 
                  System.out.println("el numero binario es: " + binario);
               break;

               case 3:
                    System.out.println("Que Metodo de Coversion Quiere Usar");
                    System.out.println("(1) Convertir de Celcius a Fahrenheit, Celcius a Kelvine, Celcius a Rankine");
                    System.out.println("(2) Convertir de Fahrenheit a Celcius, Fahrenheit a Kelvine, Fahrenheit a Rankine");
                    System.out.println("(3) Convertir de Kelvine a Celcius, Kelvine a Fahrenheit, Kelvine a Rankine");
                    System.out.println("(4) Convertir de Rankine a Celcius, Rankine a Fahrenheit, Rankine a Kelvine");
                    opcion = entrada.nextint();

                    if(opcion == 1){
                      System.out.println("Digite el Numero de Grados Celcius para Convertir");
                      gradosC = entrada.nextfloat();
                      gradosF = (1.8 * gradosC) + 32;
                      gradosK = 273.15 + gradosC;
                      gradosR = (1.8 * gradosC) + 491.67;
                      System.out.println("Los Grados Fahrenheit son: "+gradosF+"°");
                      System.out.println("Los Grados Kelvine son: "+gradosK+"°");
                      System.out.println("Los Grados Rankine son: "+gradosR+"°");

                    }else if(opcion == 2){
                     System.out.println("Digite el Numero de Grados Fahrenheit a Convertir");
                     gradosF = entrada.nextfloat();
                     gradosC = (gradosF - 32) / 1.8;
                     gradosK = ((gradosF - 32) / 1.8) + 273.15;
                     gradosR = gradosF + 459.67;
                     System.out.println("Los Grados Celcius son: "+gradosC+"°");
                     System.out.println("Los Grados Kelvine son: "+gradosK+"°");
                     System.out.println("Los Grados Rankine son: "+gradosR+"°");

                    }else if(opcion == 3){
                     System.out.println("Digite el Numero de Grados Kelvine a Convertir");
                     gradosK = entrada.nextfloat();
                     gradosC = gradosK - 273.15;
                     gradosF = ((gradosK - 273.15) * 1.8) + 32;
                     gradosR = 1.8 * gradosK;
                     System.out.println("Los Grados Celcius son: "+gradosC+"°");
                     System.out.println("Los Frados Fahrenheit son: "+gradosF+"°");
                     System.out.println("Los Grados Rankine son: "+gradosR+"°");

                    }else if(opcion == 4){
                     System.out.println("Digite el Numero de Grados Rankine a Convertir");
                     gradosR = entrada.nextfloat();
                     gradosC = 5/9 * (gradosR - 491.67);
                     gradosF = gradosR - 459.67;
                     gradosK = 5/9 * (gradosR);
                     System.out.println("Los Grados Celcius son: "+gradosC+"°");
                     System.out.println("Los Frados Fahrenheit son: "+gradosF+"°");
                     System.out.println("Los Grados Rankine son: "+gradosK+"°");
                    }
                break;

               case 4:
                  System.out.println("Digite la Cantidad de Numeros que va a Ingresar");
                  n = entrada.nextint();
                  if(n > 0){
                     for(int i = 1; i <= n; i++){
                        System.out.println("Ingrese los Numeros a Leer");
                        n1 = entrada.nextInt();
                        if(n1 > 0){
                           n2++;
                          
                        }else if(n1 < 0){
                           n3++;
                          
                        }else if(n1 ==0){
                           n4++;
                           
                        }
                     }
                     System.out.println("Los Numeros: "+n1+" "+n2+" Son Positivos");
                     System.out.println("Los Numeros: "+n1+" "+n2+" Son Negativos");
                     System.out.println("Los Numeros: "+n1+" "+n2+" Son Neutros");

                  }else if(n <= 0){
                     System.out.println("La Cantidad Ingresada es Incorrecta");
                     System.out.println("Vuelva a Ingresar UNA Cantidad Correcta");
                  }
                break;

               case 5:
                    System.out.println("Bienvenido a la tienda kawai");
                    System.out.println("Ingrese el nuemro de productos que desaa comprar");
                    total = entrada.nextInt();
                    for(int i=1; i<= total; i++){
                        System.out.println("Ingrese ele nombre del producto: ");
                        nombreproducto = entreda.next();
                        System.out.println("Ingrese el precio: ");
                        precio = entreda.nextfloat();
                        System.out.println("Ingrese la Cantidad de Productos: ");
                        cantidadproducto = entrada.nextInt();
                        compra = 0;
                        resultado = precio * cantidadproducto;
                        compra = compra + resultado;
                    }
                    System.out.println("El Total de la Compra es: "+compra);
               break;

               case 6:
                    System.out.println("Elija una Opcion para Calcular su Perimetro y Area o Volumen");
                    System.out.println("(1) Rectangulo");
                    System.out.println("(2) Triangulo");
                    System.out.println("(3) Esfera");
                    System.out.println("(4) Cilindro");
                    n = entrada.nextInt();

                    switch(n){
                     case 1:
                        System.out.println("Ingrese la Base");
                        b = entrada.nextdouble();
                        System.out.println("Ingrese la Altura");
                        h = entrada.nextdouble();

                        if(b <= 0 || h <= 0){
                           System.out.println("Vuleve a Ingresar un Numero Entero Positivo");
                        }else{
                           perimetro = (b * 2) + (h * 2);
                           area = b * h;

                           System.out.println("El Perimetro es: "+perimetro);
                           System.out.println("El Area es: "+area);
                        }
                     break;

                     case 2:
                         System.out.println("Elija un Tipo de Triangulo");
                         System.out.println("(1) Triangulo Equilatero");
                         System.out.println("(2) Triangulo Escaleno");
                         System.out.println("(3) Triangulo Isoseles");
                         t = engtrada.nextInt();
                        if(t == 1){
                           System.out.println("Ingrese la Base");
                           b = entrada.nextdouble();
                           System.out.println("Ingrese la Altura");
                           h = entrada.nextdouble();
                           System.out.println("Ingrese un Lado");
                           l1 = entrada.nextdouble();
                           if(b <= 0 || h <= 0){
                              System.out.println("Vuleve a Ingresar un Numero Entero Positivo");
                           }else{
                              perimetro = l1 * 3;
                              area = (b * h) / 2;
                              System.out.println("El Perimetro es: "+perimetro);
                              System.out.println("El Area es: "+area);
                        }
                        }else if(t == 2){
                           System.out.println("Ingrese la Base");
                           b = entrada.nextdouble();
                           System.out.println("Ingrese la Altura");
                           h = entrada.nextdouble();
                           System.out.println("Ingrese Lado1");
                           l1 = entrada.nextdouble();
                           System.out.println("Ingrese Lado2");
                           l2 = entrada.nextdouble();
                           System.out.println("Ingrese Lado3");
                           l3 = entrada.nextdouble();
                           if(b <= 0 || h <= 0 || l1 <= 0 || l2 <= 0 || l3 <= 0){
                              System.out.println("Vuleve a Ingresar un Numero Entero Positivo");
                           }else{
                              perimetro = l1 + l2 + l3;
                              area = (b * h) / 2;
                              System.out.println("El Perimetro es: "+perimetro);
                              System.out.println("El Area es: "+area);
                           }
                        }else if(t ==3){
                              System.out.println("Ingrese la Base");
                              b = entrada.nextdouble();
                              System.out.println("Ingrese la Altura");
                              h = entrada.nextdouble();
                              System.out.println("Ingrese Lado1");
                              l1 = entrada.nextdouble();
                              System.out.println("Ingrese Lado2");
                              l2 = entrada.nextdouble();
                           if(b <= 0 || h <= 0 || l1 <= 0 || l2 <= 0 ){
                              System.out.println("Vuleve a Ingresar un Numero Entero Positivo");
                           }else{
                              perimetro = l1 + (l2 * 2);
                              area = (b * h) / 2;
                              System.out.println("El Perimetro es: "+perimetro);
                              System.out.println("El Area es: "+area);
                           }
                        }
                           break;

                     case 3:
                         System.out.println("Ingrese el Radrio");
                         r = entrada.nextdouble();
                         if(r <= 0 ){
                           System.out.println("Vuleve a Ingresar un Numero Entero Positivo");
                        }else{
                         volumen = 4/3 * 3.1416 * r;
                         area = 4 * 3.1416 * (r*r);
                         System.out.println("El Area de la Esfera es: "+area);
                         System.out.println("El Volumen de la Esfera es: "+volumen);
                        }
                        break;

                     case 4:
                         System.out.println("Ingrese el radio");
                         r = entrada.nextdouble();
                         System.out.println("Ingrese la Altura");
                         h = entrada.nextdouble();
                         System.out.println("Ingrese la Base");
                         b = entrada.nextdouble();
                         if(r <= 0 || h <= 0){
                           System.out.println("Vuleve a Ingresar un Numero Entero Positivo");
                        }else{
                           area = 2 * 3.1416 * r * (r + h);
                           volumen = b * h;
                           System.out.println("El Area del Cilindro es: "+area);
                         System.out.println("El Volumen del Cilindro es: "+volumen);
                        }
                        break;                    
                break;
                
               case 7:
                   class ModeloDatos extends AbstractTableModel {
                   Object datos[][] = {
                     {"uno","dos","tres","cuatro"},
                     {"cinco","seis","siete","ocho"},
                     {"nueve","diez","once","doce"},
                    };
                     class TablaListener implements TableModelListener {
                     public void tableChanged( TableModelEvent evt ) {
                      for( int i=0; i < datos.length; i++ ) {
                          for( int j=0; j < datos[0].length; j++ )
                             System.out.print( datos[i][j] + " " );
                             System.out.println();
                       }
                      }
                     }
                    ModeloDatos() {
                    addTableModelListener( new TablaListener() );
                    }
<<<<<<< HEAD
                    public int getColumnCount() { 
                    return( datos[0].length ); 
                    }
                    public int getRowCount() { 
                    return( datos.length );
                    }
                    public Object getValueAt( int fila,int col ) { 
                    return( datos[fila][col] ); 
                    }
                    public void setValueAt( Object valor,int fila,int col ) {
                    datos[fila][col] = valor;
                    fireTableDataChanged();
                    }
                    public boolean isCellEditable( int fila,int col ) { 
                    return( true ); 
                    }
                    }       
                    public class java1416 extends JPanel {
                    public java1416() {
                    setLayout( new BorderLayout() );
                    JTable tabla = new JTable( new ModeloDatos() );
                    JScrollPane panel = new JScrollPane( tabla );
                    add( panel,BorderLayout.CENTER );
                    }
                    public void main(String args[]) {
                    JFrame frame = new JFrame( "Tutorial de Java, Swing" );
                    frame.addWindowListener( new WindowAdapter() {
                    public void windowClosing( WindowEvent evt ) {
                    System.exit( 0 );
                    }
                    } );
                    frame.getContentPane().add( new java1416(),BorderLayout.CENTER );
                    frame.setSize( 200,200 );
                    frame.setVisible( true );
                    }
                    } 
               break;
=======
                    break;
                case 7:
                  //vamos a imprimir un tabla
                  //un ciclo for
                  for(int n = 1; n <= 10; n++){
                    System.out.println(n + " " + (n*10) + " " + (n*100) + " " + (n*1000) + " " + (n*10000));
                  }
                  break;
                case 8:
                case 9:
                  System.out.println(x: "Cuadrado mágico");
                  System.out.println(x: "Ingrese el tamaño del cuadrado a pintar");
                  num1 = entrada.nextInt();

                  if(num1 >= 1 && num1 <= 20){
                    //ciclo para las filas
                    for(int i = 1; i <= num1; i++){
                        //imprimir columnas
                        for(int j = 1; j <= num1; j++){
                            System.out.print(s:"*");
                        }
                        System.out.println(x:"");
                    }     
                  }else{
                    System.out.println(x:"Ingresa solo numeros entre el 1 y 20");
                  }
                  break;
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
>>>>>>> 9371a9f4fe4ffa0a175e31f943868aef76c83cec

               case 8:
                 System.out.print("Introduce un numero entero >= 0: ");
                 n = entrada.nextInt();
                 if(n > 0){
                   for (int i = 1; i <= n; i++) {
                   factorial = factorial * i;
                   System.out.printf("%d! = %.0f %n", n, factorial);
                  }
                  }else if (n <= 0) {
                     System.out.println("Ingresa un Numero Mayor a 0");
                  }
                break;

               case 9:
                     public static void main (String[] args){
                        SwingUtilities.invokelater();{
                           JFrame frame = new JFrame("EstructuraControl");
                           frame.setMinimumsize(new Dimension(640, 480));
                           frame.setResizable(false);
                           frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                           frame.setContentPane(new EstructuraControl());
                           frame.setLocationRelativeTo(null);
                           frame.setVisible(true);
                        } 
                     }
                    break;

               case 10:
                      System.out.println("Ingrese el Ancho del Rectangulo");
                      int ancho = entrada.nextInt();
                      System.out.println("Ingrese la Altura del Rectangulo");
                      int altura = entrada.nextInt();
                      for(int fila = 1; fila <= altura; fila++){
                        for(int columna = 1; columna <= ancho; columna++){
                           if(fila == 1 || fila == alto || columna == 1 || columna == ancho){
                              System.out.println("°");
                           }else{
                              System.out.println(" ");
                           }
                        System.out.println("°");
                        }
                        System.out.println("");
                      }
                break;

               case 11:
                       System.out.println("Patron de Codigo o Diseño SINGLETON");
                       Thread t1 = new Thread(new Runnable()){
                        public void run(){
                           Monitor monitor1 = Monitor.getMonitor();
                           System.out.println(monitor1.hashCode());
                        }
                       };
                       };
                       Thread t2 = new Thread(new Runnable(){
                        public void run(){
                           Monitor monitor2 = Monitor.getMonitor();
                           System.out.println(monitor2.hashCode());
                        }
                       });
                       t1.start();
                       t2.start();
                break;

               case 12:
                     do {
                           System.out.print("Introduce el número de filas (natural e impar): ");
                           numFilasRombos = entrada.nextInt();
                           if(numFilasRombos > 0 && numFilasRombos %2 != 0){
                               numeroCorrecto = true;
                           }
                       } while (!numeroCorrecto); 
                       System.out.println("");
                        
                       int numFilas = numFilasRombos/2 + 1;       
                       for(int altura = 1; altura <= numFilas; altura++){
                           for(int blancos=1;blancos<=numFilas-altura;blancos++){
                               System.out.print(" ");
                           }
                           for(int minicirculos = 1; minicirculos <= (2*altura) - 1; minicirculos++){
                               System.out.print("°");
                           }
                           System.out.println(" ");         
                       }
                       numFilas--;
                       for(int altura = 1; altura <= numFilas; altura++){
                           for(int blancos = 1; blancos <= altura; blancos++){
                               System.out.print(" ");
                           }
                           for(int minicirculos = 1; minicirculos <= (numFilas-altura) * 2 + 1; minicirculos++){
                               System.out.print("°");
                           }
                           System.out.println();
                        
                        break;
                        case 13:
                     do{
                     String numero1;
                     do {
                      System.out.println("\n Ingrese el primer número de la operación. ");
                      numero1 = entrada.nextLine();
                     } while (!numero1.matches("[+-]?[\\d]*[.]?[\\d]+"));
                     double nume1 = Double.parseDouble(numero1);
                     double n1 = new String(numero1);
                     do {
                      System.out.println("\n ¿Que operación desea hacer? (Solo coloque un signo)");
                      System.out.println("Teniendo en cuenta que: \n + = sumar \n - = restar \n" + " x = multiplicar \n / = dividir \n * = elevar primer número al segundo numero."+ "\n % = residuo");
                           operacion = entrada.nextLine();
                      if (operacion.equals("+") || operacion.equals("-") || operacion.equals("x") ||
                          operacion.equals("X") || operacion.equals("/") || operacion.equals("%") ||
                          operacion.equals("*")) {
                          comprobar = true;
                          }else { comprobar = false; }
                         } while (comprobar != true);
                       String numero2;
                     do {
                      System.out.println("\n Por favor, dame el segundo número.");
                      numero2 = entrada.nextLine();
                      } while (!numero2.matches("[+-]?[\\d]*[.]?[\\d]+"));
                     double nume2 = Double.parseDouble(numero2);
                     double n2 = new String(numero2);
                     do{
                      comprobar = true;
                      switch(operacion){
                          case "+":
                              res = n1 + n2;
                              break;
                          case "-":
                              res = n1 - n2;
                              break;
                          case "x":
                          case "X":
                              res = n1 * n2;
                              break;
                          case "/":
                              
                              while(n2 == 0){
                                       do {
                                          System.err.println(" En el denominador se encuentra \n" + "un cero, para evitar errores coloca otro número.");
                                          numero2 = entrada.nextLine();
                                      }while (!numero2.matches("[+-]?[\\d]*[.]?[\\d]+"));
                                          nume2 = Double.parseDouble(numero2);
                                          n2 = new Double(numero2);
                              }
                              res = n1 / n2;
                              break;
                          case "*":
                              res = Math.pow(n1, n2);
                              break;
                          case "%":
                              while(n2 == 0){
                                       do {
                                          System.err.println(" En el denominador se encuentra \n"+ "un cero, para evitar errores coloca otro número.");
                                          numero2 = entrada.nextLine();
                                      }while (!numero2.matches("[+-]?[\\d]*[.]?[\\d]+"));
                                          nume2 = Double.parseDouble(numero2);
                                          n2 = new Double(numero2);
                              }
                              res = n1 % n2;
                              break;
                              }
                              }while(comprobar != true);
                              System.out.println("(" + numero1 + ") " + operacion + " (" + numero2 + ")" + " = " + res);
                              System.out.println("\n ¿Desea hacer alguna otra operación? \n");
                              System.out.println(" [s/n]");
                             do{
                             comprobar = true;
                             operacion = sc.nextLine();
       
                             switch (operacion) {
                             case "s":
                             case "S":
                             case "n":
                             case "N":
                             break;
                             default:
                              System.err.println("\n Error, ponga un literal valido. \n");
                              comprobar = false;
                             }
                             }while(comprobar != true);
                             }while(operacion.equals("s") || operacion.equals("S"));
               break;

               case 14:
                      System.exit(0);
                break;
                
               default:
                  System.out.println("Elije la opcion");
                  break;
                }

                //aqui adentro de preguntar
                System.out.println("Deseas repetir el programa?, escribe s para si ");
                //vamos a leer el primer caracter de la entrada por defectode de la computadora 
                letra = entrada.next().charAt(0);
            }while(letra == 's' || letra == 'S');
        }
    }
}