package 07 Cadenas;

import java.util.*;

public class cadena {
    Scanner entrada = new Scanner(System.in);

    public void cadenas(){
        String s1 = "El Gato Volador y su Amigo el Mapche Atomico";

        System.out.println("El Tamño de la Cadena es: "+ s1.length() );

        System.out.println("La Cadena Empieza (V) verdadero o (F) falso con la Palabra Hola ?: " + s1.startsWith("Hola"));

        System.out.println("La Cadena Finaliza (V) verdadero o (F) falso con la Palabra Atomico ?: " + s1.endsWith("Atomico"));

        System.out.println("Ingrese la Palabbra: ");
        String s2 = entrada.nextLine();

        System.out.println("Parte de una Cadena de s1 es: "+ s1.indexOf("mico"));

        System.out.println("Primera Parte de s1: "+ s1.substring(12);

        System.out.println("Segunda Parte de s1: "+ s1.substring(14, 20));

        int valor = 24;

        String s3 = String.valueOf(valor);

        System.out.println("Asi es como se Convierte un Valor de: "+valor+" e una Cadena"+ s3);

        String s4 = "20";

        int numero = Integer.parseInt(s4);

        System.out.println("Asi es como se Convuerte una Cadena: "+s4+" a un Valor: "+numero);

        int suma = valor + numero;

        System.out.println(suma);

        String s5 = "562.265";

        double numero1 = Double.parseDouble(s5);

        System.out.println(numero1);

        numero1 = valor + numero1;

        System.out.println(numero1);

        Integer x = 5;

        System.out.println("El Valor de: "+x.toString()+" Ahora es una Cadena");

        System.out.println("Otra Forma de Transformarlo"+Integer.toString(12)+" Ahora es una cadena");
    }
}
