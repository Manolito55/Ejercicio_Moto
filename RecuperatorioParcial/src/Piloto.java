
public class Piloto extends Persona {
	
	private int vel_piloto,num_corredor;

	public Piloto(String nombre, int edad, int dni, int liencia, int vel_piloto, int num_corredor) {
		super(nombre, edad, dni, liencia);
		this.vel_piloto = vel_piloto;
		this.num_corredor = num_corredor;
	}

	public int getVel_piloto() {
		return vel_piloto;
	}

	public void setVel_piloto(int vel_piloto) {
		this.vel_piloto = vel_piloto;
	}

	public int getNum_corredor() {
		return num_corredor;
	}

	public void setNum_corredor(int num_corredor) {
		this.num_corredor = num_corredor;
	}

	@Override
	public String toString() {
		return "Informacion del Piloto [Numero de Corredorr=" + num_corredor + ", Nombre=" + getNombre() + ", Edad=" + getEdad()
				+ ", Dni=" + getDni() + ", Numero de Licencia=" + getLiencia()
				+ "]";
	}

		

}
