package POO;

public class POO {
	public static void main (String [] args)	{
		
		Alumno alumno1 = new Alumno(1, "Oscar", "Sanchez");
		Alumno alumno2 = new Alumno(2, "Mario", "Lopez");
		Alumno alumno3 = new Alumno();
	
		System.out.println("ID: " + alumno1.getId()+ "\nNombre: " + alumno1.getNombre()+ "\nApellido: "+ alumno1.getApellido());
		System.out.println("ID: " + alumno2.getId()+ "\nNombre: " + alumno2.getNombre()+ "\nApellido: "+ alumno2.getApellido());
		
		alumno3.setId(3);
		alumno3.setNombre("Pablo");
		alumno3.setApellido("Flores");
		
		alumno3.getId();
		alumno3.getNombre();
		alumno3.getApellido();
		
		System.out.println("ID: " + alumno3.getId()+ "\nNombre: " + alumno3.getNombre()+ "\nApellido: "+ alumno3.getApellido());
		
		alumno2.setId(5);
		System.out.println("ID: " + alumno2.getId()+ "\nNombre: " + alumno2.getNombre()+ "\nApellido: "+ alumno2.getApellido());
		}
	}