package Herencia;

public class Consultor extends Persona{

	String nombreCondultora;
	int num_consultor;
	public Consultor() {
		super();
	}
	public Consultor(String nombreCondultora, int num_consultor, int id, String nombre, String apellido, String calle, String telefono) {
		super(id, nombre, apellido, calle, telefono);
		this.nombreCondultora = nombreCondultora;
		this.num_consultor = num_consultor;
	}
	public String getNombreCondultora() {
		return nombreCondultora;
	}
	public void setNombreCondultora(String nombreCondultora) {
		this.nombreCondultora = nombreCondultora;
	}
	public int getNum_consultor() {
		return num_consultor;
	}
	public void setNum_consultor(int num_consultor) {
		this.num_consultor = num_consultor;
	}
	
	
	
	
}
