algoritmo "pgm54"
// Fun��o : Quantidade estoque
// Autor :  Willian Carlos Gomes
// Data : 28/01/2021

// Se��o de Declara��es
Var
qatual, qmax, qmed, qmin: real

Inicio

//Atribui��es �s vari�veis
escreval("Digite a quantidade atual em estoque: ")
leia(qatual)

escreval("Digite a quantidade m�xima em estoque: ")
leia(qmax)

escreval("Digite a quantidade minima em estoque: ")
leia(qmin)

//C�lculo da m�dia
qmed <- ((qmax+qmin)/2)

//Condicional composta
se (qatual >= qmed) entao
   escreva("Quantidade m�dia =",qmed,". N�o efetuar compra!")
senao
   escreva("Quantidade m�dia =",qmed,". Efetuar compra!")
fimse
fimalgoritmo
