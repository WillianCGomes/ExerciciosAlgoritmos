algoritmo "pgm23"
// Fun��o : Convers�o de unidade de medida de temperatura
// Autor : Willian Carlos Gomes
// Data : 22/01/2021

// Se��o de Declara��es 
var
 ftemperatura, ctemperatura: real
 
inicio
//leitura da variavel de graus Fahrenheit
escreval("Digite a temperatura em graus Fahrenheit")
leia(ftemperatura)

//c�lculo de convers�o
ctemperatura <- (((ftemperatura-32)*5)/9)

//impress�o em tela
escreval (ftemperatura, " graus Fahrenheit � igual a:", ctemperatura," graus Celsius.")

fimalgoritmo
