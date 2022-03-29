package exercicios;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

/**
 * Programa para verificar dados da população de uma cidade
 * 
 * @author Willian Carlos Gomes
 * @since 11 de fev. de 2021
 */
public class Exercicio84 {

	/*
	 * Método principal para a execução da classe
	 */
	public static void main(String[] args) {
		// Declarando variáveis
		double salario, filhos, mediasalario, mediafilhos, totalsalario, maiorsalario, quantidade150, totalfamilia,
				totalfilhos, percentual;

		// Contador para o laço de repetição
		int qtdn;

		// Descobrindo o número de pessoas que irão responder
		qtdn = Integer.parseInt(JOptionPane.showInputDialog("Quantas pessoas responderão a pesquisa?"));
		if (qtdn < 0) {// O usuário informou um número negativo
			JOptionPane.showMessageDialog(null, "A operação não é possível com valores negativos!");
		} else if (qtdn < 1) {// O usuário informou que 0 pessoas responderiam
			JOptionPane.showMessageDialog(null, "A quantidade de pessoas informada precisa ser maior que 0!");
		} else {// Executa o programa

			// Iniciando as variáveis
			maiorsalario = 0;
			totalsalario = 0;
			totalfilhos = 0;
			totalfamilia = 0;
			quantidade150 = 0;

			// Perguntar as informações de acordo com o número de respondedores
			for (int i = 1; i <= qtdn; i++) {
				filhos = Double.parseDouble(
						JOptionPane.showInputDialog("Digite a quantidade de filhos da " + i + "ª pessoa: "));
				salario = Double
						.parseDouble(JOptionPane.showInputDialog("Digite digite o salário da " + i + "ª pessoa: "));

				// Incrementos para impressões em tela e cálculos de média
				totalsalario = totalsalario + salario;
				totalfilhos = totalfilhos + filhos;
				totalfamilia = totalfamilia + 1;

				// Condicional para atribuir o maior valor de salário digitado ao maior salário
				if (salario > maiorsalario) {
					maiorsalario = salario;
				}

				// Condicional para incrementar a variável caso o salário informado seja menor
				// ou igual a 150
				if (salario <= 150) {
					quantidade150++;
				}
			}
			// Cálculo das médias e percentual
			mediasalario = totalsalario / totalfamilia;
			mediafilhos = totalfilhos / qtdn;
			percentual = quantidade150 * 100 / totalfamilia;

			// Redutor de casas decimais
			DecimalFormat formatador = new DecimalFormat("0.00");

			// Impressões dos resultados em tela
			JOptionPane.showMessageDialog(null,
					"A média de salário da população é de R$ " + formatador.format(mediasalario) + "\n"
							+ "A média de filhos por pessoa é de: " + formatador.format(mediafilhos) + "\n"
							+ "O maior salário encontrado foi de R$" + maiorsalario + "\n"
							+ "O percentual de pessoas com salário de até R$ 150,00 reais é de: "
							+ formatador.format(percentual) + "%");
		}
	}

}
