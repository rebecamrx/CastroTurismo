package br.com.rebeca.application.pessoal;

import java.io.Serializable;
import java.util.Date;

/**
 * htpps://www.github.com/rebecamrx/CastroTurismo.git
 * Classe que recebe os dados da Pessoa Juridica
 * @author rebeca.0902
 * @version 1.0.0
 * @since 1.0.0
 */

public class PessoaJuridica implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer xCNPJ;
	
	private Integer inscricaoEstadual;
	
	private Date dataAbertura;

	/**
	 * 
	 */
	public PessoaJuridica() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the xCNPJ
	 */
	public Integer getxCNPJ() {
		return xCNPJ;
	}

	/**
	 * @param xCNPJ the xCNPJ to set
	 */
	public void setxCNPJ(Integer xCNPJ) {
		this.xCNPJ = xCNPJ;
	}

	/**
	 * @return the inscricaoEstadual
	 */
	public Integer getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	/**
	 * @param inscricaoEstadual the inscricaoEstadual to set
	 */
	public void setInscricaoEstadual(Integer inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}

	/**
	 * @return the dataAbertura
	 */
	public Date getDataAbertura() {
		return dataAbertura;
	}

	/**
	 * @param dataAbertura the dataAbertura to set
	 */
	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @param xCNPJ
	 * @param inscricaoEstadual
	 * @param dataAbertura
	 */
	public PessoaJuridica(Integer xCNPJ, Integer inscricaoEstadual, Date dataAbertura) {
		super();
		this.xCNPJ = xCNPJ;
		this.inscricaoEstadual = inscricaoEstadual;
		this.dataAbertura = dataAbertura;
	}
	
	

}
