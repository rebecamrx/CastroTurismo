package br.com.rebeca.application.pessoal;

import java.io.Serializable;

/** 
 * htpps://www.github.com/rebecamrx/CastroTurismo.git
 * Classe que recebe os dados da Pessoa Fisica
 * @author rebeca.0902
 * @version 1.0.0
 * @since 1.0.0
 */

public class Rodoviaria implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String horaAbertura;
	
	private String horaFechamento;
	
	private Double taxaDeEmbarque;

	/**
	 * 
	 */
	public Rodoviaria() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param horaAbertura
	 * @param horaFechamento
	 * @param taxaDeEmbarque
	 */
	public Rodoviaria(String horaAbertura, String horaFechamento, Double taxaDeEmbarque) {
		super();
		this.horaAbertura = horaAbertura;
		this.horaFechamento = horaFechamento;
		this.taxaDeEmbarque = taxaDeEmbarque;
	}

	/**
	 * @return the horaAbertura
	 */
	public String getHoraAbertura() {
		return horaAbertura;
	}

	/**
	 * @param horaAbertura the horaAbertura to set
	 */
	public void setHoraAbertura(String horaAbertura) {
		this.horaAbertura = horaAbertura;
	}

	/**
	 * @return the horaFechamento
	 */
	public String getHoraFechamento() {
		return horaFechamento;
	}

	/**
	 * @param horaFechamento the horaFechamento to set
	 */
	public void setHoraFechamento(String horaFechamento) {
		this.horaFechamento = horaFechamento;
	}

	/**
	 * @return the taxaDeEmbarque
	 */
	public Double getTaxaDeEmbarque() {
		return taxaDeEmbarque;
	}

	/**
	 * @param taxaDeEmbarque the taxaDeEmbarque to set
	 */
	public void setTaxaDeEmbarque(Double taxaDeEmbarque) {
		this.taxaDeEmbarque = taxaDeEmbarque;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
