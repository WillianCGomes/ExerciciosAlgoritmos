algoritmo "pgm56"
// Fun��o : Maior entre 3 valores
// Autor :  Willian Carlos Gomes
// Data : 28/01/2021

// Se��o de Declara��es
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

//C�lculo e condicionais compostas
se (v1>v2) e (v1>v3) entao
   escreva("O maior valor �: ", v1,".")
senao
   se (v2>v3) entao
      escreval("O maior valor �: ",v2,".")
   senao
      escreval("O maior valor �: ",v3,".")
   fimse
fimse
fimalgoritmo
