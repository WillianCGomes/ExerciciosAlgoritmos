algoritmo "pgm33"
// Função : Valor em reais
// Autor :  Willian Carlos Gomes
// Data : 23/01/2021

// Seção de Declarações
var
ucent, cicent, dcent, vincent, cincent, ureal, vtotal: real

inicio
//Leitura da quantidade de cada tipo de moeda
escreval("Qual a quantidade de moedas de 1 centavo?")
leia(ucent)

escreval("Qual a quantidade de moedas de 5 centavos?")
leia(cicent)

escreval("Qual a quantidade de moedas de 10 centavos?")
leia(dcent)

escreval("Qual a quantidade de moedas de 25 centavo?")
leia(vincent)

escreval("Qual a quantidade de moedas de 50 centavo?")
leia(cincent)

escreval("Qual a quantidade de moedas de 1 real?")
leia(ureal)

//Cálculo do valor total e conversão dos centavos para real
vtotal <- ((ucent*1)/100)+((cicent*5)/100)+((dcent*10)/100)+((vincent*25)/100)+((cincent*50)/100)+(ureal*1)

//Impressão em tela
escreval("O valor economizado foi de: R$", vtotal)

fimalgoritmo
