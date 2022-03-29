algoritmo "pgm31"
// Função : Gastos com frangos
// Autor :  Willian Carlos Gomes
// Data : 23/01/2021

// Seção de Declarações 
var
aidentf, aaliment, nfrangos, vfrangos: inteiro

inicio
//Leitura da quantidade de frangos
escreval("Qual a quantidade de frangos?")
leia(nfrangos)

//Cálculo do custo com os anéis
aidentf <- (nfrangos * 4)
aaliment <- (nfrangos* 7)
vfrangos <- (aidentf + aaliment)

//Impressões em tela
Escreval("O custo total de anéis com os frangos será de: R$", vfrangos)
escreval("Sendo R$", aidentf," com anéis de identidade e R$", aaliment, " com anéis de alimentos.")

fimalgoritmo
