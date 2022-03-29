algoritmo "pgm20"
// Função : Conversão em dólar
// Autor :  Willian Carlos Gomes
// Data : 22/01/2021

// Seção de Declarações
var
vinicio, vconvertido, vdolar: real

inicio
// Atribuição do valor do dólar, leitura do valor
vdolar <- (6.61)
escreval("Digite o valor a ser convertido:")
escreva("R$")
leia(vinicio)

//cálculo da conversão
vconvertido <- (vinicio * vdolar)

//impressão em tela
escreval("O valor digitado em dólar é: US$",vconvertido)

fimalgoritmo
