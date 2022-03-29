package controller;

import java.time.LocalDate;

import javax.swing.JOptionPane;

import model.Autor;
import model.Data;
import model.Editora;
import model.Livro;
import model.Locacao;
import model.Usuario;

/**
 * Classe para efetuar o processamento, consulta, inclusão de estoque e
 * gerenciamento da biblioteca
 * 
 * @author Willian Carlos Gomes
 * @since 17 de fev. de 2021
 */

public class Biblioteca {

	// Atribuindo vetores à classe
	private Livro livros[];
	private Usuario clientes[];
	private Locacao locacoes[];

	// variáveis auxiliares para definir o limite de livros, de
	// clientes e locacoes
	private int tamanholivro = 0;
	private int tamanhocliente = 0;
	private int tamanholocacao = 0;

	// Método construtor
	public Biblioteca() {
		processar();
	}

	// Método principal do programa
	public void processar() {
		// Obtendo do usuário a quantidade de livros cadastrados
		tamanholivro = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de livros cadastrados"));

		// Obtendo do usuário a quantidade de clientes cadastrados
		tamanhocliente = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de clientes cadastrados"));

		// Obtendo do usuário a quantidade de locações a serem cadastrados
		tamanholocacao = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de locações"));

		// Definindo o tamanho do estoque de carros
		livros = new Livro[tamanholivro];

		// Definindo o tamanho do estoque de carros
		clientes = new Usuario[tamanhocliente];

		// Definindo o tamanho do estoque de carros
		locacoes = new Locacao[tamanholocacao];
		
		//Atribuindo valores aos livros
		implementaLivros();

		// Processamento de looping do programa
		while (true) {
			escolhaUsuario();
		}
	}

	// Método para capturar do usuário a opção
	public void escolhaUsuario() {
		String menu = "Informe a opção desejada:\n\n" + "OPÇÃO 1: Cadastrar livro\n" + "OPÇÃO 2: Cadastrar cliente\n"
				+ "OPÇÃO 3: Efetuar locação de livros\n" + "OPÇÃO 4: Efetuar devolução de livros\n"
				+ "OPÇÃO 5: Listar todos os livros cadastrados\n" + "OPÇÃO 6: Listar todos os usuários cadastrados\n"
				+ "OPÇÃO 7: Pesquisar livros por editora\n" + "OPÇÃO 8: Pesquisar livros por autor\n"
				+ "OPÇÃO 9: Pesquisar locações por data\n" + "OPÇÃO 10: Sair do sistema";

		int escolha = Integer.parseInt(JOptionPane.showInputDialog(menu));
		escolhaProcessamento(escolha);
	}

	// Método para seleção das opções do programa
	public void escolhaProcessamento(int opcao) {
		switch (opcao) {
		case 1:
			cadastrarLivro();
			break;

		case 2:
			cadastrarUsuario();
			break;

		case 3:
			efetuaLocacao();
			break;

		case 4:
			efetuaDevolucao();
			break;

		case 5:
			listarTodosOsLivrosCadastrados();
			break;

		case 6:
			listaUsuariosCadastrados();
			break;

		case 7:
			pesquisaEditora();
			break;

		case 8:
			pesquisaAutor();
			break;

		case 9:
			locacoesPorData();
			break;

		case 10:
			sairDoSistema();
			break;

		default:
			JOptionPane.showMessageDialog(null, "Opção inválida!", "Cadastro de livros", 0);// erro
			break;
		}
	}

	// Método para efetuar o cadastro de um novo livro
	public void cadastrarLivro() {
		// variável auxiliar para verificar se gravou o livro no estoque
		boolean gravado = false;

		// laço para verificar espaço em estoque
		for (int i = 0; i < livros.length; i++) {// inicio do for
			if (livros[i] == null) {
				livros[i] = criarLivro();
				gravado = true;
				break;
			}
		} // fim do for

		// exibindo o resultado para o usuario
		if (gravado) {
			JOptionPane.showMessageDialog(null, "Livro gravado com sucesso!", "Cadastro de Estoque", 1);
		} else {
			JOptionPane.showMessageDialog(null, "Estoque cheio!", "Cadastro de Estoque", 2);
		}

	}// fim do método

	// Método para cadastrar um usuário
	public void cadastrarUsuario() {
		// variável auxiliar para verificar se gravou o livro no estoque
		boolean gravado = false;

		// laço para verificar espaço em estoque
		for (int i = 0; i < clientes.length; i++) {// inicio do for
			if (clientes[i] == null) {
				clientes[i] = criarUsuario();
				gravado = true;
				break;
			}
		} // fim do for

		// exibindo o resultado para o usuario
		if (gravado) {
			JOptionPane.showMessageDialog(null, "Cliente gravado com sucesso!", "Gerenciamento da Biblioteca",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Armazenamento Cheio!", "Gerenciamento da Biblioteca",
					JOptionPane.WARNING_MESSAGE);
		}

	}// fim do método

	// Método para realizar locações de livros
	public void efetuaLocacao() {

		// variavel auxiliar para verificar gravação
		boolean gravado = false;
		// variavel para verificar se tem usuario cadastrado
		boolean verificaUsuario = false;
		// verificando se tem usuario cadastrado
		for (int i = 0; i < clientes.length; i++) {
			if (clientes[i] != null) {
				verificaUsuario = true;
			}
		}

		// laço para verificar espaço para salvar a locação
		for (int i = 0; i < locacoes.length; i++) { // inicio do for
			if (locacoes[i] == null && verificaUsuario && livroDisponivel()) {
				locacoes[i] = criarLocacao();
				gravado = true;
				break;
			}
		} // fim do for

		// exibindo dados ao usuário
		if (gravado) {
			JOptionPane.showMessageDialog(null, "Livro alugado com sucesso!", "Gerenciamento da Biblioteca",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Erro ao Efetuar locação.", "Gerenciamento da Biblioteca",
					JOptionPane.WARNING_MESSAGE);
		}
	}

	// método para efetur a devolucão do livro
	public void efetuaDevolucao() {

		// variavel para verificar a devolução
		boolean aux = false;

		// verificando se existe locação para devolver
		for (int i = 0; i < locacoes.length; i++) {
			if (locacoes[i] != null) {
				aux = true;
			}
		}

		// caso tenha devolução solicita a mensagem
		if (aux) {

			String msg = "Erro ao devolver.";

			// recebendo codigo do livro para realizar a devoliçao
			int codigo = Integer.parseInt(JOptionPane
					.showInputDialog("Digite o codigo do livro para efetuar a devolução:\n" + mostrarLivrosLocados()));

			// varrendo o array de locacoes
			for (int i = 0; i < locacoes.length; i++) {
				// verificando array vazio
				if (locacoes[i] != null) {
					Livro livrosAlugados[] = locacoes[i].getLivros();
					for (int j = 0; j < livrosAlugados.length; j++) {
						if (livrosAlugados[j] != null && livrosAlugados[j].getCodigo() == codigo
								&& !livrosAlugados[j].isDisponivel()) {
							livrosAlugados[j].setDisponivel(true);
							locacoes[i] = null;
							msg = "Livro devolvido.";
							break;
						}
					}
				}
			}
			JOptionPane.showMessageDialog(null, msg, "Gerenciamento da Biblioteca", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Erro ao devolver.", "Gerenciamento da Biblioteca",
					JOptionPane.WARNING_MESSAGE);
		}
	} // fim do método

	// Método para listar todos os livros cadastrados
	public void listarTodosOsLivrosCadastrados() {
		// variavel auxiliar para verificar a pesquisa
		boolean busca = false;

		// variável mensagem para exibir os livros cadastrados
		String msg = "Exibindo livros cadastrados:\n";

		for (int i = 0; i < livros.length; i++) {
			if (livros[i] != null) {
				if (livros[i].isDisponivel()) {
					msg += "Código: " + livros[i].getCodigo() + " - Título: " + livros[i].getTitulo() + " - Autor: "
							+ livros[i].getAutor().getNome() + " - Editora: " + livros[i].getEditora().getNome()
							+ " - Status: Disponível" + "\n";
				} else {
					msg += "Código: " + livros[i].getCodigo() + " - Título: " + livros[i].getTitulo() + " - Autor: "
							+ livros[i].getAutor().getNome() + " - Editora: " + livros[i].getEditora().getNome()
							+ " - Status: Não disponivel" + "\n";
				}

				busca = true;
			}
		}
		// exibindo informações ao usuariosusuarios
		if (busca) {
			JOptionPane.showMessageDialog(null, msg, "Gerenciamento da Biblioteca", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Nenhum livro cadastrado.", "Gerenciamento da Biblioteca",
					JOptionPane.WARNING_MESSAGE);
		}

	}

	// método para listar todos os usuários
	public void listaUsuariosCadastrados() {

		// variavel auxiliar para verificar a pesquisa
		boolean busca = false;

		// variável mensagem para exibir os usuários cadastrados
		String msg = "Exibindo usuários:\n";

		for (int i = 0; i < clientes.length; i++) {
			if (clientes[i] != null) {
				msg += "Código: " + clientes[i].getCodigo() + " - Nome: " + clientes[i].getNome() + "\n";
				busca = true;
			}
		}
		// exibindo informações ao usuariosusuarios
		if (busca) {
			JOptionPane.showMessageDialog(null, msg, "Gerenciamento da Biblioteca", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Nenhum usuário cadastrado.", "Gerenciamento da Biblioteca",
					JOptionPane.WARNING_MESSAGE);
		}
	}// fim do método

	public void pesquisaEditora() {
		// Recebendo a editora a ser pesquisada
		String editora = JOptionPane.showInputDialog("Informe a editora a pesquisar").toLowerCase();
		// variável auxiliar para exibir a pesquisa
		String mensagem = "Pesquisa por editora:\n";

		// Auxiliar para verificar se a editora existe
		boolean existe = false;

		// varredura com verificação de livros cadastrados
		for (int i = 0; i < clientes.length; i++) {
			if (livros[i] != null && livros[i].getEditora().getNome().toLowerCase().trim().equals(editora)) {
				mensagem += livros[i].getCodigo() + " | " + livros[i].getTitulo();
				existe = true;
			}
		}
		if (existe) {
			JOptionPane.showMessageDialog(null, mensagem, "Cadastro da Biblioteca", 1);
		} else {
			JOptionPane.showMessageDialog(null, "A editora informada não existe", "Cadastro da Biblioteca", 2);
		}
	}

	public void pesquisaAutor() {
		// Recebendo o autor a ser pesquisado
		String autor = JOptionPane.showInputDialog("Informe o autor a pesquisar").toLowerCase().trim();

		// variável auxiliar para exibir a pesquisa
		String mensagem = "Pesquisa por Autor:\n";

		// Auxiliar para verificar se a editora existe
		boolean existe = false;

		// varredura com verificação de livros cadastrados
		for (int i = 0; i < clientes.length; i++) {
			if (livros[i] != null && livros[i].getAutor().getNome().toLowerCase().trim().equals(autor)) {
				mensagem += "Autor: " + livros[i].getCodigo() + ". " + livros[i].getAutor().getNome() + "\n"
						+ "Livro(s): " + livros[i].getTitulo();
				existe = true;
			}
		}

		// Exibindo a pesquisa
		if (existe) {
			JOptionPane.showMessageDialog(null, mensagem, "Cadastro da Biblioteca", 1);
		} else {
			// caso nenhum item seja localizado ele vai exibir as opções aos usuários
			mensagem = "Nenhum livro localizado com este autor.\n" + "Autores cadastrados: \n";
			for (int i = 0; i < livros.length; i++) {
				if (livros[i] != null) {

					mensagem += "Código: " + livros[i].getAutor().getCodigo() + " - Nome: "
							+ livros[i].getAutor().getNome() + "\n";
				}
			} // fim do laço
			JOptionPane.showMessageDialog(null, mensagem, "Gerenciamento da Biblioteca", JOptionPane.WARNING_MESSAGE);
		}

	}// fim do método

	// Método para pesquisar locações por data
	public void locacoesPorData() {

		String msg = "";

		// variavel para exibir a resposta
		boolean aux = false;

		for (int i = 0; i < locacoes.length; i++) {
			// verificando se possui locações
			if (locacoes[i] != null) {
				aux = true;
			}
		}
		if (aux) {
			Data dt = new Data();
			// recebendo informaçoes para pesquisar por data
			// vetor de string com 3 posições (0 - dia 1 - mes - 2 ano)
			String data[] = JOptionPane.showInputDialog("Informe a data de locação para buscar (dd/mm/aaaa:")
					.split("/");
			// atribuindo valores a data:
			dt.setDia(Integer.parseInt(data[0]));
			dt.setMes(Integer.parseInt(data[1]));
			dt.setAno(Integer.parseInt(data[2]));

			// varrendo o vetor de locacoes
			for (int i = 0; i < locacoes.length; i++) {
				// cerificando se o vetor de locações nao esta vazio e comparando as datas
				if (locacoes[i] != null && locacoes[i].getDataLocacao().toString().equals(dt.toString())) {

					// adicionando os livros ao array
					Livro livrosAlugados[] = locacoes[i].getLivros();
					msg = "------------------------------------------------\n";
					msg += "Data da Locação: " + locacoes[i].getDataLocacao() + "\n";
					msg += "Cliente: " + locacoes[i].getUsuario().getNome() + "\nLivros: \n";
					for (int j = 0; j < livrosAlugados.length; j++) {
						if (livrosAlugados[j] != null) {
							msg += livrosAlugados[j].getCodigo() + " - " + livrosAlugados[j].getTitulo() + "\n";
						}
					}
					msg += "------------------------------------------------\n";
				}
				if (msg.equals("")) {
					msg = "Nenhuma locação encontrada na data informada!";
				}

			}
			JOptionPane.showMessageDialog(null, msg, "Gerenciamento da Biblioteca", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Nenhuma locação encontrada.", "Gerenciamento da Biblioteca",
					JOptionPane.WARNING_MESSAGE);
		}
	} // fim do método

	// Método para encerrar o sistema
	public void sairDoSistema() {
		System.exit(0);
	} // fim do método

	// Método para retornar um livro para cadastro
	public Livro criarLivro() {

		Livro livro = new Livro();
		Editora editora = new Editora();
		Autor autor = new Autor();

		// Recebendo do usuário o código do livro
		livro.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Informe o código do livro:")));
		// Recebendo do usuário o título do livro
		livro.setTitulo(JOptionPane.showInputDialog("Informe o título: "));
		// Recebendo do usuário o ano de publicação do livro
		livro.setAnoPublicacao(Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de publicação do livro: ")));
		// atualizando a disponibilidade
		livro.setDisponivel(true);

		// Recebendo do usuário o código da editora
		editora.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Informe o código da editora: ")));

		// Recebendo do usuário o nome da editora do livro
		editora.setNome(JOptionPane.showInputDialog("Informe o nome da editora: "));
		// Recebendo do usuário o país da editora
		editora.setPais(JOptionPane.showInputDialog("Informe o país da editora: "));

		// Recebendo do usuário o código do autor
		autor.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Informe o código do autor: ")));
		// Recebendo do usuário o nome do autor
		autor.setNome(JOptionPane.showInputDialog("Informe o nome do autor: "));
		// Recebendo do usuário a nacionalidade do autor
		autor.setNacionalidade(JOptionPane.showInputDialog("Informe a nacionalidade do autor: "));

		// Referenciar atributos da classe autor e editora
		livro.setAutor(autor);
		livro.setEditora(editora);

		return livro;
	}

	// Método para retornar um usuário/cliente para cadastro
	public Usuario criarUsuario() {
		Usuario usuario = new Usuario();
		Data dataNascimento = new Data();

		// Recebendo o código do cliente
		usuario.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Informe o código do cliente: ")));

		// Recebendo o nome do cliente
		usuario.setNome(JOptionPane.showInputDialog("Informe o nome do cliente: "));

		// Recebendo o telefone do cliente
		usuario.setTelefone(JOptionPane.showInputDialog("Informe o telefone do cliente: "));

		// Recebendo o email do usuário
		usuario.setEmail(JOptionPane.showInputDialog("Informe o email do cliente: "));

		// Solicitando a data de nascimento ao usuário eutilizando split por "/"
		String data[] = JOptionPane.showInputDialog("Insira a data de nascimento(DD/MM/AAAA)").split("/");
		dataNascimento.setDia(Integer.parseInt(data[0]));
		dataNascimento.setMes(Integer.parseInt(data[1]));
		dataNascimento.setAno(Integer.parseInt(data[2]));

		// Referenciar atributos da classe de data
		usuario.setDataNascimento(dataNascimento);
		return usuario;
	}

	// método para criar uma locação
	public Locacao criarLocacao() {
		// criando e instanciando objeto do tipo Locacao
		Locacao locacao = new Locacao();
		// criando e instanciando um objeto do tipo Data
		Data data = new Data();
		// criando e instanciando um objeto do tipo Usuario
		Usuario usuario = new Usuario();
		// criando e instanciando um objeto do tipo Livro
		Livro livro = new Livro();
		// criando e instanciando o arrai para armazenar os livros
		Livro[] livrosAlugado = new Livro[livros.length];

		// atribuindo valor ao atributo codigo
		locacao.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Insira o código da locação:")));

		// capturando a data do sistema atual convertendo e atribuindo a data da locação
		String dt[] = LocalDate.now().toString().split("-");
		data.setAno(Integer.parseInt(dt[0]));
		data.setMes(Integer.parseInt(dt[1]));
		data.setDia(Integer.parseInt(dt[2]));

		// associando data a locação
		locacao.setDataLocacao(data);

		int codigo = 0;
		do {
			codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do usuario.\n" + mostrarUsuarios()));
			usuario = buscarUsuarioPorCodigo(codigo);
		} while (usuario == null);

		int cod = 0;
		do {
			cod = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do livro.\n" + mostrarLivros()));
			livro = buscarLivroPorCodigo(cod);
		} while (livro == null);

		livro.setDisponivel(false);

		for (int i = 0; i < livrosAlugado.length; i++) {
			if (livrosAlugado[i] == null) {
				livrosAlugado[i] = livro;
				break;
			}
		}
		// adicionando os livros alugados a locação
		locacao.setLivros(livrosAlugado);
		// associando o usuario a locação
		locacao.setUsuario(usuario);

		return locacao;
	}

	// método para exibir a relação de livros
	public String mostrarLivros() {
		String msg = "";
		for (int i = 0; i < livros.length; i++) {
			if (livros[i] != null && livros[i].isDisponivel() == true) {
				msg += "Cód.: " + livros[i].getCodigo() + " Título: " + livros[i].getTitulo() + "\n";
			}
		}
		return msg;
	}

	// método para exibir a relação de usuarios
	public String mostrarUsuarios() {
		String msg = "";
		for (int i = 0; i < clientes.length; i++) {
			if (clientes[i] != null) {
				msg += "Cód.: " + clientes[i].getCodigo() + " Nome: " + clientes[i].getNome() + "\n";
			}
		}
		return msg;
	}

	// método para exibir a relação de livros locados
	public String mostrarLivrosLocados() {

		String msg = "";

		for (int i = 0; i < locacoes.length; i++) {
			if (locacoes[i] != null) {
				Livro livrosAlugados[] = locacoes[i].getLivros();
				msg += "Data da Locação: " + locacoes[i].getDataLocacao() + "\n";
				msg += "Cliente: " + locacoes[i].getUsuario().getNome() + "\nLivros: \n";
				for (int j = 0; j < livrosAlugados.length; j++) {
					if (livrosAlugados[j] != null) {
						msg += "Cód.: " + livrosAlugados[j].getCodigo() + " - Título: " + livrosAlugados[j].getTitulo()
								+ "\n";
					}
				}
				msg += "------------------------------------------------\n";
			}
		}
		return msg;
	}

	// metodo para buscar usuario por codigo
	public Usuario buscarUsuarioPorCodigo(int cod) {

		for (int i = 0; i < clientes.length; i++) {
			if (clientes[i] != null && clientes[i].getCodigo() == cod) {
				return clientes[i];
			}

		}
		JOptionPane.showMessageDialog(null, "Usuario não encontrado", "Gerenciamento da Biblioteca",
				JOptionPane.WARNING_MESSAGE);
		return null;
	}

	// metodo para buscar livros por codigo
	public Livro buscarLivroPorCodigo(int cod) {

		for (int i = 0; i < livros.length; i++) {
			if (livros[i] != null && livros[i].getCodigo() == cod) {
				return livros[i];
			}
		}
		JOptionPane.showMessageDialog(null, "Livro não encontrado", "Gerenciamento da Biblioteca",
				JOptionPane.WARNING_MESSAGE);
		return null;
	}

	// metodo para verificar os livros disponiveis
	public boolean livroDisponivel() {

		// verificando se tem livros disponiveis
		for (int i = 0; i < livros.length; i++) {
			if (livros[i] != null && livros[i].isDisponivel()) {
				return true;
			}
		}
		return false;
	}
	
	// Método para incrementar valores aos livros
	public void implementaLivros() {
	}

}