package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// importa��es de pacotes
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
 * Classe respons�vel por gerar a view de cadastro de filmes
 * 
 * @author Willian Carlos Gomes
 * @since 4 de mar. de 2021
 * @version 1.0
 */
public class CadastrarFilmeView {
	// componente JCheckbox que permite a sele��o de mais de uma op��o
	private JCheckBox cbAcao;
	private JCheckBox cbFiccao;
	private JCheckBox cbTerror;
	private JCheckBox cbComedia;
	private JCheckBox cbOutro;

	// componente JRadioButton que permite a sele��o de apenas uma op��o
	private JRadioButton rbDisponivelSim;
	private JRadioButton rbDisponivelNao;
	private JRadioButton rbPromocaoSim;
	private JRadioButton rbPromocaoNao;

	// componente ButtonGroup respons�vel por gerenciar os componentes radio button
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

	//Bot�es da tela de cadastro
	private JButton btSalvar;
	private JButton btCancelar;
	private JButton btNovo;
	private JButton btSair;

	// M�todo respons�vel por criar a tela e adicionar seus componentes
	public void iniciaGui() {

		/*
		 * Definindo a tela e suas configura��es
		 */

		JFrame janela = new JFrame();

		// Configurando o t�tulo da tela
		janela.setTitle("CADASTRO DE FILME");

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
		lbValor = new JLabel();
		lbDisponivel = new JLabel();
		lbPromocao = new JLabel();
		lbVpromocao = new JLabel();
		lbGenero = new JLabel();
		// Configurando o texto a ser exibido na label
		lbCodigo.setText("C�digo:");
		lbNome.setText("Nome:");
		lbValor.setText("Valor:");
		lbDisponivel.setText("Dispon�vel:");
		lbPromocao.setText("Promo��o:");
		lbVpromocao.setText("Valor Promo��o:");
		lbGenero.setText("G�nero:");

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
		 * configura��es dos radio buttons
		 */
		rbDisponivelSim = new JRadioButton();
		rbDisponivelNao = new JRadioButton();
		rbPromocaoSim = new JRadioButton();
		rbPromocaoNao = new JRadioButton();

		// configurando o texto do componente
		rbDisponivelSim.setText("Sim");
		rbDisponivelNao.setText("N�o");
		rbPromocaoSim.setText("Sim");
		rbPromocaoNao.setText("N�o");

		// configurando a posi��o e tamanho
		rbDisponivelSim.setBounds(118, 105, 50, 25);
		rbDisponivelNao.setBounds(178, 105, 50, 25);
		rbPromocaoSim.setBounds(118, 135, 50, 25);
		rbPromocaoNao.setBounds(178, 135, 50, 25);

		/*
		 * configura��es do ButtonGroup
		 */
		grpDisponivel = new ButtonGroup();
		grpPromocao = new ButtonGroup();
		grpDisponivel.add(rbDisponivelSim);
		grpDisponivel.add(rbDisponivelNao);
		grpPromocao.add(rbPromocaoSim);
		grpPromocao.add(rbPromocaoNao);

		/*
		 * configura��es do JCheckBox
		 */
		cbAcao = new JCheckBox();
		cbFiccao = new JCheckBox();
		cbTerror = new JCheckBox();
		cbComedia = new JCheckBox();
		cbOutro = new JCheckBox();
		// configurando o texto exibido nos componentes do JCheckBox
		cbAcao.setText("A��o");
		cbFiccao.setText("Fic��o");
		cbTerror.setText("Terror");
		cbComedia.setText("Com�dia");
		cbOutro.setText("Outro");
		// configurando a posi��o e tamanho dos componentes do JCheckBox
		cbAcao.setBounds(118, 195, 70, 20);
		cbFiccao.setBounds(188, 195, 70, 20);
		cbTerror.setBounds(268, 195, 70, 20);
		cbComedia.setBounds(348, 195, 75, 20);
		cbOutro.setBounds(428, 195, 70, 20);

		/*
		 * definindo os bot�es e suas configura��es
		 */
		btSalvar = new JButton();
		btCancelar = new JButton();
		btNovo = new JButton();
		btSair = new JButton();

		// Configurando o texto dos bot�es
		btSalvar.setText("Salvar");
		btCancelar.setText("Cancelar");
		btNovo.setText("Novo");
		btSair.setText("Sair");
		// Configurando o tamanho e local dos bot�es
		btSalvar.setBounds(130, 250, 140, 30);
		btCancelar.setBounds(300, 250, 140, 30);
		btNovo.setBounds(130, 250, 140, 30);
		btSair.setBounds(300, 250, 140, 30);

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

		// Adicionando os bot�es de salvar e cancelar
		painel.add(btSalvar);
		painel.add(btCancelar);
		painel.add(btSair);
		painel.add(btNovo);

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
	 * m�todo para liberar os campos da tela de cadastro
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
		// deixando o c�digo como primeiro campo a ser preenchido
		tfCodigo.grabFocus();

	}

	/*
	 * m�todo para limpar os campos da tela de cadastro
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
	}// fim do m�todo

	/*
	 * M�todo para receeber a��o do clique salvar
	 */
	public void salvar() {
		// Salvar o filme apenas se estiver v�lido todos os dados
		if (validar()) {

			/*
			 * Procedimentos de grava��o do objeto filme no arquivo TXT
			 */

			Filme filme = getFilme();

			// Chamando o m�todo respons�vel por gravar o arquivo TXT
			new FilmeController().gravarTxtFilme(filme);

			// Limpar a tela preenchida
			limparTela();

			// Bloquear a tela
			bloquearTela();

			// Exibindo mensagem de sucesso para o usu�rio
			JOptionPane.showMessageDialog(null, Mensagem.filmeGravado, Titulo.cadastroFilme, 1);
		}
	}

	/*
	 * m�todo para validar os campos da tela
	 */
	private boolean validar() {

		// Valida��o do campo c�digo
		if (Valida.isEmptyOrNull(tfCodigo.getText())) {
			// Informando o usu�rio que o c�digo n�o est� preenchido
			JOptionPane.showMessageDialog(null, Mensagem.codigoVazio, Titulo.cadastroFilme, 0);
			// Colocando o foco no campo com erro
			tfCodigo.grabFocus();
			// Retornando false para o m�todo
			return false;
		} else if (!Valida.isInteger(tfCodigo.getText())) {
			// Informando ao usu�rio que o c�digo � inv�lido
			JOptionPane.showMessageDialog(null, Mensagem.codigoInvalido, Titulo.cadastroFilme, 0);
			// Colocando o foco no campo com erro
			tfCodigo.grabFocus();
			// Retornando false para o m�todo
			return false;

		}

		// Valida��o do campo nome
		if (Valida.isEmptyOrNull(tfNome.getText())) {
			// Informando o usu�rio que o nome n�o est� preenchido
			JOptionPane.showMessageDialog(null, Mensagem.nomeVazio, Titulo.cadastroFilme, 0);
			// Colocando o foco no campo com erro
			tfNome.grabFocus();
			// Retornando false para o m�todo
			return false;
		}

		// Valida��o do campo valor
		if (!Valida.isDouble(tfValor.getText())) {
			// Informando o usu�rio que o valor n�o est� preenchida
			JOptionPane.showMessageDialog(null, Mensagem.valorVazio, Titulo.cadastroFilme, 0);
			// Colocando o foco no campo com erro
			tfValor.grabFocus();
			// Retornando false para o m�todo
			return false;
		}

		// Valida��o do radio button de disponivel
		if (!rbDisponivelSim.isSelected()) {
			if (!rbDisponivelNao.isSelected()) {
				// Informando o usu�rio que a disponibilidade do filme n�o est� selecionado
				JOptionPane.showMessageDialog(null, Mensagem.disponiveliVazio, Titulo.cadastroFilme, 0);
				// Retornando false para o m�todo
				return false;
			}

		}

		// Valida��o do radio button de promocao
		if (!rbPromocaoSim.isSelected()) {
			if (!rbPromocaoNao.isSelected()) {
				// Informando o usu�rio que a promo��o do filme n�o est� selecionado
				JOptionPane.showMessageDialog(null, Mensagem.promocaoVazio, Titulo.cadastroFilme, 0);
				// Retornando false para o m�todo
				return false;
			}

		}
		// Valida��o do preenchimento do campo de promo��o
		if (rbPromocaoSim.isSelected() && (!Valida.isDouble(tfVpromocao.getText()))) {
			// Informando o usu�rio que o valor da promo��o n�o est� preenchida
			JOptionPane.showMessageDialog(null, Mensagem.valorPromocaoVazio, Titulo.cadastroFilme, 0);
			// Colocando o foco no campo com erro
			tfVpromocao.grabFocus();
			// Retornando false para o m�todo
			return false;
		}
		
		// Valida��o do preenchimento do campo de promo��o
				if (rbPromocaoNao.isSelected() && (Valida.isDouble(tfVpromocao.getText()))) {
					// Informando o usu�rio que o valor da promo��o n�o est� preenchida
					JOptionPane.showMessageDialog(null, Mensagem.valorPromocaoPreenchido, Titulo.cadastroFilme, 0);
					// Colocando o foco no campo com erro
					tfVpromocao.grabFocus();
					// Retornando false para o m�todo
					return false;
				}
	
		// Valida��o do preenchimento do campo de promo��o
				if (rbPromocaoNao.isSelected() && (Valida.isDouble(tfVpromocao.getText()))) {
					// Informando o usu�rio que o valor da promo��o n�o est� preenchida
					JOptionPane.showMessageDialog(null, Mensagem.valorPromocaoVazio, Titulo.cadastroFilme, 0);
					// Colocando o foco no campo com erro
					tfVpromocao.grabFocus();
					// Retornando false para o m�todo
					return false;
				}

		// Valida��o da comboBox de genero
		if (!cbAcao.isSelected() && !cbComedia.isSelected() && !cbFiccao.isSelected() && !cbOutro.isSelected()
				&& !cbTerror.isSelected()) {
			// Informando o usu�rio que o g�nero n�o est� selecionado
			JOptionPane.showMessageDialog(null, Mensagem.generoVazio, Titulo.cadastroFilme, 0);
			// Retornando false para o m�todo
			return false;
		}

		// Devolvendo true caso esteja tudo v�lido
		return true;

	} // Fim do m�todo validar

	/*
	 * M�todo para valorizar um objeto filme utilizando os campos da tela
	 */
	private Filme getFilme() {

		// Instanciando o objeto filme para o retorno do m�todo
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
		
		
		// Condicional tern�ria - if em uma linha -> ? se -> : sen�o
		filme.setDisponivel((rbDisponivelSim.isSelected()) ? true : false);
		filme.setPromocao((rbPromocaoSim.isSelected()) ? true : false);

		filme.setGenero(getGenero());

		// retornando o objeto valorizado
		return filme;

	} // Fim do m�todo getFilme

	/*
	 * M�todo para concatenar os g�neros ao salva no arquivo
	 */
	private String getGenero() {
		String msg = "";

		if (cbAcao.isSelected()) {
			msg += "A��o;";
		}
		if (cbComedia.isSelected()) {
			msg += "Com�dia;";
		}
		if (cbFiccao.isSelected()) {
			msg += "Fic��o;";
		}
		if (cbOutro.isSelected()) {
			msg += "Outro;";
		}
		if (cbTerror.isSelected()) {
			msg += "Terror;";
		}

		return msg;
	}//fim do m�todo

}// fim da classe
