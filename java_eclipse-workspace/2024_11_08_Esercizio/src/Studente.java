
// creiamo la classe studente che estende la classe persona (nome,età)
public class Studente extends Persona implements Comparable<Studente>{
	// si comparano gli attributi dello stesso tipo di più oggetti uguali 
	// in questo caso di studenti 
	
	public static int studenti_creati = 0; 
	private String corso;
	private int anno_frequenza; // shift+alt+s per andare su source e creare il costruttore (e non solo) in modo più veloce 
	
	
	public String getCorso() {
		return corso;
	}


	public void setCorso(String corso) {
		this.corso = corso;
	}


	public int getAnno_frequenza() {
		return anno_frequenza;
	}


	public void setAnno_frequenza(int anno_frequenza) {
		this.anno_frequenza = anno_frequenza;
	}
	
	
	@Override
	public String toString() {
		return "Studente [corso=" + corso + ", anno_frequenza=" + anno_frequenza + ", toString()=" + super.toString()
				+ "]\n";
	}

	public Studente() {
		super();
	}


	public Studente(String nome, int età, String corso, int anno_frequenza) {
		super(nome, età); // eredita gli attributi dalla superclasse Persona
		this.corso = corso;
		this.anno_frequenza = anno_frequenza;
		
		studenti_creati ++;
	}
	
	@Override
	public int compareTo(Studente o) {
		return getNome().compareTo(o.getNome());
		
	}
		
	
}




