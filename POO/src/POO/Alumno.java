package POO;

public class Alumno {
	
	int id;
	String nombre;
	String apellido;
	
	//Constructor
	
	public Alumno() {
		
	}
	
	public Alumno(int id, String nombre, String apellido) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	//Getter y Setter
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	//Acciones que va a realizar el alumno
	
	//Modificador de acceso
	
	public void mostrarNombre()	{
		System.out.println("Hola, soy el alumno y se decir mi nombre");
	}
	
	
	public void saberAprobado(double calificacion) {
		if (calificacion>=5)
		System.out.println("Aprobé");
		else {
			System.out.println("Suspendí");
		}
	}
}