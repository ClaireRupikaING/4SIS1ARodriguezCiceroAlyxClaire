import java.util.Scanner;

public class PromedioValores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numeros = new int[10]; // Creamos un array para almacenar los números
        
        // Solicitamos al usuario que ingrese los 10 números
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        
        scanner.close(); // Cerramos el scanner
        
        int sumaPositivos = 0;
        int contadorPositivos = 0;
        int sumaNegativos = 0;
        int contadorNegativos = 0;
        
        // Calculamos la suma de positivos y negativos, y contamos cuántos hay de cada tipo
        for (int numero : numeros) {
            if (numero > 0) {
                sumaPositivos += numero;
                contadorPositivos++;
            } else if (numero < 0) {
                sumaNegativos += numero;
                contadorNegativos++;
            }
        }
        
        // Calculamos el promedio de los valores positivos y lo mostramos
        if (contadorPositivos > 0) {
            double promedioPositivos = (double) sumaPositivos / contadorPositivos;
            System.out.println("Promedio de valores positivos: " + promedioPositivos);
        } else {
            System.out.println("No se ingresaron valores positivos");
        }
        
        // Mostramos la suma de los valores negativos
        System.out.println("Suma de valores negativos: " + sumaNegativos);
    }
}