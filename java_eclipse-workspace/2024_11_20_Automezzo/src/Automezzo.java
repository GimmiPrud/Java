
public abstract class Automezzo {
	
	private Integer numero_ruote;
	private String carburante;
	public abstract Integer get_max_speed();

	

	public Automezzo(Integer numero_ruote, String carburante) {
		super();
		this.numero_ruote = numero_ruote;
		this.carburante = carburante;
	}
	
	
	public Integer getNumero_ruote() {
		return numero_ruote;
	}
	
	public void setNumero_ruote(Integer numero_ruote) {
		this.numero_ruote = numero_ruote;
	}
	
	public String getCarburante() {
		return carburante;
	}
	
	public void setCarburante(String carburante) {
		this.carburante = carburante;
	}
	
	@Override
	public String toString() {
		return "Automezzo [numero_ruote=" + numero_ruote + ", carburante=" + carburante + "]";
	}
		


}