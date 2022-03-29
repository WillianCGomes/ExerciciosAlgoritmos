package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

import util.Valida;

/**
 * Classe respons�vel por demonstrar a utiliza��o do componente de tabela -
 * JTable
 * 
 * @author Willian Carlos Gomes
 * @since 3 de mar. de 2021
 * @version 1.0
 */
public class Exemplo11 {

	// declarando os atributos da janela
	private JFrame janela;
	// declarando as labels para exibir os r�tulos na tela
	private JLabel lbIncluirUF;
	private JLabel lbIncluirNome;
	// declarando os campos de texto para o usu�rio digitara as informa��es
	private JTextField tfIncluirUF;
	private JTextField tfIncluirNome;
	// declarando a tabela para armazenar os dados inputados pelo usu�rio
	private JTable tabela;
	// declarando o scroll auxiliar para exibir os registros da tabela
	private JScrollPane scroll;
	// declarando os bot�es para incluir e excluir registros na tabela
	private JButton btIncluir;
	private JButton btExcluir;
	// declarando o painel para organizar os componentes da tela
	private JPanel painel;

	// vetor auxiliar para armazenar os nomes das colunas
	private String colunas[] = { "UF", "Estado" };
	// matriz auxiliar para armazenar os dados exibidos na tabela
	private String linhas[][] = { { "SP", "S�o Paulo" }, { "PR", "Paran�" }, { "SC", "Santa Catarina" },
			{ "RS", "Rio Grande do Sul" }

	};

	/*
	 * m�todo para criar a tela
	 */

	public void iniciaGui() {
		/*
		 * Configura��es do JFrame - tela
		 */
		janela = new JFrame();
		// Configurando o t�tulo da tela
		janela.setTitle("Exemplo de Tabela");
		// configurando o tamanho da tela - largura/altura
		janela.setSize(390, 300);
		// Configurando a posi��o inicial da tela - centralizada
		janela.setLocationRelativeTo(null);

		/*
		 * configura��es do componente JLabel UF
		 */
		lbIncluirUF = new JLabel();
		// configurar o texto inicial
		lbIncluirUF.setText("Informe UF:");
		// configurar a posi��o e tamanho
		lbIncluirUF.setBounds(15, 20, 70, 25);

		/*
		 * configura��es do componente JLabel nome
		 */
		lbIncluirNome = new JLabel();
		// configurar o texto inicial
		lbIncluirNome.setText("Informe Estado:");
		// configurar a posi��o e tamanho
		lbIncluirNome.setBounds(15, 55, 90, 25);

		/*
		 * configura��es do componente JTextField UF
		 */
		tfIncluirUF = new JTextField();
		// configurar a posi��o e tamanho
		tfIncluirUF.setBounds(110, 20, 50, 25);

		/*
		 * configura��es do componente JTextField
		 */
		tfIncluirNome = new JTextField();
		// configurar a sua posi��o e tamanho
		tfIncluirNome.setBounds(110, 55, 260, 25);

		/*
		 * configura��es do componente JTable - tabela de dados
		 */
		// definir o modelo utilizado na tabela - quantidade de linhas e colunas
		DefaultTableModel modelo = new DefaultTableModel(linhas, colunas);
		tabela = new JTable(modelo);
		// configurar a posi��o e tamanhoo
		tabela.setBounds(10, 30, 300, 95);
		// configurar a a��o do usu�rio quando clica no registro armazena
		tabela.setEnabled(true);

		/*
		 * configura��es do componente JScrollPane
		 */
		scroll = new JScrollPane(tabela);
		// configurar local de exibi��o do scroll
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		// configurar a posi��o e tamanho
		scroll.setBounds(10, 100, 360, 95);

		/*
		 * configura��es do componente JButton incluir
		 */
		btIncluir = new JButton();
		// configurar o texto inicial
		btIncluir.setText("Incluir");
		// configurar a posi��o e tamanho
		btIncluir.setBounds(75, 200, 100, 50);
		// configurar a a��o do bot�o
		btIncluir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				incluirLinha();
			}
		});

		/*
		 * configura��es do componente JButton incluir
		 */
		btExcluir = new JButton();
		// configurar o texto inicial
		btExcluir.setText("Excluir");
		// configurar a posi��o e tamanho
		btExcluir.setBounds(195, 200, 100, 50);
		// configurar a a��o do bot�o
		btExcluir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				excluirLinha();
			}
		});

		/*
		 * configura��es do painel principal da tela
		 */
		painel = (JPanel) janela.getContentPane();
		painel.setLayout(null);
		painel.add(lbIncluirUF);
		painel.add(lbIncluirNome);
		painel.add(tfIncluirUF);
		painel.add(tfIncluirNome);
		painel.add(scroll);
		painel.add(btIncluir);
		painel.add(btExcluir);

		// configurando a visibilidade da tela
		janela.setVisible(true);

	}// fim do m�todo

	/*
	 * m�todo para incluir registro na tela
	 */
	private void incluirLinha() {

		// validar os dados digitados pelo usu�rio
		if (validarDados()) {
			// obtendo o modelo da tabela criada
			DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
			// adicionando a linha tabela
			modelo.addRow(new String[] { tfIncluirUF.getText(), tfIncluirNome.getText() });
			// limpando os dados digitados
			tfIncluirUF.setText("");
			tfIncluirNome.setText("");
			// exibindo a mensagem de sucesso ao usu�rio
			JOptionPane.showMessageDialog(null, "Registro inclu�do com sucesso", "Cadastro de Estado", 1);
		}
	}

	/*
	 * m�todo auxiliar para validar os dados digitados
	 */
	private boolean validarDados() {
		// verificando se o usu�rio informou a sigla UF
		if (Valida.isEmptyOrNull(tfIncluirUF.getText())) {
			// exibindo a mensagem de erro para o usu�rio
			JOptionPane.showMessageDialog(null, "Informe UF", "Campo Obrigat�rio!", 0);
			// retornando o valor falso para o m�todo
			return false;
		}

		// verificando se o conte�do do nome � valido
		if (Valida.isEmptyOrNull(tfIncluirNome.getText())) {
			// exibindo a mensagem de erro para o usu�rio
			JOptionPane.showMessageDialog(null, "Informe o estado", "Campo Obrigat�rio!", 0);
			// retornando o valor falso para o m�todo
			return false;
		}

		// se tudo estiver ok, retorna verdadeiro
		return true;
	}

	/*
	 * m�todo para exclior registro na tela
	 */
	private void excluirLinha() {

		// verificando se o usu�rio selecionou um registro
		if (tabela.getSelectedRow() == -1) {
			// exibindo a mensagem de erro
			JOptionPane.showMessageDialog(null, "Selecione um registro", "Excluir Estado", 0);
		} else if (tabela.getSelectedRowCount() > 1) {
			// exibindo a mensagem de erro
			JOptionPane.showMessageDialog(null, "Selecione apenas um registro", "Excluir Estado", 0);
		} else {
			// obter o modelo da tabela atual
			DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
			// excluir o registro selecionado pelo usu�rio
			modelo.removeRow(tabela.getSelectedRow());
			// mensagem de sucesso para o usu�rio
			JOptionPane.showMessageDialog(null, "Registro exclu�do", "Excluir", 1);
		}
	}
	
	

	/*
	 * m�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		try {UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e) {
		e.printStackTrace();
		}		
		new Exemplo11().iniciaGui();
	}

}
