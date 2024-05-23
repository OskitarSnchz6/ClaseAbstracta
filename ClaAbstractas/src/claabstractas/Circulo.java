package claabstractas;
import java.util.Scanner;

public class Circulo extends Figura {
    private double radio;

    public Circulo() {
    }

    public Circulo(double x, double y, double radio) {
        super(x, y);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public void ingresarDatos(Scanner sc) {
        System.out.print("Ingrese el radio del círculo: (Escribe ',' para los decimales)");
        this.radio = sc.nextDouble();
    }
}
