algoritmo "pgm46"
// Fun��o : M�dia aritim�tica
// Autor :  Willian Carlos Gomes
// Data : 27/01/2021

// Se��o de Declara��es
var
nota1, nota2, media: real

inicio

//Leitura das notas
escreval("Digite a primeira nota: ")
leia(nota1)

escreval("Digite a segunda nota: ")
leia(nota2)

//C�lculo da m�dia
media <- ((nota1+nota2)/2)

//Condicionaise impress�es em tela
se (media>=6) entao
   escreval("Sua m�dia foi: ", media," e voc� est� aprovado")
fimse

se (media<6) entao
   escreva ("Sua m�dia foi: ", media," e voc� est� reprovado")
fimse

fimalgoritmo
