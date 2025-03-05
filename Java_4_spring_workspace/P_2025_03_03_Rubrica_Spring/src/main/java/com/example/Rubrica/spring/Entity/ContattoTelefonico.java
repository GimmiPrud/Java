package com.example.Rubrica.spring.Entity;

public class ContattoTelefonico {
		
		private int id;
		private String nome;
		private String cognome;
		private int numero;
		private String gruppoDiAppartenenza;
		private String data_nascita;
		private Boolean preferito;
		
		
		public ContattoTelefonico( int id, String nome, String cognome, int numero, String gruppoDiAppartenenza, String data_nascita,
				Boolean preferito) {
			super();
			this.id = id;
			this.nome = nome;
			this.cognome = cognome;
			this.numero = numero;
			this.gruppoDiAppartenenza = gruppoDiAppartenenza;
			this.data_nascita = data_nascita;
			this.preferito = false;
		}
		
		
		public ContattoTelefonico() {
			super();
		}

		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
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
		public int getNumero() {
			return numero;
		}
		public void setNumero(int numero) {
			this.numero = numero;
		}
		public String getGruppoDiAppartenenza() {
			return gruppoDiAppartenenza;
		}
		public void setGruppoDiAppartenenza(String gruppoDiAppartenenza) {
			this.gruppoDiAppartenenza = gruppoDiAppartenenza;
		}
		public String getData_nascita() {
			return data_nascita;
		}
		public void setData_nascita(String data_nascita) {
			this.data_nascita = data_nascita;
		}
		public Boolean getPreferito() {
			return preferito;
		}
		public void setPreferito(Boolean preferito) {
			this.preferito = preferito;
		}

		
		@Override
		public String toString() {
			return "ContattoTelefonico [nome=" + nome + ", cognome=" + cognome + ", numero=" + numero
					+ ", gruppoDiAppartenenza=" + gruppoDiAppartenenza + ", data_nascita=" + data_nascita + ", preferito="
					+ preferito + "]";
		}
		
	}

