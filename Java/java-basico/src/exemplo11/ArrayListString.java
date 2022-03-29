package exemplo11;

import java.util.ArrayList;

/**
 * Classe para demonstrar a utiliza��o de ArrayList do tipo String
 * 
 * @author Willian Carlos Gomes
 * @since 23 de fev. de 2021
 */
public class ArrayListString {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {

		// Declarar e instanciar uma lista de String
		ArrayList<String> listaString = new ArrayList<String>();

		// Adicionar registros na linha de String
		listaString.add("Elemento 1");
		listaString.add("Elemento 2");
		listaString.add("Elemento 3");

		// Exibindo o conte�do da lista
		System.out.println(listaString.get(0));
		System.out.println(listaString.get(1));
		System.out.println(listaString.get(2));

		// Adicionando em uma posi��o espec�fica
		listaString.add(1, "Elemento 1.5");

		// Varrendo a lista para exibir ao usu�rio
		for (String elemento : listaString) {
			System.out.println(elemento);
		}

		// Obtendo o tamanho da lista de String
		System.out.println("O tamanho da lista �: " + listaString.size());

		// Pesquisando um valor espec�fico na lista
		if (listaString.contains("Elemento 1")) {
			System.out.println("Elemento encontrado!");
		} else {
			System.out.println("Elemento n�o encontrado!");
		}

		// Descobrindo o �ndice do elemento pesquisado
		int indice = listaString.indexOf("Elemento 1");
		System.out.println("Indice: " + indice);

		// Adicionando um novo elemento na lista
		listaString.add("Elemento 4");

		// Obtendo o tamanho da lista de String
		System.out.println("O tamanho da lista �: " + listaString.size());

		// Removendo um elemento da lista
		listaString.remove("Elemento 1.5");
		for (String string : listaString) {
			System.out.println(string);
		}

		// Obtendo o tamanho da lista de String
		System.out.println("O tamanho da lista �: " + listaString.size());

	}

}
