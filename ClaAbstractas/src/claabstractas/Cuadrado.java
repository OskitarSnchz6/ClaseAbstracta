package claabstractas;

import java.util.Scanner;

public class Cuadrado extends Figura {
    private double lado;

    public Cuadrado() {
    }

    public Cuadrado(double x, double y, double lado) {
        super(x, y);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public void ingresarDatos(Scanner sc) {
        System.out.print("Ingrese el lado del cuadrado: (Escribe ',' para los decimales)");
        this.lado = sc.nextDouble();
    }
}
