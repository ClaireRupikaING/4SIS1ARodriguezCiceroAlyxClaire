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

class EstructurasControl {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opcion, numbinario, total, cantdadproducto, num1;
        float precio, compra = 0;
        String nombreproducto;
        String binario = "";
        char letra;

        do {
            System.out.println("Bienvenido al programa feo ;3");
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

            switch (opcion) {
                case 1:
                    System.out.println("El Total de su Compra es: " + compra);
                    System.out.println("Se Aplica un Descuento si es Mayor de Edad o Socio");
                    System.out.println("Ingrese su Edad: ");
                    int edad = entrada.nextInt();
                    System.out.println("Ingrese el Nombre de la Persona");
                    entrada.nextLine(); // Limpiar el buffer de entrada
                    String nombre = entrada.nextLine();

                    if (edad <= 21) {
                        System.out.println("Los Padres del Cliente son Socios ?");
                        System.out.println("(1) Si");
                        System.out.println("(2) No");
                        int opcionEdad = entrada.nextInt();

                        if (opcionEdad == 1) {
                            System.out.println("El Cliente: " + nombre + " Se le Aplica el Descuento del 45%");
                            total = (int) (compra * 0.45);
                            System.out.println("Su Total con Descuento es: " + total);
                        } else if (opcionEdad == 2) {
                            System.out.println("Los Padres del Cliente: " + nombre + " No son Socios");
                            System.out.println("Por lo cual solo se Aplicara el Descuento del 25%");
                            total = (int) (compra * 0.25);
                            System.out.println("Su Total con Descuento es: " + total);
                        }
                    } else if (edad >= 65) {
                        System.out.println("Al Cliente: " + nombre + " Se le Aplicara un Descuento del 40%");
                        total = (int) (compra * 0.40);
                        System.out.println("Su Total con Descuento es: " + total);

                    } else if (edad > 21 && edad < 65) {
                        System.out.println("Es Socio o tiene un Familiar que sea Socio ?");
                        System.out.println("(1) Si");
                        System.out.println("(2) No");
                        int opcionSocio = entrada.nextInt();

                        if (opcionSocio == 1) {
                            System.out.println("El Cliente: " + nombre + " Se le Aplica el Descuento del 45%");
                            total = (int) (compra * 0.45);
                            System.out.println("Su Total con Descuento es: " + total);
                        } else if (opcionSocio == 2) {
                            System.out.println("Los Padres del Cliente: " + nombre + " No son Socios");
                            System.out.println("Por lo cual solo se Aplicara el Descuento del 25%");
                            total = (int) (compra * 0.25);
                            System.out.println("Su Total con Descuento es: " + total);
                        }
                    }
                    break;
                case 2:
                    System.out.println("Ingrese un numero positivo entero que desee convertir a binario");
                    numbinario = entrada.nextInt();

                    if (numbinario > 0) {
                        while (numbinario > 0) {
                            if (numbinario % 2 == 0) {
                                binario = "0" + binario;
                            } else {
                                binario = "1" + binario;
                            }
                            numbinario = numbinario / 2;
                        }

                    } else if (numbinario == 0) {
                        binario = "0" + binario;
                    } else {
                        binario = "No se puede convertir un numero negativo no mms";
                    }
                    System.out.println("El número binario es: " + binario);
                    break;
                case 3:
                    System.out.println("Que Metodo de Conversion Quiere Usar");
                    System.out.println("(1) Convertir de Celcius a Fahrenheit, Celcius a Kelvine, Celcius a Rankine");
                    System.out.println("(2) Convertir de Fahrenheit a Celcius, Fahrenheit a Kelvine, Fahrenheit a Rankine");
                    System.out.println("(3) Convertir de Kelvine a Celcius, Kelvine a Fahrenheit, Kelvine a Rankine");
                    System.out.println("(4) Convertir de Rankine a Celcius, Rankine a Fahrenheit, Rankine a Kelvine");
                    int opcionConversion = entrada.nextInt();

                    float gradosC, gradosF, gradosK, gradosR;

                    switch (opcionConversion) {
                        case 1:
                            System.out.println("Escriba el Numero de Grados Celcius a Convertir");
                            gradosC = entrada.nextFloat();
                            gradosF = (float) (1.8 * gradosC) + 32;
                            gradosK = 273.15f + gradosC;
                            gradosR = (float) (1.8 * gradosC) + 491.67;
                            System.out.println("En Grados Fahrenheit son: " + gradosF + "°");
                            System.out.println("En Grados Kelvine son: " + gradosK + "°");
                            System.out.println("En Grados Rankine son: " + gradosR + "°");
                            break;
                        case 2:
                            System.out.println("Escriba el Numero de Grados Fahrenheit a Convertir");
                            gradosF = entrada.nextFloat();
                            gradosC = (gradosF - 32) / 1.8f;
                            gradosK = ((gradosF - 32) / 1.8f) + 273.15f;
                            gradosR = gradosF + 459.67f;
                            System.out.println("En Grados Celcius son: " + gradosC + "°");
                            System.out.println("En Grados Kelvine son: " + gradosK + "°");
                            System.out.println("En Grados Rankine son: " + gradosR + "°");
                            break;
                        case 3:
                            System.out.println("Escriba el Numero de Grados Kelvine a Convertir");
                            gradosK = entrada.nextFloat();
                            gradosC = gradosK - 273.15f;
                            gradosF = ((gradosK - 273.15f) * 1.8f) + 32;
                            gradosR = 1.8f * gradosK;
                            System.out.println("En Grados Celcius son: " + gradosC + "°");
                            System.out.println("En Grados Fahrenheit son: " + gradosF + "°");
                            System.out.println("En Grados Rankine son: " + gradosR + "°");
                            break;
                        case 4:
                            System.out.println("Escriba el Numero de Grados Rankine a Convertir");
                            gradosR = entrada.nextFloat();
                            gradosC = 5/9f * (gradosR - 491.67f);
                            gradosF = gradosR - 459.67f;
                            gradosK = 5/9f * gradosR;
                            System.out.println("En Grados Celcius son: " + gradosC + "°");
                            System.out.println("En Grados Fahrenheit son: " + gradosF + "°");
                            System.out.println("En Grados Kelvine son: " + gradosK + "°");
                            break;
                        default:
                            System.out.println("Opción más invalida que tus sueños.");
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Escriba la Cantidad de Numeros que va a Ingresar");
                    int n = entrada.nextInt();
                    int n1 = 0, n2 = 0, n3 = 0, n4 = 0;

                    if (n > 0) {
                        for (int i = 1; i <= n; i++) {
                            System.out.println("Ingrese los Numeros a Leer");
                            int num = entrada.nextInt();
                            if (num > 0) {
                                n1++;
                            } else if (num < 0) {
                                n2++;
                            } else if (num == 0) {
                                n3++;
                            }
                        }
                        System.out.println("Los Numeros Positivos son: " + n1);
                        System.out.println("Los Numeros Negativos son: " + n2);
                        System.out.println("Los Numeros Neutros son: " + n3);
                    } else {
                        System.out.println("La Cantidad Ingresada es Incorrecta");
                        System.out.println("Vuelva a ingresar, ahora con una cantidad correcta");
                    }
                    break;
                case 5:
                    System.out.println("Bienvenido a la tiendita gei");
                    System.out.println("Por favor ingrese el numero de productos que desea comprar");
                    total = entrada.nextInt();

                    for (int i = 1; i <= total; i++) {
                        System.out.println("Ingrese el nombre del producto: ");
                        nombreproducto = entrada.next();
                        System.out.println("Ingrese el precio: ");
                        precio = entrada.nextFloat();
                        System.out.println("Ingrese la cantidad del producto: ");
                        cantdadproducto = entrada.nextInt();
                        // operacion
                        float resultado = precio * cantdadproducto;
                        compra += resultado;

                    }
                    System.out.println("El total de la compra es: " + compra);
                    compra = 0;
                    break;
                case 6:
                    System.out.println("Elija una Opcion para Calcular su Perimetro y Area o Volumen");
                    System.out.println("(1) Rectangulo");
                    System.out.println("(2) Triangulo");
                    System.out.println("(3) Esfera");
                    System.out.println("(4) Cilindro");
                    n = entrada.nextInt();

                    switch (n) {
                        case 1:
                            System.out.println("Ingrese la Base");
                            double b = entrada.nextDouble();
                            System.out.println("Ingrese la Altura");
                            double h = entrada.nextDouble();

                            if (b <= 0 || h <= 0) {
                                System.out.println("Vuleve a Ingresar un Numero Entero Positivo");
                            } else {
                                double perimetro = (b * 2) + (h * 2);
                                double area = b * h;

                                System.out.println("El Perimetro es: " + perimetro);
                                System.out.println("El Area es: " + area);
                            }
                            break;
                        default:
                            System.out.println("Opción super invalida.");
                            break;
                    }
                    break;
                case 7:
                case 8:
                case 9:
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

            System.out.println("Deseas repetir el programa? Presiona S para Sí");
            letra = entrada.next().charAt(0);

        } while (letra == 's' || letra == 'S');
    }
}