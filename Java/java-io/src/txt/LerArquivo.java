package txt;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * Classe respons�vel por demonstrar a leitura de arquivo txt
 * @author Willian Carlos Gomes
 * @since 5 de mar. de 2021
 */
public class LerArquivo {
	
	/*
	 * m�todo para ler um arquivo recebendo o seu nome
	 */
	public void lerArquivo(String nome) {
	
		
		try {
			// declara um atributo para ler um arquivo e informar o seu nome para leitura
			Scanner leitor = new Scanner(new FileReader(nome));
			
			//la�o de repeti��o para leitura do arquivo com o comando hasNext
			while (leitor.hasNext()) {
				// exibindo no console o conte�do armazenado no arquivo TXT
				System.out.println(leitor.nextLine());
			}
			
			
		} catch (FileNotFoundException e) {
			//exibindo uma mensagem de erro para o usu�rio
			JOptionPane.showMessageDialog(null, "Arquivo n�o encontrado", "Ler Arquivo", 0);
			//exibe no console o log de erro do Java			
			e.printStackTrace();
			
			
		}
		
	} //fim do m�todo
	
	/*
	 * m�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		new LerArquivo().lerArquivo("entrada.txt");
	}

}//fim da classe
