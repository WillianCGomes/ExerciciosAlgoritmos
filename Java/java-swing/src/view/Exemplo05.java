package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * Classe respons�vel por demonstrar a utiliza��o do componente JCheckBox
 * 
 * @author Willian Carlos Gomes
 * @since 2 de mar. de 2021
 */
public class Exemplo05 {

	// declarando os componentes da tela
	private JFrame janela;
	// label auxiliar para exibir a mensagem na tela
	private JLabel lbAuxiliar;
	// componente checkbox que permite a sele��o de mais de uma op��o
	private JCheckBox cbBoleto;
	private JCheckBox cbCartao;
	private JCheckBox cbCobranca;
	// botao auxiliar para retornar a escolha do usu�rio
	private JButton btVerificar;
	// painel para organizar os componentes
	private JPanel painel;

	/*
	 * m�todo para configura��es da tela
	 */

	public void iniciaGui() {

		/*
		 * Configura��es do JFrame - tela
		 */
		janela = new JFrame();
		// Configurando o t�tulo da tela
		janela.setTitle("Exemplo de Radio Button");
		// configurando o tamanho da tela - largura/altura
		janela.setSize(390, 300);
		// Configurando a posi��o inicial da tela - centralizada
		janela.setLocationRelativeTo(null);

		/*
		 * configura��es do JLabel
		 */
		lbAuxiliar = new JLabel();
		// configurando o texto a ser exibido
		lbAuxiliar.setText("Selecione a forma de pagamento:");
		// configurando a posi��o e tamanho do componente
		lbAuxiliar.setBounds(40, 15, 210, 20);

		/*
		 * configura��es do JCheckBox
		 */
		cbBoleto = new JCheckBox();
		cbCartao = new JCheckBox();
		cbCobranca = new JCheckBox();
		// configurando o texto exibido no componente
		cbBoleto.setText("Boleto");
		cbCartao.setText("Cart�o de Cr�dito");
		cbCobranca.setText("Cobran�a Banc�ria");
		// configurando a posi��o e tamanho do componente
		cbBoleto.setBounds(45, 60, 145, 20);
		cbCartao.setBounds(45, 80, 145, 20);
		cbCobranca.setBounds(45, 100, 145, 20);

		/*
		 * configura��es do JButton
		 */
		btVerificar = new JButton();
		btVerificar.setText("Verificar");
		btVerificar.setBounds(145, 196, 120, 28);
		// configurando a��o do bot�o
		btVerificar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				verificaCheckBox();
			}
		});

		/*
		 * configura��es do painel da janela - JPanel
		 */

		painel = (JPanel) janela.getContentPane();
		painel.setLayout(null);
		painel.add(lbAuxiliar);
		painel.add(cbBoleto);
		painel.add(cbCartao);
		painel.add(cbCobranca);
		painel.add(btVerificar);

		// configurando a visibilidade da tela
		janela.setVisible(true);
	}// fim do m�todo

	/*
	 * m�todo auxiliar para verificar a sele��o do componente JCheckBox
	 */
	private void verificaCheckBox() {
		// vari�vel auxiliar para exibir formas de pagamento
		String aux = "";
		// verificando o boleto selecionado
		if (cbBoleto.isSelected()) {
			aux += cbBoleto.getText() + "\n";
		}

		// verificando o cart�o selecionado
		if (cbCartao.isSelected()) {
			aux += cbCartao.getText() + "\n";
		}

		// veroficando cobran�a selecionada
		if (cbCobranca.isSelected()) {
			aux += cbCobranca.getText() + "\n";
		}

		// exibindo o resultado para o usu�rio
		if (!aux.equals("")) {
			JOptionPane.showMessageDialog(null, aux, "Formas de pagamento", 1);
		}

	}

	/*
	 * m�todo principal para a execul�o da classe
	 */
	public static void main(String[] args) {
		new Exemplo05().iniciaGui();
	}

}// fim da classe