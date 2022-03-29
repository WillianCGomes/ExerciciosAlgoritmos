package exemplo09;

/**
 * Classe para armazenar os atributos de professor herdando os dados de funcionário (herança)
 * @author Willian Carlos Gomes
 * @since 23 de fev. de 2021
 */
public class Professor extends Funcionario implements InterfaceFuncionario {

	// Atributos do objeto Professor
	private String materia;
	
	// Métodos para acessar o atributo
	public String getMateria() {
		return materia;
	}
	
	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	// Método para exibir os dados
	public void mostraDados () {
		super.mostrarDados();
		System.out.println("Matéria: " + materia);
	}

	@Override
	public void salvar() {
		//Declarando variáveis
		
	}

	@Override
	public void excluir() {
		//Declarando variáveis
		
	}

	@Override
	public void consultar() {
		//Declarando variáveis
		
	}

	@Override
	public void alterar() {
		//Declarando variáveis
		
	}
	
	
	
}
