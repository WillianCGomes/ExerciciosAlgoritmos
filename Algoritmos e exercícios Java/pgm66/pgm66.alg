algoritmo "pgm66"
// Função : Soma e multiplicação de idades
// Autor :  Willian Carlos Gomes
// Data : 29/01/2021

// Seção de Declarações
var
hv, hn, mv, mn, hom_mul_recep: inteiro
soma, mult: inteiro

inicio
// Realização da leitura das idades
escreval("Entre com a idade do primeiro homem:")
leia(hv)

escreval("Entre com a idade do segundo homem:")
leia(hn)

escreval("Entre com a idade da primeira mulher:")
leia(mv)

escreval("Entre com a idade da segunda mulher:")
leia(mn)

//Método de substituição dos valores das variáveis, caso a condição do homem "hn" for maior que "hv" seja atinjida.
se (hv < hn) entao
   hom_mul_recep <- (hv)
   hv <- hn
   hn <- hom_mul_recep
fimse

//Método de substituição dos valores das variáveis, caso a condição da mulher "mn" for maior que "mv" seja atinjida.
se(mv<mn) entao
   hom_mul_recep <- (mv)
   mv <- (mn)
   mn <- hom_mul_recep
fimse

//Comando para otimização da visualização do usuário
limpatela

//Impressão em tela
escreval("A soma de idades do homem mais velho com a mulher mais nova é: ")
escreval(hv+mn)

escreval("O produto das idades do homem mais novo com a mulher mais velha é: ")
escreval(hn*mv)


fimalgoritmo
