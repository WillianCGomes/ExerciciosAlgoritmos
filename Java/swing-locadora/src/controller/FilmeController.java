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

import model.Filme;
import util.Mensagem;
import util.Titulo;
import util.Util;

/**
 * Classe respons�vel por controlar os processos de grava��o e leitura da tela
 * de filme
 * 
 * @author Willian Carlos Gomes
 * @since 9 de mar. de 2021
 * @version 1.0
 */
public class FilmeController {

	// declara��o do nome do arquivo TXT utilizado
	private String arquivo = "filmes.txt";

	/*
	 * m�todo para gravar registros no arquivo txt
	 */
	public void gravarTxtFilme(Filme filme) {
		// classe auxiliar para carregar um arquivo existente ou criar um novo arquivo
		File file = new File(arquivo);

		try {
			// classe auxiliar para gerar um objeto de mem�ria para grava��o do arquivo
			FileOutputStream arquivoOutput = new FileOutputStream(file, true);

			// classe auxiliar para gerar o arquivo e seu conte�do
			PrintStream gravador = new PrintStream(arquivoOutput);

			// gravando o conte�do do arquivo
			gravador.print(filme.getCodigo());
			gravador.print(";");
			gravador.print(filme.getNome());
			gravador.print(";");
			gravador.print(filme.getValor());
			gravador.print(";");
			gravador.print(filme.isDisponivel());
			gravador.print(";");
			gravador.print(filme.isPromocao());
			gravador.print(";");
			gravador.print(filme.getValorPromocao());
			gravador.print(";");
			gravador.print(filme.getGenero());
			gravador.print("\n");

			// fechando o processo de grava��o
			gravador.close();
			arquivoOutput.close();

		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, Mensagem.erroGravarArquivoFilme, Titulo.cadastroFilme, 0);
			e.printStackTrace();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, e.toString(), "Grava��o de Arquivo", 0);
			e.printStackTrace();
		}
	}

	/*
	 * M�todo para retornar uma lista de filme
	 */

	public ArrayList<Filme> getFilmes() {

		// Objeto da lista para retornar no m�todo
		ArrayList<Filme> filmes = buscarTodos();
		return filmes;
	}

	/*
	 * M�todo para ler o arquivo TXT de filme
	 */

	private ArrayList<Filme> buscarTodos() {

		// Lista auxiliar para retornar no m�todo
		ArrayList<Filme> filmes = new ArrayList<Filme>();

		try {
			// Classe Scanner auxiliar para ler o arquivo de filme
			Scanner leitor = new Scanner(new FileReader(arquivo));

			// La�o de repeti��o para ler o arquivo de filme
			while (leitor.hasNext()) {

				// Objeto auxiliar para retornar no m�todo
				Filme filme = getFilme(leitor.nextLine());

				// Atribuindo o objeto filme na lista de retorno
				filmes.add(filme);

			} // Fim do while

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// Retornando a lista de filmes
		return filmes;

	} // Fim do m�todo

	/*
	 * M�todo para retornar um objeto do tipo filme
	 */

	private Filme getFilme(String args) {

		// Objeto auxiliar para retornar no m�todo
		Filme filme = new Filme();

		// Vari�vel auxiliar para quebrar o registro do arquivo
		String aux[] = args.split(";");

		// Valorizando o objeto filme
		filme.setCodigo(Util.getInt(aux[0]));
		filme.setNome(aux[1]);
		filme.setValor(Util.getDouble(aux[2]));

		filme.setDisponivel(Util.getBoolean(aux[3]));
		filme.setPromocao(Util.getBoolean(aux[4]));

		filme.setValorPromocao(Util.getDouble(aux[5]));
		for (int i = 0; i < aux.length; i++) {
			filme.setGenero(aux[6]);
		}

		// Retornando o objeto valorizado
		return filme;
	}

}// fim da classe