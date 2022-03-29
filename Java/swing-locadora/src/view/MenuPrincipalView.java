package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import util.Mensagem;
import util.Titulo;

/**
 * Classe para demonstrar a utilização de Menu
 * 
 * @author Willian Carlos Gomes
 * @since 4 de mar. de 2021
 * @version 1.0
 */
public class MenuPrincipalView {

	// Declarando os atributos da tela
	private JFrame janela;

	// Declarando o componente para a barra de menu
	private JMenuBar barraMenu;

	// Declarando os menus de menu1, menu2 e menu3
	private JMenu menu1;
	private JMenu menu2;
	private JMenu menu3;

	// Declarando os itens de menu
	private JMenuItem itemMenu1;
	private JMenuItem itemMenu2;
	private JMenuItem itemMenu3;
	private JMenuItem itemMenu4;
	private JMenuItem itemMenu5;
	private JMenuItem itemMenu6;
	private JMenuItem itemMenu7;
	private JMenuItem itemMenu8;

	// Método para criar a tela
	public void iniciaGui() {

		/*
		 * Criando as instâncias do objeto
		 */

		janela = new JFrame();
		barraMenu = new JMenuBar();
		menu1 = new JMenu();
		menu2 = new JMenu();
		menu3 = new JMenu();
		itemMenu1 = new JMenuItem();
		itemMenu2 = new JMenuItem();
		itemMenu3 = new JMenuItem();
		itemMenu4 = new JMenuItem();
		itemMenu5 = new JMenuItem();
		itemMenu6 = new JMenuItem();
		itemMenu7 = new JMenuItem();
		itemMenu8 = new JMenuItem();

		/*
		 * Configurações de texto do menu
		 */

		menu1.setText("CADASTRO");
		menu2.setText("COLSULTA");
		menu3.setText("SAIR");

		/*
		 * Configurações do texto de itens de menu
		 */

		itemMenu1.setText("Cliente");
		itemMenu2.setText("Vendedor");
		itemMenu3.setText("Filme");
		itemMenu4.setText("Locação");
		itemMenu5.setText("Cliente");
		itemMenu6.setText("Filme");
		itemMenu7.setText("Vendedor");
		itemMenu8.setText("SAIR ");

		/*
		 * Adicionando o menu na barra de menus
		 */

		barraMenu.add(menu1);
		barraMenu.add(menu2);
		barraMenu.add(menu3);

		/*
		 * Adicionando os itens de menu no menu 1
		 */

		menu1.add(itemMenu1);
		menu1.add(itemMenu2);
		menu1.add(itemMenu3);
		menu1.add(itemMenu4);

		/*
		 * Adicionando os itens de menu no menu 2
		 */
		menu2.add(itemMenu5);
		menu2.add(itemMenu6);
		menu2.add(itemMenu7);

		/*
		 * Adicionando os itens de menu no menu 3
		 */
		menu3.add(itemMenu8);

		/*
		 * Adicionando as ações aos itens de menu
		 */

		itemMenu1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					new CadastroClienteView().iniciaGui();
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});

		itemMenu2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new CadastrarVendedorView().iniciaGui();

			}
		});

		itemMenu3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new CadastrarFilmeView().iniciaGui();

			}
		});

		itemMenu4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new CadastrarLocacaoView().iniciaGui();

			}
		});

		itemMenu5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new ConsultarClienteView().iniciaGui();

			}
		});

		itemMenu6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new ConsultarFilmeView().iniciaGui();

			}
		});

		itemMenu7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new ConsultarVendedorView().iniciaGui();

			}
		});

		itemMenu8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				int opcao = JOptionPane.showConfirmDialog(null, Mensagem.menuSair, Titulo.menuAtencao,
						JOptionPane.YES_OPTION, JOptionPane.CANCEL_OPTION);

				if (opcao == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});

		/*
		 * Configurações do JFrame - janela
		 */

		// Adicionando a barra de menu a janela
		janela.setJMenuBar(barraMenu);

		// Configurando o título do menu
		janela.setTitle("Menu Principal");

		// Configurando a ação do X do JFrame
		janela.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

		// Configurando o tamanho maximizado
		janela.setExtendedState(JFrame.MAXIMIZED_BOTH);

		// Configurando a visibilidade da tela
		janela.setVisible(true);

	} // Fim do método

} // Fim da classe