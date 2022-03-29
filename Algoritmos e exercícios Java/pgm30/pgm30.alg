algoritmo "pgm30"
// Função : Conversão de unidade de medida de temperatura
// Autor : Willian Carlos Gomes
// Data : 22/01/2021

// Seção de Declarações
var
 ftemperatura, ctemperatura: real

inicio
//leitura da variavel
escreval("Digite a temperatura em graus Celsius")
leia(ctemperatura)

//cálculo de conversão
ftemperatura <- (ctemperatura*1.8+32)

//impressão em tela
escreval (ctemperatura, " graus Celsius é igual a:", ftemperatura," graus Fahrenheit.")

fimalgoritmo

