package exemplo09;

/**
 * Classe para armazenar os atributos de professor herdando os dados de funcion�rio (heran�a)
 * @author Willian Carlos Gomes
 * @since 23 de fev. de 2021
 */
public class Professor extends Funcionario implements InterfaceFuncionario {

	// Atributos do objeto Professor
	private String materia;
	
	// M�todos para acessar o atributo
	public String getMateria() {
		return materia;
	}
	
	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	// M�todo para exibir os dados
	public void mostraDados () {
		super.mostrarDados();
		System.out.println("Mat�ria: " + materia);
	}

	@Override
	public void salvar() {
		//Declarando vari�veis
		
	}

	@Override
	public void excluir() {
		//Declarando vari�veis
		
	}

	@Override
	public void consultar() {
		//Declarando vari�veis
		
	}

	@Override
	public void alterar() {
		//Declarando vari�veis
		
	}
	
	
	
}
