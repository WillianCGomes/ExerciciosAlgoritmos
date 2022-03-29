algoritmo "pgm35"
// Função : Idade
// Autor :  Willian Carlos Gomes
// Data : 23/01/2021

// Seção de Declarações 
var
anonasc, anoatual, idade, meses, dias, semana: real
inicio
// Atribuição da idade
escreval("Em que ano você nasceu?")
leia(anonasc)

escreval("Qual o ano atual?")
leia(anoatual)

//calculo da idade
idade <- (anoatual - anonasc)
meses <- (idade*12)
dias <-  (idade*365)
semana <- (dias/7)

//Impressão em tela
escreval("A sua idade é", idade," anos.")
escreval("Você tem", meses, " meses de vida.")
escreval("Você tem", dias, " dias de vida.")
escreval("Você tem", semana, " semanas de vida.")

fimalgoritmo
