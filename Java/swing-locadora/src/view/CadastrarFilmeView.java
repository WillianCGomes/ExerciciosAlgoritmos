package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// importações de pacotes
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import controller.FilmeController;
import model.Filme;
import util.Mensagem;
import util.Titulo;
import util.Util;
import util.Valida;

/**
 * Classe responsável por gerar a view de cadastro de filmes
 * 
 * @author Willian Carlos Gomes
 * @since 4 de mar. de 2021
 * @version 1.0
 */
public class CadastrarFilmeView {
	// componente JCheckbox que permite a seleção de mais de uma opção
	private JCheckBox cbAcao;
	private JCheckBox cbFiccao;
	private JCheckBox cbTerror;
	private JCheckBox cbComedia;
	private JCheckBox cbOutro;

	// componente JRadioButton que permite a seleção de apenas uma opção
	private JRadioButton rbDisponivelSim;
	private JRadioButton rbDisponivelNao;
	private JRadioButton rbPromocaoSim;
	private JRadioButton rbPromocaoNao;

	// componente ButtonGroup responsável por gerenciar os componentes radio button
	private ButtonGroup grpDisponivel;
	private ButtonGroup grpPromocao;

	// Painel para organizar os componentes
	private JPanel painel;

	// Labels
	private JLabel lbCodigo;
	private JLabel lbNome;
	private JLabel lbValor;
	private JLabel lbDisponivel;
	private JLabel lbPromocao;
	private JLabel lbVpromocao;
	private JLabel lbGenero;

	// Campos de texto
	private JTextField tfCodigo;
	private JTextField tfNome;
	private JTextField tfValor;
	private JTextField tfVpromocao;

	//Botões da tela de cadastro
	private JButton btSalvar;
	private JButton btCancelar;
	private JButton btNovo;
	private JButton btSair;

	// Método responsável por criar a tela e adicionar seus componentes
	public void iniciaGui() {

		/*
		 * Definindo a tela e suas configurações
		 */

		JFrame janela = new JFrame();

		// Configurando o título da tela
		janela.setTitle("CADASTRO DE FILME");

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
		lbValor = new JLabel();
		lbDisponivel = new JLabel();
		lbPromocao = new JLabel();
		lbVpromocao = new JLabel();
		lbGenero = new JLabel();
		// Configurando o texto a ser exibido na label
		lbCodigo.setText("Código:");
		lbNome.setText("Nome:");
		lbValor.setText("Valor:");
		lbDisponivel.setText("Disponível:");
		lbPromocao.setText("Promoção:");
		lbVpromocao.setText("Valor Promoção:");
		lbGenero.setText("Gênero:");

		// Configurando os tamanhos e locais das labels
		lbCodigo.setBounds(15, 15, 100, 20);
		lbNome.setBounds(15, 45, 100, 20);
		lbValor.setBounds(15, 75, 100, 20);
		lbDisponivel.setBounds(15, 105, 100, 20);
		lbPromocao.setBounds(15, 135, 100, 20);
		lbVpromocao.setBounds(15, 165, 100, 20);
		lbGenero.setBounds(15, 195, 100, 20);

		/*
		 * Definindo os campos de texto
		 */
		tfCodigo = new JTextField();
		tfNome = new JTextField();
		tfValor = new JTextField();
		tfVpromocao = new JTextField();
		// Configurando o tamanho e local do campo de texto
		tfCodigo.setBounds(120, 15, 420, 20);
		tfNome.setBounds(120, 45, 420, 20);
		tfValor.setBounds(120, 75, 420, 20);
		tfVpromocao.setBounds(120, 165, 420, 20);

		/*
		 * configurações dos radio buttons
		 */
		rbDisponivelSim = new JRadioButton();
		rbDisponivelNao = new JRadioButton();
		rbPromocaoSim = new JRadioButton();
		rbPromocaoNao = new JRadioButton();

		// configurando o texto do componente
		rbDisponivelSim.setText("Sim");
		rbDisponivelNao.setText("Não");
		rbPromocaoSim.setText("Sim");
		rbPromocaoNao.setText("Não");

		// configurando a posição e tamanho
		rbDisponivelSim.setBounds(118, 105, 50, 25);
		rbDisponivelNao.setBounds(178, 105, 50, 25);
		rbPromocaoSim.setBounds(118, 135, 50, 25);
		rbPromocaoNao.setBounds(178, 135, 50, 25);

		/*
		 * configurações do ButtonGroup
		 */
		grpDisponivel = new ButtonGroup();
		grpPromocao = new ButtonGroup();
		grpDisponivel.add(rbDisponivelSim);
		grpDisponivel.add(rbDisponivelNao);
		grpPromocao.add(rbPromocaoSim);
		grpPromocao.add(rbPromocaoNao);

		/*
		 * configurações do JCheckBox
		 */
		cbAcao = new JCheckBox();
		cbFiccao = new JCheckBox();
		cbTerror = new JCheckBox();
		cbComedia = new JCheckBox();
		cbOutro = new JCheckBox();
		// configurando o texto exibido nos componentes do JCheckBox
		cbAcao.setText("Ação");
		cbFiccao.setText("Ficção");
		cbTerror.setText("Terror");
		cbComedia.setText("Comédia");
		cbOutro.setText("Outro");
		// configurando a posição e tamanho dos componentes do JCheckBox
		cbAcao.setBounds(118, 195, 70, 20);
		cbFiccao.setBounds(188, 195, 70, 20);
		cbTerror.setBounds(268, 195, 70, 20);
		cbComedia.setBounds(348, 195, 75, 20);
		cbOutro.setBounds(428, 195, 70, 20);

		/*
		 * definindo os botões e suas configurações
		 */
		btSalvar = new JButton();
		btCancelar = new JButton();
		btNovo = new JButton();
		btSair = new JButton();

		// Configurando o texto dos botões
		btSalvar.setText("Salvar");
		btCancelar.setText("Cancelar");
		btNovo.setText("Novo");
		btSair.setText("Sair");
		// Configurando o tamanho e local dos botões
		btSalvar.setBounds(130, 250, 140, 30);
		btCancelar.setBounds(300, 250, 140, 30);
		btNovo.setBounds(130, 250, 140, 30);
		btSair.setBounds(300, 250, 140, 30);

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
		painel.add(lbValor);
		painel.add(lbDisponivel);
		painel.add(lbPromocao);
		painel.add(lbVpromocao);
		painel.add(lbGenero);

		// Adicionando os campos de preenchimento
		painel.add(tfCodigo);
		painel.add(tfNome);
		painel.add(tfValor);
		painel.add(tfVpromocao);

		// Adicionando os RadioButtons
		painel.add(rbDisponivelSim);
		painel.add(rbDisponivelNao);
		painel.add(rbPromocaoSim);
		painel.add(rbPromocaoNao);

		// Adicionando os JCheckBoxes
		painel.add(cbAcao);
		painel.add(cbFiccao);
		painel.add(cbTerror);
		painel.add(cbComedia);
		painel.add(cbOutro);

		// Adicionando os botões de salvar e cancelar
		painel.add(btSalvar);
		painel.add(btCancelar);
		painel.add(btSair);
		painel.add(btNovo);

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
		tfValor.setEditable(false);
		tfVpromocao.setEditable(false);
		rbDisponivelNao.setEnabled(false);
		rbDisponivelSim.setEnabled(false);
		rbPromocaoNao.setEnabled(false);
		rbPromocaoSim.setEnabled(false);
		cbAcao.setEnabled(false);
		cbFiccao.setEnabled(false);
		cbTerror.setEnabled(false);
		cbComedia.setEnabled(false);
		cbOutro.setEnabled(false);
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
		tfValor.setEditable(true);
		tfVpromocao.setEditable(true);
		rbDisponivelNao.setEnabled(true);
		rbDisponivelSim.setEnabled(true);
		rbPromocaoNao.setEnabled(true);
		rbPromocaoSim.setEnabled(true);
		cbAcao.setEnabled(true);
		cbFiccao.setEnabled(true);
		cbTerror.setEnabled(true);
		cbComedia.setEnabled(true);
		cbOutro.setEnabled(true);
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
		tfValor.setText(null);
		tfVpromocao.setText(null);
		grpDisponivel.clearSelection();
		grpPromocao.clearSelection();
		cbAcao.setSelected(false);
		cbFiccao.setSelected(false);
		cbTerror.setSelected(false);
		cbComedia.setSelected(false);
		cbOutro.setSelected(false);
	}// fim do método

	/*
	 * Método para receeber ação do clique salvar
	 */
	public void salvar() {
		// Salvar o filme apenas se estiver válido todos os dados
		if (validar()) {

			/*
			 * Procedimentos de gravação do objeto filme no arquivo TXT
			 */

			Filme filme = getFilme();

			// Chamando o método responsável por gravar o arquivo TXT
			new FilmeController().gravarTxtFilme(filme);

			// Limpar a tela preenchida
			limparTela();

			// Bloquear a tela
			bloquearTela();

			// Exibindo mensagem de sucesso para o usuário
			JOptionPane.showMessageDialog(null, Mensagem.filmeGravado, Titulo.cadastroFilme, 1);
		}
	}

	/*
	 * método para validar os campos da tela
	 */
	private boolean validar() {

		// Validação do campo código
		if (Valida.isEmptyOrNull(tfCodigo.getText())) {
			// Informando o usuário que o código não está preenchido
			JOptionPane.showMessageDialog(null, Mensagem.codigoVazio, Titulo.cadastroFilme, 0);
			// Colocando o foco no campo com erro
			tfCodigo.grabFocus();
			// Retornando false para o método
			return false;
		} else if (!Valida.isInteger(tfCodigo.getText())) {
			// Informando ao usuário que o código é inválido
			JOptionPane.showMessageDialog(null, Mensagem.codigoInvalido, Titulo.cadastroFilme, 0);
			// Colocando o foco no campo com erro
			tfCodigo.grabFocus();
			// Retornando false para o método
			return false;

		}

		// Validação do campo nome
		if (Valida.isEmptyOrNull(tfNome.getText())) {
			// Informando o usuário que o nome não está preenchido
			JOptionPane.showMessageDialog(null, Mensagem.nomeVazio, Titulo.cadastroFilme, 0);
			// Colocando o foco no campo com erro
			tfNome.grabFocus();
			// Retornando false para o método
			return false;
		}

		// Validação do campo valor
		if (!Valida.isDouble(tfValor.getText())) {
			// Informando o usuário que o valor não está preenchida
			JOptionPane.showMessageDialog(null, Mensagem.valorVazio, Titulo.cadastroFilme, 0);
			// Colocando o foco no campo com erro
			tfValor.grabFocus();
			// Retornando false para o método
			return false;
		}

		// Validação do radio button de disponivel
		if (!rbDisponivelSim.isSelected()) {
			if (!rbDisponivelNao.isSelected()) {
				// Informando o usuário que a disponibilidade do filme não está selecionado
				JOptionPane.showMessageDialog(null, Mensagem.disponiveliVazio, Titulo.cadastroFilme, 0);
				// Retornando false para o método
				return false;
			}

		}

		// Validação do radio button de promocao
		if (!rbPromocaoSim.isSelected()) {
			if (!rbPromocaoNao.isSelected()) {
				// Informando o usuário que a promoção do filme não está selecionado
				JOptionPane.showMessageDialog(null, Mensagem.promocaoVazio, Titulo.cadastroFilme, 0);
				// Retornando false para o método
				return false;
			}

		}
		// Validação do preenchimento do campo de promoção
		if (rbPromocaoSim.isSelected() && (!Valida.isDouble(tfVpromocao.getText()))) {
			// Informando o usuário que o valor da promoção não está preenchida
			JOptionPane.showMessageDialog(null, Mensagem.valorPromocaoVazio, Titulo.cadastroFilme, 0);
			// Colocando o foco no campo com erro
			tfVpromocao.grabFocus();
			// Retornando false para o método
			return false;
		}
		
		// Validação do preenchimento do campo de promoção
				if (rbPromocaoNao.isSelected() && (Valida.isDouble(tfVpromocao.getText()))) {
					// Informando o usuário que o valor da promoção não está preenchida
					JOptionPane.showMessageDialog(null, Mensagem.valorPromocaoPreenchido, Titulo.cadastroFilme, 0);
					// Colocando o foco no campo com erro
					tfVpromocao.grabFocus();
					// Retornando false para o método
					return false;
				}
	
		// Validação do preenchimento do campo de promoção
				if (rbPromocaoNao.isSelected() && (Valida.isDouble(tfVpromocao.getText()))) {
					// Informando o usuário que o valor da promoção não está preenchida
					JOptionPane.showMessageDialog(null, Mensagem.valorPromocaoVazio, Titulo.cadastroFilme, 0);
					// Colocando o foco no campo com erro
					tfVpromocao.grabFocus();
					// Retornando false para o método
					return false;
				}

		// Validação da comboBox de genero
		if (!cbAcao.isSelected() && !cbComedia.isSelected() && !cbFiccao.isSelected() && !cbOutro.isSelected()
				&& !cbTerror.isSelected()) {
			// Informando o usuário que o gênero não está selecionado
			JOptionPane.showMessageDialog(null, Mensagem.generoVazio, Titulo.cadastroFilme, 0);
			// Retornando false para o método
			return false;
		}

		// Devolvendo true caso esteja tudo válido
		return true;

	} // Fim do método validar

	/*
	 * Método para valorizar um objeto filme utilizando os campos da tela
	 */
	private Filme getFilme() {

		// Instanciando o objeto filme para o retorno do método
		Filme filme = new Filme();

		// Valorizando o objeto filme
		filme.setCodigo(Util.getInt(tfCodigo.getText()));
		filme.setNome(tfNome.getText());
		filme.setValor(Util.getDouble(tfValor.getText()));
		
		if (tfVpromocao.getText() != null && rbPromocaoNao.isSelected()) {
            filme.setValorPromocao(Util.getDouble("0"));;
        } else {
            filme.setValorPromocao(Util.getDouble(tfVpromocao.getText()));
        }
		
		
		// Condicional ternária - if em uma linha -> ? se -> : senão
		filme.setDisponivel((rbDisponivelSim.isSelected()) ? true : false);
		filme.setPromocao((rbPromocaoSim.isSelected()) ? true : false);

		filme.setGenero(getGenero());

		// retornando o objeto valorizado
		return filme;

	} // Fim do método getFilme

	/*
	 * Método para concatenar os gêneros ao salva no arquivo
	 */
	private String getGenero() {
		String msg = "";

		if (cbAcao.isSelected()) {
			msg += "Ação;";
		}
		if (cbComedia.isSelected()) {
			msg += "Comédia;";
		}
		if (cbFiccao.isSelected()) {
			msg += "Ficção;";
		}
		if (cbOutro.isSelected()) {
			msg += "Outro;";
		}
		if (cbTerror.isSelected()) {
			msg += "Terror;";
		}

		return msg;
	}//fim do método

}// fim da classe
