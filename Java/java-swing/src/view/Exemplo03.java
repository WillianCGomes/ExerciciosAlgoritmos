package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * Classe para demonstrar a utilização de janela, textArea, textField, botões e
 * suas ações
 * 
 * @author Willian Carlos Gomes
 * @since 1 de mar. de 2021
 */
public class Exemplo03 {

	/*
	 * Declarando os componentes utilizados na tela
	 */
	private JFrame janela;
	private JTextField campo;
	private JTextArea area;
	private JButton botao1;
	private JButton botao2;

	/*
	 * Método para criar a instância dos objetos e componentes da tela e suas
	 * configurações
	 */
	public void iniciaGui() {// Início do método

		/*
		 * Configurando a tela
		 */
		janela = new JFrame();
		// Definindo o tamanho da tela
		janela.setSize(300, 300);
		// Definindo o título da tela
		janela.setTitle("Exemplo de ações");
		// Configurando o posicionamento da tela
		janela.setLocationRelativeTo(null);

		/*
		 * Configurando o campo de texto
		 */
		campo = new JTextField();

		/*
		 * Configurando a área de texto
		 */
		area = new JTextArea();

		/*
		 * Configurando o primeiro botão
		 */
		botao1 = new JButton();
		// Configurando o texto a ser exibido
		botao1.setText("Clique aqui");
		// Adicionando um evento de clique no componente
		botao1.addActionListener(new AcaoBotao1());

		/*
		 * Configurando o segundo botão
		 */
		botao2 = new JButton();
		// Configurando o texto a ser exibido
		botao2.setText("Troca cor");
		// Adicionando um evento de clique no componente
		botao2.addActionListener(new AcaoBotao2());

		/*
		 * Adicionando os componentes na tela, passando parâmetros de localização
		 */
		janela.getContentPane().add(BorderLayout.EAST, botao2);
		janela.getContentPane().add(BorderLayout.SOUTH, botao1);
		janela.getContentPane().add(BorderLayout.CENTER, area);
		janela.getContentPane().add(BorderLayout.NORTH, campo);

		/*
		 * Configurando os parâmetros de exibição da tela
		 */
		janela.setVisible(true);

	} // Fim do método

	/*
	 * Classe interna auxiliar para controlar a ação do primeiro botão = botao1
	 */
	public class AcaoBotao1 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String auxiliar = campo.getText(); // Captura o conteúdo digitado no TextField
			// Atribuindo o valor digitado pelo usuário no componente area
			area.append(auxiliar + "\n");
			// Apagando o conteúdo digitado pelo usuário
			campo.setText("");
		}

	}// fim da classe interna

	/*
	 * Classe interna para controlar a ação dos segundo botão = botao2
	 */

	public class AcaoBotao2 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// verificando se a cor já foi trocada
			if (area.getBackground().equals(Color.BLACK)) {
				// Definindo a cor de fundo como branco
				area.setBackground(Color.WHITE);
				// Definindo a cor do texto
				area.setForeground(Color.BLACK);
			} else {
				// Definindo a cor de fundo como preto24r6
				area.setBackground(Color.BLACK);
				// Definindo a cor do texto
				area.setForeground(Color.WHITE);
			}

		}

	}

	// Método principal para executar a classe
	public static void main(String[] args) {
		new Exemplo03().iniciaGui();
	}

}// Fim da classe
