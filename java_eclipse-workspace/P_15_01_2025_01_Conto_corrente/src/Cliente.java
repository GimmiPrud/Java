
public class Cliente extends Thread {
	
	private String nome;
	private Integer somma;
	
	public Cliente(String nome, Integer somma) {
		super();
		this.nome = nome;
		this.somma = somma;
		
	}
	
	public Cliente() {
		super();

	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Integer getSomma() {
		return somma;
	}
	
	public void setSomma(Integer somma) {
		this.somma = somma;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", somma=" + somma + "]";
	}
	
	

}
