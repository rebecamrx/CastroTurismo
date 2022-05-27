package br.com.rebeca.local;

import java.io.Serializable;

/**
 * htpps://www.github.com/rebecamrx/CastroTurismo.git
 * Classe que recebe os dados do Pais
 * @author rebeca.0902
 * @version 1.0.0
 * @since 1.0.0
 */

public class Estado implements Serializable {


	private static final long serialVersionUID = 1L;

	private Integer id;
	
	private String nome;
	
	private Pais pais;

	/**
	 * Metodo Construtor
	 */
	public Estado() {
		super();
		// TODO Auto-generated constructor stub
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

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
