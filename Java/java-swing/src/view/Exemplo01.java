package view;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Classe respons�vel por demonstrar a utiliza��o de janela (JFrame) e bot�o
 * (JButton)
 * 
 * @author Willian Carlos Gomes
 * @since 1 de mar. de 2021
 */
public class Exemplo01 {

	// M�todo para exibir uma janela Swing com o componente bot�o
	public void iniciaGui() { // In�cio do m�todo

		// Criando o componente JFrame = janela e adicionando o seu t�tulo
		JFrame janela = new JFrame("Exemplo tela e bot�o");

		// Criando o componente JButton = bot�o e adicionando o seu t�tulo
		JButton botao = new JButton("Clique aqui");

		// Configurar o tamanho do objeto janela - tela;
		// Primeiro par�metro - largura da tela
		// Segundo par�metro - altura da tela
		janela.setSize(500, 300);

		// adicionando o bot�o no objeto janela (dentro do seu content pane)
		janela.getContentPane().add(botao);

		// Configurando a visibilidade da tela
		janela.setVisible(true);

		// Informando que a tela n�o tem layout pr�-definido
		janela.getContentPane().setLayout(null);

	}// Fim do m�todo

	// M�todo principal para executar a classe
	public static void main(String[] args) {
		new Exemplo01().iniciaGui();
	}

} // Fim da classe
