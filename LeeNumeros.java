public class LeeNumeros {
    public static void main(String[] args) {
        String linea;
        
        System.out.println("Ingrese el numero entero:");
        
        linea = System.console().readLine();
        
        int numero1;
        numero1 = Integer.parseInt(linea);

    System.out.println("Ingresa otro numero");
    linea= System.console().readLine();
     int numero2;
     
     numero2 = Integer.parseInt(linea);
     System.out.println("la suma es : "+(numero1+ numero2));
     }
}
