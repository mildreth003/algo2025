package Ejercicios3;

import java.util.Scanner;

public class Ejercicio3 {
     public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        double euros , peseta;
        System.out.println("ingresa la cantidad de soles a covertir");
        euros = Teclado.nextDouble();
        peseta = euros /0.000053;
        System.out.println(" la cantidad de euros seria de" + peseta);
       }
}
