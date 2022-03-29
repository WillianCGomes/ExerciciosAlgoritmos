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
	// auxiliar para receber altera��es
	private ArrayList<String> nomes;
	private ArrayList<String> ordenaNomes;

	// M�todo construtor da classe
	public VerificaArrayList() {
		nomes = new ArrayList<String>();
		ordenaNomes = new ArrayList<String>();

		// Socilitando o m�todo de menu principal
		menuPrincipal();
	}

	// M�dodo para criar o menu principal
	public void menuPrincipal() {

		// Mensagem para ser exibida em janela para o usu�rio
		String menu = "INFORME A OP��O DESEJADA \n\n" + "1 - CADASTRAR NOME\n" + "2 - EXCLUIR NOME\n"
				+ "3 - LISTAR NOMES CADASTRADOS\n" + "4 - LISTAR NOMES EM ORDEM ALFAB�TICA\n"
				+ "5 - LISTAR NOMES IGUAIS\n" + "6 - LISTAR NOMES POR LETRA INICIAL\n" + "7 - PESQUISAR POR NOME\n"
				+ "8 - SAIR DO SISTEMA\n";

		// La�o para repetir menu caso seja informada uma op��o inv�lida
		while (true) {
			try {
				int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, menu, "MENU PRINCIPAL", 1));
				processamentoPrincipal(opcao);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "OP��O INV�LIDA", "MENU PRINCIPAL", 0);
			}
		}
	}

	// m�todo de procesamento principal
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
		// Mensagem padr�o caso o usu�rio informe uma op��o inv�lida
		default:
			JOptionPane.showMessageDialog(null, "Op��o Inv�lida!", "MENU PRINCIPAL", 0);
			break;
		}
	}

	// M�todo para cadastrar novos nomes
	private void cadastrarNome() {

		// Vari�vel auxiliar para repetir a solicita��o caso o usu�rio informe um valor
		// inv�lido
		boolean execute;
		// Vari�vel para receber o nome informado do usu�rio
		String nomeinf;
		execute = true;
		if (nomes.size() == 10) {
			JOptionPane.showMessageDialog(null,
					"N�MERO M�XIMO DE NOMES CADASTRADOS J� ATINGIDO!" + "\nRetornando ao menu principal.", "ERRO", 0);
			execute = false;
			menuPrincipal();
		} else {
			while (execute) { // la�o para executar caso exista algum erro ou o usu�rio deseje cadastrar mais
								// um nome
				if (nomes.size() >= 10) { // verifica se o programa n�o excedeu o limite de 10 nomes
					JOptionPane.showMessageDialog(null,
							"N�MERO M�XIMO DE NOMES CADASTRADOS ATINGIDO!" + "\nRetornando ao menu principal.", "ERRO",
							0);
					// Para a execu��o do m�todo e retorna ao menu principal
					execute = false;
					menuPrincipal();
				} else { // Caso n�o tenha excedido os 10 nomes

					try { // Try - Catch para retornar ao usu�rio caso um caractere inv�lido ou nulo seja
							// digitado
						nomeinf = JOptionPane.showInputDialog(null, "Digite o nome a ser cadastrado:",
								"Lista de 10 nomes", 3);
						if (nomeinf.length() < 2) { // Se o usu�rio informar apenas uma letra, informar mensagem de erro
							JOptionPane.showMessageDialog(null,
									"Por favor preencha um nome com mais de uma letra - CAMPO OBRIGAT�RIO!",
									"ERRO: FAVOR INFORMAR UM NOME", 0);
							execute = false; // Para a execu��o do m�todo
						} else { // caso o usu�rio informe mais de uma letra
							nomes.add(nomeinf); // adicionando o nome informado � ArrayList
							if (isEmptyOrNull(nomeinf)) { // se o usu�rio n�o digitar nada ou digitar espa�os
								JOptionPane.showMessageDialog(null, "Por favor preencha um nome - CAMPO OBRIGAT�RIO!",
										"ERRO: FAVOR INFORMAR UM NOME", 0);
								nomes.remove(nomes.size() - 1); // Removendo da ArrayList o nome inv�lido informado
								execute = true; // Ativando a vari�vel auxiliar para executar novamente a solicita��o no
												// mesmo
												// �ndice

							} else if (!isOnlyText(nomeinf)) {// chamando o m�todo que verifica se o usu�rio
																// informou apenas texto
								JOptionPane.showMessageDialog(null,
										"Voc� inseriu um caractere inv�lido - Favor digitar no formato: NOME SOBRENOME",
										"ERRO: CARACTERE INV�LIDO", 0);
								nomes.remove(nomes.size() - 1); // Removendo da ArrayList o nome inv�lido informado
								execute = true; // Ativando a vari�vel auxiliar para executar novamente a solicita��o no
												// mesmo
												// �ndice
							} else { // Caso o nome seja v�lido, perguntar se o usu�rio deseja cadastrar mais nomes
								int opcao = JOptionPane.showConfirmDialog(null,
										"Deseja Cadastrar outro nome? (Nomes cadastrados: " + nomes.size() + ")",
										"ATEN��O", JOptionPane.YES_OPTION, JOptionPane.CANCEL_OPTION);
								// Caso o usu�rio deseje cadastrar mais nomes
								if (opcao == JOptionPane.YES_OPTION) {
									execute = true;
								} else {
									ordenaNomes = nomes;
									execute = false;
								}
							}
						}
					} catch (Exception e) { // Caso um outro caractere inv�lido seja informado
						JOptionPane.showMessageDialog(null,
								"Voc� inseriu um caractere inv�lido - Favor digitar no formato: NOME SOBRENOME",
								"ERRO: CARACTERE INV�LIDO", 0);
					}
				}
			}
		}
	}// Fim do m�todo

	// M�todo para excluir um nome
	private void excluirNome() {
		if (nomes.size() < 1) {// Se n�o existirem nomes cadastrados
			JOptionPane.showMessageDialog(null, "Nenhum nome foi cadastrado! " + "\nFavor cadastrar um nome.",
					"EXCLUIR NOME", 0);
			menuPrincipal();
		} else { // Caso existam nomes cadastrados:
			// Vari�veis auxiliares
			String aux;
			String msg = "";
			int contador = 0;

			// C�digo respons�vel para listar e deletar os nomes informados pelo usu�rio
			try {
				// In�cio La�o de repeti��o
				for (String mostra_nome : nomes) {
					msg += mostra_nome + "\n"; // Concatenando testo da vari�vel
					contador++; // Vari�vel contadora sendo incrementada
					if (contador == nomes.size()) { // Se o valor incrementado equivaler ao tamanho da lista, solicitar
													// o nome para exclus�o
						aux = JOptionPane.showInputDialog(null,
								"Nomes cadastrados:\n" + msg + "\nInforme o nome a ser excluido", "EXCLUIR NOME", 1);

						if (!isOnlyText(aux)) {// chamando o m�todo que verifica se o usu�rio
							// informou apenas texto
							JOptionPane.showMessageDialog(null,
									"Voc� informou um ou mais caracteres inv�lidos - Favor digitar no formato: NOME SOBRENOME"
											+ "\nRetornando ao menu principal",
									"EXCLUIR NOME", 0);
						} else if (isEmptyOrNull(aux)) { // se o usu�rio n�o digitar nada ou digitar espa�os
							JOptionPane.showMessageDialog(null,
									"Por favor preencha um nome" + "\nRetornando ao menu principal", "EXCLUIR NOME", 0);
						} else if

						(aux.length() <= 1) { // Se o usu�rio informar apenas uma letra, informar mensagem de erro
							JOptionPane.showMessageDialog(null, "Por favor preencha um nome com mais de uma letra!"
									+ "\nRetornando ao menu principal", "EXCLUIR NOME", 0);
						} else {

							// Se o nome existir na lista, realiza a exclus�o
							if (nomes.contains(aux)) { // Caso a ArrayList de nomes contenha o nome informado
								JOptionPane.showMessageDialog(null, "Nome excluido com sucesso!", "EXCLUIR NOME", 1);
								nomes.remove(aux); // Removendo o nome da lista original
								ordenaNomes.remove(aux); // Removendo o nome da lista secund�ria
							} else { // Caso n�o exista o nome informado na lista
								JOptionPane.showMessageDialog(null,
										"O nome informado n�o existe na lista, por favor, informar um nome v�lido!!",
										"EXCLUIR NOME", 0);
							}
						}
					}
				}
			} catch (Exception e) {
			}
		}
	}// Fim do m�todo

	// M�todo para listar todos os nomes cadastrados
	private void listarNomesCadastrados() {

		if (nomes.size() < 1) {// Caso n�o existam nomes cadastrados
			JOptionPane.showMessageDialog(null, "Nenhum nome foi cadastrado! " + "\nFavor cadastrar um nome.",
					"NOMES CADASTRADOS", 0);
			menuPrincipal();
		} else { // Caso existam nomes cadastrados:
			// Vari�veis auxiliares
			String msg = "Nomes cadastrados:\n";
			int contador = 0;
			boolean aux = true;

			// La�o de repeti��o para buscar os nomes cadastrados no ArrayList (letras)
			for (String mostranomes : nomes) {
				msg += mostranomes + "\n";
				contador++;

				// Se o tamanho da lista atingir o valor do contador, a listagem de nomes �
				// realizada
				if (nomes.size() == contador) {
					JOptionPane.showMessageDialog(null, msg, "NOMES CADASTRADOS", 1); // Resultado em tela
					aux = false;
				}
			}
			if (aux == true) { // Caso a vari�vel auxiliar continue sendo true, o nome n�o foi encontrado
				JOptionPane.showMessageDialog(null, "N�o existem nomes cadastrados", "NOMES CADASTRADOS", 0);
			}

		}

	}

	private void listarNomesOrdemAlfabetica() {

		if (nomes.size() < 1) {// Caso n�o existam nomes cadastrados
			JOptionPane.showMessageDialog(null, "Nenhum nome foi cadastrado! " + "\nFavor cadastrar um nome.",
					"LISTA ORDENADA", 0);
			menuPrincipal();
		} else if (nomes.size() == 1) { // Caso exista apenas um nome cadastrado
			JOptionPane.showMessageDialog(null,
					"Apenas 1 nome foi cadastrado! " + "\nNome: " + nomes.get(0) + "\nFavor cadastrar mais de um nome.",
					"LISTA ORDENADA", 0);
			menuPrincipal();
		} else {// Caso existam nomes cadastrados:

			// Lista secund�ria sendo limpa e recebendo os valores da lista principal
			ordenaNomes = nomes;

			// Ordenando a lista secund�ria em ordem alfab�tica
			Collections.sort(ordenaNomes);

			// Exibindo em tela a lista secund�ria
			JOptionPane.showMessageDialog(null, ordenaNomes, "LISTA ORDENADA", 1);
		}
	}

	private void listarNomesIguais() {

		// Vari�veis auxiliares
		String mensagem = "";
		boolean existe = false;

		// La�o de repeti��o para verificar se tem nomes repetidos no ArrayList, e caso
		// tenha, quantas vezes ele esta sendo repetido
		if (nomes.size() >= 2) {
			// Vari�vel auxiliar - 1� armazena os nomes, 2� o n� de quantidade
			Map<String, Integer> contagem = new HashMap<>();

			ArrayList<String> nomesIguais = new ArrayList<String>();

			for (String auxiliar : nomes) {// inicio for
				nomesIguais.add(auxiliar.toLowerCase());
			} // fim for
			for (String nome : nomesIguais) {// inicio for
				// m�todo para ver quantos vezes foi repetido dentro do arrayList
				contagem.put(nome, Collections.frequency(nomesIguais, nome));
			} // fim for
				// vari�vel para setar a quantidade de vezes que apareceu
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

			} else { // Mensagem de aviso caso n�o tenha nenhum nome repeptido
				JOptionPane.showMessageDialog(null, "N�o existem nomes repetidos", "LISTAR NOMES IGUAIS", 1);
			}

		} else if (nomes.size() == 1) {
			JOptionPane.showMessageDialog(null,
					"H� apenas 1 nome cadastrado (s�o necess�rios dois ou mais nomes cadastrados para efetuar a busca)! " +"\nRetornando ao menu principal",
					"LISTAR NOMES IGUAIS", 0);
		} else {
				JOptionPane.showMessageDialog(null, "Nenhum nome foi cadastrado! " + "\nFavor cadastrar um nome." + "\nRetornando ao menu principal",
						"LISTAR NOMES IGUAIS", 0);
				menuPrincipal();
		}
	}

	// M�todo para listar os nomes pela inicial
	private void listarNomesInicial() {
		// Vari�veis auxiliares
		String letra, aux = "auxiliar";
		String msg = "";
		int aux2 = 1;

		// Obtendo informa��es do usu�rio e buscando o nome no ArrayList
		// Caso nenhum nome tenha sido cadastrado ainda
		if (nomes.size() < 1) {// Caso n�o existam nomes cadastrados
			JOptionPane.showMessageDialog(null, "Nenhum nome foi cadastrado! " + "\nFavor cadastrar um nome.",
					"BUSCA POR INICIAL", 0);
			menuPrincipal();
		} else { // Caso existam nomes cadastrados:

			// Solicitando do usu�rio a inicial para realizar a busca
			letra = JOptionPane.showInputDialog(null, "Digite a inicial para realizar a busca:", "BUSCA POR INICIAL",
					3);

			// Caso o usu�rio informe mais de uma letra
			if (letra.length() > 1) { // Informar mensagem de erro
				JOptionPane.showMessageDialog(null,
						"ERRO: FAVOR INFORMAR APENAS UMA LETRA" + "\nToque em OK para retornar ao menu principal.",
						"BUSCA POR INICIAL", 0);
			} else {
				if (isEmptyOrNull(letra)) { // se o usu�rio n�o digitar nada ou digitar espa�os
					JOptionPane.showMessageDialog(null,
							"ERRO: A inicial n�o foi informada" + "\nToque em OK para retornar ao menu principal.",
							"BUSCA POR NOME", 0);

				} else if (!isOnlyText(letra)) {// se o usu�rio informar n�meros ou caracteres n�o permitidos
					JOptionPane.showMessageDialog(null,
							"CARACTERE INV�LIDO! Favor informar 'UMA' letra."
									+ "\nToque em OK para retornar ao menu principal.",
							"ERRO: FAVOR INFORMAR UM NOME", 0);
				}

				else { // Se o caractere informado for v�lido

					// Mudando a inicial para minuscula
					letra = letra.toLowerCase();

					// La�o de repeti��o para passar por todos os nomes da lista
					for (int i = 0; i < nomes.size(); i++) {
						// Vari�vel auxiliar recebendo a inicial de todos os nomes, convertidos em
						// letras minusculas
						aux = nomes.get(i).substring(0, 1).toLowerCase();
						// Se a inicial informada for igual � primeira letra do nome em que se encontra
						// o �ndice
						if (letra.equals(aux)) {
							// A vari�vel de mensagem concatena o nome e a auxliar 2 � zerada
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

	// M�todo para pesquisar nome
	private void pesquisarNome() {

		if (nomes.size() < 1) {// Caso n�o existam nomes cadastrados
			JOptionPane.showMessageDialog(null, "Nenhum nome foi cadastrado! " + "\nFavor cadastrar um nome.",
					"PESQUISA DE NOME", 0);
			menuPrincipal();
		} else { // Caso existam nomes cadastrados:
			// Obtendo informa��o do usu�rio
			String aux = JOptionPane.showInputDialog(null, "Informe o nome a ser pesquisado", "PESQUISA POR NOME", 1);

			if (!isOnlyText(aux)) {// chamando o m�todo que verifica se o usu�rio
				// informou apenas texto
				JOptionPane.showMessageDialog(null,
						"Voc� informou um ou mais caracteres inv�lidos - Favor digitar no formato: NOME SOBRENOME"
								+ "\nRetornando ao menu principal",
						"PESQUISA DE NOME", 0);
			} else if (isEmptyOrNull(aux)) { // se o usu�rio n�o digitar nada ou digitar espa�os
				JOptionPane.showMessageDialog(null, "ERRO: O NOME N�O FOI INFORMADO" + "\nRetornando ao menu principal",
						"PEQUISA DE NOME", 0);
			} else if

			(aux.length() <= 1) { // Se o usu�rio informar apenas uma letra, informar mensagem de erro
				JOptionPane.showMessageDialog(null,
						"Por favor preencha um nome com mais de uma letra!" + "\nRetornando ao menu principal",
						"PESQUISA DE NOME", 0);
			} else {

				// Caso o nome esteja correto, demonstrar o resultado de "Nome cadastrado!"
				if (nomes.contains(aux)) {
					JOptionPane.showMessageDialog(null, "Nome cadastrado!", "PESQUISA DE NOME", 1);
				} else { // Caso o nome n�o esteja correto, demonstrar o resultado de "N�o cadastrado!"
					JOptionPane.showMessageDialog(null, "O nome n�o est� cadastrado!", "PESQUISA DE NOME", 0);
				}
			}
		}
	}

	// M�todo para sair do sistema
	private void sairDoSistema() {

		// variavel para encerrar o sistema com sim ou n�o
		int opcao = JOptionPane.showConfirmDialog(null, "Encerrar o sistema?", "ATEN��O", JOptionPane.YES_OPTION,
				JOptionPane.NO_OPTION);

		// se sim, sai do sistema
		if (opcao == JOptionPane.YES_OPTION) {
			System.exit(0);
		}

	}

	// M�todo para verificar se h� apenas texto
	public static boolean isOnlyText(String text) {
		if (text.matches("[A-Z a-z\u00C0-\u00FF]*")) {
			return true;
		} else {
			return false;
		}
		// Passa para o m�todo matches a regex
		// Se tiver n�mero ou caractere diferente de letra na string ir� retornar falso
	}

	// verificando se o valor � nulo ou vazio
	public static boolean isEmptyOrNull(String string) {
		return (string == null || string.trim().equals(""));
	}

	/*
	 * M�todo principal para a execu��o do programa
	 */
	public static void main(String[] args) {
		new VerificaArrayList();
	}

} // Fim da classe
