algoritmo "pgm31"
// Fun��o : Gastos com frangos
// Autor :  Willian Carlos Gomes
// Data : 23/01/2021

// Se��o de Declara��es 
var
aidentf, aaliment, nfrangos, vfrangos: inteiro

inicio
//Leitura da quantidade de frangos
escreval("Qual a quantidade de frangos?")
leia(nfrangos)

//C�lculo do custo com os an�is
aidentf <- (nfrangos * 4)
aaliment <- (nfrangos* 7)
vfrangos <- (aidentf + aaliment)

//Impress�es em tela
Escreval("O custo total de an�is com os frangos ser� de: R$", vfrangos)
escreval("Sendo R$", aidentf," com an�is de identidade e R$", aaliment, " com an�is de alimentos.")

fimalgoritmo
