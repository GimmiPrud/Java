package com.spring.Ecommerce.Entity;

import java.util.LinkedList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Venditore {
	
	@Id
	private Integer id;
	
	private String nome;
	private String cognome;
	private String username;
	private String password;
	private String via;
	private String citta;
	
	@OneToMany(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "FK_Venditore")
	private List<Prodotto> prodottiVendesi = new LinkedList<Prodotto>();
	

	public Venditore() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Venditore(Integer id, String nome, String cognome, String username, String password, String via,
			String citta) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.username = username;
		this.password = password;
		this.via = via;
		this.citta = citta;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getVia() {
		return via;
	}

	public void setVia(String via) {
		this.via = via;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	public List<Prodotto> getProdottiVendesi() {
		return prodottiVendesi;
	}

	public void setProdottiVendesi(List<Prodotto> prodottiVendesi) {
		this.prodottiVendesi = prodottiVendesi;
	}
	
	
	
	
}
