algoritmo "pgm17"
// Fun��o : Idade em dias
// Autor : Willian Carlos Gomes
// Data : 21/01/2021

// Se��o de Declara��es
var
anos, meses, dias, total: inteiro

inicio
//leitura da idade (anos, meses e dias)
escreval("Digite sua idade:")
leia(anos)   

escreval("Digite quantos meses:")
leia(meses)

escreval("Digite quantos dias:")
leia(dias)

// Convers�o dos anos em Dias
total <- + (anos*365)

// Convers�o dos meses em dias
total <- total + (meses*30)
total <- total + dias

//Exibi��o na tela
escreval("O total de dias �: ", total)

fimalgoritmo

