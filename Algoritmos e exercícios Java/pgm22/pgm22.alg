algoritmo "pgm22"
// Função : Salário dos vendedores
// Autor: Willian Carlos Gomes
// Data : 22/01/2021

// Seção de Declarações 
var
sfixo, cfixa, nvendas, vveiculos, porcentagem, comisfinal, somaperc, sfinal: real

inicio
// Atribuição da comissão de vendas
porcentagem <- 0.05

//Leitura e tribuições das variaveis
escreval("Informe o valor fixo do salário:")
escreva("R$")
leia(sfixo)

escreval("Informe o número de carros vendidos pelo funcionário:")
leia(nvendas)

escreval("Informe o valor fixo de comissão:")
escreva("R$")
leia(cfixa)

escreval("Informe o valor total dos veículos vendidos pelo funcionário:")
escreva("R$")
leia(vveiculos)

//Calculos das comissões
comisfinal <- (nvendas * cfixa)
somaperc <- (porcentagem * vveiculos)

//Calculo do salário final
sfinal <- (comisfinal + somaperc + sfixo)

//Impressão em tela
escreval("O salário final do vendedor é: ")
escreva("R$",sfinal)

fimalgoritmo
