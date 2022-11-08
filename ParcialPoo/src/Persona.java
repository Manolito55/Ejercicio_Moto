
public abstract class Persona {
	
	private String nombre;
	private int edad,dni,liencia;
	
	public Persona(String nombre, int edad, int dni, int liencia) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.liencia = liencia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getLiencia() {
		return liencia;
	}

	public void setLiencia(int liencia) {
		this.liencia = liencia;
	}
	
	
	
	
	}

	

