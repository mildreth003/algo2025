package Ejercicios2;

public class Ejejercicio4 {
    public static void main(String[] args) {
        //cantidad de soles a convertir
        int soles= 100;
        double tipodecambio=4.11;
     
        //Tipo de cambio( 1 euro=4.11 soles, por ejemplo)
        double euros = soles / tipodecambio;

        //mostrar resultado
        System.out.println(soles +" soles equivale a " + euros +"euros.");

        
    }
}
