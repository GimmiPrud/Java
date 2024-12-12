
public class Aereo {
	
	private String nome;
	private Integer n_posti_tot;
	
	public Aereo(String nome, Integer n_posti) {
		super();
		this.nome = nome;
		this.n_posti_tot = n_posti;
	}

	public Aereo() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getN_posti() {
		return n_posti_tot;
	}

	public void setN_posti(Integer n_posti) {
		this.n_posti_tot = n_posti;
	}

	@Override
	public String toString() {
		return "Aereo [nome=" + nome + ", n_posti=" + n_posti_tot + "]";
	}
	
	
	
	
	
	
	
	
	
}
