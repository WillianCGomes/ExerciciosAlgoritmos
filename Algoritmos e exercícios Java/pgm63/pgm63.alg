algoritmo "pgm63"
// Função : Número de gols
// Autor :  Willian Carlos Gomes
// Data : 28/01/2021

// Seção de Declarações
var
t1, t2: caractere
gt1, gt2: inteiro

inicio
// Leitura dos nomes dos times e placar
escreval("Informe o nome do time da casa:")
leia(t1)

escreval("Informe o nome do time visitante:")
leia(t2)

escreval("A partida acabou com quantos gols do time da casa?")
leia(gt1)

escreval("E com quantos gols do time visitante?")
leia(gt2)

//Condicionais compostas
se (gt1>gt2) entao
   escreval(t1," venceram, com o placar de: ",gt1," X",gt2)
senao
   se (gt2>gt1) entao
      escreval(t2," venceram, com o placar de: " ,gt1," X",gt2)
   senao
      escreva("Empate! Placar: ", gt1," X",gt2)
   fimse
fimse

fimalgoritmo
