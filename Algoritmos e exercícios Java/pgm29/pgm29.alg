algoritmo "pgm29"
// Fun��o : Peso sandu�ches
// Autor :  Willian Carlos Gomes
// Data : 23/01/2021
// Se��o de Declara��es 
var
qtdsd, vtotal: real
inicio
//Leitura do n�mero de sandu�ches
Escreval("Qual a quantidade de sandu�ches?")
leia(qtdsd)

//C�lculo e convers�o de gramas para quilogramas
vtotal <- ((qtdsd * 250)/1000)

//Impress�o em tela
Escreval("O peso total de queijo, presunto e hamb�rguer �:", vtotal," kg.")

fimalgoritmo
