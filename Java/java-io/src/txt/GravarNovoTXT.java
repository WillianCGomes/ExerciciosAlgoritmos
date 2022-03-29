package txt;

import java.io.FileNotFoundException;
import java.io.PrintStream;

import javax.swing.JOptionPane;

/**
 * Classe responsável por demonstrar a gravação de arquivos TXT, levando em
 * consideração que o processo abaixo sempre criará um novo arquivo,
 * sobrescrevendo o anterior
 * 
 * @author Willian Carlos Gomes
 * @since 5 de mar. de 2021
 * @version 1.0
 */
public class GravarNovoTXT {

	/*
	 * método para gerar um arquivo txt
	 */
	public void gerarArquivoTxt(String nome) {

		try {
			// classe auxiliar para gerar o arquivo e seu conteúdo
			PrintStream gravador = new PrintStream(nome);
			// objeto gravador possui o método print para escrita de conteúdo do arquivo
			gravador.println("PrintStream");
			gravador.println("A classe PrintStream possui um construtor que já");
			gravador.println("recebe o nome de um arquivo como argumento.");
			gravador.println("");
			gravador.println("É importante lembrar que o arquivo de saída");
			gravador.println("DEVE SER FECHADO usando o método close().");
			// método obrigatório para encerrar a gravação do conteúdo
			gravador.close();
			// exibindo o resultado para o usuário
			JOptionPane.showMessageDialog(null, "Arquivo gravado com sucesso", "Gravação de arquivo", 1);
			//encerrando a execução
			System.exit(0);
			
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, e.toString(), "Gravação de Arquivo", 0);
			e.printStackTrace();
		}

	}// fim do método

	/*
	 * método principal para executar a classe
	 */
	public static void main(String[] args) {
		new GravarNovoTXT().gerarArquivoTxt("saida.txt");
	}
	
	
}// fim da classe
