algoritmo "pgm47"
// Função : Verificar possibilidade de votação
// Autor :  Willian Carlos Gomes
// Data : 27/01/2021

// Seção de Declarações
var
anonasc, anoatual, idade: inteiro

inicio

//Leitura das informações
escreval("Digite o ano de nascimento: ")
leia(anonasc)

escreval("Digite o ano atual: ")
leia(anoatual)

idade <- (anoatual - anonasc)

//Condicionais e impressões em tela
se (idade>=16) entao
   escreval("Você pode votar.")
fimse

se (idade<16) entao
   escreva ("Você não pode votar.")
fimse

fimalgoritmo
