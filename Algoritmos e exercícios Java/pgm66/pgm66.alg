algoritmo "pgm66"
// Fun��o : Soma e multiplica��o de idades
// Autor :  Willian Carlos Gomes
// Data : 29/01/2021

// Se��o de Declara��es
var
hv, hn, mv, mn, hom_mul_recep: inteiro
soma, mult: inteiro

inicio
// Realiza��o da leitura das idades
escreval("Entre com a idade do primeiro homem:")
leia(hv)

escreval("Entre com a idade do segundo homem:")
leia(hn)

escreval("Entre com a idade da primeira mulher:")
leia(mv)

escreval("Entre com a idade da segunda mulher:")
leia(mn)

//M�todo de substitui��o dos valores das vari�veis, caso a condi��o do homem "hn" for maior que "hv" seja atinjida.
se (hv < hn) entao
   hom_mul_recep <- (hv)
   hv <- hn
   hn <- hom_mul_recep
fimse

//M�todo de substitui��o dos valores das vari�veis, caso a condi��o da mulher "mn" for maior que "mv" seja atinjida.
se(mv<mn) entao
   hom_mul_recep <- (mv)
   mv <- (mn)
   mn <- hom_mul_recep
fimse

//Comando para otimiza��o da visualiza��o do usu�rio
limpatela

//Impress�o em tela
escreval("A soma de idades do homem mais velho com a mulher mais nova �: ")
escreval(hv+mn)

escreval("O produto das idades do homem mais novo com a mulher mais velha �: ")
escreval(hn*mv)


fimalgoritmo
