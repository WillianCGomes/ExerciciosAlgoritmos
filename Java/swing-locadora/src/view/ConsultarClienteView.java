package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controller.ClienteController;
import model.Cliente;

/**
 * Classe respons�vel por gerar a view de consulta de clientes
 * 
 * @author Willian Carlos Gomes
 * @since 4 de mar. de 2021
 * @version 1.0
 */
public class ConsultarClienteView {

	// Declarando os atributos da tela
	private JFrame janela;

	// Declarando os bot�es para incluir e excluir registros na tabela
	private JButton btSair;

	// Declarando a tabela para armazenar os dados inputados elo usu�rio
	private JTable tabela;

	// Declarando o scroll auxiliar para exibir os registros da tabela
	private JScrollPane scroll;

	// Vetor auxiliar para armazenar os nomes das colunas
	private String colunas[] = { "Nome", "Sexo", "Idade", "Cidade", "Celular" };

	// Declarando o painel para organizar os componentes da tela
	private JPanel painel;

	public void iniciaGui() {
		
		/*
		 * Configura��es do JFrame - tela
		 */
		janela = new JFrame();

		// Configurando o t�tulo da tela
		janela.setTitle("CONSULTA DE CLIENTES CADASTRADOS");

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
				// A��o do bot�o
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

		// chamando o m�todo para carregar a tela
		carregarTabela();

		janela.setVisible(true);

	} // Fim do m�todo

	/*
	 * m�todo para carregar a tabela com os dados dos clientes
	 */
	public void carregarTabela() {
		// obtendo o modelo da tabela criada
		DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();

		// la�o de repeti��o para preencher as linhas da tabela
		for (Cliente cliente : new ClienteController().getClientes()) {

			// adicionando a linha na tabela
			modelo.addRow(new String[] { cliente.getNome(), cliente.getSexo()+"", cliente.getIdade()+"", cliente.getEndereco().getCidade()+"" , cliente.getCelular()});
		}

	}//fim do m�todo

} // Fim da classe