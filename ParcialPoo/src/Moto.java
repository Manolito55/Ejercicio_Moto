
public class Moto {

	private String marca,modelo,patente;
	private int km_recorridos,combustible;
	private boolean estado_moto;
	
	public Moto(String marca, String modelo, String patente, int km_recorridos, int combustible, boolean estado_moto) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.patente = patente;
		this.km_recorridos = km_recorridos;
		this.combustible = combustible;
		this.estado_moto = estado_moto;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}
	public int getKm_recorridos() {
		return km_recorridos;
	}
	public void setKm_recorridos(int km_recorridos) {
		this.km_recorridos = km_recorridos;
	}
	public int getCombustible() {
		return combustible;
	}
	public void setCombustible(int combustible) {
		this.combustible = combustible;
	}
	public boolean isEstado_moto() {
		return estado_moto;
	}
	public void setEstado_moto(boolean estado_moto) {
		this.estado_moto = estado_moto;
	}
	
	
	
	
	
	
}
