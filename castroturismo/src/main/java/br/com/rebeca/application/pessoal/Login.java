package br.com.rebeca.application.pessoal;

import java.io.Serializable;

public class Login implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	private String login;
	
	private String senha;
	
	private PessoaFisica pessoafisica;

	/**
	 * 
	 */
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param login
	 * @param senha
	 * @param pessoafisica
	 */
	public Login(Integer id, String login, String senha, PessoaFisica pessoafisica) {
		super();
		this.id = id;
		this.login = login;
		this.senha = senha;
		this.pessoafisica = pessoafisica;
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
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * @return the senha
	 */
	public String getSenha() {
		return senha;
	}

	/**
	 * @param senha the senha to set
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}

	/**
	 * @return the pessoafisica
	 */
	public PessoaFisica getPessoafisica() {
		return pessoafisica;
	}

	/**
	 * @param pessoafisica the pessoafisica to set
	 */
	public void setPessoafisica(PessoaFisica pessoafisica) {
		this.pessoafisica = pessoafisica;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
