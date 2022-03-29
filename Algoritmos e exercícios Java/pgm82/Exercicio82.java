package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler, apresentar média de números e o maior deles
 * 
 * @author Willian Carlos Gomes
 * @since 10 de fev. de 2021
 */
public class Exercicio82 {

	/*
	 * Método principal para a execução da classe
	 */
	public static void main(String[] args) {
		// Declarando variáveis
		int qtdn, valor, maior;
		double vSoma, vMedia = 0;

		// Perguntando o número de valores que serão informados
		qtdn = Integer.parseInt(JOptionPane.showInputDialog("Quantos números você irá digitar?"));
		if (qtdn < 0) {// Caso o usuário informe números negativos
			JOptionPane.showMessageDialog(null, "A operação não é possível com valores negativos!");
		} else if (qtdn < 1) {// Caso o usuário informe o valor 0
			JOptionPane.showMessageDialog(null, "A quantidade informada precisa ser maior que 0!");
		} else {// Inicia o programa

			// Inicialização da variável de incremento para o cálculo da média
			vSoma = 0;

			// Leitura e atribuição do primeiro valor digitado como maior informado
			valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o 1º valor: "));
			maior = valor;
			vSoma = vSoma + valor;

			// Laço de repetição para executar de acordo com o número valores informados
			for (int i = 2; i <= qtdn; i++) {
				valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + i + "º valor: "));

				// Se o valor informado for maior que os anteriores, seu valor passará a
				// variável "maior"
				if (valor > maior) {
					maior = valor;
				}

				// Cálculo da média
				vSoma = vSoma + valor;
				vMedia = vSoma / qtdn;
			}

			// Impressão dos resultados em tela
			JOptionPane.showMessageDialog(null, "Quantidade de números lidos: " + qtdn + "\n" + "Maior número lido: "
					+ maior + "\n" + "Média dos números lidos: " + vMedia);

		}
	}

}
