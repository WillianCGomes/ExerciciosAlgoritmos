package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 * Classe respons�vel por gerar a view de cadastro de loca��o
 * 
 * @author Willian Carlos Gomes
 * @since 4 de mar. de 2021
 */
public class CadastrarLocacaoView {

	// Declarando os atributos da tela
	private JFrame janela;

	// Declarando as lebels para exibir os r�tulos tela
	private JLabel lbNomeVendedor;
	private JLabel lbNomeFilme;
	private JLabel lbFormaPagamento;
	private JLabel lbValorTotal;
	private JLabel lbValorPago;
	private JLabel lbTroco;

	// Declarando os campos de texto para o usu�rio digitar as informa��es
	private JTextField tfValorTotal;
	private JTextField tfValorPago;
	private JTextField tfTroco;

	// Componente JRadioButton para selecionar a forma de pagamento
	private JRadioButton rbDinheiro;
	private JRadioButton rbCheque;
	private JRadioButton rbDebito;
	private JRadioButton rbCredito;

	// componente ButtonGroup respons�vel por gerenciar os componentes radio button
	private ButtonGroup grpPagamento;

	private JComboBox cbxVendedor;
	private JComboBox cbxFilme;

	// Vetor auxiliar para selecionar os vendedores
	private String vendedor[] = { "-Selecione um Vendedor-" };

	// Vetor auxiliar para selecionar o filme
	private String filme[] = { "-Selecione um Filme-" };

	// Declarando os bot�es para incluir e excluir registros na tabela
	private JButton btIncluir;
	private JButton btSalvar;
	private JButton btCancelar;

	// Declarando a tabela para armazenar os dados inputados elo usu�rio
	private JTable tabela;

	// Declarando o scroll auxiliar para exibir os registros da tabela
	private JScrollPane scroll;

	// Vetor auxiliar para armazenar os nomes das colunas
	private String colunas[] = { "C�digo", "Nome", "Valor", "Dispon�vel", "Promo��o", "Valor Promocional" };

	// Matriz auxiliar para armazenar os dados exibidos na tabela
	private String linhas[][] = {};

	// Declarando o painel para organizar os componentes da tela
	private JPanel painel;

	public void iniciaGui() {

		/*
		 * Configura��es do JFrame - tela
		 */

		janela = new JFrame();

		// Configurando o t�tulo da tela
		janela.setTitle("LOCA��O DE FILME");

		// Configurando o tamanho da tela - largura/altura
		janela.setSize(590, 370);

		// Configurando a posi��o inicial da tela - centralizada
		janela.setLocationRelativeTo(null);

		/*
		 * Configura��es do componente JLabel NomeVendedor
		 */

		lbNomeVendedor = new JLabel();

		// Configurar o texto inicial
		lbNomeVendedor.setText("Nome do Vendedor:");

		// Configurar a posi��o e tamanho
		lbNomeVendedor.setBounds(15, 10, 110, 25);

		/*
		 * Configura��es do componente JLabel NomeFilme
		 */

		lbNomeFilme = new JLabel();

		// Configurar o texto inicial
		lbNomeFilme.setText("Nome do Filme:");

		// Configurar a posi��o e tamanho
		lbNomeFilme.setBounds(15, 40, 90, 25);

		/*
		 * Configura��es do componente JLabel FormaPagamento
		 */

		lbFormaPagamento = new JLabel();

		// Configurar o texto inicial
		lbFormaPagamento.setText("Forma de Pagamento:");

		// Configurar a posi��o e tamanho
		lbFormaPagamento.setBounds(15, 190, 130, 25);

		/*
		 * Configura��es do componente JLabel ValorTotal
		 */

		lbValorTotal = new JLabel();

		// Configurar o texto inicial
		lbValorTotal.setText("Valor Total:");

		// Configurar a posi��o e tamanho
		lbValorTotal.setBounds(300, 190, 110, 25);

		/*
		 * Configura��es do componente JLabel ValorPago
		 */

		lbValorPago = new JLabel();

		// Configurar o texto inicial
		lbValorPago.setText("Valor Pago:");

		// Configurar a posi��o e tamanho
		lbValorPago.setBounds(300, 210, 110, 25);

		/*
		 * Configura��es do componente JLabel Troco
		 */

		lbTroco = new JLabel();

		// Configurar o texto inicial
		lbTroco.setText("Troco:");

		// Configurar a posi��o e tamanho
		lbTroco.setBounds(300, 230, 110, 25);

		/*
		 * Configura��es do componente JTextField - ValorTotal
		 */

		tfValorTotal = new JTextField();

		// Configurar a posi��o e tamanho
		tfValorTotal.setBounds(380, 190, 120, 25);

		/*
		 * Configura��es do componente JTextField - ValorPago
		 */

		tfValorPago = new JTextField();

		// Configurar a posi��o e tamanho
		tfValorPago.setBounds(380, 210, 120, 25);

		/*
		 * Configura��es do componente JTextField - Troco
		 */

		tfTroco = new JTextField();

		// Configurar a posi��o e tamanho
		tfTroco.setBounds(380, 230, 120, 25);

		/*
		 * Configura��es do JcomboBox
		 */

		cbxVendedor = new JComboBox(vendedor);
		cbxVendedor.setBounds(140, 10, 400, 25);

		cbxFilme = new JComboBox(filme);
		cbxFilme.setBounds(140, 40, 290, 25);

		/*
		 * Configura��es do JCheckBox
		 */

		rbDinheiro = new JRadioButton();
		rbCheque = new JRadioButton();
		rbDebito = new JRadioButton();
		rbCredito = new JRadioButton();

		// Configurando o texto exibido no componente
		rbDinheiro.setText("Dinheiro");
		rbCheque.setText("Cheque");
		rbDebito.setText("D�bito");
		rbCredito.setText("Cr�dito");

		// Configurando a posi��o e tamanho do componente
		rbDinheiro.setBounds(150, 193, 145, 20);
		rbCheque.setBounds(150, 213, 145, 20);
		rbDebito.setBounds(150, 233, 145, 20);
		rbCredito.setBounds(150, 253, 145, 20);

		/*
		 * configura��es do ButtonGroup
		 */
		grpPagamento = new ButtonGroup();
		grpPagamento.add(rbDinheiro);
		grpPagamento.add(rbCheque);
		grpPagamento.add(rbDebito);
		grpPagamento.add(rbCredito);

		/*
		 * Configura��es do componente JButton - Incluir
		 */

		btIncluir = new JButton();

		// Configurar o texto inicial
		btIncluir.setText("Incluir");

		// Configurar a posi��o e tamanho
		btIncluir.setBounds(450, 40, 95, 25);

		// Configurar a a��o do bot�o
		btIncluir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// A��o do bot�o
			}
		});

		/*
		 * Configura��es do componente JButton - Salvar
		 */

		btSalvar = new JButton();

		// Configurar o texto inicial
		btSalvar.setText("Salvar");

		// Configurar a posi��o e tamanho
		btSalvar.setBounds(180, 290, 100, 25);

		// Configurar a a��o do bot�o
		btSalvar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// A��o do bot�o
			}
		});

		/*
		 * Configura��es do componente JButton - Cancelar
		 */

		btCancelar = new JButton();

		// Configurar o texto inicial
		btCancelar.setText("Cancelar");

		// Configurar a posi��o e tamanho
		btCancelar.setBounds(280, 290, 100, 25);

		// Configurar a a��o do bot�o
		btCancelar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// A��o do bot�o
			}
		});

		/*
		 * Configura��es do componente JTable - tabela de dados
		 */

		// Definir o modelo utilizado na tabela - quantidade de linhas e colunas
		DefaultTableModel modelo = new DefaultTableModel(linhas, colunas);
		tabela = new JTable(modelo);

		// Configurar a posi��o e tamanho
		tabela.setBounds(10, 30, 588, 200);

		// Configurar a a��o do usu�rio quando clica no registro armazenado
		tabela.setEnabled(true);

		/*
		 * Configura��es do componente JScrollPane
		 */

		scroll = new JScrollPane(tabela);

		// Configurar local de exibi��o do scroll
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		// Configurar a posi��o e tamanho
		scroll.setBounds(1, 75, 575, 110);

		/*
		 * Configura��es do painel principal da tela
		 */

		painel = (JPanel) janela.getContentPane();
		painel.setLayout(null);
		painel.add(lbNomeVendedor);
		painel.add(lbNomeFilme);
		painel.add(lbFormaPagamento);
		painel.add(lbValorTotal);
		painel.add(lbValorPago);
		painel.add(lbTroco);

		painel.add(tfValorTotal);
		painel.add(tfValorPago);
		painel.add(tfTroco);

		painel.add(cbxVendedor);
		painel.add(cbxFilme);

		painel.add(rbDinheiro);
		painel.add(rbCheque);
		painel.add(rbDebito);
		painel.add(rbCredito);

		painel.add(scroll);

		painel.add(btIncluir);
		painel.add(btSalvar);
		painel.add(btCancelar);

		janela.setVisible(true);

	} // Fim do m�todo

	

} // Fim da classe