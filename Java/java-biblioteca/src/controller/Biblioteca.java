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
 * Classe para efetuar o processamento, consulta, inclus�o de estoque e
 * gerenciamento da biblioteca
 * 
 * @author Willian Carlos Gomes
 * @since 17 de fev. de 2021
 */

public class Biblioteca {

	// Atribuindo vetores � classe
	private Livro livros[];
	private Usuario clientes[];
	private Locacao locacoes[];

	// vari�veis auxiliares para definir o limite de livros, de
	// clientes e locacoes
	private int tamanholivro = 0;
	private int tamanhocliente = 0;
	private int tamanholocacao = 0;

	// M�todo construtor
	public Biblioteca() {
		processar();
	}

	// M�todo principal do programa
	public void processar() {
		// Obtendo do usu�rio a quantidade de livros cadastrados
		tamanholivro = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de livros cadastrados"));

		// Obtendo do usu�rio a quantidade de clientes cadastrados
		tamanhocliente = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de clientes cadastrados"));

		// Obtendo do usu�rio a quantidade de loca��es a serem cadastrados
		tamanholocacao = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de loca��es"));

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

	// M�todo para capturar do usu�rio a op��o
	public void escolhaUsuario() {
		String menu = "Informe a op��o desejada:\n\n" + "OP��O 1: Cadastrar livro\n" + "OP��O 2: Cadastrar cliente\n"
				+ "OP��O 3: Efetuar loca��o de livros\n" + "OP��O 4: Efetuar devolu��o de livros\n"
				+ "OP��O 5: Listar todos os livros cadastrados\n" + "OP��O 6: Listar todos os usu�rios cadastrados\n"
				+ "OP��O 7: Pesquisar livros por editora\n" + "OP��O 8: Pesquisar livros por autor\n"
				+ "OP��O 9: Pesquisar loca��es por data\n" + "OP��O 10: Sair do sistema";

		int escolha = Integer.parseInt(JOptionPane.showInputDialog(menu));
		escolhaProcessamento(escolha);
	}

	// M�todo para sele��o das op��es do programa
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
			JOptionPane.showMessageDialog(null, "Op��o inv�lida!", "Cadastro de livros", 0);// erro
			break;
		}
	}

	// M�todo para efetuar o cadastro de um novo livro
	public void cadastrarLivro() {
		// vari�vel auxiliar para verificar se gravou o livro no estoque
		boolean gravado = false;

		// la�o para verificar espa�o em estoque
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

	}// fim do m�todo

	// M�todo para cadastrar um usu�rio
	public void cadastrarUsuario() {
		// vari�vel auxiliar para verificar se gravou o livro no estoque
		boolean gravado = false;

		// la�o para verificar espa�o em estoque
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

	}// fim do m�todo

	// M�todo para realizar loca��es de livros
	public void efetuaLocacao() {

		// variavel auxiliar para verificar grava��o
		boolean gravado = false;
		// variavel para verificar se tem usuario cadastrado
		boolean verificaUsuario = false;
		// verificando se tem usuario cadastrado
		for (int i = 0; i < clientes.length; i++) {
			if (clientes[i] != null) {
				verificaUsuario = true;
			}
		}

		// la�o para verificar espa�o para salvar a loca��o
		for (int i = 0; i < locacoes.length; i++) { // inicio do for
			if (locacoes[i] == null && verificaUsuario && livroDisponivel()) {
				locacoes[i] = criarLocacao();
				gravado = true;
				break;
			}
		} // fim do for

		// exibindo dados ao usu�rio
		if (gravado) {
			JOptionPane.showMessageDialog(null, "Livro alugado com sucesso!", "Gerenciamento da Biblioteca",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Erro ao Efetuar loca��o.", "Gerenciamento da Biblioteca",
					JOptionPane.WARNING_MESSAGE);
		}
	}

	// m�todo para efetur a devoluc�o do livro
	public void efetuaDevolucao() {

		// variavel para verificar a devolu��o
		boolean aux = false;

		// verificando se existe loca��o para devolver
		for (int i = 0; i < locacoes.length; i++) {
			if (locacoes[i] != null) {
				aux = true;
			}
		}

		// caso tenha devolu��o solicita a mensagem
		if (aux) {

			String msg = "Erro ao devolver.";

			// recebendo codigo do livro para realizar a devoli�ao
			int codigo = Integer.parseInt(JOptionPane
					.showInputDialog("Digite o codigo do livro para efetuar a devolu��o:\n" + mostrarLivrosLocados()));

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
	} // fim do m�todo

	// M�todo para listar todos os livros cadastrados
	public void listarTodosOsLivrosCadastrados() {
		// variavel auxiliar para verificar a pesquisa
		boolean busca = false;

		// vari�vel mensagem para exibir os livros cadastrados
		String msg = "Exibindo livros cadastrados:\n";

		for (int i = 0; i < livros.length; i++) {
			if (livros[i] != null) {
				if (livros[i].isDisponivel()) {
					msg += "C�digo: " + livros[i].getCodigo() + " - T�tulo: " + livros[i].getTitulo() + " - Autor: "
							+ livros[i].getAutor().getNome() + " - Editora: " + livros[i].getEditora().getNome()
							+ " - Status: Dispon�vel" + "\n";
				} else {
					msg += "C�digo: " + livros[i].getCodigo() + " - T�tulo: " + livros[i].getTitulo() + " - Autor: "
							+ livros[i].getAutor().getNome() + " - Editora: " + livros[i].getEditora().getNome()
							+ " - Status: N�o disponivel" + "\n";
				}

				busca = true;
			}
		}
		// exibindo informa��es ao usuariosusuarios
		if (busca) {
			JOptionPane.showMessageDialog(null, msg, "Gerenciamento da Biblioteca", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Nenhum livro cadastrado.", "Gerenciamento da Biblioteca",
					JOptionPane.WARNING_MESSAGE);
		}

	}

	// m�todo para listar todos os usu�rios
	public void listaUsuariosCadastrados() {

		// variavel auxiliar para verificar a pesquisa
		boolean busca = false;

		// vari�vel mensagem para exibir os usu�rios cadastrados
		String msg = "Exibindo usu�rios:\n";

		for (int i = 0; i < clientes.length; i++) {
			if (clientes[i] != null) {
				msg += "C�digo: " + clientes[i].getCodigo() + " - Nome: " + clientes[i].getNome() + "\n";
				busca = true;
			}
		}
		// exibindo informa��es ao usuariosusuarios
		if (busca) {
			JOptionPane.showMessageDialog(null, msg, "Gerenciamento da Biblioteca", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Nenhum usu�rio cadastrado.", "Gerenciamento da Biblioteca",
					JOptionPane.WARNING_MESSAGE);
		}
	}// fim do m�todo

	public void pesquisaEditora() {
		// Recebendo a editora a ser pesquisada
		String editora = JOptionPane.showInputDialog("Informe a editora a pesquisar").toLowerCase();
		// vari�vel auxiliar para exibir a pesquisa
		String mensagem = "Pesquisa por editora:\n";

		// Auxiliar para verificar se a editora existe
		boolean existe = false;

		// varredura com verifica��o de livros cadastrados
		for (int i = 0; i < clientes.length; i++) {
			if (livros[i] != null && livros[i].getEditora().getNome().toLowerCase().trim().equals(editora)) {
				mensagem += livros[i].getCodigo() + " | " + livros[i].getTitulo();
				existe = true;
			}
		}
		if (existe) {
			JOptionPane.showMessageDialog(null, mensagem, "Cadastro da Biblioteca", 1);
		} else {
			JOptionPane.showMessageDialog(null, "A editora informada n�o existe", "Cadastro da Biblioteca", 2);
		}
	}

	public void pesquisaAutor() {
		// Recebendo o autor a ser pesquisado
		String autor = JOptionPane.showInputDialog("Informe o autor a pesquisar").toLowerCase().trim();

		// vari�vel auxiliar para exibir a pesquisa
		String mensagem = "Pesquisa por Autor:\n";

		// Auxiliar para verificar se a editora existe
		boolean existe = false;

		// varredura com verifica��o de livros cadastrados
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
			// caso nenhum item seja localizado ele vai exibir as op��es aos usu�rios
			mensagem = "Nenhum livro localizado com este autor.\n" + "Autores cadastrados: \n";
			for (int i = 0; i < livros.length; i++) {
				if (livros[i] != null) {

					mensagem += "C�digo: " + livros[i].getAutor().getCodigo() + " - Nome: "
							+ livros[i].getAutor().getNome() + "\n";
				}
			} // fim do la�o
			JOptionPane.showMessageDialog(null, mensagem, "Gerenciamento da Biblioteca", JOptionPane.WARNING_MESSAGE);
		}

	}// fim do m�todo

	// M�todo para pesquisar loca��es por data
	public void locacoesPorData() {

		String msg = "";

		// variavel para exibir a resposta
		boolean aux = false;

		for (int i = 0; i < locacoes.length; i++) {
			// verificando se possui loca��es
			if (locacoes[i] != null) {
				aux = true;
			}
		}
		if (aux) {
			Data dt = new Data();
			// recebendo informa�oes para pesquisar por data
			// vetor de string com 3 posi��es (0 - dia 1 - mes - 2 ano)
			String data[] = JOptionPane.showInputDialog("Informe a data de loca��o para buscar (dd/mm/aaaa:")
					.split("/");
			// atribuindo valores a data:
			dt.setDia(Integer.parseInt(data[0]));
			dt.setMes(Integer.parseInt(data[1]));
			dt.setAno(Integer.parseInt(data[2]));

			// varrendo o vetor de locacoes
			for (int i = 0; i < locacoes.length; i++) {
				// cerificando se o vetor de loca��es nao esta vazio e comparando as datas
				if (locacoes[i] != null && locacoes[i].getDataLocacao().toString().equals(dt.toString())) {

					// adicionando os livros ao array
					Livro livrosAlugados[] = locacoes[i].getLivros();
					msg = "------------------------------------------------\n";
					msg += "Data da Loca��o: " + locacoes[i].getDataLocacao() + "\n";
					msg += "Cliente: " + locacoes[i].getUsuario().getNome() + "\nLivros: \n";
					for (int j = 0; j < livrosAlugados.length; j++) {
						if (livrosAlugados[j] != null) {
							msg += livrosAlugados[j].getCodigo() + " - " + livrosAlugados[j].getTitulo() + "\n";
						}
					}
					msg += "------------------------------------------------\n";
				}
				if (msg.equals("")) {
					msg = "Nenhuma loca��o encontrada na data informada!";
				}

			}
			JOptionPane.showMessageDialog(null, msg, "Gerenciamento da Biblioteca", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Nenhuma loca��o encontrada.", "Gerenciamento da Biblioteca",
					JOptionPane.WARNING_MESSAGE);
		}
	} // fim do m�todo

	// M�todo para encerrar o sistema
	public void sairDoSistema() {
		System.exit(0);
	} // fim do m�todo

	// M�todo para retornar um livro para cadastro
	public Livro criarLivro() {

		Livro livro = new Livro();
		Editora editora = new Editora();
		Autor autor = new Autor();

		// Recebendo do usu�rio o c�digo do livro
		livro.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Informe o c�digo do livro:")));
		// Recebendo do usu�rio o t�tulo do livro
		livro.setTitulo(JOptionPane.showInputDialog("Informe o t�tulo: "));
		// Recebendo do usu�rio o ano de publica��o do livro
		livro.setAnoPublicacao(Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de publica��o do livro: ")));
		// atualizando a disponibilidade
		livro.setDisponivel(true);

		// Recebendo do usu�rio o c�digo da editora
		editora.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Informe o c�digo da editora: ")));

		// Recebendo do usu�rio o nome da editora do livro
		editora.setNome(JOptionPane.showInputDialog("Informe o nome da editora: "));
		// Recebendo do usu�rio o pa�s da editora
		editora.setPais(JOptionPane.showInputDialog("Informe o pa�s da editora: "));

		// Recebendo do usu�rio o c�digo do autor
		autor.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Informe o c�digo do autor: ")));
		// Recebendo do usu�rio o nome do autor
		autor.setNome(JOptionPane.showInputDialog("Informe o nome do autor: "));
		// Recebendo do usu�rio a nacionalidade do autor
		autor.setNacionalidade(JOptionPane.showInputDialog("Informe a nacionalidade do autor: "));

		// Referenciar atributos da classe autor e editora
		livro.setAutor(autor);
		livro.setEditora(editora);

		return livro;
	}

	// M�todo para retornar um usu�rio/cliente para cadastro
	public Usuario criarUsuario() {
		Usuario usuario = new Usuario();
		Data dataNascimento = new Data();

		// Recebendo o c�digo do cliente
		usuario.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Informe o c�digo do cliente: ")));

		// Recebendo o nome do cliente
		usuario.setNome(JOptionPane.showInputDialog("Informe o nome do cliente: "));

		// Recebendo o telefone do cliente
		usuario.setTelefone(JOptionPane.showInputDialog("Informe o telefone do cliente: "));

		// Recebendo o email do usu�rio
		usuario.setEmail(JOptionPane.showInputDialog("Informe o email do cliente: "));

		// Solicitando a data de nascimento ao usu�rio eutilizando split por "/"
		String data[] = JOptionPane.showInputDialog("Insira a data de nascimento(DD/MM/AAAA)").split("/");
		dataNascimento.setDia(Integer.parseInt(data[0]));
		dataNascimento.setMes(Integer.parseInt(data[1]));
		dataNascimento.setAno(Integer.parseInt(data[2]));

		// Referenciar atributos da classe de data
		usuario.setDataNascimento(dataNascimento);
		return usuario;
	}

	// m�todo para criar uma loca��o
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
		locacao.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Insira o c�digo da loca��o:")));

		// capturando a data do sistema atual convertendo e atribuindo a data da loca��o
		String dt[] = LocalDate.now().toString().split("-");
		data.setAno(Integer.parseInt(dt[0]));
		data.setMes(Integer.parseInt(dt[1]));
		data.setDia(Integer.parseInt(dt[2]));

		// associando data a loca��o
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
		// adicionando os livros alugados a loca��o
		locacao.setLivros(livrosAlugado);
		// associando o usuario a loca��o
		locacao.setUsuario(usuario);

		return locacao;
	}

	// m�todo para exibir a rela��o de livros
	public String mostrarLivros() {
		String msg = "";
		for (int i = 0; i < livros.length; i++) {
			if (livros[i] != null && livros[i].isDisponivel() == true) {
				msg += "C�d.: " + livros[i].getCodigo() + " T�tulo: " + livros[i].getTitulo() + "\n";
			}
		}
		return msg;
	}

	// m�todo para exibir a rela��o de usuarios
	public String mostrarUsuarios() {
		String msg = "";
		for (int i = 0; i < clientes.length; i++) {
			if (clientes[i] != null) {
				msg += "C�d.: " + clientes[i].getCodigo() + " Nome: " + clientes[i].getNome() + "\n";
			}
		}
		return msg;
	}

	// m�todo para exibir a rela��o de livros locados
	public String mostrarLivrosLocados() {

		String msg = "";

		for (int i = 0; i < locacoes.length; i++) {
			if (locacoes[i] != null) {
				Livro livrosAlugados[] = locacoes[i].getLivros();
				msg += "Data da Loca��o: " + locacoes[i].getDataLocacao() + "\n";
				msg += "Cliente: " + locacoes[i].getUsuario().getNome() + "\nLivros: \n";
				for (int j = 0; j < livrosAlugados.length; j++) {
					if (livrosAlugados[j] != null) {
						msg += "C�d.: " + livrosAlugados[j].getCodigo() + " - T�tulo: " + livrosAlugados[j].getTitulo()
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
		JOptionPane.showMessageDialog(null, "Usuario n�o encontrado", "Gerenciamento da Biblioteca",
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
		JOptionPane.showMessageDialog(null, "Livro n�o encontrado", "Gerenciamento da Biblioteca",
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
	
	// M�todo para incrementar valores aos livros
	public void implementaLivros() {
	}

}