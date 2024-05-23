package Herencia;

public class Jefe extends Persona{

	int jefe;
	String departamento_jefe;
	public Jefe() {
		super();
	}
	public Jefe(int jefe, String departamento_jefe, int id, String nombre, String apellido, String calle, String telefono) {
		super();
		this.jefe = jefe;
		this.departamento_jefe = departamento_jefe;
	}
	public int getJefe() {
		return jefe;
	}
	public void setJefe(int jefe) {
		this.jefe = jefe;
	}
	public String getDepartamento_jefe() {
		return departamento_jefe;
	}
	public void setDepartamento_jefe(String departamento_jefe) {
		this.departamento_jefe = departamento_jefe;
	}
	
	
	
	
}
