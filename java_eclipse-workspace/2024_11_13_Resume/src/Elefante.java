
public class Elefante extends Mammifero implements Must, Requirements, Comparable<Elefante> {

	private Double peso;
	
	
	public Elefante() {
		super();
		
	}


	public Elefante(Integer freq_resp, Integer freq_cardio, Double peso) {
		super(freq_resp, freq_cardio);
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Elefante [peso=" + peso + ", getFreq_resp()=" + getFreq_resp() + ", getFreq_cardio()="
				+ getFreq_cardio() + "]";
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	@Override
	public int compareTo(Elefante o) {
		return peso.compareTo(o.peso);
	}

	@Override
	public String get_class_name() {
		return "Elefante";
	}

	@Override
	public String get_version() {
		// TODO Auto-generated method stub
		return "1.0";
	}

	@Override
	public String get_serial() {
		// TODO Auto-generated method stub
		return "IJ20";
	}

	@Override
	public String verso() {
		// TODO Auto-generated method stub
		return "barrito";
	}

}
