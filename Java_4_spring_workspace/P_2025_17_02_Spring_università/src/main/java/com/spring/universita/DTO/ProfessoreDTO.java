package com.spring.universita.DTO;

public class ProfessoreDTO {
	
	private int ID; // key
	private String nome;
	private String cognome;
	private String materia_insegnamento;
	
	
	public ProfessoreDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ProfessoreDTO(int iD, String nome, String cognome, String materia_insegnamento) {
		super();
		ID = iD;
		this.nome = nome;
		this.cognome = cognome;
		this.materia_insegnamento = materia_insegnamento;
	}
	
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getMateria_insegnamento() {
		return materia_insegnamento;
	}
	public void setMateria_insegnamento(String materia_insegnamento) {
		this.materia_insegnamento = materia_insegnamento;
	}
	
	@Override
	public String toString() {
		return "Professore [ID=" + ID + ", nome=" + nome + ", cognome=" + cognome + ", materia_insegnamento="
				+ materia_insegnamento + "]";
	}
	
}
