algoritmo "pgm64"
// Função : Igualdade ou maioridade entre valores
// Autor :  Willian Carlos Gomes
// Data : 28/01/2021

// Seção de Declarações
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
   escreval("Números iguais.")
senao
   se (a>b) entao
      escreval("Primeiro é maior.")
   senao
      escreval("Segundo é maior.")
   fimse
fimse

fimalgoritmo
