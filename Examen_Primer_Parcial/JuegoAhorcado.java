import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JuegoAhorcado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> palabras = new ArrayList<>(Arrays.asList("PROGRAMACION", "JAVA", "AHORCADO", "JUEGO"));

        System.out.println("¡Bienvenido al juego de Ahorcado!");

        while (!palabras.isEmpty()) {
            String palabra = seleccionarPalabra(palabras);
            int puntaje = 0;
            int intentosRestantes = 3;
            char[] palabraAdivinada = new char[palabra.length()];
            Arrays.fill(palabraAdivinada, '_');

            System.out.println("Palabra seleccionada: " + palabra);
            System.out.println("Pista 1: La palabra tiene " + palabra.length() + " letras.");
            System.out.println("Pista 2: La primera letra es " + palabra.charAt(0));
            System.out.println("Pista 3: La última letra es " + palabra.charAt(palabra.length() - 1));
            System.out.println("Comienza el juego...");

            while (intentosRestantes > 0) {
                System.out.println("Palabra actual: " + String.valueOf(palabraAdivinada));
                System.out.println("Intentos restantes: " + intentosRestantes);

                System.out.print("Ingresa una letra: ");
                char letra = scanner.next().toUpperCase().charAt(0);

                if (palabra.contains(String.valueOf(letra))) {
                    System.out.println("¡Acierto!");
                    for (int i = 0; i < palabra.length(); i++) {
                        if (palabra.charAt(i) == letra) {
                            palabraAdivinada[i] = letra;
                        }
                    }
                    puntaje += 10;
                } else {
                    System.out.println("¡Error!");
                    intentosRestantes--;
                    puntaje -= 5;
                }

                if (Arrays.equals(palabraAdivinada, palabra.toCharArray())) {
                    System.out.println("¡Felicidades, has adivinado la palabra!");
                    System.out.println("Tu puntaje final es: " + puntaje);
                    break;
                }
            }

            if (intentosRestantes == 0) {
                System.out.println("¡Has agotado tus intentos! La palabra era: " + palabra);
            }

            System.out.println("¿Quieres jugar de nuevo? (S/N)");
            String respuesta = scanner.next().toUpperCase();
            if (respuesta.equals("N")) {
                break;
            }
        }

        System.out.println("¡Gracias por jugar!");
    }

    private static String seleccionarPalabra(List<String> palabras) {
        int indice = (int) (Math.random() * palabras.size());
        return palabras.remove(indice);
    }
}