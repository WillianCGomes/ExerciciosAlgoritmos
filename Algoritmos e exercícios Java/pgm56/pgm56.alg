algoritmo "pgm56"
// Função : Maior entre 3 valores
// Autor :  Willian Carlos Gomes
// Data : 28/01/2021

// Seção de Declarações
var
v1, v2, v3: inteiro

inicio
//leitura dos valores
escreval("Digite o primeiro valor")
leia(v1)

escreval("Digite o segundo valor")
leia(v2)

escreval("Digite o terceiro valor")
leia(v3)

//Cálculo e condicionais compostas
se (v1>v2) e (v1>v3) entao
   escreva("O maior valor é: ", v1,".")
senao
   se (v2>v3) entao
      escreval("O maior valor é: ",v2,".")
   senao
      escreval("O maior valor é: ",v3,".")
   fimse
fimse
fimalgoritmo
