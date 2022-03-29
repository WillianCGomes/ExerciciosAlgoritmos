package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * Classe para demonstrar a utiliza��o da janela, bot�es, r�tulo e campo de
 * texto
 * 
 * @author Willian Carlos Gomes
 * @since 1 de mar. de 2021
 */
public class Exemplo02 {
	// M�todo respons�vel por criar a tela e adicionar seus componentes
	public void iniciaGui() {

		/*
		 * Definindo a tela e suas configura��es
		 */

		JFrame janela = new JFrame();

		// Configurando o t�tulo da tela
		janela.setTitle("Exemplo de campo de texto");

		// Configurando o tamanho da tela
		janela.setSize(300, 200);

		// Definir o layout como nula da janela
		janela.getContentPane().setLayout(null);

		// Configurando a centraliza��o do objeto janela
		janela.setLocationRelativeTo(null);

		/*
		 * Definindo o r�tulo e suas configura��es JLabel
		 */

		JLabel lbNome = new JLabel();
		// Configurando o texto a ser exibido na label
		lbNome.setText("Nome:");

		// Configurando o tamanho e local da label
		// Primeiro argumento - posi��o x - do ponto zero para direita
		// segundo argumento - posi��o y - do ponto zero para baixo
		// terceiro argumento - largura
		// quarto argumento - altura
		lbNome.setBounds(10, 10, 40, 20);

		/*
		 * Definindo o campo de texto
		 */
		JTextField tfNome = new JTextField();
		// Configurando o tamanho e local do campo de texto
		tfNome.setBounds(60, 10, 150, 20);
		/*
		 * definindo o bot�o e suas configura��es
		 */
		JButton botao = new JButton();
		// Configurando o texto do bot�o
		botao.setText("Clique aqui");
		// Configurando o tamanho e local do bot�o
		botao.setBounds(10, 60, 100, 20);

		/*
		 * Adicionando os componentes na tela
		 */
		janela.getContentPane().add(lbNome);
		janela.getContentPane().add(tfNome);
		janela.getContentPane().add(botao);

		/*
		 * Configurando o parametro de visualiza��o da tela
		 */
		janela.setVisible(true);
	}// fim do m�todo

	// M�todo principal para a execu��o do programa
	public static void main(String[] args) {
		new Exemplo02().iniciaGui();
	}
}// Fim da classe
