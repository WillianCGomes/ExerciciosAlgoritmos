algoritmo "pgm50"
// Fun��o : Horas do jogo de xadrez
// Autor :  Willian Carlos Gomes
// Data : 28/01/2021

// Se��o de Declara��es
var
hinicio, hfim, htotal: inteiro

inicio

//leitura do hor�rio
escreval("Digite o hor�rio de in�cio (formato 24 de horas:)")
leia(hinicio)

escreval("Digite o hor�rio de t�rmino (formato 24 de horas):")
leia(hfim)

//In�cio das condicionais de c�lculo
se (hinicio=hfim) entao
   escreval("Tempo m�ximo de dura��o atingido: 24 horas.")
senao
   se (hfim>=hinicio) entao
      htotal <-(hfim - hinicio)
   senao
      htotal <- ((24-hinicio)+hfim)
   fimse
   escreval("A dura��o da partida foi de: ", htotal, " horas.")
fimse


fimalgoritmo
