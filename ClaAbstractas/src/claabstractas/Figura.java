package claabstractas;
import java.util.Scanner;

public abstract class Figura {
    protected double x; // posicion en x
    protected double y; // posicion en y

    public Figura() {
    }

    public Figura(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public abstract double calcularArea();

    public abstract void ingresarDatos(Scanner sc);
}