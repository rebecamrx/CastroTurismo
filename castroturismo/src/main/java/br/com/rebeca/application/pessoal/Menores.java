package br.com.rebeca.application.pessoal;

import java.io.Serializable;

/** 
 * htpps://www.github.com/rebecamrx/CastroTurismo.git
 * Classe que recebe os dados da Pessoa Fisica
 * @author rebeca.0902
 * @version 1.0.0
 * @since 1.0.0
 */

public class Menores implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Boolean autorizacaoEmbarque;
	
	private Passageiro responsavel;
	
	private PessoaFisica pessoafisica;

	/**
	 * 
	 */
	public Menores() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param autorizacaoEmbarque
	 * @param responsavel
	 * @param pessoafisica
	 */
	public Menores(Boolean autorizacaoEmbarque, Passageiro responsavel, PessoaFisica pessoafisica) {
		super();
		this.autorizacaoEmbarque = autorizacaoEmbarque;
		this.responsavel = responsavel;
		this.pessoafisica = pessoafisica;
	}

	/**
	 * @return the autorizacaoEmbarque
	 */
	public Boolean getAutorizacaoEmbarque() {
		return autorizacaoEmbarque;
	}

	/**
	 * @param autorizacaoEmbarque the autorizacaoEmbarque to set
	 */
	public void setAutorizacaoEmbarque(Boolean autorizacaoEmbarque) {
		this.autorizacaoEmbarque = autorizacaoEmbarque;
	}

	/**
	 * @return the responsavel
	 */
	public Passageiro getResponsavel() {
		return responsavel;
	}

	/**
	 * @param responsavel the responsavel to set
	 */
	public void setResponsavel(Passageiro responsavel) {
		this.responsavel = responsavel;
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
