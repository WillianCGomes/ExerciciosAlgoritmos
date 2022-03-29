package txt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import javax.swing.JOptionPane;

/**
 * Classe responsável por demonstrar a gravação de arquivo TXT, se o aqruivo for existente, mantém o conteúdo, caso não exista, criará um novo arquivo
 * @author Willian Carlos Gomes
 * @since 8 de mar. de 2021
 * @version 1.0
 */

public class GravarTxtExistente {

	/*
	 * método para criar arquivot TXT recebendo o nome
	 */
	public void gravarArquivo(String nome) {
		
		//classe auxiliar para carregar um arquivo existente ou criar um novo arquivo
		File arquivo = new File(nome);
		
		try {
			//classe auxiliar para gerar um objeto de memória para gravação do arquivo
			FileOutputStream arquivoOutput = new FileOutputStream(arquivo, true);
			
			//classe auxiliar para gerar o arquivo e seu conteúdo
			PrintStream gravador = new PrintStream(arquivoOutput);
			
			//gravando o conteúdo do arquivo
			gravador.println("FileOutputStream");
			gravador.println("Utilizando o fileOutputStream é possível");
			gravador.println("abrir um arquivo e gravar os dados");
			gravador.println("sem necessariamente sobrescrever o arquivo existente");
			gravador.println("");
			gravador.println("Neste exemplo, além de fechar o objeto gravador com o método close,");
			gravador.println("também é necessário fechar o arquivoOutput");
			
			//fechando o processo de gravação
			gravador.close();
			arquivoOutput.close();
			
			//informando ao usuário a finalização duo processo de gravação
			JOptionPane.showMessageDialog(null, "Arquivo gravado com sucesso!", "Gravação de Arquivo", 1);
			
			//encerrando o processamento
			System.exit(0);
			
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, e.toString(), "Gravação de Arquivo", 0);
			e.printStackTrace();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, e.toString(), "Gravação de Arquivo", 0);
			e.printStackTrace();
		}
		
	}// fim do método
	
	public static void main(String[] args) {
		new GravarTxtExistente().gravarArquivo("saida.txt");
	}
	
}//fim da classe
