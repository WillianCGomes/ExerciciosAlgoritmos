algoritmo "pgm35"
// Fun��o : Idade
// Autor :  Willian Carlos Gomes
// Data : 23/01/2021

// Se��o de Declara��es 
var
anonasc, anoatual, idade, meses, dias, semana: real
inicio
// Atribui��o da idade
escreval("Em que ano voc� nasceu?")
leia(anonasc)

escreval("Qual o ano atual?")
leia(anoatual)

//calculo da idade
idade <- (anoatual - anonasc)
meses <- (idade*12)
dias <-  (idade*365)
semana <- (dias/7)

//Impress�o em tela
escreval("A sua idade �", idade," anos.")
escreval("Voc� tem", meses, " meses de vida.")
escreval("Voc� tem", dias, " dias de vida.")
escreval("Voc� tem", semana, " semanas de vida.")

fimalgoritmo
