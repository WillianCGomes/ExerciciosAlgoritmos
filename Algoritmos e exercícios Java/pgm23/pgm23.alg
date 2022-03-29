algoritmo "pgm23"
// Função : Conversão de unidade de medida de temperatura
// Autor : Willian Carlos Gomes
// Data : 22/01/2021

// Seção de Declarações 
var
 ftemperatura, ctemperatura: real
 
inicio
//leitura da variavel de graus Fahrenheit
escreval("Digite a temperatura em graus Fahrenheit")
leia(ftemperatura)

//cálculo de conversão
ctemperatura <- (((ftemperatura-32)*5)/9)

//impressão em tela
escreval (ftemperatura, " graus Fahrenheit é igual a:", ctemperatura," graus Celsius.")

fimalgoritmo
