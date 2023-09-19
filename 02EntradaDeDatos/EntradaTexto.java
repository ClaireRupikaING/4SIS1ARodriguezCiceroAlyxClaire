//Debe de tener una clase
// public class   class???

//Variable int num por defecto es público  public int num
//Librería
import java.io.*;

class EntradaTexto{

    //debe de existir un método principal
    public static void main(String[] args) throws IOException {
        //Debemos de crear una estructura básica
        //Declaración
        //String nombre;
        char nombre;
        //mensaje para el usuario
        System.out.print("Por favor ingrese su nombre: ");
        //ln es para salto de linea

        //asignar qué operación o comportamiento le voy a otorgar a la variable
        //nombre = System.console().readLine();
        nombre = (char)System.in.read();

        //System es la clase de sistema
        //console() es el método qe puede obtener los datos de la consola
        //readLine() es el método que puede dar lectura a los datos introducidos en la consola

        System.out.println("Hola " + nombre + " Bienvenida a tronar wiiii");

    }
}