import java.util.Scanner;
import java.util.Random;

public class JuegoGato {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Hola usuario... Quiero jugar un juego...");
        System.out.println("...¡Bienvenido al juego de Gato!");

        while (true) {
            char[][] tablero = inicializarTablero();
            boolean jugador1 = true; // True representa al Jugador 1, False representa a la CPU

            while (true) {
                imprimirTablero(tablero);

                if (jugador1) {
                    System.out.println("Turno del Jugador 1 (X). Ingresa la fila (0-2) y la columna (0-2):");
                    int fila = scanner.nextInt();
                    int columna = scanner.nextInt();

                    if (esMovimientoValido(tablero, fila, columna)) {
                        realizarMovimiento(tablero, fila, columna, 'X');
                        if (haGanado(tablero, 'X')) {
                            imprimirTablero(tablero);
                            System.out.println("Haz tenido suerte esta vez... Ganaste");
                            break;
                        }
                        jugador1 = false;
                    } else {
                        System.out.println("Movimiento tan invalido como tus sueños :c");
                    }
                } else {
                    System.out.println("Turno de la CPU Terminator (O).");
                    int filaCPU, columnaCPU;

                    do {
                        filaCPU = rand.nextInt(3);
                        columnaCPU = rand.nextInt(3);
                    } while (!esMovimientoValido(tablero, filaCPU, columnaCPU));

                    realizarMovimiento(tablero, filaCPU, columnaCPU, 'O');
                    if (haGanado(tablero, 'O')) {
                        imprimirTablero(tablero);
                        System.out.println("Te ha ganado una CPU que fue programada con fragmentos de código sacados de internet y un entendimiento medio de parte de quien lo programó");
                        break;
                    }
                    jugador1 = true;
                }

                if (tableroLleno(tablero)) {
                    imprimirTablero(tablero);
                    System.out.println("Ha habido un empate, que conveniente");
                    break;
                }
            }

            System.out.println("¿Quieres jugar de nuevo? (S/N)");
            String respuesta = scanner.next().toUpperCase();
            if (respuesta.equals("N")) {
                break;
            }
        }

        System.out.println("¡Gracias por jugar!");
        scanner.close(); // Cierra el objeto Scanner al final del programa
    }

    private static char[][] inicializarTablero() {
        char[][] tablero = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = ' ';
            }
        }
        return tablero;
    }

    private static void imprimirTablero(char[][] tablero) {
        System.out.println("Tablero:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j]);
                if (j < 2) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println("---------");
            }
        }
    }

    private static boolean esMovimientoValido(char[][] tablero, int fila, int columna) {
        return fila >= 0 && fila < 3 && columna >= 0 && columna < 3 && tablero[fila][columna] == ' ';
    }

    private static void realizarMovimiento(char[][] tablero, int fila, int columna, char jugador) {
        tablero[fila][columna] = jugador;
    }

    private static boolean haGanado(char[][] tablero, char jugador) {
        // Comprobar filas
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] == jugador && tablero[i][1] == jugador && tablero[i][2] == jugador) {
                return true;
            }
        }

        // Comprobar columnas
        for (int j = 0; j < 3; j++) {
            if (tablero[0][j] == jugador && tablero[1][j] == jugador && tablero[2][j] == jugador) {
                return true;
            }
        }

        // Comprobar diagonales
        if ((tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador) ||
            (tablero[0][2] == jugador && tablero[1][1] == jugador && tablero[2][0] == jugador)) {
            return true;
        }

        return false;
    }

    private static boolean tableroLleno(char[][] tablero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}