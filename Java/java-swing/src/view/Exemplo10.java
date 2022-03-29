package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 * Classe responsável por representar a utilização do componente JPanel com abas
 * 
 * @author Willian Carlos Gomes
 * @since 3 de mar. de 2021
 * @version 1.0
 */
public class Exemplo10 {

	// declarando os atributos da tela
	private JFrame janela;
	// declarando as labels auxiliares
	private JLabel lbAux1;
	private JLabel lbAux2;
	private JLabel lbAux3;
	// declarando os painéis
	private JPanel aba1;
	private JPanel aba2;
	private JPanel aba3;
	// declarando o componente para controle de abas
	private JTabbedPane painelAbas;
	// declarando o painel para organizar os componentrs
	private JPanel painelPrincipal;

	/*
	 * método para criar a tela
	 */

	public void iniciaGui() {
		/*
		 * Configurações do JFrame - tela
		 */
		janela = new JFrame();
		// Configurando o título da tela
		janela.setTitle("Exemplo de Abas");
		// configurando o tamanho da tela - largura/altura
		janela.setSize(390, 300);
		// Configurando a posição inicial da tela - centralizada
		janela.setLocationRelativeTo(null);
		
		/*
		 * configurações da primeira label
		 */
		lbAux1 = new JLabel();
		// configurando o texto inicial
		lbAux1.setText("Primeira aba");
		
		/*
		 * configurações da primeira label
		 */
		lbAux2 = new JLabel();
		//configurando o texto inicial
		lbAux2.setText("Segunda aba");
		
		
		/*
		 * configurações da primeira label
		 */
		lbAux3 = new JLabel();
		// configurando o texto inicial
		lbAux3.setText("Terceira aba");
		
		/*
		 * configuração da primeira aba
		 */
		aba1 = new JPanel();
		aba1.add(lbAux1);
		
		/*
		 * configuração da primeira aba
		 */
		aba2 = new JPanel();
		aba2.add(lbAux2);
		
		/*
		 * configuração da primeira aba
		 */
		aba3 = new JPanel();
		aba3.add(lbAux3);
		
		/*
		 * configurações do controlador de abas - componente JtabbedPane
		 */
		painelAbas = new JTabbedPane();
		//adicionar as abas(painéis) com o título
		painelAbas.add("Aba 1", aba1);
		painelAbas.add("Aba 2", aba2);
		painelAbas.add("Aba 3", aba3);
		// configurar a posição e tamanho
		painelAbas.setBounds(14, 21, 342, 200);
		
		/*
		 * configurações do painel principal da tela
		 */
		painelPrincipal = (JPanel) janela.getContentPane();
		painelPrincipal.setLayout(null);
		painelPrincipal.add(painelAbas);
		
		//configurações de visibilidade da tela
		janela.setVisible(true);
		
	}//fim do método
	
	/*
	 * método principal para executar a classe
	 */
	public static void main(String[] args) {
		new Exemplo10().iniciaGui();
	}
	
}//fim da classe
