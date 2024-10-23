
public class Computer2 {
	
	static int contatore = 0;
	
	private double prezzo;
	private double peso;
	private double larghezza;
	private double altezza;
	private double profondita;
	private String produttore;
	private int annoProduzione;
	
	// per creare il costruttore, tasto destro e andare su source 
	public Computer2(Double prezzo, Double peso, Double larghezza, Double altezza, Double profondita, String produttore,
			Integer annoProduzione) {
		super();
		this.prezzo = prezzo;
		this.peso = peso;
		this.larghezza = larghezza;
		this.altezza = altezza;
		this.profondita = profondita;
		this.produttore = produttore;
		this.annoProduzione = annoProduzione;
		
		contatore ++;
		
	}

	public Computer2() {
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
;	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getLarghezza() {
		return larghezza;
	}

	public void setLarghezza(double larghezza) {
		this.larghezza = larghezza;
	}

	public double getAltezza() {
		return altezza;
	}

	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}

	public double getProfondita() {
		return profondita;
	}

	public void setProfondita(double profondita) {
		this.profondita = profondita;
	}

	public String getProduttore() {
		return produttore;
	}

	public void setProduttore(String produttore) {
		this.produttore = produttore;
	}

	public int getAnnoProduzione() {
		return annoProduzione;
	}

	public void setAnnoProduzione(int annoProduzione) {
		this.annoProduzione = annoProduzione;
	}
	
	// toString è un metodo object che richiama tutte le variabili dell'oggetto
	@Override
	public String toString() {
		return "Computer2 [prezzo= " + prezzo + ", peso= " + peso + ", larghezza= " + larghezza + ", altezza= " + altezza
				+ ", profondita= " + profondita + ", produttore= " + produttore + ", annoProduzione= " + annoProduzione
				+ "]";
	}

}
