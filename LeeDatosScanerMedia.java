import java. util.Scanner;

public class LeeDatosScanerMedia {
    public static void main(String[] args) {
        Scanner a = new Scanner( System. in);

        System.out.println("Ingresa 3 numeros( con decimales) separados por un espacio");

        double num1 = a.nextDouble();
        double num2 = a.nextDouble();
        double num3 = a.nextDouble();
        double promedio = (num1 +num2 + num3);
        System.out.println("el promedio de esos tres numeros es:" + promedio);
        
    }
}
