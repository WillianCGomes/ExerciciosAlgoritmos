algoritmo "pgm62"
// Fun��o : Verificar se forma um tri�ngulo
// Autor :  Willian Carlos Gomes
// Data : 28/01/2021

// Se��o de Declara��es
var
a, b, c: inteiro

inicio
// Leitura dos valores
escreval("Digite o valor do primeiro lado:")
leia(a)

escreval("Digite o valor do segundo lado:")
leia(b)

escreval("Digite o valor do terceiro lado:")
leia(c)

//Condicionais compostas e c�lculo
se(a<b+c) e (b<a+c) e (c<a+b) entao
   escreval("Forma um tri�ngulo.")
senao
   escreval("N�o forma um tri�ngulo.")
fimse

fimalgoritmo
