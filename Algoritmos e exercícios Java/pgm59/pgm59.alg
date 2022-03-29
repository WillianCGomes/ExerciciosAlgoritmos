algoritmo "pgm59"
// Função : Multiplicação dos números menores
// Autor :  Willian Carlos Gomes
// Data : 28/01/2021

// Seção de Declarações
var
v1, v2, v3, mult: real

inicio
// Leitura dos valores
escreval("Digite o primeiro valor:")
leia(v1)

escreval("Digite o segundo valor:")
leia(v2)

escreval("Digite o terceiro valor:")
leia(v3)

//Condicionais compostas e cálculo
se (v1 < v2) e (v2 < v3) ou (v2 < v1) e (v1 < v3) entao
   mult <- (v1 * v2)
   escreval("A multiplicação dos 2 primeiros valores foi de: ",mult)
senao
   se (v3 < v1) e (v1 < v2) ou (v1 < v3) e (v3 < v2) entao
      mult <- (v1 * v3)
      escreval("A multiplicação do primeiro e último valor foi de: ",mult)
   senao
      mult <- (v2*v3)
      escreval("A multiplicação dos 2 últimos valores foi de:: ",mult)
   fimse
fimse
fimalgoritmo
