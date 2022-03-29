package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controller.FilmeController;
import model.Filme;

/**
 * Classe respons�vel por gerar a view de consulta de filmes
 * 
 * @author Willian Carlos Gomes
 * @since 4 de mar. de 2021
 * @version 1.0
 */
public class ConsultarFilmeView {

	// Declarando os atributos da tela
	private JFrame janela;

	// Declarando os bot�es para incluir e excluir registros na tabela
	private JButton btSair;

	// Declarando a tabela para armazenar os dados inputados elo usu�rio
	private JTable tabela;

	// Declarando o scroll auxiliar para exibir os registros da tabela
	private JScrollPane scroll;

	// Vetor auxiliar para armazenar os nomes das colunas
	private String colunas[] = { "C�digo", "Nome", "Valor", "Dispon�vel", "Promo��o", "Valor Promocional" };

	// Declarando o painel para organizar os componentes da tela
	private JPanel painel;

	public void iniciaGui() {

		/*
		 * Configura��es do JFrame - tela
		 */

		janela = new JFrame();

		// Configurando o t�tulo da tela
		janela.setTitle("CONSULTA DE FILMES");

		// Configurando o tamanho da tela - largura/altura
		janela.setSize(590, 400);

		// Configurando a posi��o inicial da tela - centralizada
		janela.setLocationRelativeTo(null);

		btSair = new JButton();

		// Configurar o texto inicial
		btSair.setText("Sair");

		// Configurar a posi��o e tamanho
		btSair.setBounds(218, 310, 150, 30);

		// A��o do bot�o
		btSair.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// A��o do bot�o de sair
				janela.dispose();
			}
		});

		/*
		 * Configura��es do componente JTable - tabela de dados
		 */

		// Definir o modelo utilizado na tabela - quantidade de linhas e colunas
		DefaultTableModel modelo = new DefaultTableModel(null, colunas);
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
		scroll.setBounds(1, 1, 573, 280);

		/*
		 * Configura��es do painel principal da tela
		 */
		painel = (JPanel) janela.getContentPane();
		painel.setLayout(null);

		painel.add(btSair);
		painel.add(scroll);

		// Chamando o m�todo para carregar a tabela
		carregarTabela();

		// Setando a visibilidade da janela
		janela.setVisible(true);
	}

	/*
	 * M�todo para carregar a tabela com os filmes gravados no arquivo TXT
	 */
	public void carregarTabela() {

		// Obtendo o modelo da tabela criada
		DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();

		// La�o de repeti��o paar preencher as linhas da tabela
		for (Filme filme : new FilmeController().getFilmes()) {
			String disponivel = "";
			String terPromocao = "";

			// Caso o retorno booleano seja TRUE, exibri SIM na tabela
			if (filme.isDisponivel()) {
				disponivel = "SIM";
			} else { // Caso o retorno booleano seja FALSE, exibri N�O na tabela
				disponivel = "N�O";
			}
			// Caso o retorno booleano seja TRUE, exibri SIM na tabela
			if (filme.isPromocao()) {
				terPromocao = "SIM";
			} else { // Caso o retorno booleano seja FALSE, exibri N�O na tabela
				terPromocao = "N�O";
			}
			// Adicionando a linha na tabela
			modelo.addRow(new String[] { filme.getCodigo() + "", filme.getNome(), filme.getValor() + "", disponivel,
					terPromocao, filme.getValorPromocao() + "", });

		} // fim do for

	}// fim do m�todo

} // Fim da classe