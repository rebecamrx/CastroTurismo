package br.com.rebeca.local;

import java.io.Serializable;

/**
 * htpps://www.github.com/rebecamrx/CastroTurismo.git
 * Classe que recebe os dados do Pais
 * @author rebeca.0902
 * @version 1.0.0
 * @since 1.0.0
 */

    public class Cidade implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	private String nome;
	
	private Estado estado;

	/**
	 * @param id
	 * @param nome
	 * @param estado
	 */
	public Cidade(Integer id, String nome, Estado estado) {
		super();
		this.id = id;
		this.nome = nome;
		this.estado = estado;
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
	 * @return the estado
	 */
	public Estado getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	}
