algoritmo "pgm55"
// Fun��o : Verificar valor positivo ou negativo
// Autor :  Willian Carlos Gomes
// Data : 28/01/2021

// Se��o de Declara��es
Var
valor: inteiro

Inicio

//Leitura do valor
escreval("Digite um valor")
leia(valor)

//Condicional composta
se (valor > 0) entao
   escreva("Valor positivo")
senao
   se (valor < 0) entao
      escreva("Valor negativo")
   senao
      escreva("Valor neutro(0).")
   fimse
fimse
fimalgoritmo
