algoritmo "pgm22"
// Fun��o : Sal�rio dos vendedores
// Autor: Willian Carlos Gomes
// Data : 22/01/2021

// Se��o de Declara��es 
var
sfixo, cfixa, nvendas, vveiculos, porcentagem, comisfinal, somaperc, sfinal: real

inicio
// Atribui��o da comiss�o de vendas
porcentagem <- 0.05

//Leitura e tribui��es das variaveis
escreval("Informe o valor fixo do sal�rio:")
escreva("R$")
leia(sfixo)

escreval("Informe o n�mero de carros vendidos pelo funcion�rio:")
leia(nvendas)

escreval("Informe o valor fixo de comiss�o:")
escreva("R$")
leia(cfixa)

escreval("Informe o valor total dos ve�culos vendidos pelo funcion�rio:")
escreva("R$")
leia(vveiculos)

//Calculos das comiss�es
comisfinal <- (nvendas * cfixa)
somaperc <- (porcentagem * vveiculos)

//Calculo do sal�rio final
sfinal <- (comisfinal + somaperc + sfixo)

//Impress�o em tela
escreval("O sal�rio final do vendedor �: ")
escreva("R$",sfinal)

fimalgoritmo
