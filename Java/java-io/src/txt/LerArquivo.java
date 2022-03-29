package txt;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * Classe responsável por demonstrar a leitura de arquivo txt
 * @author Willian Carlos Gomes
 * @since 5 de mar. de 2021
 */
public class LerArquivo {
	
	/*
	 * método para ler um arquivo recebendo o seu nome
	 */
	public void lerArquivo(String nome) {
	
		
		try {
			// declara um atributo para ler um arquivo e informar o seu nome para leitura
			Scanner leitor = new Scanner(new FileReader(nome));
			
			//laço de repetição para leitura do arquivo com o comando hasNext
			while (leitor.hasNext()) {
				// exibindo no console o conteúdo armazenado no arquivo TXT
				System.out.println(leitor.nextLine());
			}
			
			
		} catch (FileNotFoundException e) {
			//exibindo uma mensagem de erro para o usuário
			JOptionPane.showMessageDialog(null, "Arquivo não encontrado", "Ler Arquivo", 0);
			//exibe no console o log de erro do Java			
			e.printStackTrace();
			
			
		}
		
	} //fim do método
	
	/*
	 * método principal para executar a classe
	 */
	public static void main(String[] args) {
		new LerArquivo().lerArquivo("entrada.txt");
	}

}//fim da classe
