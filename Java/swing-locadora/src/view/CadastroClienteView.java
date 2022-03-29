package view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.text.MaskFormatter;

import controller.ClienteController;
import controller.EstadoController;
import model.Cliente;
import model.Data;
import model.Endereco;
import model.Estado;
import util.Mensagem;
import util.Titulo;
import util.Util;
import util.Valida;

/**
 * Classe responsável por gerar a view de cadastro de cliente
 * 
 * @author Willian Carlos Gomes
 * @since 4 de mar. de 2021
 * @version 1.0
 */

public class CadastroClienteView {

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
	private JPanel painelPrincipal;
	private JPanel painelEndereco;

	// Declarando os atributos de formatação
	private MaskFormatter fmtCpf;
	private MaskFormatter fmtRg;
	private MaskFormatter fmtDataNascimento;
	private MaskFormatter fmtTelefone;
	private MaskFormatter fmtCelular;

	// Labels da tela
	private JLabel lbCodigo;
	private JLabel lbNome;
	private JLabel lbSexo;
	private JLabel lbIdade;
	private JLabel lbCelular;
	private JLabel lbRg;
	private JLabel lbCpf;
	private JLabel lbEmail;
	private JLabel lbTelefone;
	private JLabel lbDataNasc;

	// Labels do painel de endereço
	private JLabel lbCodigoEnd;
	private JLabel lbTipoLogradouro;
	private JLabel lbNomeLogradouro;
	private JLabel lbNumero;
	private JLabel lbComplemento;
	private JLabel lbBairro;
	private JLabel lbCidade;
	private JLabel lbEstado;
	private JLabel lbCep;

	// Campos de texto da janela
	private JTextField tfCodigo;
	private JTextField tfNome;
	private JTextField tfIdade;
	private JTextField tfCelular;
	private JTextField tfRg;
	private JTextField tfCpf;
	private JTextField tfEmail;
	private JTextField tfTelefone;
	private JTextField tfDataNasc;

	//Campos de texto do painel de endereço
	private JTextField tfTipoLogradouro;
	private JTextField tfNomeLogradouro;
	private JTextField tfNumero;
	private JTextField tfComplemento;
	private JTextField tfBairro;
	private JTextField tfCidade;
	private JTextField tfCep;

	//botões da janela
	private JButton btNovo;
	private JButton btSair;
	private JButton btSalvar;
	private JButton btCancelar;

	// Método responsável por criar a tela e adicionar seus componentes
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void iniciaGui() throws ParseException {

		/*
		 * Configurações do campos de formatação
		 */

		fmtCpf = new MaskFormatter("###.###.###-##");
		fmtCpf.setPlaceholderCharacter('_');
		fmtRg = new MaskFormatter("##.###.###-#");
		fmtRg.setPlaceholderCharacter('_');
		fmtDataNascimento = new MaskFormatter("##/##/####");
		fmtTelefone = new MaskFormatter("(##) ####-####");
		fmtTelefone.setPlaceholderCharacter('_');
		fmtCelular = new MaskFormatter("(##) #####-####");
		fmtCelular.setPlaceholderCharacter('_');

		/*
		 * Definindo a tela e suas configurações
		 */

		JFrame janela = new JFrame();

		// Configurando o título da tela
		janela.setTitle("CADASTRO DE CLIENTES");

		// Configurando o tamanho da tela
		janela.setSize(745, 395);

		// Definir o layout como nula da janela
		janela.getContentPane().setLayout(null);

		// Configurando a centralização do objeto janela
		janela.setLocationRelativeTo(null);

		/*
		 * Definindo os rótulos e suas configurações JLabel
		 */
		lbCodigo = new JLabel();
		lbNome = new JLabel();
		lbSexo = new JLabel();
		lbIdade = new JLabel();
		lbCelular = new JLabel();
		lbRg = new JLabel();
		lbCpf = new JLabel();
		lbEmail = new JLabel();
		lbTelefone = new JLabel();
		lbDataNasc = new JLabel();

		// Configurando o texto a ser exibido na label
		lbCodigo.setText("Código:");
		lbNome.setText("Nome:");
		lbSexo.setText("Sexo:");
		lbIdade.setText("Idade:");
		lbCelular.setText("Celular:");
		lbRg.setText("RG:");
		lbCpf.setText("CPF:");
		lbEmail.setText("E-mail:");
		lbTelefone.setText("Telefone:");
		lbDataNasc.setText("Data de Nascimento:");

		// Configurando os tamanhos e locais das labels
		lbCodigo.setBounds(15, 15, 100, 20);
		lbNome.setBounds(195, 15, 100, 20);
		lbSexo.setBounds(520, 15, 100, 20);
		lbIdade.setBounds(520, 45, 100, 20);
		lbCelular.setBounds(15, 45, 100, 20);
		lbRg.setBounds(195, 45, 40, 20);
		lbCpf.setBounds(344, 45, 100, 20);
		lbEmail.setBounds(15, 75, 100, 20);
		lbTelefone.setBounds(520, 75, 100, 20);
		lbDataNasc.setBounds(520, 105, 100, 20);

		/*
		 * Definindo os campos de texto
		 */
		tfCodigo = new JTextField();
		tfNome = new JTextField();
		tfIdade = new JTextField();
		tfCelular = new JFormattedTextField(fmtCelular);
		tfRg = new JFormattedTextField(fmtRg);
		tfCpf = new JFormattedTextField(fmtCpf);
		tfEmail = new JTextField();
		tfTelefone = new JFormattedTextField(fmtTelefone);
		tfDataNasc = new JFormattedTextField(fmtDataNascimento);

		// Configurando o tamanho e local dos campos de texto
		tfCodigo.setBounds(75, 15, 100, 20);
		tfNome.setBounds(230, 15, 250, 20);
		tfIdade.setBounds(575, 45, 135, 20);
		tfCelular.setBounds(75, 45, 100, 20);
		tfRg.setBounds(230, 45, 100, 20);
		tfCpf.setBounds(380, 45, 100, 20);
		tfEmail.setBounds(75, 75, 405, 20);
		tfTelefone.setBounds(575, 75, 135, 20);
		tfDataNasc.setBounds(625, 105, 85, 20);

		/*
		 * configurações do radio button
		 */
		rbSexoMasculino = new JRadioButton();
		rbSexoFeminino = new JRadioButton();

		// configurando o texto do componente
		rbSexoMasculino.setText("Masculino");
		rbSexoFeminino.setText("Feminino");

		// configurando a posição e tamanho
		rbSexoMasculino.setBounds(560, 15, 80, 25);
		rbSexoFeminino.setBounds(645, 15, 80, 25);

		/*
		 * configurações do ButtonGroup
		 */
		grpSexo = new ButtonGroup();
		grpSexo.add(rbSexoMasculino);
		grpSexo.add(rbSexoFeminino);

		/*
		 * configurações do painel de endereço
		 */
		painelEndereco = new JPanel();
		// configurar a posição e tamanho
		painelEndereco.setBounds(5, 140, 715, 130);
		// configurar o layout do painel
		painelEndereco.setLayout(new GridLayout(1, 1, 0, 0));
		// configurar a borda do layout
		painelEndereco.setBorder(new TitledBorder("Endereço"));
		// Zerando o layout do painel
		painelEndereco.setLayout(null);

		/*
		 * Definindo os rótulos e suas configurações JLabel
		 */

		lbCodigoEnd = new JLabel();
		lbTipoLogradouro = new JLabel();
		lbNomeLogradouro = new JLabel();
		lbNumero = new JLabel();
		lbComplemento = new JLabel();
		lbBairro = new JLabel();
		lbCidade = new JLabel();
		lbEstado = new JLabel();
		lbCep = new JLabel();

		// Configurando o texto a ser exibido na label
		lbCodigoEnd.setText("Código: ");
		lbTipoLogradouro.setText("Logradouro:");
		lbNomeLogradouro.setText("Endereço:");
		lbNumero.setText("Número:");
		lbComplemento.setText("Complemento:");
		lbBairro.setText("Bairro:");
		lbCidade.setText("Cidade:");
		lbEstado.setText("Estado:");
		lbCep.setText("CEP:");

		// Configurando os tamanhos e locais das labels
		lbTipoLogradouro.setBounds(15, 15, 100, 20);
		lbNomeLogradouro.setBounds(205, 15, 200, 20);
		lbNumero.setBounds(563, 15, 100, 20);
		lbComplemento.setBounds(535, 45, 100, 20);
		lbBairro.setBounds(15, 45, 75, 20);
		lbCidade.setBounds(205, 45, 75, 20);
		lbEstado.setBounds(355, 45, 75, 20);
		lbCep.setBounds(15, 75, 100, 20);
		/*
		 * Definindo os campos de texto
		 */
		tfTipoLogradouro = new JTextField();
		tfNomeLogradouro = new JTextField();
		tfNumero = new JTextField();
		tfComplemento = new JTextField();
		tfBairro = new JTextField();
		tfCidade = new JTextField();
		tfCep = new JTextField();

		// Configurando o tamanho e local dos campos de texto
		tfTipoLogradouro.setBounds(80, 15, 100, 20);
		tfNomeLogradouro.setBounds(260, 15, 260, 20);
		tfNumero.setBounds(615, 15, 87, 20);
		tfComplemento.setBounds(615, 45, 87, 20);
		tfBairro.setBounds(80, 45, 100, 20);
		tfCidade.setBounds(260, 45, 90, 20);
		tfCep.setBounds(80, 75, 100, 20);

		/*
		 * configurações do JComboBox
		 */
		cbxEstados = new JComboBox(estados);
		cbxEstados.setBounds(402, 45, 118, 20);

		/*
		 * Adicionando os componentes de endereço ao painel
		 */
		painelEndereco.add(lbCodigoEnd);
		painelEndereco.add(lbTipoLogradouro);
		painelEndereco.add(tfTipoLogradouro);
		painelEndereco.add(lbNomeLogradouro);
		painelEndereco.add(tfNomeLogradouro);
		painelEndereco.add(lbNumero);
		painelEndereco.add(tfNumero);
		painelEndereco.add(lbComplemento);
		painelEndereco.add(tfComplemento);
		painelEndereco.add(lbBairro);
		painelEndereco.add(tfBairro);
		painelEndereco.add(lbCidade);
		painelEndereco.add(tfCidade);
		painelEndereco.add(lbEstado);
		painelEndereco.add(lbCep);
		painelEndereco.add(tfCep);

		/*
		 * configurações do painel principal
		 */
		painelPrincipal = (JPanel) janela.getContentPane();
		painelPrincipal.setLayout(null);

		painelEndereco.add(lbCidade);
		painelEndereco.add(cbxEstados);

		/*
		 * definindo os botões e suas configurações
		 */
		btNovo = new JButton();
		btSair = new JButton();
		btSalvar = new JButton();
		btCancelar = new JButton();
		// Configurando o texto dos botões
		btNovo.setText("Novo");
		btSair.setText("Sair");
		btSalvar.setText("Salvar");
		btCancelar.setText("Cancelar");
		// Configurando o tamanho e local dos botões
		btNovo.setBounds(215, 300, 140, 30);
		btSair.setBounds(385, 300, 140, 30);
		btSalvar.setBounds(215, 300, 140, 30);
		btCancelar.setBounds(385, 300, 140, 30);

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

		// Adicionando os rótulos
		painelPrincipal.add(lbCodigo);
		painelPrincipal.add(lbNome);
		painelPrincipal.add(lbIdade);
		painelPrincipal.add(lbSexo);
		painelPrincipal.add(lbCelular);
		painelPrincipal.add(lbRg);
		painelPrincipal.add(lbCpf);
		painelPrincipal.add(lbEmail);
		painelPrincipal.add(lbTelefone);
		painelPrincipal.add(lbDataNasc);
		// Adicionando os campos de preenchimento, e botões
		painelPrincipal.add(tfCodigo);
		painelPrincipal.add(tfNome);
		painelPrincipal.add(tfIdade);
		painelPrincipal.add(tfCelular);
		painelPrincipal.add(tfRg);
		painelPrincipal.add(tfCpf);
		painelPrincipal.add(tfEmail);
		painelPrincipal.add(tfTelefone);
		painelPrincipal.add(tfDataNasc);
		painelPrincipal.add(rbSexoMasculino);
		painelPrincipal.add(rbSexoFeminino);
		painelPrincipal.add(painelEndereco);
		painelPrincipal.add(btNovo);
		painelPrincipal.add(btSair);
		painelPrincipal.add(btCancelar);
		painelPrincipal.add(btSalvar);

		// chamando o método para carregar a combo de estados
		carregarComboEstados();

		// bloqueando a tela ao iniciar
		bloquearTela();

		/*
		 * Configurando o parâmetro de visualização da tela
		 */
		janela.setVisible(true);
	}

	/*
	 * método para bloquear a tela de cadastro
	 */
	private void bloquearTela() {
		tfCodigo.setEditable(false);
		tfNome.setEditable(false);
		tfIdade.setEditable(false);
		tfCelular.setEditable(false);
		tfRg.setEditable(false);
		tfCpf.setEditable(false);
		tfEmail.setEditable(false);
		tfTelefone.setEditable(false);
		tfDataNasc.setEditable(false);
		rbSexoMasculino.setEnabled(false);
		rbSexoFeminino.setEnabled(false);
		tfTipoLogradouro.setEditable(false);
		tfNomeLogradouro.setEditable(false);
		tfNumero.setEditable(false);
		tfComplemento.setEditable(false);
		tfBairro.setEditable(false);
		tfCidade.setEditable(false);
		cbxEstados.setEnabled(false);
		tfCep.setEditable(false);
		btSalvar.setVisible(false);
		btCancelar.setVisible(false);
		btNovo.setVisible(true);
		btSair.setVisible(true);

	}// fim do método gui

	/*
	 * método para liberar os campos da tela de cadastro
	 */
	private void liberarTela() {
		tfCodigo.setEditable(true);
		tfNome.setEditable(true);
		tfIdade.setEditable(true);
		tfCelular.setEditable(true);
		tfRg.setEditable(true);
		tfCpf.setEditable(true);
		tfEmail.setEditable(true);
		tfTelefone.setEditable(true);
		tfDataNasc.setEditable(true);
		rbSexoMasculino.setEnabled(true);
		rbSexoFeminino.setEnabled(true);
		tfTipoLogradouro.setEditable(true);
		tfNomeLogradouro.setEditable(true);
		tfNumero.setEditable(true);
		tfComplemento.setEditable(true);
		tfBairro.setEditable(true);
		tfCidade.setEditable(true);
		cbxEstados.setEnabled(true);
		tfCep.setEditable(true);
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
		tfIdade.setText(null);
		tfCelular.setText(null);
		tfRg.setText(null);
		tfCpf.setText(null);
		tfEmail.setText(null);
		tfTelefone.setText(null);
		tfDataNasc.setText(null);
		tfTipoLogradouro.setText(null);
		tfNomeLogradouro.setText(null);
		tfNumero.setText(null);
		tfComplemento.setText(null);
		tfBairro.setText(null);
		tfCidade.setText(null);
		tfCep.setText(null);
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

	}// fim do método

	public void salvar() {
		// salvar o cliente apenas se estiverem válidos todos os dados
		if (validar()) {
			/*
			 * procedimentos de gravação do objeto Cliente no arquivo TXT
			 */
			Cliente cliente = getCliente();

			// chamando o método responsável por gravar o arquivo TXT
			new ClienteController().gravarTxtCliente(cliente);

			// limpar a tela preenchida
			limparTela();

			// bloquear a tela
			bloquearTela();

			// exibindo mensagem de sucesso para o usuário
			JOptionPane.showMessageDialog(null, Mensagem.clienteGravado, Titulo.cadastroCliente, 1);
		}
	}// fim do método
	/*
	 * método para validar os campos da tela
	 */
	private boolean validar() {
		// validação do campo código
		if (Valida.isEmptyOrNull(tfCodigo.getText())) {
			// informando o usuário que o código não está preenchido
			JOptionPane.showMessageDialog(btNovo, Mensagem.codigoVazio, Titulo.cadastroCliente, 0);
			// colocando o foco no campo com erro
			tfCodigo.grabFocus();
			// retornar false para o método
			return false;
		} else if (!Valida.isInteger(tfCodigo.getText())) {
			// informando ao usuário que o código é inválido
			JOptionPane.showMessageDialog(null, Mensagem.codigoInvalido, Titulo.cadastroCliente, 0);
			// colocando o foco no campo de erro
			tfCodigo.grabFocus();
			// retornar false para o método
			return false;
		} else if (Valida.isEmptyOrNull(tfNome.getText())) {
			// informando o usuário que o nome não está preenchido
			JOptionPane.showMessageDialog(null, Mensagem.nomeVazio, Titulo.cadastroCliente, 0);
			// colocando o foco no campo com erro
			tfNome.grabFocus();
			// retornar false para o método
			return false;
		} else if (!rbSexoMasculino.isSelected() && (!rbSexoFeminino.isSelected())) {
			// informando o usuário que o sexo não foi selecionado
			JOptionPane.showMessageDialog(null, Mensagem.sexoVazio, Titulo.cadastroCliente, 0);
			// retornar false para o método
			return false;

		} else if ((tfCelular.getText().equals("(__) _____-____"))) {
			// informando o usuário que o celular não está preenchido
			JOptionPane.showMessageDialog(null, Mensagem.celularInvalido, Titulo.cadastroCliente, 0);
			// colocando o foco no campo com erro
			tfCelular.grabFocus();
			// retornar false para o método
			return false;
		} else if ((tfRg.getText().equals("__.___.___-_"))) {
			// informando o usuário que o RG não está preenchido
			JOptionPane.showMessageDialog(null, Mensagem.rgInvalido, Titulo.cadastroCliente, 0);
			// colocando o foco no campo com erro
			tfRg.grabFocus();
			// retornar false para o método
			return false;
		} else if ((tfCpf.getText().equals("___.___.___-__"))) {
			// informando o usuário que o CPF não está preenchido
			JOptionPane.showMessageDialog(null, Mensagem.cpfInvalido, Titulo.cadastroCliente, 0);
			// colocando o foco no campo com erro
			tfCpf.grabFocus();
			// retornar false para o método
			return false;
		} else if (Valida.isEmptyOrNull(tfIdade.getText())) {
			// informando o usuário que a idade não está preenchida
			JOptionPane.showMessageDialog(null, Mensagem.idadeVazio, Titulo.cadastroCliente, 0);
			// colocando o foco no campo com erro
			tfIdade.grabFocus();
			// retornar false para o método
			return false;
		} else if (!Valida.isInteger(tfIdade.getText())) {
			// informando ao usuário que a idade é inválida
			JOptionPane.showMessageDialog(null, Mensagem.idadeInvalida, Titulo.cadastroCliente, 0);
			// colocando o foco no campo de erro
			tfIdade.grabFocus();
			// retornar false para o método
			return false;
		} else if (Valida.isEmptyOrNull(tfEmail.getText())) {
			// informando o usuário que o email não está preenchido
			JOptionPane.showMessageDialog(null, Mensagem.emailInvalido, Titulo.cadastroCliente, 0);
			// colocando o foco no campo com erro
			tfEmail.grabFocus();
			// retornar false para o método
			return false;
		} else if ((tfDataNasc.getText().equals("  /  /    "))) {
			// informando o usuário que a data de nascimento não está preenchida
			JOptionPane.showMessageDialog(null, Mensagem.dataNascInvalido, Titulo.cadastroCliente, 0);
			// colocando o foco no campo com erro
			tfDataNasc.grabFocus();
			// retornar false para o método
			return false;
		} else if (Valida.isEmptyOrNull(tfTipoLogradouro.getText())) {
			// informando o usuário que o tipo do logradouro não está preenchido
			JOptionPane.showMessageDialog(null, Mensagem.tipoLogradouroVazio, Titulo.cadastroCliente, 0);
			// colocando o foco no campo com erro
			tfTipoLogradouro.grabFocus();
			// retornar false para o método
			return false;
		} else if (Valida.isEmptyOrNull(tfNomeLogradouro.getText())) {
			// informando o usuário que o logradouro não está preenchido
			JOptionPane.showMessageDialog(null, Mensagem.enderecoVazio, Titulo.cadastroCliente, 0);
			// colocando o foco no campo com erro
			tfNomeLogradouro.grabFocus();
			// retornar false para o método
			return false;
		} else if (Valida.isEmptyOrNull(tfNumero.getText())) {
			// informando o usuário que o tipo do logradouro não está preenchido
			JOptionPane.showMessageDialog(null, Mensagem.numeroEnderecoVazio, Titulo.cadastroCliente, 0);
			// colocando o foco no campo com erro
			tfNumero.grabFocus();
			// retornar false para o método
			return false;
		} else if (Valida.isEmptyOrNull(tfBairro.getText())) {
			// informando o usuário que o bairro não está preenchido
			JOptionPane.showMessageDialog(null, Mensagem.bairroVazio, Titulo.cadastroCliente, 0);
			// colocando o foco no campo com erro
			tfBairro.grabFocus();
			// retornar false para o método
			return false;
		} else if (Valida.isEmptyOrNull(tfCidade.getText())) {
			// informando o usuário que a cidade não está preenchida
			JOptionPane.showMessageDialog(null, Mensagem.cidadeVazio, Titulo.cadastroCliente, 0);
			// colocando o foco no campo com erro
			tfCidade.grabFocus();
			// retornar false para o método
			return false;
		} else if (cbxEstados.getSelectedIndex() == 0) {
			// informando o usuário que o estado não foi selecionado
			JOptionPane.showMessageDialog(null, Mensagem.estadoVazio, Titulo.cadastroCliente, 0);
			// colocando o foco no campo com erro
			cbxEstados.grabFocus();
			// retornar false para o método
			return false;
		} else if (Valida.isEmptyOrNull(tfCep.getText())) {
			// informando o usuário que o CEP não está preenchido
			JOptionPane.showMessageDialog(null, Mensagem.cepVazio, Titulo.cadastroCliente, 0);
			// colocando o foco no campo com erro
			tfCep.grabFocus();
			// retornar false para o método
			return false;
		}
		// devolvendo true caso esteja tudo válido
		return true;
	}// fim do método validar

	/*
	 * método para valorizar um objeto cliente utilizando os campos da tela
	 */
	private Cliente getCliente() {
		// instanciando o objeto cliente para retorno do método
		Cliente cliente = new Cliente();

		// valorizando o objeto cliente
		cliente.setCodigo(Util.getInt(tfCodigo.getText()));
		cliente.setNome(tfNome.getText());
		cliente.setEndereco(getEndereco());
		cliente.setCpf(tfCpf.getText());
		cliente.setRg(tfRg.getText());
		cliente.setDataNascimento(dataNasc());
		cliente.setIdade(Util.getInt(tfIdade.getText()));
		// condicional ternária - if em uma linha -> ? se -> : senão
		cliente.setSexo((rbSexoMasculino.isSelected()) ? 'M' : 'F');
		cliente.setTelefone(tfTelefone.getText());
		cliente.setCelular(tfCelular.getText());
		cliente.setEmail(tfEmail.getText());

		// retornando o objeto valorizado
		return cliente;

	}// fim do método getCliente

	/*
	 * Método para para valorizar a classe endereço
	 */
	private Endereco getEndereco() {

		Endereco endereco = new Endereco();
		endereco.setCodigo(Util.getInt(tfCodigo.getText()));
		endereco.setLogradouro(tfTipoLogradouro.getText());
		endereco.setEndereco(tfNomeLogradouro.getText());
		endereco.setNumero(Util.getInt(tfNumero.getText()));
		endereco.setComplemento(tfComplemento.getText());
		endereco.setBairro(tfBairro.getText());
		endereco.setCidade(tfCidade.getText());
		endereco.setEstado(cbxEstados.getSelectedItem() + "");
		endereco.setCep(tfCep.getText());
		return endereco;
	}

	/*
	 * método para armazenar a data de nascimento do cliente na classe Data
	 */
	private Data dataNasc() {
		Data data = new Data();
		String[] armazenaData = (tfDataNasc.getText().split("/"));

		data.setDia((Integer.parseInt(armazenaData[0])));
		data.setMes((Integer.parseInt(armazenaData[1])));
		data.setAno((Integer.parseInt(armazenaData[2])));
		return data;

	}// fim do método

}// fim da classe
