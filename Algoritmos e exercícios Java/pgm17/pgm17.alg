algoritmo "pgm17"
// Função : Idade em dias
// Autor : Willian Carlos Gomes
// Data : 21/01/2021

// Seção de Declarações
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

// Conversão dos anos em Dias
total <- + (anos*365)

// Conversão dos meses em dias
total <- total + (meses*30)
total <- total + dias

//Exibição na tela
escreval("O total de dias é: ", total)

fimalgoritmo

