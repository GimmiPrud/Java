
public class Carta {
	
	private String seme;
	private Double numero;
	

	public Carta() {
		super();
	}

	public Carta(String seme, Double numero) {
		super();
		this.seme = seme;
		this.numero = numero;
	}
	
	public String getSeme() {
		return seme;
	}
	public void setSeme(String seme) {
		this.seme = seme;
	}
	public Double getNumero() {
		return numero;
	}
	public void setNumero(Double numero) {
		this.numero = numero;
	}
	
	
}
