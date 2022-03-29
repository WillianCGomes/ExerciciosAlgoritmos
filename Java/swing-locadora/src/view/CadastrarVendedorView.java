package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Importações de pacotes
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
 * Classe responsável por gerar a view de cadastro de Vendedor
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

	// componente JRadioButton que permite a seleção de apenas uma opção
	private JRadioButton rbSexoMasculino;
	private JRadioButton rbSexoFeminino;

	// componente ButtonGroup responsável por gerenciar os componentes radio button
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
	
	//Botões da tela de cadastro
	private JButton btSalvar;
	private JButton btCancelar;
	private JButton btNovo;
	private JButton btSair;

	// Método responsável por criar a tela e adicionar seus componentes
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void iniciaGui() {

		/*
		 * Definindo a tela e suas configurações
		 */

		JFrame janela = new JFrame();

		// Configurando o título da tela
		janela.setTitle("CADASTRO DE VENDEDOR");

		// Configurando o tamanho da tela
		janela.setSize(590, 355);

		// Definir o layout como nula da janela
		janela.getContentPane().setLayout(null);

		// Configurando a centralização do objeto janela
		janela.setLocationRelativeTo(null);

		/*
		 * Definindo os rótulos e suas configurações JLabel
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
		lbCodigo.setText("Código:");
		lbNome.setText("Nome:");
		lbAreaVenda.setText("Área de venda:");
		lbCidade.setText("Cidade:");
		lbEstado.setText("Estado:");
		lbSexo.setText("Sexo:");
		lbIdade.setText("Idade:");
		lbSalario.setText("Salário:");

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
		 * configurações do JComboBox
		 */
		cbxEstados = new JComboBox(estados);
		cbxEstados.setBounds(120, 135, 300, 20);

		/*
		 * configurações do painel da janela
		 */
		painel = (JPanel) janela.getContentPane();
		painel.setLayout(null);
		painel.add(cbxEstados);

		/*
		 * configurações do radio button
		 */
		rbSexoMasculino = new JRadioButton();
		rbSexoFeminino = new JRadioButton();

		// configurando o texto do componente
		rbSexoMasculino.setText("Masculino");
		rbSexoFeminino.setText("Feminino");

		// configurando a posição e tamanho
		rbSexoMasculino.setBounds(118, 165, 80, 25);
		rbSexoFeminino.setBounds(198, 165, 80, 25);

		/*
		 * configurações do ButtonGroup
		 */
		grpSexo = new ButtonGroup();
		grpSexo.add(rbSexoMasculino);
		grpSexo.add(rbSexoFeminino);

		/*
		 * definindo os botões e suas configurações
		 */
		btSalvar = new JButton();
		btCancelar = new JButton();
		btNovo = new JButton();
		btSair = new JButton();

		btNovo.setText("Novo");
		btSair.setText("Sair");

		// Configurando o texto dos botões
		btSalvar.setText("Salvar");
		btCancelar.setText("Cancelar");
		// Configurando o tamanho e local dos botões
		btSalvar.setBounds(130, 265, 140, 30);
		btCancelar.setBounds(300, 265, 140, 30);
		btNovo.setBounds(130, 265, 140, 30);
		btSair.setBounds(300, 265, 140, 30);

		// Aciona os métodos dos JButtons
		btNovo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// método para desbloquear a tela
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
				// fecha a janela e mantém o menu aberto
				janela.dispose();

			}

		});

		btCancelar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// método para limpar os campos da tela
				limparTela();
				// método para bloquear os campos da tela
				bloquearTela();
			}

		});

		/*
		 * Adicionando os componentes na tela
		 */
		// painel recebendo o ContentPane do JFrame
		painel = (JPanel) janela.getContentPane();

		// Adicionando os rótulos
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

		// Adicionando os botões de salvar e cancelar
		painel.add(btSalvar);
		painel.add(btCancelar);
		painel.add(btNovo);
		painel.add(btSair);

		// chamando o método para carregar a combo de estados
		carregarComboEstados();

		// bloqueando a tela ao iniciar
		bloquearTela();

		/*
		 * Configurando o parâmetro de visualização da tela
		 */
		janela.setVisible(true);

	}// fim do método gui

	/*
	 * método para bloquear a tela de cadastro
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
	 * método para liberar os campos da tela de cadastro
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
		// deixando o código como primeiro campo a ser preenchido
		tfCodigo.grabFocus();
	}

	/*
	 * método para limpar os campos da tela de cadastro
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
	 * método para preencher a combo de estados
	 */
	@SuppressWarnings("unchecked")
	private void carregarComboEstados() {
		// valor inicial da combo
		cbxEstados.addItem("-Selecione Estado-");

		// laço de repetição para carregar a combo de estados
		for (Estado estado : new EstadoController().getEstados()) {
			cbxEstados.addItem(estado.getNome());
		}

	}

	/*
	 * método para receber ação do clique salvar
	 */
	public void salvar() {

		// salvar o vendedor apenas se estiverem válidos todos os dados
		if (validar()) {

			/*
			 * procedimentos de gravação do objeto Vendedor arquivo TXT
			 */
			Vendedor vendedor = getVendedor();

			// chamando o método responsável por gravar o arquivo TXT
			new VendedorController().gravarTxtVendedor(vendedor);

			// limpar a tela preenchida
			limparTela();

			// bloquear a tela
			bloquearTela();

			// exibindo mensagem de sucesso para o usuário
			JOptionPane.showMessageDialog(null, Mensagem.vendedorGravado, Titulo.cadastroVendedor, 1);
		}
	}

	/*
	 * método para validar os campos da tela
	 */
	private boolean validar() {

		// validação do campo código
		if (Valida.isEmptyOrNull(tfCodigo.getText())) {
			// informando o usuário que o código não está preenchido
			JOptionPane.showMessageDialog(btNovo, Mensagem.codigoVazio, Titulo.cadastroVendedor, 0);
			// colocando o foco no campo com erro
			tfCodigo.grabFocus();
			// retornar false para o método
			return false;
		} else if (!Valida.isInteger(tfCodigo.getText())) {
			// informando ao usuário que o código é inválido
			JOptionPane.showMessageDialog(null, Mensagem.codigoInvalido, Titulo.cadastroVendedor, 0);
			// colocando o foco no campo de erro
			tfCodigo.grabFocus();
			// retornar false para o método
			return false;
		} else if (!Valida.isInteger(tfIdade.getText())) {
			// informando ao usuário que a idade é inválida
			JOptionPane.showMessageDialog(null, Mensagem.idadeInvalida, Titulo.cadastroVendedor, 0);
			// colocando o foco no campo de erro
			tfIdade.grabFocus();
			// retornar false para o método
			return false;
		} else if (!Valida.isDouble(tfSalario.getText())) {
			// informando ao usuário que o salário é inválido
			JOptionPane.showMessageDialog(null, Mensagem.salarioInvalido, Titulo.cadastroVendedor, 0);
			// colocando o foco no campo de erro
			tfSalario.grabFocus();
			// retornar false para o método
			return false;
		}
		if (Valida.isEmptyOrNull(tfNome.getText())) {
			// informando o usuário que o nome não está preenchido
			JOptionPane.showMessageDialog(null, Mensagem.nomeVazio, Titulo.cadastroVendedor, 0);
			// colocando o foco no campo com erro
			tfNome.grabFocus();
			// retornar false para o método
			return false;
		}

		if (Valida.isEmptyOrNull(tfAreaVenda.getText())) {
			// informando o usuário que a área de venda não está preenchida
			JOptionPane.showMessageDialog(null, Mensagem.areaVendaVazio, Titulo.cadastroVendedor, 0);
			// colocando o foco no campo com erro
			tfAreaVenda.grabFocus();
			// retornar false para o método
			return false;
		}
		// validação da cidade
		if (Valida.isEmptyOrNull(tfCidade.getText())) {
			// informando o usuário que a cidade não está preenchida
			JOptionPane.showMessageDialog(null, Mensagem.cidadeVazio, Titulo.cadastroVendedor, 0);
			// colocando o foco no campo com erro
			tfCidade.grabFocus();
			// retornar false para o método
			return false;
		}

		// validação da combo de estado
		if (cbxEstados.getSelectedIndex() == 0) {
			// informando o usuário que o estado não foi selecionado
			JOptionPane.showMessageDialog(null, Mensagem.estadoVazio, Titulo.cadastroVendedor, 0);
			// colocando o foco no campo com erro
			cbxEstados.grabFocus();
			// retornar false para o método
			return false;
		}

		// validação do radio button de sexo
		if (!rbSexoMasculino.isSelected()) {
			if (!rbSexoFeminino.isSelected()) {
				// informando o usuário que o sexo não foi selecionado
				JOptionPane.showMessageDialog(null, Mensagem.sexoVazio, Titulo.cadastroVendedor, 0);
				// retornar false para o método
				return false;
			}
		}

		// validação da idade
		if (Valida.isEmptyOrNull(tfIdade.getText())) {
			// informando o usuário que a idade não está preenchida
			JOptionPane.showMessageDialog(null, Mensagem.idadeVazio, Titulo.cadastroVendedor, 0);
			// colocando o foco no campo com erro
			tfIdade.grabFocus();
			// retornar false para o método
			return false;
		}

		// validação do campo salário
		if (Valida.isEmptyOrNull(tfSalario.getText())) {
			// informando o usuário que o salário não está preenchido
			JOptionPane.showMessageDialog(null, Mensagem.salarioVazio, Titulo.cadastroVendedor, 0);
			// colocando o foco no campo com erro
			tfSalario.grabFocus();
			// retornar false para o método
			return false;
		}

		// devolvendo true caso esteja tudo válido
		return true;

	}// fim do método validar

	/*
	 * método para valorizar um objeto vendedor utilizando os campos da tela
	 */
	private Vendedor getVendedor() {
		// instanciando o objeto vendedor para retorno do método
		Vendedor vendedor = new Vendedor();

		// valorizando o objeto vendedor
		vendedor.setCodigo(Util.getInt(tfCodigo.getText()));
		vendedor.setNome(tfNome.getText());
		vendedor.setAreaVenda(tfAreaVenda.getText());
		vendedor.setCidade(tfCidade.getText());
		vendedor.setEstado(cbxEstados.getSelectedItem() + "");

		// condicional ternária - if em uma linha -> ? se -> : senão
		vendedor.setSexo((rbSexoMasculino.isSelected()) ? 'M' : 'F');

		vendedor.setIdade(Util.getInt(tfIdade.getText()));
		vendedor.setSalario(Util.getDouble(tfSalario.getText()));

		// retornando o objeto valorizado
		return vendedor;

	}// fim do método getVendedor

}// fim da classe
