algoritmo "pgm47"
// Fun��o : Verificar possibilidade de vota��o
// Autor :  Willian Carlos Gomes
// Data : 27/01/2021

// Se��o de Declara��es
var
anonasc, anoatual, idade: inteiro

inicio

//Leitura das informa��es
escreval("Digite o ano de nascimento: ")
leia(anonasc)

escreval("Digite o ano atual: ")
leia(anoatual)

idade <- (anoatual - anonasc)

//Condicionais e impress�es em tela
se (idade>=16) entao
   escreval("Voc� pode votar.")
fimse

se (idade<16) entao
   escreva ("Voc� n�o pode votar.")
fimse

fimalgoritmo
