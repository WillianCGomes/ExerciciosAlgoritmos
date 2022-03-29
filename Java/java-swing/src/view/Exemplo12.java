package view;

import java.text.ParseException;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.text.MaskFormatter;

/**
 * Classe respons�vel por demonstrar a utiliza��o do componente
 * JFormattedTextField
 * 
 * @author Willian Carlos Gomes
 * @since 4 de mar. de 2021
 */
public class Exemplo12 {

	// Declarando os atributos da tela
	private JFrame janela;

	// Labels auxiliares
	private JLabel lbCpf;
	private JLabel lbRg;
	private JLabel lbDataNascimento;
	private JLabel lbTelefone;

	// Declarando os compos formatados
	private JFormattedTextField tfCpf;
	private JFormattedTextField tfRg;
	private JFormattedTextField tfDataNascimento;
	private JFormattedTextField tfTelefone;

	// Declarando os atributos de formata��o
	private MaskFormatter fmtCpf;
	private MaskFormatter fmtRg;
	private MaskFormatter fmtDataNascimento;
	private MaskFormatter fmtTelefone;

	// Declarando o painel para organizar os componentes
	private JPanel painel;

	/*
	 * M�todo para criar a tela
	 */

	public void iniciaGui() throws ParseException {

		/*
		 * Configura��es do campos de formata��o
		 */

		fmtCpf = new MaskFormatter("###.###.###-##");
		fmtRg = new MaskFormatter("##.###.###-#");
		fmtDataNascimento = new MaskFormatter("##/##/####");
		fmtTelefone = new MaskFormatter("(##) ###-####");

		/*
		 * Configura��es do JFrame - tela
		 */
		janela = new JFrame();

		// Configurando o t�tulo da tela
		janela.setTitle("Exemplo de Campos Formatados");

		// Configurando o tamanho da tela - largura/altura
		janela.setSize(400, 300);

		// Configurando a posi��o inicial da tela - centralizada
		janela.setLocationRelativeTo(null);

		/*
		 * Configura��es da JLabel CPF
		 */

		lbCpf = new JLabel();

		// Configurando o texto inicial
		lbCpf.setText("CPF:");

		// Configurando a posi��o e tamanho
		lbCpf.setBounds(10, 10, 50, 20);

		/*
		 * Configura��es da JLabel RG
		 */

		lbRg = new JLabel();

		// Configurando o texto inicial
		lbRg.setText("RG:");

		// Configurando a posi��o e tamanho
		lbRg.setBounds(10, 40, 50, 20);

		/*
		 * Configura��es da JLabel DataNascimento
		 */

		lbDataNascimento = new JLabel();

		// Configurando o texto inicial
		lbDataNascimento.setText("Data Nascimento:");

		// Configurando a posi��o e tamanho
		lbDataNascimento.setBounds(10, 70, 120, 20);

		/*
		 * Configura��es da JLabel Telefone
		 */

		lbTelefone = new JLabel();

		// Configurando o texto inicial
		lbTelefone.setText("Telefone:");

		// Configurando a posi��o e tamanho
		lbTelefone.setBounds(10, 100, 110, 20);

		/*
		 * Configura��es do JFormattedTextField CPF
		 */

		tfCpf = new JFormattedTextField(fmtCpf);

		// Configurando a posi��o e tamanho
		tfCpf.setBounds(130, 10, 100, 20);

		/*
		 * Configura��es do JFormattedTextField RG
		 */

		tfRg = new JFormattedTextField(fmtRg);

		// Configurando a posi��o e tamanho
		tfRg.setBounds(130, 40, 100, 20);

		/*
		 * Configura��es do JFormattedTextField DataNascimento
		 */

		tfDataNascimento = new JFormattedTextField(fmtDataNascimento);

		// Configurando a posi��o e tamanho
		tfDataNascimento.setBounds(130, 70, 100, 20);

		/*
		 * Configura��es do JFormattedTextField Telefone
		 */

		tfTelefone = new JFormattedTextField(fmtTelefone);

		// Configurando a posi��o e tamanho
		tfTelefone.setBounds(130, 100, 100, 20);

		/*
		 * Configura��es do painel da janela
		 */

		painel = (JPanel) janela.getContentPane();
		painel.setLayout(null);

		painel.add(lbCpf);
		painel.add(lbRg);
		painel.add(lbDataNascimento);
		painel.add(lbTelefone);

		painel.add(tfCpf);
		painel.add(tfRg);
		painel.add(tfDataNascimento);
		painel.add(tfTelefone);

		// Configurando a visibilidade da tela
		janela.setVisible(true);

	} // Fim do m�todo

	/*
	 * M�todo principal para executar a classe
	 */

	public static void main(String[] args) {
		try {
			new Exemplo12().iniciaGui();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

} // Fim da classe