package controller;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.Aluno;
import model.Contato;
import model.Endereco;
import model.Materia;
import model.Professor;
import model.Turma;
import util.Mensagem;
import util.Rotulo;
import util.Valida;

/**
 * Classe responsavel por controlar o sistema de gerenciamento para cadastro de
 * alunos, turmas, materias e professores
 *
 * @author Willian Carlos Gomes
 * @since 23 de fev. de 2021
 */
public class GerenciaEscola {

	// declarando as listas para armazenar os conteudos do sistema(ALUNOS,
	// PROFESSORES)
	private ArrayList<Aluno> alunos;
	private ArrayList<Professor> professores;
	private ArrayList<Materia> materias;
	private ArrayList<Turma> turmas;

	// Construtor da classe
	public GerenciaEscola() {
		alunos = new ArrayList<Aluno>();
		professores = new ArrayList<Professor>();
		materias = new ArrayList<Materia>();
		turmas = new ArrayList<Turma>();

		menuPrincipal();
	}

	// método principal para criar um menu de opções
	public void menuPrincipal() {

		String menu = "INFORME A OPÇÃO DESEJADA \n\n" + "1 - CADASTRAR MATERIA\n" + "2 - CADASTRAR PROFESSOR\n"
				+ "3 - CADASTRAR ALUNO\n" + "4 - CADASTRAR TURMA\n" + "5 - LISTAR ALUNOS\n" + "6 - LISTAR PROFESSORES\n"
				+ "7 - LISTAR TURMAS\n" + "8 - CONSULTAR TURMA\n" + "9 - SAIR DO SISTEMA\n";

		// ficar repetindo menu caso seja invalida
		while (true) {
			// tentar fazer até receber uma opção valida
			try {
				int opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
				processamentoPrincipal(opcao);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, Mensagem.opcaoInvalida, Rotulo.sistemaEscola, 0);
			}
		}
	}

	// método de procesamento principal
	public void processamentoPrincipal(int opcao) {
		// caso de escolhas
		switch (opcao) {
		case 1:
			cadastrarMateria();
			break;
		case 2:
			cadastrarProfessor();
			break;
		case 3:
			cadastrarAluno();
			break;
		case 4:
			cadastrarTurma();
			break;
		case 5:
			listarAlunos();
			break;
		case 6:
			listarProfessores();
			break;
		case 7:
			listarTurmas();
			break;
		case 8:
			consultarTurma();
			break;
		case 9:
			sairDoSistema();
			break;
		default:
			JOptionPane.showMessageDialog(null, Mensagem.opcaoInvalida, Rotulo.sistemaEscola, 0);
			break;
		}
	}

	// método para cadastrar materia
	public void cadastrarMateria() {
		// adicionando materias ao ArrayList
		materias.add(getMateria());
		JOptionPane.showMessageDialog(null, Mensagem.materiaCadastrada, Rotulo.cadastroMateria, 1);
	}

	// método para cadastrar professor
	public void cadastrarProfessor() {
		// Se não houver materia não pode adicionar professor
		if (materias.size() > 0) {
			professores.add(getProfessor());
			JOptionPane.showMessageDialog(null, Mensagem.professorCadastrado, Rotulo.cadastroProfessor, 1);
		} else {
			JOptionPane.showMessageDialog(null, Mensagem.erroCadastroProfessor, Rotulo.cadastroProfessor, 2);
		}
	}

	// método para cadastar aluno
	public void cadastrarAluno() {
		// adicionar aluno ao ArrayList
		alunos.add(getAluno());
		JOptionPane.showMessageDialog(null, Mensagem.alunoCadastrado, Rotulo.cadastroAluno, 1);
	}

	// método para cadastrar turma
	public void cadastrarTurma() {
		if (materias.size() > 0 && professores.size() > 0) {
			turmas.add(getTurma());
			JOptionPane.showMessageDialog(null, Mensagem.turmaCadastrada, Rotulo.cadastroTurma, 1);
		} else {
			JOptionPane.showMessageDialog(null, Mensagem.erroCadastroTurma, Rotulo.cadastroTurma, 2);
		}

	}

	private Turma getTurma() {
		// atributos e objetos de turma
		Turma turma = new Turma();

		// adicionando o codigo e ano da turma
		turma.setAno(getAno());
		turma.setCodigo(getCodigoTurma());

		// atribuindo professor e materia a turma
		turma.setProfessor(getProfessorTurma());
		turma.setMateria(getMateriaTurma());
		turma.setAlunos(getAlunosTurma());

		return turma;
	}

	// métodos para listar alunos cadastrados
	public void listarAlunos() {
		// variaveis auxiliares
		String mensagem = "Alunos cadastrados\n";
		boolean existe = false;

		// percorrendo o ArrayList aluno
		for (Aluno aluno : alunos) {
			existe = true;
			mensagem += "\nCódigo: " + aluno.getCodigo() + " - " + aluno.getNome();
		}

		// caso exista aluno no ArrayList exibir se não erro
		if (existe) {
			JOptionPane.showMessageDialog(null, mensagem, Rotulo.cadastroAluno, 1);
		} else {
			JOptionPane.showMessageDialog(null, Mensagem.alunosVazio, Rotulo.cadastroAluno, 2);
		}
	}

	// métodos para listar professores cadastrados
	public void listarProfessores() {
		// variaveis auxiliares
		String mensagem = "Professores cadastrados\n";
		boolean existe = false;

		// percorrer ArrayList professor
		for (Professor professor : professores) {
			existe = true;
			mensagem += "\nCódigo: " + professor.getCodigo() + " - " + professor.getNome();
		}

		// caso exista professor exibirse não erro
		if (existe) {
			JOptionPane.showMessageDialog(null, mensagem, Rotulo.cadastroProfessor, 1);
		} else {
			JOptionPane.showMessageDialog(null, Mensagem.professoresVazio, Rotulo.cadastroProfessor, 2);
		}
	}

	// métodos para listar professoress cadastrados
	public void listarTurmas() {
		// variaveis auxiliares
		String mensagem = "Turmas cadastradas\n";
		boolean existe = false;

		// percorrer ArrayList Turma
		for (Turma turma : turmas) {
			existe = true;
			mensagem += "\nCódigo: " + turma.getCodigo() + " - " + turma.getAno() + " - "
					+ turma.getMateria().getNome();
		}

		// caso exista aluno no ArrayList exibir se não erro
		if (existe) {
			JOptionPane.showMessageDialog(null, mensagem, Rotulo.cadastroTurma, 1);
		} else {
			JOptionPane.showMessageDialog(null, Mensagem.turmasVazio, Rotulo.cadastroProfessor, 2);
		}
	}

	// métodos para consultar turma especifica
	public void consultarTurma() {
		Turma turma = getConsultarTurma();
		String menssagem = "Detalhes da turma\n";

		menssagem += "\nCódigo: " + turma.getCodigo();
		menssagem += "\nAno: " + turma.getAno();
		menssagem += "\nProfessor: " + turma.getProfessor().getNome();
		menssagem += "\nMáteria: " + turma.getMateria().getNome();
		menssagem += "\nAlunos Matriculados: ";

		for (Aluno aluno : turma.getAlunos()) {
			menssagem += "\nCódigo: " + aluno.getCodigo() + " - " + aluno.getNome();
		}

		JOptionPane.showMessageDialog(null, menssagem, Rotulo.consultaTurma, getAno());
	}

	// método para sair do sistema
	public void sairDoSistema() {

		// variavel para encerrar o sistema com sim ou não
		int opcao = JOptionPane.showConfirmDialog(null, "Encerrar o sistema?", "Atenção", JOptionPane.YES_OPTION,
				JOptionPane.NO_OPTION);

		// se sim, sai do sistema
		if (opcao == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}

	// metodo para retornar os atributos (valores) do aluno
	public Aluno getAluno() {
		Aluno aluno = new Aluno();
		Endereco endereco = new Endereco();
		Contato contato = new Contato();

		// set atributos do aluno
		aluno.setCodigo(getCodigoAluno());
		aluno.setNome(getNomeAluno());
		aluno.setCpf(getCpfAluno());
		aluno.setRg(getRgAluno());

		// set atributos do endereço
		endereco.setLogradouro(getLogradouro());
		endereco.setNome(getNomeLogradouro());
		endereco.setNumero(getNumero());
		endereco.setComplemento(getComplemento());
		endereco.setBairro(getBairro());
		endereco.setCidade(getCidade());
		endereco.setEstado(getEstado());
		endereco.setCep(getCep());

		// set atributos do contato
		contato.setCelular(getCelular());
		contato.setEmail(getEmail());

		// atribuindo endereço ao aluno e contato ao aluno
		aluno.setEndereco(endereco);
		aluno.setContato(contato);
		return aluno;
	}

	// metodo para retornar os atributos (valores) do professor
	private Professor getProfessor() {
		// atributos para cadastrar o professor
		Professor professor = new Professor();
		Endereco endereco = new Endereco();
		Contato contato = new Contato();

		// atributos do professor
		professor.setCodigo(getCodigoProfessor());
		professor.setNome(getNomeProfessor());
		professor.setCpf(getCpfProfessor());
		professor.setRg(getRgProfessor());
		professor.setListaMaterias(getMaterias());
		professor.setSalario(getSalario());

		// atributos do endereço
		endereco.setLogradouro(getLogradouro());
		endereco.setNome(getNomeLogradouro());
		endereco.setNumero(getNumero());
		endereco.setComplemento(getComplemento());
		endereco.setBairro(getBairro());
		endereco.setCidade(getCidade());
		endereco.setEstado(getEstado());
		endereco.setCep(getCep());

		// atributos do contato
		contato.setCelular(getCelular());
		contato.setEmail(getEmail());

		// atribuindo endereço e contato ao professor
		professor.setEndereco(endereco);
		professor.setContato(contato);
		return professor;
	}

	private Materia getMateria() {
		// atributos para cadastrar materia
		Materia materia = new Materia();

		// atribuindo valores da materia
		materia.setCodigo(getCodigoMateria());
		materia.setNome(getNomeMateria());

		return materia;
	}

	private int getCodigoMateria() {
		// variaveis auxiliares
		boolean execute = true;
		int codigo = 0;

		// enquanto o codigo for verdadeiro executa a mensagem e valida o codigo da
		// materia
		while (execute) {
			try {
				codigo = Integer.parseInt(JOptionPane.showInputDialog(Mensagem.informeCodigo));
				if (Valida.isIntZero(codigo)) {
					JOptionPane.showMessageDialog(null, Mensagem.codigoVazio, Rotulo.cadastroMateria, 0);
				} else {
					execute = false;
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, Mensagem.codigoInvalido, Rotulo.cadastroMateria, 0);
				execute = true;
			}
		}
		return codigo;
	}

	private String getNomeMateria() {
		// variaveis auxiliares
		boolean execute = true;
		String nome = "";

		// enquanto o codigo for verdadeiro executa a mensagem e valida o nome da
		// materia
		while (execute) {
			nome = JOptionPane.showInputDialog(Mensagem.informeNome);
			if (Valida.isEmptyOrNull(nome)) {
				JOptionPane.showMessageDialog(null, Mensagem.nomeInvalido, Rotulo.cadastroMateria, 0);
				execute = true;
			} else {
				execute = false;
			}
		}
		return nome;
	}

	private int getCodigoAluno() {
		// variaveis auxiliares
		boolean execute = true;
		int codigo = 0;

		// enquanto o codigo for verdadeiro executa a mensagem e valida o codigo do
		// aluno
		while (execute) {
			try {
				codigo = Integer.parseInt(JOptionPane.showInputDialog(Mensagem.informeCodigo));
				if (Valida.isIntZero(codigo)) {
					JOptionPane.showMessageDialog(null, Mensagem.codigoVazio, Rotulo.cadastroAluno, 0);
				} else {
					execute = false;
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, Mensagem.codigoInvalido, Rotulo.cadastroAluno, 0);
				execute = true;
			}
		}
		return codigo;
	}

	private String getNomeAluno() {
		// variaveis auxiliares
		boolean execute = true;
		String nome = "";

		// enquanto o codigo for verdadeiro executa a mensagem e valida o nome do aluno
		while (execute) {
			nome = JOptionPane.showInputDialog(Mensagem.informeNome);
			if (Valida.isEmptyOrNull(nome)) {
				JOptionPane.showMessageDialog(null, Mensagem.nomeInvalido, Rotulo.cadastroAluno, 0);
				execute = true;
			} else {
				execute = false;
			}
		}
		return nome;
	}

	private String getCpfAluno() {
		// variaveis auxiliares
		boolean execute = true;
		String cpf = "";

		// enquanto o codigo for verdadeiro executa a mensagem e valida o cpf do aluno
		while (execute) {
			cpf = JOptionPane.showInputDialog(Mensagem.informeCpf);
			if (Valida.isEmptyOrNull(cpf)) {
				JOptionPane.showMessageDialog(null, Mensagem.cpfVazio, Rotulo.cadastroAluno, 0);
				execute = true;
			} else {
				execute = false;
			}
		}
		return cpf;
	}

	private String getRgAluno() {
		// variaveis auxiliares
		boolean execute = true;
		String rg = "";

		// enquanto o codigo for verdadeiro executa a mensagem e valida o rg do aluno
		while (execute) {
			rg = JOptionPane.showInputDialog(Mensagem.informeRg);
			if (Valida.isEmptyOrNull(rg)) {
				JOptionPane.showMessageDialog(null, Mensagem.rgVazio, Rotulo.cadastroAluno, 0);
				execute = true;
			} else {
				execute = false;
			}
		}
		return rg;
	}

	private String getLogradouro() {
		// variaveis auxiliares
		boolean execute = true;
		String logradouro = "";

		// enquanto o codigo for verdadeiro executa a mensagem e valida o logradouro
		while (execute) {
			logradouro = JOptionPane.showInputDialog(Mensagem.informeLogradouro);
			if (Valida.isEmptyOrNull(logradouro)) {
				JOptionPane.showMessageDialog(null, Mensagem.logradouroVazio, Rotulo.cadastroEndereco, 0);
				execute = true;
			} else {
				execute = false;
			}
		}
		return logradouro;
	}

	private String getNomeLogradouro() {
		// variaveis auxiliares
		boolean execute = true;
		String nomeLogradouro = "";

		// enquanto o codigo for verdadeiro executa a mensagem e valida o nome do
		// logradouro
		while (execute) {
			nomeLogradouro = JOptionPane.showInputDialog(Mensagem.informeNomeLogradouro);
			if (Valida.isEmptyOrNull(nomeLogradouro)) {
				JOptionPane.showMessageDialog(null, Mensagem.nomeLogradouroVazio, Rotulo.cadastroEndereco, 0);
				execute = true;
			} else {
				execute = false;
			}
		}
		return nomeLogradouro;
	}

	private int getNumero() {
		// variaveis auxiliares
		boolean execute = true;
		int numero = 0;

		// enquanto o codigo for verdadeiro executa a mensagem e valida o numero do
		// logradouro
		while (execute) {
			try {
				numero = Integer.parseInt(JOptionPane.showInputDialog(Mensagem.informeNumero));

				if (Valida.isIntZero(numero)) {
					JOptionPane.showMessageDialog(null, Mensagem.numeroVazio, Rotulo.cadastroEndereco, 0);
					execute = true;
				} else {
					execute = false;
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, Mensagem.numeroInvalido, Rotulo.cadastroEndereco, 0);
				execute = true;
			}

		}
		return numero;
	}

	private String getComplemento() {
		// recebe o rotulo, não é obrigatorio
		String complemento = "";
		complemento = JOptionPane.showInputDialog(Mensagem.informeComplemento);
		return complemento;
	}

	private String getBairro() {
		// variaveis auxiliares
		boolean execute = true;
		String bairro = "";

		// enquanto o codigo for verdadeiro executa a mensagem e valida o bairro do
		// logradouro
		while (execute) {
			bairro = JOptionPane.showInputDialog(Mensagem.informeBairro);
			if (Valida.isEmptyOrNull(bairro)) {
				JOptionPane.showMessageDialog(null, Mensagem.bairroVazio, Rotulo.cadastroEndereco, 0);
				execute = true;
			} else {
				execute = false;
			}
		}
		return bairro;
	}

	private String getCidade() {
		// variaveis auxiliares
		boolean execute = true;
		String cidade = "";

		// enquanto o codigo for verdadeiro executa a mensagem e valida a cidade do
		// logradouro
		while (execute) {
			cidade = JOptionPane.showInputDialog(Mensagem.informeCidade);
			if (Valida.isEmptyOrNull(cidade)) {
				JOptionPane.showMessageDialog(null, Mensagem.cidadeVazio, Rotulo.cadastroEndereco, 0);
				execute = true;
			} else {
				execute = false;
			}
		}
		return cidade;
	}

	private String getEstado() {
		// variaveis auxiliares
		boolean execute = true;

		// enquanto o codigo for verdadeiro executa a mensagem e valida o estado do
		// logradouro
		String estado = "";
		while (execute) {
			estado = JOptionPane.showInputDialog(Mensagem.informeEstado);
			if (Valida.isEmptyOrNull(estado)) {
				JOptionPane.showMessageDialog(null, Mensagem.estadoVazio, Rotulo.cadastroEndereco, 0);
				execute = true;
			} else {
				execute = false;
			}
		}
		return estado;
	}

	private int getCep() {
		// variaveis auxiliares
		boolean execute = true;
		int cep = 0;

		// enquanto o codigo for verdadeiro executa a mensagem e valida o cep do
		// logradouro
		while (execute) {
			cep = Integer.parseInt(JOptionPane.showInputDialog(Mensagem.informeCep));
			if (Valida.isIntZero(cep)) {
				JOptionPane.showMessageDialog(null, Mensagem.cepVazio, Rotulo.cadastroEndereco, 0);
			} else {
				execute = false;
			}
		}
		return cep;
	}

	private String getCelular() {
		// variaveis auxiliares
		boolean execute = true;
		String celular = "";

		// enquanto o codigo for verdadeiro executa a mensagem e valida o celular
		while (execute) {
			celular = JOptionPane.showInputDialog(Mensagem.informeCelular);
			if (Valida.isEmptyOrNull(celular)) {
				JOptionPane.showMessageDialog(null, Mensagem.celularVazio, Rotulo.cadastroEndereco, 0);
				execute = true;
			} else {
				execute = false;
			}
		}
		return celular;
	}

	private String getEmail() {
		// variaveis auxiliares
		boolean execute = true;
		String email = "";

		// enquanto o codigo for verdadeiro executa a mensagem e valida o email
		while (execute) {
			email = JOptionPane.showInputDialog(Mensagem.informeEmail);
			if (Valida.isEmptyOrNull(email)) {
				JOptionPane.showMessageDialog(null, Mensagem.emailInvalido, Rotulo.cadastroEndereco, 0);
				execute = true;
			} else {
				execute = false;
			}
		}

		return email;
	}

	private int getCodigoProfessor() {
		// variaveis auxiliares
		boolean execute = true;
		int codigo = 0;

		// enquanto o codigo for verdadeiro executa a mensagem e valida o codigo do
		// professor
		while (execute) {
			try {
				codigo = Integer.parseInt(JOptionPane.showInputDialog(Mensagem.informeCodigo));
				if (Valida.isIntZero(codigo)) {
					JOptionPane.showMessageDialog(null, Mensagem.codigoVazio, Rotulo.cadastroProfessor, 0);
				} else {
					execute = false;
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, Mensagem.codigoInvalido, Rotulo.cadastroProfessor, 0);
				execute = true;
			}
		}
		return codigo;
	}

	private String getNomeProfessor() {
		// variaveis auxiliares
		boolean execute = true;
		String nome = "";

		// enquanto o codigo for verdadeiro executa a mensagem e valida o nome do
		// professor
		while (execute) {
			nome = JOptionPane.showInputDialog(Mensagem.informeNome);
			if (Valida.isEmptyOrNull(nome)) {
				JOptionPane.showMessageDialog(null, Mensagem.nomeInvalido, Rotulo.cadastroProfessor, 0);
				execute = true;
			} else {
				execute = false;
			}
		}
		return nome;
	}

	private String getCpfProfessor() {
		// variaveis auxiliares
		boolean execute = true;
		String cpf = "";

		// enquanto o codigo for verdadeiro executa a mensagem e valida o cpf do
		// professor
		while (execute) {
			cpf = JOptionPane.showInputDialog(Mensagem.informeCpf);
			if (Valida.isEmptyOrNull(cpf)) {
				JOptionPane.showMessageDialog(null, Mensagem.cpfVazio, Rotulo.cadastroProfessor, 0);
				execute = true;
			} else {
				execute = false;
			}
		}
		return cpf;
	}

	private String getRgProfessor() {
		// variaveis auxiliares
		boolean execute = true;
		String rg = "";

		// enquanto o codigo for verdadeiro executa a mensagem e valida o rg do
		// professor
		while (execute) {
			rg = JOptionPane.showInputDialog(Mensagem.informeRg);
			if (Valida.isEmptyOrNull(rg)) {
				JOptionPane.showMessageDialog(null, Mensagem.rgVazio, Rotulo.cadastroProfessor, 0);
				execute = true;
			} else {
				execute = false;
			}
		}
		return rg;
	}

	private ArrayList<Materia> getMaterias() {
		// variaveis auxiliares
		ArrayList<Materia> materias = new ArrayList<Materia>();
		String mensagem = "Matérias cadastradas\n";

		// varrendo o ArrayList de materias
		for (Materia materia : this.materias) {
			mensagem += "\n Código: " + materia.getCodigo() + " - " + materia.getNome();
		}
		// variaveis auxiliares
		boolean aux = true;
		mensagem += "\n" + Mensagem.informeCodigo;

		// enquanto a opcao for verdadeira executa o cadastramento de outra materia
		while (aux) {
			try {
				int codigo = Integer.parseInt(JOptionPane.showInputDialog(mensagem));
				materias.add(this.materias.get(codigo - 1));

				int opcao = JOptionPane.showConfirmDialog(null, "Deseja Cadastrar outra Materia?", "Atenção",
						JOptionPane.YES_OPTION, JOptionPane.CANCEL_OPTION);

				if (opcao == JOptionPane.YES_OPTION) {
					aux = true;
				} else {
					aux = false;
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, Mensagem.codigoInvalido, Rotulo.cadastroMateria, getCep());
			}
		}

		return materias;
	}

	private double getSalario() {
		// variaveis auxiliares
		boolean execute = true;
		double salario = 0;
		while (execute) {
			// enquanto o codigo for verdadeiro executa a mensagem e valida o salario do
			// professor
			try {
				salario = Double.parseDouble(JOptionPane.showInputDialog(Mensagem.informeSalario));
				if (Valida.isDoubleZero(salario)) {
					JOptionPane.showMessageDialog(null, Mensagem.salarioVazio, Rotulo.cadastroProfessor, 0);
				} else {
					execute = false;
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, Mensagem.salarioInvalido, Rotulo.cadastroProfessor, 0);
				execute = true;
			}
		}
		return salario;
	}

	private int getCodigoTurma() {

		// variaveis auxiliares
		boolean execute = true;
		int codigo = 0;

		// enquanto o codigo for verdadeiro executa a mensagem e valida o codigo da
		// turma
		while (execute) {
			try {
				codigo = Integer.parseInt(JOptionPane.showInputDialog(Mensagem.informeCodigo));
				if (Valida.isIntZero(codigo)) {
					JOptionPane.showMessageDialog(null, Mensagem.codigoVazio, Rotulo.cadastroTurma, 0);
				} else {
					execute = false;
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, Mensagem.codigoInvalido, Rotulo.cadastroTurma, 0);
				execute = true;
			}
		}
		return codigo;
	}

	private int getAno() {
		// variaveis auxiliares
		boolean execute = true;
		int ano = 0;

		// enquanto o codigo for verdadeiro executa a mensagem e valida o codigo da
		// turma
		while (execute) {
			try {
				ano = Integer.parseInt(JOptionPane.showInputDialog(Mensagem.informeCodigo));
				if (Valida.isIntZero(ano)) {
					JOptionPane.showMessageDialog(null, Mensagem.anoVazio, Rotulo.cadastroTurma, 0);
				} else {
					execute = false;
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, Mensagem.anoInvalido, Rotulo.cadastroTurma, 0);
				execute = true;
			}
		}
		return ano;
	}

	private Professor getProfessorTurma() {
		// variaveis auxiliares
		String mensagem = "Professores cadastrados\n";

		Professor retorno = new Professor();

		// varrendo o ArrayList de materias
		for (Professor professor : professores) {
			mensagem += "\n Código: " + professor.getCodigo() + " - " + professor.getNome();
		}

		// mensagem auxiliar
		mensagem += "\n" + Mensagem.informeCodigo;

		// enquanto a opcao for verdadeira executa o cadastramento de outra materia
		try {
			int codigo = Integer.parseInt(JOptionPane.showInputDialog(mensagem));
			retorno = professores.get(codigo - 1);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, Mensagem.codigoInvalido, Rotulo.cadastroTurma, getCep());
		}

		return retorno;
	}

	private Materia getMateriaTurma() {
		// variaveis auxiliares
		String mensagem = "Materias cadastradas\n";

		Materia retorno = new Materia();

		// varrendo o ArrayList de materias
		for (Materia materia : materias) {
			mensagem += "\n Código: " + materia.getCodigo() + " - " + materia.getNome();
		}

		// mensagem auxiliar
		mensagem += "\n" + Mensagem.informeCodigo;

		// enquanto a opcao for verdadeira executa o cadastramento de outra materia
		try {
			int codigo = Integer.parseInt(JOptionPane.showInputDialog(mensagem));
			retorno = materias.get(codigo - 1);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, Mensagem.codigoInvalido, Rotulo.cadastroTurma, getCep());
		}

		return retorno;
	}

	private ArrayList<Aluno> getAlunosTurma() {
		// variaveis auxiliares
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		String mensagem = "Alunos cadastrados\n";

		// varrendo o ArrayList de aluno
		for (Aluno aluno : this.alunos) {
			mensagem += "\n Código: " + aluno.getCodigo() + " - " + aluno.getNome();
		}
		// variaveis auxiliares
		boolean aux = true;
		mensagem += "\n" + Mensagem.informeCodigo;

		// enquanto a opcao for verdadeira executa o cadastramento de outro aluno
		while (aux) {
			try {
				int codigo = Integer.parseInt(JOptionPane.showInputDialog(mensagem));
				alunos.add(this.alunos.get(codigo - 1));

				int opcao = JOptionPane.showConfirmDialog(null, "Deseja Cadastrar outro aluno?", "Atenção",
						JOptionPane.YES_OPTION, JOptionPane.CANCEL_OPTION);

				if (opcao == JOptionPane.YES_OPTION) {
					aux = true;
				} else {
					aux = false;
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, Mensagem.codigoInvalido, Rotulo.cadastroAluno, getCep());
			}
		}

		return alunos;
	}

	private Turma getConsultarTurma() {
		// variaveis auxiliares
		String mensagem = "Turma cadastradas\n";

		Turma retorno = new Turma();

		// varrendo o ArrayList de materias
		for (Turma turma : turmas) {
			mensagem += "\n Código: " + turma.getCodigo() + " - " + turma.getAno() + " - "
					+ turma.getMateria().getNome();
		}

		// mensagem auxiliar
		mensagem += "\n" + Mensagem.informeCodigo;

		// enquanto a opcao for verdadeira executa o cadastramento de outra materia
		try {
			int codigo = Integer.parseInt(JOptionPane.showInputDialog(mensagem));
			retorno = turmas.get(codigo - 1);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, Mensagem.codigoInvalido, Rotulo.cadastroTurma, getCep());
		}

		return retorno;
	}
}
