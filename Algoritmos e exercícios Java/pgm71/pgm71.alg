algoritmo "pgm71"
// Fun��o : Aposentadoria do empregado
// Autor :  Willian Carlos Gomes
// Data : 29/01/2021

// Se��o de Declara��es
var
cod, anonasc, anoing, anoatual, ttrabalho, idade: inteiro
aps: caractere

inicio
//Leitura dos dados do funcion�rio
escreval("Digite a sua matr�cula")
leia(cod)

escreval("Digite o seu ano de nascimento, por favor:")
leia(anonasc)

escreval("Digite o seu ano de ingresso na Organiza��o:")
leia(anoing)

//C�lculo do tempo de trabalho
anoatual<- (2021)
ttrabalho <- (anoatual - anoing)

//C�lculo da idade do funcion�rio
idade <- (anoatual-anonasc)

//Condicionais compostas para a possibilidade de aposentadoria
se (idade>=65) entao
   aps <- ("Requerer aposentadoria")
senao
   se (ttrabalho >= 30) entao
      aps <- ("Requerer aposentadoria")
   senao
      se (idade>=60) e (ttrabalho >= 25) entao
         aps <- ("Requerer aposentadoria")
      senao
         aps <- ("N�o requerer aposentadoria")
      fimse
   fimse
fimse

//Impress�o em tela do resultado
escreval("Prezado, voc� possu� ",idade," anos de idade e ", ttrabalho," anos de empresa.")
escreval("Contudo, a orienta��o �: ", aps, ".")

fimalgoritmo
