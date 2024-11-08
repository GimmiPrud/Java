
public class Persona {
	
	private String nome;
	private int età;
	
	public Persona() {
		super();
	}
	
	public Persona(String nome, int età) {
		super();
		this.nome = nome;
		this.età = età;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getEtà() {
		return età;
	}

	public void setEtà(int età) {
		this.età = età;
	}
	
	public String toString() {
		return "Persona [ nome= "+ nome +", "+ "età= "+ età +"]";
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
