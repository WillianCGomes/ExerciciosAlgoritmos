algoritmo "pgm45"
// Fun��o : C�lculo de ma��s
// Autor :  Willian Carlos Gomes
// Data : 27/01/2021

// Se��o de Declara��es
var
qtd: inteiro

inicio

//Leitura da quantidade de ma��s compradas
escreval("Qual a quantidade de ma��s compradas?")
leia(qtd)

//Condicionais e impress�es em tela
se (qtd>=12) entao
   escreval("O valor total ser� de: ", (qtd*1.00), " reais.")
fimse

se (qtd<12) entao
   escreva ("O valor total ser� de: ", (qtd*1.30), " reais.")
fimse

fimalgoritmo
