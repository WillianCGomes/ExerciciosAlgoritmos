algoritmo "pgm62"
// Função : Verificar se forma um triângulo
// Autor :  Willian Carlos Gomes
// Data : 28/01/2021

// Seção de Declarações
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

//Condicionais compostas e cálculo
se(a<b+c) e (b<a+c) e (c<a+b) entao
   escreval("Forma um triângulo.")
senao
   escreval("Não forma um triângulo.")
fimse

fimalgoritmo
