algoritmo "pgm30"
// Fun��o : Convers�o de unidade de medida de temperatura
// Autor : Willian Carlos Gomes
// Data : 22/01/2021

// Se��o de Declara��es
var
 ftemperatura, ctemperatura: real

inicio
//leitura da variavel
escreval("Digite a temperatura em graus Celsius")
leia(ctemperatura)

//c�lculo de convers�o
ftemperatura <- (ctemperatura*1.8+32)

//impress�o em tela
escreval (ctemperatura, " graus Celsius � igual a:", ftemperatura," graus Fahrenheit.")

fimalgoritmo

