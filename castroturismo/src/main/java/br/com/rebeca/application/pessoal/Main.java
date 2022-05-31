package br.com.rebeca.application.pessoal;

import java.util.Date;
import br.com.rebeca.local.Cidade;
import br.com.rebeca.local.Estado;
import br.com.rebeca.local.Pais;

/** 
 * @author rebeca.0902
 * @version 1.0.0
 * @since 1.0.0
 */

public class Main {
	
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		
		//Pais
		
		// Pais 

		Pais pais = new Pais(); 

		  
       pais.setId(1); 

		  
		pais.setNome("Brasil"); 

		  
		System.out.println(pais); 

		  
		Estado parana = new Estado(); 

		  
		parana.setId(1); 


		parana.setNome("Parana"); 

		  
		parana.setPais(pais); 

		  

		System.out.println(parana); 

		  

		Estado sp = new Estado(); 

		sp.setId(2); 

		sp.setNome("São Paulo"); 

		sp.setPais(pais); 

		System.out.println(sp); 

		  

		// Cidade 

		Cidade castro = new Cidade(null, null, sp); 

		  

		castro.setId(1); 

		  

		castro.setNome("Castro"); 

		  

		castro.setEstado(parana); 

		  

		System.out.println(castro); 

		  

		Cidade itp = new Cidade(null, null, sp); 

		  

		itp.setId(2); 

		  

		itp.setNome("Itapetininga"); 

		  

		itp.setEstado(sp); 

		  

		System.out.println(itp); 

		  

		// Pessoas 

		Motorista motorista = new Motorista(); 

		  

		motorista.setId(1); 

		  

		motorista.setNome("Tubarão da 151"); 

		  

		motorista.setTelefoneCelular("42 9999-0000"); 

		  

		motorista.setEmail("tubarao151@castroturismo.com.br"); 

		  

		motorista.setLogradouro("Rua Tal"); 

		  

		motorista.setComplemento("Apt 01"); 

		  

		motorista.setNumero("60b"); 

		  

		motorista.setCidade(castro); 

		  

		// Pessoa Fisica 

		motorista.setxCNH(123456789); 

		  

		motorista.setId(123465); 

		  

		motorista.setOrgaoEmissor("SSPR"); 

		  

		Date dataNascimento = new Date(); 

		  

		motorista.setDataNascimento(dataNascimento); 

		  

		// Funcionario 

		motorista.setNumeroDeRegistro(1451); 

		  

		motorista.setEstaAtivo(true); 

		  

		// Motorista 

		motorista.setxCNH(145678989); 

		  

		motorista.setCategoriaCNH("AE"); 

		  

		motorista.setxEAR(true); 

		  

		System.out.println(motorista); 
		
		Cidade passageiro = null;
		passageiro.setId(2);
		
		passageiro.setNome("Jose das couves");
		
		passageiro.setTelefoneCelular("42 9988 5555");
		
		passageiro.sextCPF(12345);
		
		char[] passsageiro = null;
		System.out.println(passsageiro);
		
		Rodoviaria rodCastro = new Rodoviaria();
		
		rodCastro.setNome("Rodoviaria de Castro");
		
		rodCastro.setCNPJ("12345");
		
		rodCastro.setCidade(castro);
		
		System.out.println(rodCastro);
		
		Rodoviaria rodItp = new Rodoviaria();
		
		rodItp.setId(5);
		
	    rodItp.setCNPJ("456789");
	    
	    rodItp.setCidade(itp);
	    
	    System.out.println(rodItp);

}
}
