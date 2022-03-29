package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Importa��es de pacotes
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import controller.EstadoController;
import controller.VendedorController;
import model.Estado;
import model.Vendedor;
import util.Mensagem;
import util.Titulo;
import util.Util;
import util.Valida;

/**
 * Classe respons�vel por gerar a view de cadastro de Vendedor
 * 
 * @author Willian Carlos Gomes
 * @since 4 de mar. de 2021
 * @version 1.0
 */
public class CadastrarVendedorView {

	// Combobox para armazenar os estados
	@SuppressWarnings("rawtypes")
	private JComboBox cbxEstados;

	// vetor auxiliar para armazenar os estados
	private String estados[] = {};

	// componente JRadioButton que permite a sele��o de apenas uma op��o
	private JRadioButton rbSexoMasculino;
	private JRadioButton rbSexoFeminino;

	// componente ButtonGroup respons�vel por gerenciar os componentes radio button
	private ButtonGroup grpSexo;

	// Painel para organizara os componentes
	private JPanel painel;

	private JLabel lbCodigo;
	private JLabel lbNome;
	private JLabel lbAreaVenda;
	private JLabel lbCidade;
	private JLabel lbEstado;
	private JLabel lbSexo;
	private JLabel lbIdade;
	private JLabel lbSalario;

	private JTextField tfCodigo;
	private JTextField tfNome;
	private JTextField tfAreaVenda;
	private JTextField tfCidade;
	private JTextField tfIdade;
	private JTextField tfSalario;
	
	//Bot�es da tela de cadastro
	private JButton btSalvar;
	private JButton btCancelar;
	private JButton btNovo;
	private JButton btSair;

	// M�todo respons�vel por criar a tela e adicionar seus componentes
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void iniciaGui() {

		/*
		 * Definindo a tela e suas configura��es
		 */

		JFrame janela = new JFrame();

		// Configurando o t�tulo da tela
		janela.setTitle("CADASTRO DE VENDEDOR");

		// Configurando o tamanho da tela
		janela.setSize(590, 355);

		// Definir o layout como nula da janela
		janela.getContentPane().setLayout(null);

		// Configurando a centraliza��o do objeto janela
		janela.setLocationRelativeTo(null);

		/*
		 * Definindo os r�tulos e suas configura��es JLabel
		 */

		lbCodigo = new JLabel();
		lbNome = new JLabel();
		lbAreaVenda = new JLabel();
		lbCidade = new JLabel();
		lbEstado = new JLabel();
		lbSexo = new JLabel();
		lbIdade = new JLabel();
		lbSalario = new JLabel();
		// Configurando o texto a ser exibido na label
		lbCodigo.setText("C�digo:");
		lbNome.setText("Nome:");
		lbAreaVenda.setText("�rea de venda:");
		lbCidade.setText("Cidade:");
		lbEstado.setText("Estado:");
		lbSexo.setText("Sexo:");
		lbIdade.setText("Idade:");
		lbSalario.setText("Sal�rio:");

		// Configurando os tamanhos e locais das labels
		lbCodigo.setBounds(15, 15, 100, 20);
		lbNome.setBounds(15, 45, 100, 20);
		lbAreaVenda.setBounds(15, 75, 100, 20);
		lbCidade.setBounds(15, 105, 100, 20);
		lbEstado.setBounds(15, 135, 100, 20);
		lbSexo.setBounds(15, 165, 100, 20);
		lbIdade.setBounds(15, 195, 100, 20);
		lbSalario.setBounds(15, 225, 100, 20);

		/*
		 * Definindo os campos de texto
		 */
		tfCodigo = new JTextField();
		tfNome = new JTextField();
		tfAreaVenda = new JTextField();
		tfCidade = new JTextField();
		tfIdade = new JTextField();
		tfSalario = new JTextField();
		// Configurando o tamanho e local do campo de texto
		tfCodigo.setBounds(120, 15, 420, 20);
		tfNome.setBounds(120, 45, 420, 20);
		tfAreaVenda.setBounds(120, 75, 420, 20);
		tfCidade.setBounds(120, 105, 420, 20);
		tfIdade.setBounds(120, 195, 420, 20);
		tfSalario.setBounds(120, 225, 420, 20);

		/*
		 * configura��es do JComboBox
		 */
		cbxEstados = new JComboBox(estados);
		cbxEstados.setBounds(120, 135, 300, 20);

		/*
		 * configura��es do painel da janela
		 */
		painel = (JPanel) janela.getContentPane();
		painel.setLayout(null);
		painel.add(cbxEstados);

		/*
		 * configura��es do radio button
		 */
		rbSexoMasculino = new JRadioButton();
		rbSexoFeminino = new JRadioButton();

		// configurando o texto do componente
		rbSexoMasculino.setText("Masculino");
		rbSexoFeminino.setText("Feminino");

		// configurando a posi��o e tamanho
		rbSexoMasculino.setBounds(118, 165, 80, 25);
		rbSexoFeminino.setBounds(198, 165, 80, 25);

		/*
		 * configura��es do ButtonGroup
		 */
		grpSexo = new ButtonGroup();
		grpSexo.add(rbSexoMasculino);
		grpSexo.add(rbSexoFeminino);

		/*
		 * definindo os bot�es e suas configura��es
		 */
		btSalvar = new JButton();
		btCancelar = new JButton();
		btNovo = new JButton();
		btSair = new JButton();

		btNovo.setText("Novo");
		btSair.setText("Sair");

		// Configurando o texto dos bot�es
		btSalvar.setText("Salvar");
		btCancelar.setText("Cancelar");
		// Configurando o tamanho e local dos bot�es
		btSalvar.setBounds(130, 265, 140, 30);
		btCancelar.setBounds(300, 265, 140, 30);
		btNovo.setBounds(130, 265, 140, 30);
		btSair.setBounds(300, 265, 140, 30);

		// Aciona os m�todos dos JButtons
		btNovo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// m�todo para desbloquear a tela
				liberarTela();
			}

		});

		btSalvar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				salvar();

			}

		});

		btSair.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// fecha a janela e mant�m o menu aberto
				janela.dispose();

			}

		});

		btCancelar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// m�todo para limpar os campos da tela
				limparTela();
				// m�todo para bloquear os campos da tela
				bloquearTela();
			}

		});

		/*
		 * Adicionando os componentes na tela
		 */
		// painel recebendo o ContentPane do JFrame
		painel = (JPanel) janela.getContentPane();

		// Adicionando os r�tulos
		painel.add(lbCodigo);
		painel.add(lbNome);
		painel.add(lbAreaVenda);
		painel.add(lbCidade);
		painel.add(lbEstado);
		painel.add(lbSexo);
		painel.add(lbIdade);
		painel.add(lbSalario);

		// Adicionando os campos de preenchimento
		painel.add(tfCodigo);
		painel.add(tfNome);
		painel.add(tfAreaVenda);
		painel.add(tfCidade);
		painel.add(tfIdade);
		painel.add(tfSalario);

		// Adicionando o JComboBox
		painel.add(cbxEstados);

		// Adicionando o RadioButton
		painel.add(rbSexoMasculino);
		painel.add(rbSexoFeminino);

		// Adicionando os bot�es de salvar e cancelar
		painel.add(btSalvar);
		painel.add(btCancelar);
		painel.add(btNovo);
		painel.add(btSair);

		// chamando o m�todo para carregar a combo de estados
		carregarComboEstados();

		// bloqueando a tela ao iniciar
		bloquearTela();

		/*
		 * Configurando o par�metro de visualiza��o da tela
		 */
		janela.setVisible(true);

	}// fim do m�todo gui

	/*
	 * m�todo para bloquear a tela de cadastro
	 */

	private void bloquearTela() {
		tfCodigo.setEditable(false);
		tfNome.setEditable(false);
		tfAreaVenda.setEditable(false);
		tfCidade.setEditable(false);
		cbxEstados.setEnabled(false);
		tfIdade.setEditable(false);
		tfSalario.setEditable(false);
		rbSexoMasculino.setEnabled(false);
		rbSexoFeminino.setEnabled(false);
		btSalvar.setVisible(false);
		btCancelar.setVisible(false);
		btNovo.setVisible(true);
		btSair.setVisible(true);

	}
	/*
	 * m�todo para liberar os campos da tela de cadastro
	 */

	private void liberarTela() {
		tfCodigo.setEditable(true);
		tfNome.setEditable(true);
		tfAreaVenda.setEditable(true);
		tfCidade.setEditable(true);
		cbxEstados.setEnabled(true);
		tfIdade.setEditable(true);
		tfSalario.setEditable(true);
		rbSexoMasculino.setEnabled(true);
		rbSexoFeminino.setEnabled(true);
		btSalvar.setVisible(true);
		btCancelar.setVisible(true);
		btNovo.setVisible(false);
		btSair.setVisible(false);
		// deixando o c�digo como primeiro campo a ser preenchido
		tfCodigo.grabFocus();
	}

	/*
	 * m�todo para limpar os campos da tela de cadastro
	 */
	private void limparTela() {
		tfCodigo.setText(null);
		tfNome.setText(null);
		tfAreaVenda.setText(null);
		tfCidade.setText(null);
		tfIdade.setText(null);
		tfSalario.setText(null);
		grpSexo.clearSelection();
		cbxEstados.setSelectedIndex(0);
	}

	/*
	 * m�todo para preencher a combo de estados
	 */
	@SuppressWarnings("unchecked")
	private void carregarComboEstados() {
		// valor inicial da combo
		cbxEstados.addItem("-Selecione Estado-");

		// la�o de repeti��o para carregar a combo de estados
		for (Estado estado : new EstadoController().getEstados()) {
			cbxEstados.addItem(estado.getNome());
		}

	}

	/*
	 * m�todo para receber a��o do clique salvar
	 */
	public void salvar() {

		// salvar o vendedor apenas se estiverem v�lidos todos os dados
		if (validar()) {

			/*
			 * procedimentos de grava��o do objeto Vendedor arquivo TXT
			 */
			Vendedor vendedor = getVendedor();

			// chamando o m�todo respons�vel por gravar o arquivo TXT
			new VendedorController().gravarTxtVendedor(vendedor);

			// limpar a tela preenchida
			limparTela();

			// bloquear a tela
			bloquearTela();

			// exibindo mensagem de sucesso para o usu�rio
			JOptionPane.showMessageDialog(null, Mensagem.vendedorGravado, Titulo.cadastroVendedor, 1);
		}
	}

	/*
	 * m�todo para validar os campos da tela
	 */
	private boolean validar() {

		// valida��o do campo c�digo
		if (Valida.isEmptyOrNull(tfCodigo.getText())) {
			// informando o usu�rio que o c�digo n�o est� preenchido
			JOptionPane.showMessageDialog(btNovo, Mensagem.codigoVazio, Titulo.cadastroVendedor, 0);
			// colocando o foco no campo com erro
			tfCodigo.grabFocus();
			// retornar false para o m�todo
			return false;
		} else if (!Valida.isInteger(tfCodigo.getText())) {
			// informando ao usu�rio que o c�digo � inv�lido
			JOptionPane.showMessageDialog(null, Mensagem.codigoInvalido, Titulo.cadastroVendedor, 0);
			// colocando o foco no campo de erro
			tfCodigo.grabFocus();
			// retornar false para o m�todo
			return false;
		} else if (!Valida.isInteger(tfIdade.getText())) {
			// informando ao usu�rio que a idade � inv�lida
			JOptionPane.showMessageDialog(null, Mensagem.idadeInvalida, Titulo.cadastroVendedor, 0);
			// colocando o foco no campo de erro
			tfIdade.grabFocus();
			// retornar false para o m�todo
			return false;
		} else if (!Valida.isDouble(tfSalario.getText())) {
			// informando ao usu�rio que o sal�rio � inv�lido
			JOptionPane.showMessageDialog(null, Mensagem.salarioInvalido, Titulo.cadastroVendedor, 0);
			// colocando o foco no campo de erro
			tfSalario.grabFocus();
			// retornar false para o m�todo
			return false;
		}
		if (Valida.isEmptyOrNull(tfNome.getText())) {
			// informando o usu�rio que o nome n�o est� preenchido
			JOptionPane.showMessageDialog(null, Mensagem.nomeVazio, Titulo.cadastroVendedor, 0);
			// colocando o foco no campo com erro
			tfNome.grabFocus();
			// retornar false para o m�todo
			return false;
		}

		if (Valida.isEmptyOrNull(tfAreaVenda.getText())) {
			// informando o usu�rio que a �rea de venda n�o est� preenchida
			JOptionPane.showMessageDialog(null, Mensagem.areaVendaVazio, Titulo.cadastroVendedor, 0);
			// colocando o foco no campo com erro
			tfAreaVenda.grabFocus();
			// retornar false para o m�todo
			return false;
		}
		// valida��o da cidade
		if (Valida.isEmptyOrNull(tfCidade.getText())) {
			// informando o usu�rio que a cidade n�o est� preenchida
			JOptionPane.showMessageDialog(null, Mensagem.cidadeVazio, Titulo.cadastroVendedor, 0);
			// colocando o foco no campo com erro
			tfCidade.grabFocus();
			// retornar false para o m�todo
			return false;
		}

		// valida��o da combo de estado
		if (cbxEstados.getSelectedIndex() == 0) {
			// informando o usu�rio que o estado n�o foi selecionado
			JOptionPane.showMessageDialog(null, Mensagem.estadoVazio, Titulo.cadastroVendedor, 0);
			// colocando o foco no campo com erro
			cbxEstados.grabFocus();
			// retornar false para o m�todo
			return false;
		}

		// valida��o do radio button de sexo
		if (!rbSexoMasculino.isSelected()) {
			if (!rbSexoFeminino.isSelected()) {
				// informando o usu�rio que o sexo n�o foi selecionado
				JOptionPane.showMessageDialog(null, Mensagem.sexoVazio, Titulo.cadastroVendedor, 0);
				// retornar false para o m�todo
				return false;
			}
		}

		// valida��o da idade
		if (Valida.isEmptyOrNull(tfIdade.getText())) {
			// informando o usu�rio que a idade n�o est� preenchida
			JOptionPane.showMessageDialog(null, Mensagem.idadeVazio, Titulo.cadastroVendedor, 0);
			// colocando o foco no campo com erro
			tfIdade.grabFocus();
			// retornar false para o m�todo
			return false;
		}

		// valida��o do campo sal�rio
		if (Valida.isEmptyOrNull(tfSalario.getText())) {
			// informando o usu�rio que o sal�rio n�o est� preenchido
			JOptionPane.showMessageDialog(null, Mensagem.salarioVazio, Titulo.cadastroVendedor, 0);
			// colocando o foco no campo com erro
			tfSalario.grabFocus();
			// retornar false para o m�todo
			return false;
		}

		// devolvendo true caso esteja tudo v�lido
		return true;

	}// fim do m�todo validar

	/*
	 * m�todo para valorizar um objeto vendedor utilizando os campos da tela
	 */
	private Vendedor getVendedor() {
		// instanciando o objeto vendedor para retorno do m�todo
		Vendedor vendedor = new Vendedor();

		// valorizando o objeto vendedor
		vendedor.setCodigo(Util.getInt(tfCodigo.getText()));
		vendedor.setNome(tfNome.getText());
		vendedor.setAreaVenda(tfAreaVenda.getText());
		vendedor.setCidade(tfCidade.getText());
		vendedor.setEstado(cbxEstados.getSelectedItem() + "");

		// condicional tern�ria - if em uma linha -> ? se -> : sen�o
		vendedor.setSexo((rbSexoMasculino.isSelected()) ? 'M' : 'F');

		vendedor.setIdade(Util.getInt(tfIdade.getText()));
		vendedor.setSalario(Util.getDouble(tfSalario.getText()));

		// retornando o objeto valorizado
		return vendedor;

	}// fim do m�todo getVendedor

}// fim da classe
