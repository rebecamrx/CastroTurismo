package br.com.rebeca.application.pessoal;

import java.io.Serializable;

public class Funcionario implements Serializable {

	/**
 * htpps://www.github.com/rebecamrx/CastroTurismo.git
 * Classe que recebe os dados da Pessoa Fisica
 * @author rebeca.0902
 * @version 1.0.0
 * @since 1.0.0
 * */
	
	private static final long serialVersionUID = 1L;
	
	private Integer numeroDeRegistro;
	
	private Boolean estAtivo;

	private PessoaFisica pessoafisica;
	/**
	 * 
	 */
	public Funcionario() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param numeroDeRegistro
	 * @param estAtivo
	 */
	public Funcionario(Integer numeroDeRegistro, Boolean estAtivo) {
		super();
		this.numeroDeRegistro = numeroDeRegistro;
		this.estAtivo = estAtivo;
	}

	/**
	 * @return the numeroDeRegistro
	 */
	public Integer getNumeroDeRegistro() {
		return numeroDeRegistro;
	}

	/**
	 * @param numeroDeRegistro the numeroDeRegistro to set
	 */
	public void setNumeroDeRegistro(Integer numeroDeRegistro) {
		this.numeroDeRegistro = numeroDeRegistro;
	}

	/**
	 * @return the estAtivo
	 */
	public Boolean getEstAtivo() {
		return estAtivo;
	}

	/**
	 * @param estAtivo the estAtivo to set
	 */
	public void setEstAtivo(Boolean estAtivo) {
		this.estAtivo = estAtivo;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}
