package br.com.rebeca.local;

import java.io.Serializable;

public class Pais implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;
	
	private String nome;
	
	private Pais pais;

	/**
	 * Metodo Construtor
	 */
	public Pais() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param nome
	 * @param pais
	 */
	public Pais(Integer id, String nome, Pais pais) {
		super();
		this.id = id;
		this.nome = nome;
		this.pais = pais;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the pais
	 */
	public Pais getPais() {
		return pais;
	}

	/**
	 * @param pais the pais to set
	 */
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	

}
