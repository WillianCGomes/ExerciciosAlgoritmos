algoritmo "pgm25"
// Fun��o : C�lculo de litros de gasolina
// Autor :  Willian Carlos Gomes
// Data : 22/01/2021

// Se��o de Declara��es 
var
vlitro, vgasolina, qtdlitros: real

inicio
//Leitura e atribui��o das vari�veis
escreval("Qual � o valor por litro de gasolina?")
escreva("R$")
leia(vlitro)

escreval("Qual o valor voc� deseja?")
escreva("R$")
leia(vgasolina)

//C�lculo
qtdlitros <- (vgasolina / vlitro)

//Impress�o em tela em tela
escreval("Voc� conseguir� colocar", qtdlitros," litros de gasolina.")

fimalgoritmo
