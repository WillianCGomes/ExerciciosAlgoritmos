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
 * Classe responsável por gerar a view de consulta de filmes
 * 
 * @author Willian Carlos Gomes
 * @since 4 de mar. de 2021
 * @version 1.0
 */
public class ConsultarFilmeView {

	// Declarando os atributos da tela
	private JFrame janela;

	// Declarando os botões para incluir e excluir registros na tabela
	private JButton btSair;

	// Declarando a tabela para armazenar os dados inputados elo usuário
	private JTable tabela;

	// Declarando o scroll auxiliar para exibir os registros da tabela
	private JScrollPane scroll;

	// Vetor auxiliar para armazenar os nomes das colunas
	private String colunas[] = { "Código", "Nome", "Valor", "Disponível", "Promoção", "Valor Promocional" };

	// Declarando o painel para organizar os componentes da tela
	private JPanel painel;

	public void iniciaGui() {

		/*
		 * Configurações do JFrame - tela
		 */

		janela = new JFrame();

		// Configurando o título da tela
		janela.setTitle("CONSULTA DE FILMES");

		// Configurando o tamanho da tela - largura/altura
		janela.setSize(590, 400);

		// Configurando a posição inicial da tela - centralizada
		janela.setLocationRelativeTo(null);

		btSair = new JButton();

		// Configurar o texto inicial
		btSair.setText("Sair");

		// Configurar a posição e tamanho
		btSair.setBounds(218, 310, 150, 30);

		// Ação do botão
		btSair.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// Ação do botão de sair
				janela.dispose();
			}
		});

		/*
		 * Configurações do componente JTable - tabela de dados
		 */

		// Definir o modelo utilizado na tabela - quantidade de linhas e colunas
		DefaultTableModel modelo = new DefaultTableModel(null, colunas);
		tabela = new JTable(modelo);

		// Configurar a posição e tamanho
		tabela.setBounds(10, 30, 588, 200);

		// Configurar a ação do usuário quando clica no registro armazenado
		tabela.setEnabled(true);

		/*
		 * Configurações do componente JScrollPane
		 */
		scroll = new JScrollPane(tabela);

		// Configurar local de exibição do scroll
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		// Configurar a posição e tamanho
		scroll.setBounds(1, 1, 573, 280);

		/*
		 * Configurações do painel principal da tela
		 */
		painel = (JPanel) janela.getContentPane();
		painel.setLayout(null);

		painel.add(btSair);
		painel.add(scroll);

		// Chamando o método para carregar a tabela
		carregarTabela();

		// Setando a visibilidade da janela
		janela.setVisible(true);
	}

	/*
	 * Método para carregar a tabela com os filmes gravados no arquivo TXT
	 */
	public void carregarTabela() {

		// Obtendo o modelo da tabela criada
		DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();

		// Laço de repetição paar preencher as linhas da tabela
		for (Filme filme : new FilmeController().getFilmes()) {
			String disponivel = "";
			String terPromocao = "";

			// Caso o retorno booleano seja TRUE, exibri SIM na tabela
			if (filme.isDisponivel()) {
				disponivel = "SIM";
			} else { // Caso o retorno booleano seja FALSE, exibri NÃO na tabela
				disponivel = "NÃO";
			}
			// Caso o retorno booleano seja TRUE, exibri SIM na tabela
			if (filme.isPromocao()) {
				terPromocao = "SIM";
			} else { // Caso o retorno booleano seja FALSE, exibri NÃO na tabela
				terPromocao = "NÃO";
			}
			// Adicionando a linha na tabela
			modelo.addRow(new String[] { filme.getCodigo() + "", filme.getNome(), filme.getValor() + "", disponivel,
					terPromocao, filme.getValorPromocao() + "", });

		} // fim do for

	}// fim do método

} // Fim da classe