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
 * Classe respons�vel por gerar a view de cadastro de cliente
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

	// componente JRadioButton que permite a sele��o de apenas uma op��o
	private JRadioButton rbSexoMasculino;
	private JRadioButton rbSexoFeminino;

	// componente ButtonGroup respons�vel por gerenciar os componentes radio button
	private ButtonGroup grpSexo;

	// Painel para organizara os componentes
	private JPanel painelPrincipal;
	private JPanel painelEndereco;

	// Declarando os atributos de formata��o
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

	// Labels do painel de endere�o
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

	//Campos de texto do painel de endere�o
	private JTextField tfTipoLogradouro;
	private JTextField tfNomeLogradouro;
	private JTextField tfNumero;
	private JTextField tfComplemento;
	private JTextField tfBairro;
	private JTextField tfCidade;
	private JTextField tfCep;

	//bot�es da janela
	private JButton btNovo;
	private JButton btSair;
	private JButton btSalvar;
	private JButton btCancelar;

	// M�todo respons�vel por criar a tela e adicionar seus componentes
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void iniciaGui() throws ParseException {

		/*
		 * Configura��es do campos de formata��o
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
		 * Definindo a tela e suas configura��es
		 */

		JFrame janela = new JFrame();

		// Configurando o t�tulo da tela
		janela.setTitle("CADASTRO DE CLIENTES");

		// Configurando o tamanho da tela
		janela.setSize(745, 395);

		// Definir o layout como nula da janela
		janela.getContentPane().setLayout(null);

		// Configurando a centraliza��o do objeto janela
		janela.setLocationRelativeTo(null);

		/*
		 * Definindo os r�tulos e suas configura��es JLabel
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
		lbCodigo.setText("C�digo:");
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
		 * configura��es do radio button
		 */
		rbSexoMasculino = new JRadioButton();
		rbSexoFeminino = new JRadioButton();

		// configurando o texto do componente
		rbSexoMasculino.setText("Masculino");
		rbSexoFeminino.setText("Feminino");

		// configurando a posi��o e tamanho
		rbSexoMasculino.setBounds(560, 15, 80, 25);
		rbSexoFeminino.setBounds(645, 15, 80, 25);

		/*
		 * configura��es do ButtonGroup
		 */
		grpSexo = new ButtonGroup();
		grpSexo.add(rbSexoMasculino);
		grpSexo.add(rbSexoFeminino);

		/*
		 * configura��es do painel de endere�o
		 */
		painelEndereco = new JPanel();
		// configurar a posi��o e tamanho
		painelEndereco.setBounds(5, 140, 715, 130);
		// configurar o layout do painel
		painelEndereco.setLayout(new GridLayout(1, 1, 0, 0));
		// configurar a borda do layout
		painelEndereco.setBorder(new TitledBorder("Endere�o"));
		// Zerando o layout do painel
		painelEndereco.setLayout(null);

		/*
		 * Definindo os r�tulos e suas configura��es JLabel
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
		lbCodigoEnd.setText("C�digo: ");
		lbTipoLogradouro.setText("Logradouro:");
		lbNomeLogradouro.setText("Endere�o:");
		lbNumero.setText("N�mero:");
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
		 * configura��es do JComboBox
		 */
		cbxEstados = new JComboBox(estados);
		cbxEstados.setBounds(402, 45, 118, 20);

		/*
		 * Adicionando os componentes de endere�o ao painel
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
		 * configura��es do painel principal
		 */
		painelPrincipal = (JPanel) janela.getContentPane();
		painelPrincipal.setLayout(null);

		painelEndereco.add(lbCidade);
		painelEndereco.add(cbxEstados);

		/*
		 * definindo os bot�es e suas configura��es
		 */
		btNovo = new JButton();
		btSair = new JButton();
		btSalvar = new JButton();
		btCancelar = new JButton();
		// Configurando o texto dos bot�es
		btNovo.setText("Novo");
		btSair.setText("Sair");
		btSalvar.setText("Salvar");
		btCancelar.setText("Cancelar");
		// Configurando o tamanho e local dos bot�es
		btNovo.setBounds(215, 300, 140, 30);
		btSair.setBounds(385, 300, 140, 30);
		btSalvar.setBounds(215, 300, 140, 30);
		btCancelar.setBounds(385, 300, 140, 30);

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

		// Adicionando os r�tulos
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
		// Adicionando os campos de preenchimento, e bot�es
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

		// chamando o m�todo para carregar a combo de estados
		carregarComboEstados();

		// bloqueando a tela ao iniciar
		bloquearTela();

		/*
		 * Configurando o par�metro de visualiza��o da tela
		 */
		janela.setVisible(true);
	}

	/*
	 * m�todo para bloquear a tela de cadastro
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

	}// fim do m�todo gui

	/*
	 * m�todo para liberar os campos da tela de cadastro
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
		// deixando o c�digo como primeiro campo a ser preenchido
		tfCodigo.grabFocus();
	}

	/*
	 * m�todo para limpar os campos da tela de cadastro
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

	}// fim do m�todo

	public void salvar() {
		// salvar o cliente apenas se estiverem v�lidos todos os dados
		if (validar()) {
			/*
			 * procedimentos de grava��o do objeto Cliente no arquivo TXT
			 */
			Cliente cliente = getCliente();

			// chamando o m�todo respons�vel por gravar o arquivo TXT
			new ClienteController().gravarTxtCliente(cliente);

			// limpar a tela preenchida
			limparTela();

			// bloquear a tela
			bloquearTela();

			// exibindo mensagem de sucesso para o usu�rio
			JOptionPane.showMessageDialog(null, Mensagem.clienteGravado, Titulo.cadastroCliente, 1);
		}
	}// fim do m�todo
	/*
	 * m�todo para validar os campos da tela
	 */
	private boolean validar() {
		// valida��o do campo c�digo
		if (Valida.isEmptyOrNull(tfCodigo.getText())) {
			// informando o usu�rio que o c�digo n�o est� preenchido
			JOptionPane.showMessageDialog(btNovo, Mensagem.codigoVazio, Titulo.cadastroCliente, 0);
			// colocando o foco no campo com erro
			tfCodigo.grabFocus();
			// retornar false para o m�todo
			return false;
		} else if (!Valida.isInteger(tfCodigo.getText())) {
			// informando ao usu�rio que o c�digo � inv�lido
			JOptionPane.showMessageDialog(null, Mensagem.codigoInvalido, Titulo.cadastroCliente, 0);
			// colocando o foco no campo de erro
			tfCodigo.grabFocus();
			// retornar false para o m�todo
			return false;
		} else if (Valida.isEmptyOrNull(tfNome.getText())) {
			// informando o usu�rio que o nome n�o est� preenchido
			JOptionPane.showMessageDialog(null, Mensagem.nomeVazio, Titulo.cadastroCliente, 0);
			// colocando o foco no campo com erro
			tfNome.grabFocus();
			// retornar false para o m�todo
			return false;
		} else if (!rbSexoMasculino.isSelected() && (!rbSexoFeminino.isSelected())) {
			// informando o usu�rio que o sexo n�o foi selecionado
			JOptionPane.showMessageDialog(null, Mensagem.sexoVazio, Titulo.cadastroCliente, 0);
			// retornar false para o m�todo
			return false;

		} else if ((tfCelular.getText().equals("(__) _____-____"))) {
			// informando o usu�rio que o celular n�o est� preenchido
			JOptionPane.showMessageDialog(null, Mensagem.celularInvalido, Titulo.cadastroCliente, 0);
			// colocando o foco no campo com erro
			tfCelular.grabFocus();
			// retornar false para o m�todo
			return false;
		} else if ((tfRg.getText().equals("__.___.___-_"))) {
			// informando o usu�rio que o RG n�o est� preenchido
			JOptionPane.showMessageDialog(null, Mensagem.rgInvalido, Titulo.cadastroCliente, 0);
			// colocando o foco no campo com erro
			tfRg.grabFocus();
			// retornar false para o m�todo
			return false;
		} else if ((tfCpf.getText().equals("___.___.___-__"))) {
			// informando o usu�rio que o CPF n�o est� preenchido
			JOptionPane.showMessageDialog(null, Mensagem.cpfInvalido, Titulo.cadastroCliente, 0);
			// colocando o foco no campo com erro
			tfCpf.grabFocus();
			// retornar false para o m�todo
			return false;
		} else if (Valida.isEmptyOrNull(tfIdade.getText())) {
			// informando o usu�rio que a idade n�o est� preenchida
			JOptionPane.showMessageDialog(null, Mensagem.idadeVazio, Titulo.cadastroCliente, 0);
			// colocando o foco no campo com erro
			tfIdade.grabFocus();
			// retornar false para o m�todo
			return false;
		} else if (!Valida.isInteger(tfIdade.getText())) {
			// informando ao usu�rio que a idade � inv�lida
			JOptionPane.showMessageDialog(null, Mensagem.idadeInvalida, Titulo.cadastroCliente, 0);
			// colocando o foco no campo de erro
			tfIdade.grabFocus();
			// retornar false para o m�todo
			return false;
		} else if (Valida.isEmptyOrNull(tfEmail.getText())) {
			// informando o usu�rio que o email n�o est� preenchido
			JOptionPane.showMessageDialog(null, Mensagem.emailInvalido, Titulo.cadastroCliente, 0);
			// colocando o foco no campo com erro
			tfEmail.grabFocus();
			// retornar false para o m�todo
			return false;
		} else if ((tfDataNasc.getText().equals("  /  /    "))) {
			// informando o usu�rio que a data de nascimento n�o est� preenchida
			JOptionPane.showMessageDialog(null, Mensagem.dataNascInvalido, Titulo.cadastroCliente, 0);
			// colocando o foco no campo com erro
			tfDataNasc.grabFocus();
			// retornar false para o m�todo
			return false;
		} else if (Valida.isEmptyOrNull(tfTipoLogradouro.getText())) {
			// informando o usu�rio que o tipo do logradouro n�o est� preenchido
			JOptionPane.showMessageDialog(null, Mensagem.tipoLogradouroVazio, Titulo.cadastroCliente, 0);
			// colocando o foco no campo com erro
			tfTipoLogradouro.grabFocus();
			// retornar false para o m�todo
			return false;
		} else if (Valida.isEmptyOrNull(tfNomeLogradouro.getText())) {
			// informando o usu�rio que o logradouro n�o est� preenchido
			JOptionPane.showMessageDialog(null, Mensagem.enderecoVazio, Titulo.cadastroCliente, 0);
			// colocando o foco no campo com erro
			tfNomeLogradouro.grabFocus();
			// retornar false para o m�todo
			return false;
		} else if (Valida.isEmptyOrNull(tfNumero.getText())) {
			// informando o usu�rio que o tipo do logradouro n�o est� preenchido
			JOptionPane.showMessageDialog(null, Mensagem.numeroEnderecoVazio, Titulo.cadastroCliente, 0);
			// colocando o foco no campo com erro
			tfNumero.grabFocus();
			// retornar false para o m�todo
			return false;
		} else if (Valida.isEmptyOrNull(tfBairro.getText())) {
			// informando o usu�rio que o bairro n�o est� preenchido
			JOptionPane.showMessageDialog(null, Mensagem.bairroVazio, Titulo.cadastroCliente, 0);
			// colocando o foco no campo com erro
			tfBairro.grabFocus();
			// retornar false para o m�todo
			return false;
		} else if (Valida.isEmptyOrNull(tfCidade.getText())) {
			// informando o usu�rio que a cidade n�o est� preenchida
			JOptionPane.showMessageDialog(null, Mensagem.cidadeVazio, Titulo.cadastroCliente, 0);
			// colocando o foco no campo com erro
			tfCidade.grabFocus();
			// retornar false para o m�todo
			return false;
		} else if (cbxEstados.getSelectedIndex() == 0) {
			// informando o usu�rio que o estado n�o foi selecionado
			JOptionPane.showMessageDialog(null, Mensagem.estadoVazio, Titulo.cadastroCliente, 0);
			// colocando o foco no campo com erro
			cbxEstados.grabFocus();
			// retornar false para o m�todo
			return false;
		} else if (Valida.isEmptyOrNull(tfCep.getText())) {
			// informando o usu�rio que o CEP n�o est� preenchido
			JOptionPane.showMessageDialog(null, Mensagem.cepVazio, Titulo.cadastroCliente, 0);
			// colocando o foco no campo com erro
			tfCep.grabFocus();
			// retornar false para o m�todo
			return false;
		}
		// devolvendo true caso esteja tudo v�lido
		return true;
	}// fim do m�todo validar

	/*
	 * m�todo para valorizar um objeto cliente utilizando os campos da tela
	 */
	private Cliente getCliente() {
		// instanciando o objeto cliente para retorno do m�todo
		Cliente cliente = new Cliente();

		// valorizando o objeto cliente
		cliente.setCodigo(Util.getInt(tfCodigo.getText()));
		cliente.setNome(tfNome.getText());
		cliente.setEndereco(getEndereco());
		cliente.setCpf(tfCpf.getText());
		cliente.setRg(tfRg.getText());
		cliente.setDataNascimento(dataNasc());
		cliente.setIdade(Util.getInt(tfIdade.getText()));
		// condicional tern�ria - if em uma linha -> ? se -> : sen�o
		cliente.setSexo((rbSexoMasculino.isSelected()) ? 'M' : 'F');
		cliente.setTelefone(tfTelefone.getText());
		cliente.setCelular(tfCelular.getText());
		cliente.setEmail(tfEmail.getText());

		// retornando o objeto valorizado
		return cliente;

	}// fim do m�todo getCliente

	/*
	 * M�todo para para valorizar a classe endere�o
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
	 * m�todo para armazenar a data de nascimento do cliente na classe Data
	 */
	private Data dataNasc() {
		Data data = new Data();
		String[] armazenaData = (tfDataNasc.getText().split("/"));

		data.setDia((Integer.parseInt(armazenaData[0])));
		data.setMes((Integer.parseInt(armazenaData[1])));
		data.setAno((Integer.parseInt(armazenaData[2])));
		return data;

	}// fim do m�todo

}// fim da classe
