
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

	/**
	 * Classe que recebe os dados de pais
	 * 
	 * @author rebeca.0902
	 * @version 1.0.0
	 * @since 1.0.0
	 * 
	 */
	//Prepara a classe para o banco de dados
	@Data
	
	//Construtor sem argumentos
	@NoArgsConstructor
	
	//Construtor com argumentos
	@AllArgsConstructor
	
	//cria o to string
	@ToString
	
	public class PaisExemplo implements Serializable {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		
		private Integer id;
		
		private String nome;
}
