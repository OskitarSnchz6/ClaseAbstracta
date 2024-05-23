package Encapsulamiento;

public class Encapsulamiento {

	public static void main (String [] args) {
	Alumno alumno1 = new Alumno();
	Alumno alumno2 = new Alumno(2, "Oscar", "Sanchez");

	System.out.println("id: " + alumno2.getId());
	System.out.println("Nombre: " + alumno2.getNombre());
	System.out.println("Apellido: " + alumno2.getApellido());
	}
}