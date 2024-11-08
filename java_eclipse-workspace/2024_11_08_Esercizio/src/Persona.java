
public class Persona extends essere_vivente{
	
	private String nome;
	private int età;
	
	
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
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

	
	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", età=" + età + "]";
	}

	@Override
	public void set_colore_occhi(String s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void get_colore_occhi(String s) {
		// TODO Auto-generated method stub
		
	}
	


}
