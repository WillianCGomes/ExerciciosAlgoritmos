algoritmo "pgm64"
// Fun��o : Igualdade ou maioridade entre valores
// Autor :  Willian Carlos Gomes
// Data : 28/01/2021

// Se��o de Declara��es
var
a, b: inteiro

inicio
// Leitura dos valores
escreval("Informe o primeiro valor: ")
leia(a)

escreval("Informe o segundo valor")
leia(b)

//Condicional composta
se (a=b) entao
   escreval("N�meros iguais.")
senao
   se (a>b) entao
      escreval("Primeiro � maior.")
   senao
      escreval("Segundo � maior.")
   fimse
fimse

fimalgoritmo
