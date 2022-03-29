package controller;

import javax.swing.UIManager;

import view.MenuPrincipalView;

/**
 * Classe para executar  o projeto
 * @author Willian Carlos Gomes
 * @since 4 de mar. de 2021
 * @version
 */
public class Main {
	
	
	/**
	 * m�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		/*
		 * configurando o estilo inicial do projeto
		 */		
		try {
			// Altera��o nos par�metros visuais da janela
						UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					} catch (Exception e) {
						e.printStackTrace();
		}
		//iniciando o menu principal
		new MenuPrincipalView().iniciaGui();
	}
}
