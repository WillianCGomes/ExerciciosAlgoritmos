package view;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Classe responsável por demonstrar a utilização de janela (JFrame) e botão
 * (JButton)
 * 
 * @author Willian Carlos Gomes
 * @since 1 de mar. de 2021
 */
public class Exemplo01 {

	// Método para exibir uma janela Swing com o componente botão
	public void iniciaGui() { // Início do método

		// Criando o componente JFrame = janela e adicionando o seu título
		JFrame janela = new JFrame("Exemplo tela e botão");

		// Criando o componente JButton = botão e adicionando o seu tútulo
		JButton botao = new JButton("Clique aqui");

		// Configurar o tamanho do objeto janela - tela;
		// Primeiro parâmetro - largura da tela
		// Segundo parâmetro - altura da tela
		janela.setSize(500, 300);

		// adicionando o botão no objeto janela (dentro do seu content pane)
		janela.getContentPane().add(botao);

		// Configurando a visibilidade da tela
		janela.setVisible(true);

		// Informando que a tela não tem layout pré-definido
		janela.getContentPane().setLayout(null);

	}// Fim do método

	// Método principal para executar a classe
	public static void main(String[] args) {
		new Exemplo01().iniciaGui();
	}

} // Fim da classe
