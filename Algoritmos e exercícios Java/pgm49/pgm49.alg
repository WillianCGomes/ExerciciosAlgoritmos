algoritmo "pgm49"
// Função : Ordem crescente de valores
// Autor :  Willian Carlos Gomes
// Data : 28/01/2021

// Seção de Declarações
var
v1, v2: inteiro

inicio

//leitura dos valores
escreval("Digite o primeiro valor:")
leia(v1)

escreval("Digite o segundo valor:")
leia(v2)

//Início das condicionais compostas
se (v1>v2) entao
   escreval("A ordem crescente é: ", v1,",", v2,".")
senao
   escreval("A ordem crescente é: ", v2, ",", v1,".")
fimse

fimalgoritmo
