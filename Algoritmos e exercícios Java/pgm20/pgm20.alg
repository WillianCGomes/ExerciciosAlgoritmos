algoritmo "pgm20"
// Fun��o : Convers�o em d�lar
// Autor :  Willian Carlos Gomes
// Data : 22/01/2021

// Se��o de Declara��es
var
vinicio, vconvertido, vdolar: real

inicio
// Atribui��o do valor do d�lar, leitura do valor
vdolar <- (6.61)
escreval("Digite o valor a ser convertido:")
escreva("R$")
leia(vinicio)

//c�lculo da convers�o
vconvertido <- (vinicio * vdolar)

//impress�o em tela
escreval("O valor digitado em d�lar �: US$",vconvertido)

fimalgoritmo
