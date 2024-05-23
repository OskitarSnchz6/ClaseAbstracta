package claabstractas;
import java.util.Scanner;

public class ClaAbstractas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Figura figura = null;
        boolean opcionValida = false;

        while (!opcionValida) {
            System.out.println("¿Qué área quieres averiguar? \n1. Cuadrado \n2. Círculo");
            int opcion = sc.nextInt();
            
            switch (opcion) {
                case 1:
                    figura = new Cuadrado();
                    figura.ingresarDatos(sc);
                    opcionValida = true;
                    break;
                case 2:
                    figura = new Circulo();
                    figura.ingresarDatos(sc);
                    opcionValida = true;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige 1 para Cuadrado o 2 para Círculo.");
                    break;
            }
        }
        
        System.out.println("El área es: " + figura.calcularArea());
    }
}