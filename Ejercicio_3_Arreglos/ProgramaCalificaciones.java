import java.util.Scanner;

public class ProgramaCalificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double[] calificaciones = new double[10]; // Creamos un array para almacenar las calificaciones
        
        System.out.println("----Sistema de calificaiones feas de Claire----");

        // Solicitamos al usuario que ingrese las 10 calificaciones
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese la calificación del alumno " + (i + 1) + ": ");
            calificaciones[i] = scanner.nextDouble();
        }
        
        // Calculamos el promedio de las calificaciones
        double sumaCalificaciones = 0;
        for (double calificacion : calificaciones) {
            sumaCalificaciones += calificacion;
        }
        double promedio = sumaCalificaciones / 10;
        
        // Menú de opciones
        while (true) {
            System.out.println("\nElija una opción:");
            System.out.println("1. Imprimir todas las calificaciones");
            System.out.println("2. Promedio de las calificaciones");
            System.out.println("3. Calificación más alta y más baja");
            System.out.println("4. Número de calificaciones superiores al promedio");
            System.out.println("5. Cantidad de alumnos aprobados y reprobados");
            System.out.println("6. Salir");
            System.out.print("Opción: ");
            
            int opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    // Imprimir todas las calificaciones
                    System.out.println("Calificaciones:");
                    for (int i = 0; i < 10; i++) {
                        System.out.println("Alumno " + (i + 1) + ": " + calificaciones[i]);
                    }
                    break;
                
                case 2:
                    // Promedio de las calificaciones
                    System.out.println("Promedio de las calificaciones: " + promedio);
                    break;
                
                case 3:
                    // Calificación más alta y más baja
                    double maximaCalificacion = calificaciones[0];
                    double minimaCalificacion = calificaciones[0];
                    for (double calificacion : calificaciones) {
                        if (calificacion > maximaCalificacion) {
                            maximaCalificacion = calificacion;
                        }
                        if (calificacion < minimaCalificacion) {
                            minimaCalificacion = calificacion;
                        }
                    }
                    System.out.println("Calificación más alta: " + maximaCalificacion);
                    System.out.println("Calificación más baja: " + minimaCalificacion);
                    break;
                
                case 4:
                    // Número de calificaciones superiores al promedio
                    int contadorSuperioresAlPromedio = 0;
                    for (double calificacion : calificaciones) {
                        if (calificacion > promedio) {
                            contadorSuperioresAlPromedio++;
                        }
                    }
                    System.out.println("Número de calificaciones superiores al promedio: " + contadorSuperioresAlPromedio);
                    break;
                
                case 5:
                    // Cantidad de alumnos aprobados y reprobados
                    int aprobados = 0;
                    int reprobados = 0;
                    for (double calificacion : calificaciones) {
                        if (calificacion >= 6.0) {
                            aprobados++;
                        } else {
                            reprobados++;
                        }
                    }
                    System.out.println("Cantidad de alumnos aprobados: " + aprobados);
                    System.out.println("Cantidad de alumnos reprobados: " + reprobados);
                    break;
                
                case 6:
                    // Salir del programa
                    scanner.close();
                    System.out.println("Chao ;3");
                    System.exit(0);
                
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        }
    }
}