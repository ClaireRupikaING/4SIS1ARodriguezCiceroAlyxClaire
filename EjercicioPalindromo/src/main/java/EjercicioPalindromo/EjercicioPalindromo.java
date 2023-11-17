package EjercicioPalindromo;


import java.util.Scanner;

public class EjercicioPalindromo {
    public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {
            String linea = "";
            String invertir = "";
            char[] palindromo;
            int izq, der;

            System.out.println("Ingrese La Palabra o Mensaje");
            linea = entrada.nextLine();

            palindromo = linea.toCharArray();
            linea = linea.toLowerCase();
            linea = linea.replace("", "");
            izq = 0;
            der = palindromo.length - 1;

            while (izq < der) {
                if (palindromo[izq] == palindromo[der]) {
                    der--;
                    izq++;

                } else {
                    System.out.println("La Palabara " + linea + " No es un Palindromo");
                    break;
                }
            }
            if (izq == der) {
                for (int i = linea.length() - 1; i >= 0; i--) {

                    char car = linea.charAt(i);
                    invertir += car;
                }
                System.out.println("La Palabra o Mensaje es un Palindromo");
                System.out.println(" " + linea + " <- = ->  " + invertir);
            }
        }
    }
}