package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para ler, apresentar m�dia de n�meros e o maior deles
 * 
 * @author Willian Carlos Gomes
 * @since 10 de fev. de 2021
 */
public class Exercicio82 {

	/*
	 * M�todo principal para a execu��o da classe
	 */
	public static void main(String[] args) {
		// Declarando vari�veis
		int qtdn, valor, maior;
		double vSoma, vMedia = 0;

		// Perguntando o n�mero de valores que ser�o informados
		qtdn = Integer.parseInt(JOptionPane.showInputDialog("Quantos n�meros voc� ir� digitar?"));
		if (qtdn < 0) {// Caso o usu�rio informe n�meros negativos
			JOptionPane.showMessageDialog(null, "A opera��o n�o � poss�vel com valores negativos!");
		} else if (qtdn < 1) {// Caso o usu�rio informe o valor 0
			JOptionPane.showMessageDialog(null, "A quantidade informada precisa ser maior que 0!");
		} else {// Inicia o programa

			// Inicializa��o da vari�vel de incremento para o c�lculo da m�dia
			vSoma = 0;

			// Leitura e atribui��o do primeiro valor digitado como maior informado
			valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o 1� valor: "));
			maior = valor;
			vSoma = vSoma + valor;

			// La�o de repeti��o para executar de acordo com o n�mero valores informados
			for (int i = 2; i <= qtdn; i++) {
				valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + i + "� valor: "));

				// Se o valor informado for maior que os anteriores, seu valor passar� a
				// vari�vel "maior"
				if (valor > maior) {
					maior = valor;
				}

				// C�lculo da m�dia
				vSoma = vSoma + valor;
				vMedia = vSoma / qtdn;
			}

			// Impress�o dos resultados em tela
			JOptionPane.showMessageDialog(null, "Quantidade de n�meros lidos: " + qtdn + "\n" + "Maior n�mero lido: "
					+ maior + "\n" + "M�dia dos n�meros lidos: " + vMedia);

		}
	}

}
