package Ejercicios3;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
         Scanner a = new Scanner( System. in);

        System.out.println("Ingresa 2 numeros( con decimales) separados por un espacio");

        double num1 = a.nextDouble();
        double num2 = a.nextDouble();
        double promedio = (num1 * num2 );
        System.out.println("el promedio de esos tres numeros es:" + promedio);
        
    }
}
