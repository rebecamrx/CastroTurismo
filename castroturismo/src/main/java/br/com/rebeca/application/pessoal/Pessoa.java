package br.com.rebeca.application.pessoal;

import java.io.Serializable;

/**
 * htpps://www.github.com/rebecamrx/CastroTurismo.git
 * 
 * @author rebeca.0902
 * @version 1.0.0
 * @since 1.0.0
 */

public abstract class Pessoa<Cidade> implements Serializable  {
	
	private static final long serialVersionUID = 1L;

	private Integer id;
	
	private String nome;
	
	private String telefoneCelular;
	
	private String email;
	
	private String logradouro;
	
	private String complemento;
	
	private Integer numero;
	
	private Cidade Cidade;


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
	 * @return the telefoneCelular
	 */
	public String getTelefoneCelular() {
		return telefoneCelular;
	}

	/**
	 * @param telefoneCelular the telefoneCelular to set
	 */
	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the logradouro
	 */
	public String getLogradouro() {
		return logradouro;
	}

	/**
	 * @param logradouro the logradouro to set
	 */
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	/**
	 * @return the complemento
	 */
	public String getComplemento() {
		return complemento;
	}

	/**
	 * @param complemento the complemento to set
	 */
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	/**
	 * @return the numero
	 */
	public Integer getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	/**
	 * @return the cidade
	 */
	public Cidade getCidade() {
		return Cidade;
	}

	/**
	 * @param cidade the cidade to set
	 */
	public void setCidade(Cidade cidade) {
		Cidade = cidade;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * 
	 */
	public Pessoa() {
		super();
		// TODO Auto-generated constructor stub
	}
}
