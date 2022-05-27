package br.com.rebeca.application.pessoal;

import java.io.Serializable;

public class Passageiro implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer numeroCartao;
	
	private String vencimento;
	
	private Integer seguranca;
	
	private PessoaFisica pessoafisica;

	/**
	 * 
	 */
	public Passageiro() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param numeroCartao
	 * @param vencimento
	 * @param seguranca
	 * @param pessoafisica
	 */
	public Passageiro(Integer numeroCartao, String vencimento, Integer seguranca, PessoaFisica pessoafisica) {
		super();
		this.numeroCartao = numeroCartao;
		this.vencimento = vencimento;
		this.seguranca = seguranca;
		this.pessoafisica = pessoafisica;
	}

	/**
	 * @return the numeroCartao
	 */
	public Integer getNumeroCartao() {
		return numeroCartao;
	}

	/**
	 * @param numeroCartao the numeroCartao to set
	 */
	public void setNumeroCartao(Integer numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	/**
	 * @return the vencimento
	 */
	public String getVencimento() {
		return vencimento;
	}

	/**
	 * @param vencimento the vencimento to set
	 */
	public void setVencimento(String vencimento) {
		this.vencimento = vencimento;
	}

	/**
	 * @return the seguranca
	 */
	public Integer getSeguranca() {
		return seguranca;
	}

	/**
	 * @param seguranca the seguranca to set
	 */
	public void setSeguranca(Integer seguranca) {
		this.seguranca = seguranca;
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
