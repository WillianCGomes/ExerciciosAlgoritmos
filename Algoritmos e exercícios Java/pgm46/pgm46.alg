algoritmo "pgm46"
// Função : Média aritimética
// Autor :  Willian Carlos Gomes
// Data : 27/01/2021

// Seção de Declarações
var
nota1, nota2, media: real

inicio

//Leitura das notas
escreval("Digite a primeira nota: ")
leia(nota1)

escreval("Digite a segunda nota: ")
leia(nota2)

//Cálculo da média
media <- ((nota1+nota2)/2)

//Condicionaise impressões em tela
se (media>=6) entao
   escreval("Sua média foi: ", media," e você está aprovado")
fimse

se (media<6) entao
   escreva ("Sua média foi: ", media," e você está reprovado")
fimse

fimalgoritmo
