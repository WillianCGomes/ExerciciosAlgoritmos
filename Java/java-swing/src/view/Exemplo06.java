package view;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Classe respons�vel por demonstrar a utiliza��o de JComboBox
 * 
 * @author Willian Carlos Gomes
 * @since 2 de mar. de 2021
 */
public class Exemplo06 {
	// declarando os atributos da tela
	private JFrame janela;
	private JComboBox cbxEstados;
	private JPanel painel;

	// vetor auxiliar para armazenar os estados
	private String estados[] = { "S�o paulo", "Paran�", "Santa Catarina", "Rio Grande do Sul" };

	/*
	 * m�todo para criar a tela
	 */

	public void iniciaGui() {// inicio do m�todo

		/*
		 * Configura��es do JFramee - tela
		 */
		janela = new JFrame();
		// Configurando o t�tulo da tela
		janela.setTitle("Exemplo do Combo Box");
		// configurando o tamanho da tela - largura/altura
		janela.setSize(390, 300);
		// Configurando a posi��o inicial da tela - centralizada
		janela.setLocationRelativeTo(null);

		/*
		 * configura��es do JComboBox
		 */
		cbxEstados = new JComboBox(estados);
		cbxEstados.setBounds(10, 10, 300, 20);

		/*
		 * configura��es do painel da janela
		 */
		painel = (JPanel) janela.getContentPane();
		painel.setLayout(null);
		painel.add(cbxEstados);

		// configurando a visibilidade da tela
		janela.setVisible(true);

	}// fim do m�todo

	/*
	 * m�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		new Exemplo06().iniciaGui();
	}

}// fim da classe
