algoritmo "pgm54"
// Função : Quantidade estoque
// Autor :  Willian Carlos Gomes
// Data : 28/01/2021

// Seção de Declarações
Var
qatual, qmax, qmed, qmin: real

Inicio

//Atribuições às variáveis
escreval("Digite a quantidade atual em estoque: ")
leia(qatual)

escreval("Digite a quantidade máxima em estoque: ")
leia(qmax)

escreval("Digite a quantidade minima em estoque: ")
leia(qmin)

//Cálculo da média
qmed <- ((qmax+qmin)/2)

//Condicional composta
se (qatual >= qmed) entao
   escreva("Quantidade média =",qmed,". Não efetuar compra!")
senao
   escreva("Quantidade média =",qmed,". Efetuar compra!")
fimse
fimalgoritmo
