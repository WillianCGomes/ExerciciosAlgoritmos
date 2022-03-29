package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import model.Cliente;
import model.Endereco;
import util.Mensagem;
import util.Titulo;
import util.Util;

/**
 * Classe respons�vel por controlar os processos de grava��o e leitura da tela
 * de cliente
 * 
 * @author Willian Carlos Gomes
 * @since 9 de mar. de 2021
 */
public class ClienteController {
	// declara��o do nome do arquivo TXT
	private String arquivo = "clientes.txt";

	/*
	 * m�todo para gravar registro no arquivo txt
	 */
	public void gravarTxtCliente(Cliente cliente) {
		// classe auxiliar para carregar arquivo existente ou criar um novo
		File file = new File(arquivo);

		try {
			// classe auxiliar para gerar o objeto de mem�ria para grava��o de arquivo
			FileOutputStream arquivoOutput = new FileOutputStream(file, true);

			// classe auxiliar para gerar o arquivo e seu conte�do
			PrintStream gravador = new PrintStream(arquivoOutput);

			// gravando o conte�do do arquivo
			gravador.print(cliente.getCodigo());
			gravador.print(";");
			gravador.print(cliente.getNome());
			gravador.print(";");
			gravador.print(cliente.getEndereco());
			gravador.print(";");
			gravador.print(cliente.getCpf());
			gravador.print(";");
			gravador.print(cliente.getRg());
			gravador.print(";");
			gravador.print(cliente.getDataNascimento());
			gravador.print(";");
			gravador.print(cliente.getIdade());
			gravador.print(";");
			gravador.print(cliente.getSexo());
			gravador.print(";");
			
			//caso o telefone n�o tenha sido informado, salva null no arquivo TXT
			if (cliente.getTelefone().equals("(__) ____-____")) {
				gravador.print("");
			} else {
			gravador.print(cliente.getTelefone());}
			
			gravador.print(";");
			gravador.print(cliente.getCelular());
			gravador.print(";");
			gravador.print(cliente.getEmail());
			gravador.print("\n");

			// fechando o processo de grava��o
			gravador.close();
			arquivoOutput.close();

			//Caso ocorram erros na grava��o do arquivo
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, Mensagem.erroGravarArquivoCliente, Titulo.cadastroCliente, 0);
			e.printStackTrace();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, e.toString(), "Grava��o de Arquivo", 0);
			e.printStackTrace();
		}
	} // fim do try-catch

	/*
	 * m�todo para retornar uma lista de clientes
	 */
	public ArrayList<Cliente> getClientes() {
		// objeto de lista para retornar no m�todo
		ArrayList<Cliente> clientes = buscarTodos();
		return clientes;
	}

	/*
	 * m�todo para ler o arquivo TXT de clientes
	 */
	private ArrayList<Cliente> buscarTodos() {
		// lista auxiliar para retornar no m�todo
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();

		try {
			// classe Scanner auxiliar para ler o arquivo de clientes
			Scanner leitor = new Scanner(new FileReader(arquivo));

			// la�o de repeti��o para ler as linhas do arquivo
			while (leitor.hasNext()) {

				// objeto auxiliar para retornar no m�todo
				Cliente cliente = getCliente(leitor.nextLine());
				// atribuindo o objeto clientes na lista de retorno
				clientes.add(cliente);
			} // fim do while

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		// retornando a lista de clientes
		return clientes;

	}// fim do m�todo

	/*
	 * m�todo para retornar um objeto do tipo cliente
	 */
	private Cliente getCliente(String args) {
		// objetos auxiliares para retornar no m�todo
		Cliente cliente = new Cliente();
		Endereco endereco = new Endereco();
		// vari�vel auxiliar para quebrar o registro do arquivo
		String aux[] = args.split(";");

		// valorizando o objeto Cliente
		cliente.setNome(aux[1]);
		cliente.setSexo(aux[15].charAt(0));
		cliente.setIdade(Util.getInt(aux[14]));
		endereco.setCidade(aux[8]);
		cliente.setCelular(aux[17]);
		cliente.setEndereco(endereco);
		// retornando o objeto valorizado
		return cliente;

	}// fim do m�todo

}// fim da classe
