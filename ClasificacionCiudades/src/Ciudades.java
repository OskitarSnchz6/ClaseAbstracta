import java.util.HashMap;
import java.util.Map;

public class Ciudades {
    public static void main(String[] args) {
        // Crear un mapa con las temperaturas de las ciudades
        Map<String, Double> temperaturas = new HashMap<>();
        temperaturas.put("Aranjuez", 7.0);
        temperaturas.put("Arrecife", 20.0);
        temperaturas.put("Cartagena", 12.5);
        temperaturas.put("Jaca", 3.0);
        temperaturas.put("Las Palmas", 18.0);
        temperaturas.put("Milán", 4.5);
        temperaturas.put("Tolosa", 7.0);
        temperaturas.put("Madrid", 15.0); // Agrega la temperatura de Madrid

        // Ciudades que deseas clasificar
        String[] ciudades = {"Arrecife", "Badalona", "Tolosa", "Madrid"};

        // Clasificar las ciudades y mostrar los resultados
        for (String ciudad : ciudades) {
            Double temperatura = temperaturas.get(ciudad);
            if (temperatura != null) {
                char clasificacion = clasificarCiudad(temperatura);
                System.out.println(ciudad + ": " + clasificacion);
            } else {
                System.out.println(ciudad + ": D");
            }
        }
    }

    public static char clasificarCiudad(double temperatura) {
        if (temperatura <= 14.0) {
            return 'A';
        } else if (temperatura <= 24.0) {
            return 'B';
        } else if (temperatura > 24.0) {
            return 'C';
        } else {
            return 'D';
        }
    }
}
