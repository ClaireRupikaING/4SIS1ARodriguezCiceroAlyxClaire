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
import java.util.Scanner;

class EstructurasControl{

    //Método Principal
    public static void main(String[] args){
        //el manejo de objetos, nos ayuda a poder instancear, (mandando a llamar al objeto)
        //para hacer instancia, es necesario 1: Identificar el tipo de objeto
        //2: nombrar al objeto
        //3: Crear al objeto
        Scanner entrada = new Scanner (System.in);
        //Crear una instancia del objeto de la entrada por defecto de la computadora
        //Vamos a identificar con Scanner el tipo de dato qu ese está instanceando
        //Entrada es el objeto que va a poder identificar si es int, double, float, etc.
        
        //Es declarar a las variables que se van a utilizar en el programa
        //las variables son de dos tipos, globales y locales
        //Si declaro dentro de un método es local

        int opcion, numbinario, total, cantdadproducto, num1;
        float precio, resultado = 0, compra = 0;
        string nombreproducto;
        string binario = "";
        char letra;

        do{
            //aquí va todo el programa
            system.out.println("Bienvenido al programa feo ;3");
            System.out.println("Elije alguna opción deseada: ");
            System.out.println("1- Descuento por edad ");
            System.out.println("2- Convertir número decimal a binario ");
            System.out.println("3- Convertir Temperaturas");
            System.out.println("4- Números Positivos y Negativos");
            System.out.println("5- Tiendita");
            System.out.println("6- Area y Perímetro");
            System.out.println("7- Tabla");
            System.out.println("8- Factorial");
            System.out.println("9- Dibujito");
            System.out.println("10- Figura Hueca");
            System.out.println("11- Patrones de Código");
            System.out.println("12- Diamante");
            System.out.println("13- Calculadora");
            System.out.println("14- Salir");

            opcion = entrada.nextInt();

            //menu
            switch(opcion){
                case 1:
                   break;
                case 2:
                //Decimal a Binario
                 System.out.pintln("Ingresa un numero positivo entero que desee convertir a binario");
                 numbinario = entada.nextInt();
                 //Primero tengo que saber que sea positivo
                if(numbinario > 0 ){
                    //se cuantas veces el número se va a dividir entre 2?
                    while(numbinario >0){
                        if (numbinario%2 == 0){
                            binario = "0" + binario;
                        } else{
                            binario = "1" + binario;
                        }
                        numbinario = (int)numbinario/2;
                    }

                 } else if(numbinario == 0){
                    binario = "0" + binario;
                 }else{
                    binario = "No se puede convertir un numero negativo no mms";
                 }
                 System.out.println("El número binario es: " + binario);
                   break;
                case 3:
                   break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:    
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:    
                    break;
                case 11:
                    break;
                case 12:
                    break;
                case 13:
                    break;
                case 14:
                    break;


            }

            //aquí adentro de preguntar
            System.out.println("Deseas repetir el programa? Presiona S para Sí");
            //Vamos a leer elprimer caracter de la entrada por defecto de la computadora
            letra = entrada.next().charAt(0);


        } while (letra == 's' || letra == 'S');
    }
}