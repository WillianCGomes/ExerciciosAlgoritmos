algoritmo "pgm58"
// Fun��o : Soma dos n�meros maiores
// Autor :  Willian Carlos Gomes
// Data : 28/01/2021

// Se��o de Declara��es
var
v1, v2, v3, soma: real

inicio
// Leitura dos valores
escreval("Digite o primeiro valor:")
leia(v1)

escreval("Digite o segundo valor:")
leia(v2)

escreval("Digite o terceiro valor:")
leia(v3)

//Condicionais compostas e c�lculo
se (v1 > v2) e (v2 > v3) ou (v2 > v1) e (v1 > v3) entao
   soma <- (v1 + v2)
   escreval("A soma dos 2 primeiros valores foi de: ",soma)
senao
   se (v3 > v1) e (v1 > v2) ou (v1 > v3) e (v3 > v2) entao
      soma <- (v1 + v3)
      escreval("A soma do primeiro e �ltimo valor foi de: ",soma)
   senao
      soma <- (v2+v3)
      escreval("A soma dos 2 �ltimos valores foi de:: ",soma)
   fimse
fimse
fimalgoritmo
