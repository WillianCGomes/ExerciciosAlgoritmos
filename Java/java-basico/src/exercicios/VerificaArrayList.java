package exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.swing.JOptionPane;

/**
 * Programa para cadastro e manuseio de nomes em uma ArrayList do tipo String
 * 
 * @author Willian Carlos Gomes
 * @since 26 de fev. de 2021
 */
public class VerificaArrayList {
	// Definindo uma ArrayList privada do tipo String para armazenar os nomes e uma
	// auxiliar para receber alterações
	private ArrayList<String> nomes;
	private ArrayList<String> ordenaNomes;

	// Método construtor da classe
	public VerificaArrayList() {
		nomes = new ArrayList<String>();
		ordenaNomes = new ArrayList<String>();

		// Socilitando o método de menu principal
		menuPrincipal();
	}

	// Médodo para criar o menu principal
	public void menuPrincipal() {

		// Mensagem para ser exibida em janela para o usuário
		String menu = "INFORME A OPÇÃO DESEJADA \n\n" + "1 - CADASTRAR NOME\n" + "2 - EXCLUIR NOME\n"
				+ "3 - LISTAR NOMES CADASTRADOS\n" + "4 - LISTAR NOMES EM ORDEM ALFABÉTICA\n"
				+ "5 - LISTAR NOMES IGUAIS\n" + "6 - LISTAR NOMES POR LETRA INICIAL\n" + "7 - PESQUISAR POR NOME\n"
				+ "8 - SAIR DO SISTEMA\n";

		// Laço para repetir menu caso seja informada uma opção inválida
		while (true) {
			try {
				int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, menu, "MENU PRINCIPAL", 1));
				processamentoPrincipal(opcao);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA", "MENU PRINCIPAL", 0);
			}
		}
	}

	// método de procesamento principal
	public void processamentoPrincipal(int opcao) {
		// Casos de escolha
		switch (opcao) {
		case 1:
			cadastrarNome();
			break;
		case 2:
			excluirNome();
			;
			break;
		case 3:
			listarNomesCadastrados();
			break;
		case 4:
			listarNomesOrdemAlfabetica();
			break;
		case 5:
			listarNomesIguais();
			break;
		case 6:
			listarNomesInicial();
			break;
		case 7:
			pesquisarNome();
			break;
		case 8:
			sairDoSistema();
			break;
		// Mensagem padrão caso o usuário informe uma opção inválida
		default:
			JOptionPane.showMessageDialog(null, "Opção Inválida!", "MENU PRINCIPAL", 0);
			break;
		}
	}

	// Método para cadastrar novos nomes
	private void cadastrarNome() {

		// Variável auxiliar para repetir a solicitação caso o usuário informe um valor
		// inválido
		boolean execute;
		// Variável para receber o nome informado do usuário
		String nomeinf;
		execute = true;
		if (nomes.size() == 10) {
			JOptionPane.showMessageDialog(null,
					"NÚMERO MÁXIMO DE NOMES CADASTRADOS JÁ ATINGIDO!" + "\nRetornando ao menu principal.", "ERRO", 0);
			execute = false;
			menuPrincipal();
		} else {
			while (execute) { // laço para executar caso exista algum erro ou o usuário deseje cadastrar mais
								// um nome
				if (nomes.size() >= 10) { // verifica se o programa não excedeu o limite de 10 nomes
					JOptionPane.showMessageDialog(null,
							"NÚMERO MÁXIMO DE NOMES CADASTRADOS ATINGIDO!" + "\nRetornando ao menu principal.", "ERRO",
							0);
					// Para a execução do método e retorna ao menu principal
					execute = false;
					menuPrincipal();
				} else { // Caso não tenha excedido os 10 nomes

					try { // Try - Catch para retornar ao usuário caso um caractere inválido ou nulo seja
							// digitado
						nomeinf = JOptionPane.showInputDialog(null, "Digite o nome a ser cadastrado:",
								"Lista de 10 nomes", 3);
						if (nomeinf.length() < 2) { // Se o usuário informar apenas uma letra, informar mensagem de erro
							JOptionPane.showMessageDialog(null,
									"Por favor preencha um nome com mais de uma letra - CAMPO OBRIGATÓRIO!",
									"ERRO: FAVOR INFORMAR UM NOME", 0);
							execute = false; // Para a execução do método
						} else { // caso o usuário informe mais de uma letra
							nomes.add(nomeinf); // adicionando o nome informado à ArrayList
							if (isEmptyOrNull(nomeinf)) { // se o usuário não digitar nada ou digitar espaços
								JOptionPane.showMessageDialog(null, "Por favor preencha um nome - CAMPO OBRIGATÓRIO!",
										"ERRO: FAVOR INFORMAR UM NOME", 0);
								nomes.remove(nomes.size() - 1); // Removendo da ArrayList o nome inválido informado
								execute = true; // Ativando a variável auxiliar para executar novamente a solicitação no
												// mesmo
												// índice

							} else if (!isOnlyText(nomeinf)) {// chamando o método que verifica se o usuário
																// informou apenas texto
								JOptionPane.showMessageDialog(null,
										"Você inseriu um caractere inválido - Favor digitar no formato: NOME SOBRENOME",
										"ERRO: CARACTERE INVÁLIDO", 0);
								nomes.remove(nomes.size() - 1); // Removendo da ArrayList o nome inválido informado
								execute = true; // Ativando a variável auxiliar para executar novamente a solicitação no
												// mesmo
												// índice
							} else { // Caso o nome seja válido, perguntar se o usuário deseja cadastrar mais nomes
								int opcao = JOptionPane.showConfirmDialog(null,
										"Deseja Cadastrar outro nome? (Nomes cadastrados: " + nomes.size() + ")",
										"ATENÇÃO", JOptionPane.YES_OPTION, JOptionPane.CANCEL_OPTION);
								// Caso o usuário deseje cadastrar mais nomes
								if (opcao == JOptionPane.YES_OPTION) {
									execute = true;
								} else {
									ordenaNomes = nomes;
									execute = false;
								}
							}
						}
					} catch (Exception e) { // Caso um outro caractere inválido seja informado
						JOptionPane.showMessageDialog(null,
								"Você inseriu um caractere inválido - Favor digitar no formato: NOME SOBRENOME",
								"ERRO: CARACTERE INVÁLIDO", 0);
					}
				}
			}
		}
	}// Fim do método

	// Método para excluir um nome
	private void excluirNome() {
		if (nomes.size() < 1) {// Se não existirem nomes cadastrados
			JOptionPane.showMessageDialog(null, "Nenhum nome foi cadastrado! " + "\nFavor cadastrar um nome.",
					"EXCLUIR NOME", 0);
			menuPrincipal();
		} else { // Caso existam nomes cadastrados:
			// Variáveis auxiliares
			String aux;
			String msg = "";
			int contador = 0;

			// Código responsável para listar e deletar os nomes informados pelo usuário
			try {
				// Início Laço de repetição
				for (String mostra_nome : nomes) {
					msg += mostra_nome + "\n"; // Concatenando testo da variável
					contador++; // Variável contadora sendo incrementada
					if (contador == nomes.size()) { // Se o valor incrementado equivaler ao tamanho da lista, solicitar
													// o nome para exclusão
						aux = JOptionPane.showInputDialog(null,
								"Nomes cadastrados:\n" + msg + "\nInforme o nome a ser excluido", "EXCLUIR NOME", 1);

						if (!isOnlyText(aux)) {// chamando o método que verifica se o usuário
							// informou apenas texto
							JOptionPane.showMessageDialog(null,
									"Você informou um ou mais caracteres inválidos - Favor digitar no formato: NOME SOBRENOME"
											+ "\nRetornando ao menu principal",
									"EXCLUIR NOME", 0);
						} else if (isEmptyOrNull(aux)) { // se o usuário não digitar nada ou digitar espaços
							JOptionPane.showMessageDialog(null,
									"Por favor preencha um nome" + "\nRetornando ao menu principal", "EXCLUIR NOME", 0);
						} else if

						(aux.length() <= 1) { // Se o usuário informar apenas uma letra, informar mensagem de erro
							JOptionPane.showMessageDialog(null, "Por favor preencha um nome com mais de uma letra!"
									+ "\nRetornando ao menu principal", "EXCLUIR NOME", 0);
						} else {

							// Se o nome existir na lista, realiza a exclusão
							if (nomes.contains(aux)) { // Caso a ArrayList de nomes contenha o nome informado
								JOptionPane.showMessageDialog(null, "Nome excluido com sucesso!", "EXCLUIR NOME", 1);
								nomes.remove(aux); // Removendo o nome da lista original
								ordenaNomes.remove(aux); // Removendo o nome da lista secundária
							} else { // Caso não exista o nome informado na lista
								JOptionPane.showMessageDialog(null,
										"O nome informado não existe na lista, por favor, informar um nome válido!!",
										"EXCLUIR NOME", 0);
							}
						}
					}
				}
			} catch (Exception e) {
			}
		}
	}// Fim do método

	// Método para listar todos os nomes cadastrados
	private void listarNomesCadastrados() {

		if (nomes.size() < 1) {// Caso não existam nomes cadastrados
			JOptionPane.showMessageDialog(null, "Nenhum nome foi cadastrado! " + "\nFavor cadastrar um nome.",
					"NOMES CADASTRADOS", 0);
			menuPrincipal();
		} else { // Caso existam nomes cadastrados:
			// Variáveis auxiliares
			String msg = "Nomes cadastrados:\n";
			int contador = 0;
			boolean aux = true;

			// Laço de repetição para buscar os nomes cadastrados no ArrayList (letras)
			for (String mostranomes : nomes) {
				msg += mostranomes + "\n";
				contador++;

				// Se o tamanho da lista atingir o valor do contador, a listagem de nomes é
				// realizada
				if (nomes.size() == contador) {
					JOptionPane.showMessageDialog(null, msg, "NOMES CADASTRADOS", 1); // Resultado em tela
					aux = false;
				}
			}
			if (aux == true) { // Caso a variável auxiliar continue sendo true, o nome não foi encontrado
				JOptionPane.showMessageDialog(null, "Não existem nomes cadastrados", "NOMES CADASTRADOS", 0);
			}

		}

	}

	private void listarNomesOrdemAlfabetica() {

		if (nomes.size() < 1) {// Caso não existam nomes cadastrados
			JOptionPane.showMessageDialog(null, "Nenhum nome foi cadastrado! " + "\nFavor cadastrar um nome.",
					"LISTA ORDENADA", 0);
			menuPrincipal();
		} else if (nomes.size() == 1) { // Caso exista apenas um nome cadastrado
			JOptionPane.showMessageDialog(null,
					"Apenas 1 nome foi cadastrado! " + "\nNome: " + nomes.get(0) + "\nFavor cadastrar mais de um nome.",
					"LISTA ORDENADA", 0);
			menuPrincipal();
		} else {// Caso existam nomes cadastrados:

			// Lista secundária sendo limpa e recebendo os valores da lista principal
			ordenaNomes = nomes;

			// Ordenando a lista secundária em ordem alfabética
			Collections.sort(ordenaNomes);

			// Exibindo em tela a lista secundária
			JOptionPane.showMessageDialog(null, ordenaNomes, "LISTA ORDENADA", 1);
		}
	}

	private void listarNomesIguais() {

		// Variáveis auxiliares
		String mensagem = "";
		boolean existe = false;

		// Laço de repetição para verificar se tem nomes repetidos no ArrayList, e caso
		// tenha, quantas vezes ele esta sendo repetido
		if (nomes.size() >= 2) {
			// Variável auxiliar - 1ª armazena os nomes, 2ª o nº de quantidade
			Map<String, Integer> contagem = new HashMap<>();

			ArrayList<String> nomesIguais = new ArrayList<String>();

			for (String auxiliar : nomes) {// inicio for
				nomesIguais.add(auxiliar.toLowerCase());
			} // fim for
			for (String nome : nomesIguais) {// inicio for
				// método para ver quantos vezes foi repetido dentro do arrayList
				contagem.put(nome, Collections.frequency(nomesIguais, nome));
			} // fim for
				// variável para setar a quantidade de vezes que apareceu
			Set<String> nome = contagem.keySet();
			// for para armazenar o nome que repetiu
			for (String vezesNome : nome) {// inicio for
				if (contagem.get(vezesNome) >= 2) {
					existe = true;
					mensagem += "Nome:  " + vezesNome + " Repetiu " + contagem.get(vezesNome) + " vezes\n";
				}
			} // fim for

			if (existe) {
				// resultado em tela
				JOptionPane.showMessageDialog(null, mensagem, "LISTAR NOMES IGUAIS", 1);

			} else { // Mensagem de aviso caso não tenha nenhum nome repeptido
				JOptionPane.showMessageDialog(null, "Não existem nomes repetidos", "LISTAR NOMES IGUAIS", 1);
			}

		} else if (nomes.size() == 1) {
			JOptionPane.showMessageDialog(null,
					"Há apenas 1 nome cadastrado (são necessários dois ou mais nomes cadastrados para efetuar a busca)! " +"\nRetornando ao menu principal",
					"LISTAR NOMES IGUAIS", 0);
		} else {
				JOptionPane.showMessageDialog(null, "Nenhum nome foi cadastrado! " + "\nFavor cadastrar um nome." + "\nRetornando ao menu principal",
						"LISTAR NOMES IGUAIS", 0);
				menuPrincipal();
		}
	}

	// Método para listar os nomes pela inicial
	private void listarNomesInicial() {
		// Variáveis auxiliares
		String letra, aux = "auxiliar";
		String msg = "";
		int aux2 = 1;

		// Obtendo informações do usuário e buscando o nome no ArrayList
		// Caso nenhum nome tenha sido cadastrado ainda
		if (nomes.size() < 1) {// Caso não existam nomes cadastrados
			JOptionPane.showMessageDialog(null, "Nenhum nome foi cadastrado! " + "\nFavor cadastrar um nome.",
					"BUSCA POR INICIAL", 0);
			menuPrincipal();
		} else { // Caso existam nomes cadastrados:

			// Solicitando do usuário a inicial para realizar a busca
			letra = JOptionPane.showInputDialog(null, "Digite a inicial para realizar a busca:", "BUSCA POR INICIAL",
					3);

			// Caso o usuário informe mais de uma letra
			if (letra.length() > 1) { // Informar mensagem de erro
				JOptionPane.showMessageDialog(null,
						"ERRO: FAVOR INFORMAR APENAS UMA LETRA" + "\nToque em OK para retornar ao menu principal.",
						"BUSCA POR INICIAL", 0);
			} else {
				if (isEmptyOrNull(letra)) { // se o usuário não digitar nada ou digitar espaços
					JOptionPane.showMessageDialog(null,
							"ERRO: A inicial não foi informada" + "\nToque em OK para retornar ao menu principal.",
							"BUSCA POR NOME", 0);

				} else if (!isOnlyText(letra)) {// se o usuário informar números ou caracteres não permitidos
					JOptionPane.showMessageDialog(null,
							"CARACTERE INVÁLIDO! Favor informar 'UMA' letra."
									+ "\nToque em OK para retornar ao menu principal.",
							"ERRO: FAVOR INFORMAR UM NOME", 0);
				}

				else { // Se o caractere informado for válido

					// Mudando a inicial para minuscula
					letra = letra.toLowerCase();

					// Laço de repetição para passar por todos os nomes da lista
					for (int i = 0; i < nomes.size(); i++) {
						// Variável auxiliar recebendo a inicial de todos os nomes, convertidos em
						// letras minusculas
						aux = nomes.get(i).substring(0, 1).toLowerCase();
						// Se a inicial informada for igual à primeira letra do nome em que se encontra
						// o índice
						if (letra.equals(aux)) {
							// A variável de mensagem concatena o nome e a auxliar 2 é zerada
							msg += nomes.get(i) + "\n";
							aux2 = 0;
						}
					}
					// Resultado em tela
					if (aux2 != 1) {
						JOptionPane.showMessageDialog(null, "Nome(s) encontrado(s):\n\n" + msg + "\n",
								"BUSCA POR INICIAL", 1);
					} else { // Mensagem de erro caso nenhum nome tenha sido encontrado
						JOptionPane.showMessageDialog(null, "Nenhum nome foi encontrado para a inicial pesquisada!",
								"BUSCA POR INICIAL", 0);
					}
				}
			}
		}
	}

	// Método para pesquisar nome
	private void pesquisarNome() {

		if (nomes.size() < 1) {// Caso não existam nomes cadastrados
			JOptionPane.showMessageDialog(null, "Nenhum nome foi cadastrado! " + "\nFavor cadastrar um nome.",
					"PESQUISA DE NOME", 0);
			menuPrincipal();
		} else { // Caso existam nomes cadastrados:
			// Obtendo informação do usuário
			String aux = JOptionPane.showInputDialog(null, "Informe o nome a ser pesquisado", "PESQUISA POR NOME", 1);

			if (!isOnlyText(aux)) {// chamando o método que verifica se o usuário
				// informou apenas texto
				JOptionPane.showMessageDialog(null,
						"Você informou um ou mais caracteres inválidos - Favor digitar no formato: NOME SOBRENOME"
								+ "\nRetornando ao menu principal",
						"PESQUISA DE NOME", 0);
			} else if (isEmptyOrNull(aux)) { // se o usuário não digitar nada ou digitar espaços
				JOptionPane.showMessageDialog(null, "ERRO: O NOME NÃO FOI INFORMADO" + "\nRetornando ao menu principal",
						"PEQUISA DE NOME", 0);
			} else if

			(aux.length() <= 1) { // Se o usuário informar apenas uma letra, informar mensagem de erro
				JOptionPane.showMessageDialog(null,
						"Por favor preencha um nome com mais de uma letra!" + "\nRetornando ao menu principal",
						"PESQUISA DE NOME", 0);
			} else {

				// Caso o nome esteja correto, demonstrar o resultado de "Nome cadastrado!"
				if (nomes.contains(aux)) {
					JOptionPane.showMessageDialog(null, "Nome cadastrado!", "PESQUISA DE NOME", 1);
				} else { // Caso o nome não esteja correto, demonstrar o resultado de "Não cadastrado!"
					JOptionPane.showMessageDialog(null, "O nome não está cadastrado!", "PESQUISA DE NOME", 0);
				}
			}
		}
	}

	// Método para sair do sistema
	private void sairDoSistema() {

		// variavel para encerrar o sistema com sim ou não
		int opcao = JOptionPane.showConfirmDialog(null, "Encerrar o sistema?", "ATENÇÃO", JOptionPane.YES_OPTION,
				JOptionPane.NO_OPTION);

		// se sim, sai do sistema
		if (opcao == JOptionPane.YES_OPTION) {
			System.exit(0);
		}

	}

	// Método para verificar se há apenas texto
	public static boolean isOnlyText(String text) {
		if (text.matches("[A-Z a-z\u00C0-\u00FF]*")) {
			return true;
		} else {
			return false;
		}
		// Passa para o método matches a regex
		// Se tiver número ou caractere diferente de letra na string irá retornar falso
	}

	// verificando se o valor é nulo ou vazio
	public static boolean isEmptyOrNull(String string) {
		return (string == null || string.trim().equals(""));
	}

	/*
	 * Método principal para a execução do programa
	 */
	public static void main(String[] args) {
		new VerificaArrayList();
	}

} // Fim da classe
