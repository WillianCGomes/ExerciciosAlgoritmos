package exercicios;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

/**
 * Programa para verificar dados da popula��o de uma cidade
 * 
 * @author Willian Carlos Gomes
 * @since 11 de fev. de 2021
 */
public class Exercicio84 {

	/*
	 * M�todo principal para a execu��o da classe
	 */
	public static void main(String[] args) {
		// Declarando vari�veis
		double salario, filhos, mediasalario, mediafilhos, totalsalario, maiorsalario, quantidade150, totalfamilia,
				totalfilhos, percentual;

		// Contador para o la�o de repeti��o
		int qtdn;

		// Descobrindo o n�mero de pessoas que ir�o responder
		qtdn = Integer.parseInt(JOptionPane.showInputDialog("Quantas pessoas responder�o a pesquisa?"));
		if (qtdn < 0) {// O usu�rio informou um n�mero negativo
			JOptionPane.showMessageDialog(null, "A opera��o n�o � poss�vel com valores negativos!");
		} else if (qtdn < 1) {// O usu�rio informou que 0 pessoas responderiam
			JOptionPane.showMessageDialog(null, "A quantidade de pessoas informada precisa ser maior que 0!");
		} else {// Executa o programa

			// Iniciando as vari�veis
			maiorsalario = 0;
			totalsalario = 0;
			totalfilhos = 0;
			totalfamilia = 0;
			quantidade150 = 0;

			// Perguntar as informa��es de acordo com o n�mero de respondedores
			for (int i = 1; i <= qtdn; i++) {
				filhos = Double.parseDouble(
						JOptionPane.showInputDialog("Digite a quantidade de filhos da " + i + "� pessoa: "));
				salario = Double
						.parseDouble(JOptionPane.showInputDialog("Digite digite o sal�rio da " + i + "� pessoa: "));

				// Incrementos para impress�es em tela e c�lculos de m�dia
				totalsalario = totalsalario + salario;
				totalfilhos = totalfilhos + filhos;
				totalfamilia = totalfamilia + 1;

				// Condicional para atribuir o maior valor de sal�rio digitado ao maior sal�rio
				if (salario > maiorsalario) {
					maiorsalario = salario;
				}

				// Condicional para incrementar a vari�vel caso o sal�rio informado seja menor
				// ou igual a 150
				if (salario <= 150) {
					quantidade150++;
				}
			}
			// C�lculo das m�dias e percentual
			mediasalario = totalsalario / totalfamilia;
			mediafilhos = totalfilhos / qtdn;
			percentual = quantidade150 * 100 / totalfamilia;

			// Redutor de casas decimais
			DecimalFormat formatador = new DecimalFormat("0.00");

			// Impress�es dos resultados em tela
			JOptionPane.showMessageDialog(null,
					"A m�dia de sal�rio da popula��o � de R$ " + formatador.format(mediasalario) + "\n"
							+ "A m�dia de filhos por pessoa � de: " + formatador.format(mediafilhos) + "\n"
							+ "O maior sal�rio encontrado foi de R$" + maiorsalario + "\n"
							+ "O percentual de pessoas com sal�rio de at� R$ 150,00 reais � de: "
							+ formatador.format(percentual) + "%");
		}
	}

}
