
import java.util.*;
import java.util.Scanner;

public class ArreglosMatriz {

    public void main(String[] args) {
        int arreglo[] = new int[10];

        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese un Valor de la Posicion del Arreglo: ");
            arreglo[i] = entrada.nextInt();
        }

        for (int j = 0; j < arreglo.length; j++) {
            System.out.println("El Valor Almacenado es: " + arreglo[j] + " Valor");
        }

        int matriz[][] = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            System.out.println(i);

            for (int j = 0; j < matriz.length; j++) {
                System.out.println(j);
                System.out.println("Ingresa el Valor de la fila: " + i + " Ingresa el Valor de la Columna: " + j);
                matriz[i][j] = entrada.nextInt();
            }
        }

        Scanner entrada = new Scanner(System.in);
        int sumarfilas = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                sumarfilas += matriz[i][j];
                System.out.println(String.format("%d", matriz[i][j]));
            }
            System.out.println(String.format("\n La suma de las Filas %f, El Promedio de la Fila &.2f", sumarfilas,
                    sumarfilas / matriz.length));

        }
    }

}
