package EjerciciosDeSentenciasCondicionales;

import java.util.Scanner;

public class Ejercicios1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner  (System.in);
        System.out.println(" por favor introduzca el numero de horas trabajadas durante la semana:");
        int horasTrabajadas= scanner.nextInt(); 

        int sueldo;
        if(horasTrabajadas <= 40) {
            sueldo = horasTrabajadas* 12;
        }else {
            int horasExtras = horasTrabajadas- 40;
            sueldo=(40*12) + (horasExtras * 16);

    }

    System.out.println(" el sueldo semanal que le corresponde es de " +sueldo+ " soles.");
       }
    }
