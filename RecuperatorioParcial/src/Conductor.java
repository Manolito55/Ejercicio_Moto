
public class Conductor extends Persona{
	
	private int vel_conductor;

	public Conductor(String nombre, int edad, int dni, int liencia, int vel_conductor) {
		super(nombre, edad, dni, liencia);
		this.vel_conductor = vel_conductor;
	}

	public int getVel_conductor() {
		return vel_conductor;
	}

	public void setVel_conductor(int vel_conductor) {
		this.vel_conductor = vel_conductor;
		
	}

	@Override
	public String toString() {
		return "Informacion del Conductor [Nombre=" + getNombre() + ", Edad=" + getEdad() + ", Dni=" + getDni()
				+ ", Liencia=" + getLiencia() + "]";
	}

}
