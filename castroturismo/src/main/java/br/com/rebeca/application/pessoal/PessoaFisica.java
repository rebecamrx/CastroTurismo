package br.com.rebeca.application.pessoal;

import java.io.Serializable;
import java.util.Date;

/**
 * htpps://www.github.com/rebecamrx/CastroTurismo.git
 * Classe que recebe os dados do Pais
 * @author rebeca.0902
 * @version 1.0.0
 * @since 1.0.0
 */

public class PessoaFisica implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer xCPF;
	
	private Integer xRG;
	
	private String orgaoEmissor;
	
	private Date dataNascimento;

	/**
	 * @return the xCPF
	 */
	public Integer getxCPF() {
		return xCPF;
	}

	/**
	 * @param xCPF the xCPF to set
	 */
	public void setxCPF(Integer xCPF) {
		this.xCPF = xCPF;
	}

	/**
	 * @return the xRG
	 */
	public Integer getxRG() {
		return xRG;
	}

	/**
	 * @param xRG the xRG to set
	 */
	public void setxRG(Integer xRG) {
		this.xRG = xRG;
	}

	/**
	 * @return the orgaoEmissor
	 */
	public String getOrgaoEmissor() {
		return orgaoEmissor;
	}

	/**
	 * @param orgaoEmissor the orgaoEmissor to set
	 */
	public void setOrgaoEmissor(String orgaoEmissor) {
		this.orgaoEmissor = orgaoEmissor;
	}

	/**
	 * @return the dataNascimento
	 */
	public Date getDataNascimento() {
		return dataNascimento;
	}

	/**
	 * @param dataNascimento the dataNascimento to set
	 */
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	}
