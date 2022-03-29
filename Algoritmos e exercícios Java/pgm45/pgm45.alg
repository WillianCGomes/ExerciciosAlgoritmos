algoritmo "pgm45"
// Função : Cálculo de maçãs
// Autor :  Willian Carlos Gomes
// Data : 27/01/2021

// Seção de Declarações
var
qtd: inteiro

inicio

//Leitura da quantidade de maçãs compradas
escreval("Qual a quantidade de maçãs compradas?")
leia(qtd)

//Condicionais e impressões em tela
se (qtd>=12) entao
   escreval("O valor total será de: ", (qtd*1.00), " reais.")
fimse

se (qtd<12) entao
   escreva ("O valor total será de: ", (qtd*1.30), " reais.")
fimse

fimalgoritmo
