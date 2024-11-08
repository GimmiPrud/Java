
public class Paziente extends Persona implements Specs {
	// estende la superclasse persona e implementa un interfaccia 
	private String illnes;
	private Boolean codice_rosso;
	

	public Paziente(String nome, int età, String illnes, Boolean codice_rosso) {
		super(nome, età);
		this.illnes = illnes;
		this.codice_rosso = codice_rosso;
	}

	public String getIllnes() {
		return illnes;
	}

	
	public void setIllnes(String illnes) {
		this.illnes = illnes;
	}
	

	public Boolean getCodice_rosso() {
		return codice_rosso;
	}


	public void setCodice_rosso(Boolean codice_rosso) {
		this.codice_rosso = codice_rosso;
	}

	@Override
	public String toString() {
		return "Paziente [illnes=" + illnes + ", codice_rosso=" + codice_rosso + ", toString()=" + super.toString()
				+ "]";
	}

	@Override
	public String get_version() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String get_date() {
		// TODO Auto-generated method stub
		return null;
	}
	

	

}
