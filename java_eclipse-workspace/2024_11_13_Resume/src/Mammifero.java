
public abstract class Mammifero {
	
	private Integer freq_resp;
	private Integer freq_cardio;
	public abstract String verso();
	
//	costruttore
	public Mammifero(Integer freq_resp, Integer freq_cardio) {
		super();
		this.freq_resp = freq_resp;
		this.freq_cardio = freq_cardio;
	}
//	cotruttore vuoto 
	public Mammifero() {
		super();
	}
	
	// tostring
	@Override
	public String toString() {
		return "Mammifero [freq_resp=" + freq_resp + ", freq_cardio=" + freq_cardio + "]";
	}
	
// getter e setter 
	public Integer getFreq_resp() {
		return freq_resp;
	}

	public void setFreq_resp(Integer freq_resp) {
		this.freq_resp = freq_resp;
	}

	public Integer getFreq_cardio() {
		return freq_cardio;
	}

	public void setFreq_cardio(Integer freq_cardio) {
		this.freq_cardio = freq_cardio;
	}
	
	
		
	
}
