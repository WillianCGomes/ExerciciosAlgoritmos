algoritmo "pgm50"
// Função : Horas do jogo de xadrez
// Autor :  Willian Carlos Gomes
// Data : 28/01/2021

// Seção de Declarações
var
hinicio, hfim, htotal: inteiro

inicio

//leitura do horário
escreval("Digite o horário de início (formato 24 de horas:)")
leia(hinicio)

escreval("Digite o horário de término (formato 24 de horas):")
leia(hfim)

//Início das condicionais de cálculo
se (hinicio=hfim) entao
   escreval("Tempo máximo de duração atingido: 24 horas.")
senao
   se (hfim>=hinicio) entao
      htotal <-(hfim - hinicio)
   senao
      htotal <- ((24-hinicio)+hfim)
   fimse
   escreval("A duração da partida foi de: ", htotal, " horas.")
fimse


fimalgoritmo
