import java.util.Scanner;

public class PromedioPosicionesPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numeros = new int[10]; // Creamos un array para almacenar los números
        
        // Solicitamos al usuario que ingrese los 10 números
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        
        scanner.close(); // Cerramos el scanner
        
        int sumaPares = 0;
        int contadorPares = 0;
        
        // Calculamos la suma de los números en posiciones pares (considerando 0 como par)
        for (int i = 0; i < 10; i += 2) {
            sumaPares += numeros[i];
            contadorPares++;
        }
        
        // Calculamos el promedio de los números en posiciones pares y lo mostramos
        if (contadorPares > 0) {
            double promedioPares = (double) sumaPares / contadorPares;
            System.out.println("Promedio de números en posiciones pares: " + promedioPares);
        } else {
            System.out.println("No pusiste nada -_- qué crees que esto es magia");
        }
    }
}