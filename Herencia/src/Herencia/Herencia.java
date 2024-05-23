package Herencia;

public class Herencia {
	public static void main (String [] args)	{
		Empleado emple = new Empleado();
		
		emple.getNum_legajo();
		emple.getNombre();
		emple.getApellido();
		
		Consultor consultor = new Consultor();
		consultor.getNum_consultor();
		consultor.getNombre();
		consultor.getApellido();
		
		Persona vector [] = new Persona [5];
		vector [0] = new Persona();
		vector[1] = new Empleado();
		vector [2] = new Consultor();
		vector [3] = new Jefe();

		Persona persona = new Persona();
		persona = consultor;
	}
}
