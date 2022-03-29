algoritmo "pgm71"
// Função : Aposentadoria do empregado
// Autor :  Willian Carlos Gomes
// Data : 29/01/2021

// Seção de Declarações
var
cod, anonasc, anoing, anoatual, ttrabalho, idade: inteiro
aps: caractere

inicio
//Leitura dos dados do funcionário
escreval("Digite a sua matrícula")
leia(cod)

escreval("Digite o seu ano de nascimento, por favor:")
leia(anonasc)

escreval("Digite o seu ano de ingresso na Organização:")
leia(anoing)

//Cálculo do tempo de trabalho
anoatual<- (2021)
ttrabalho <- (anoatual - anoing)

//Cálculo da idade do funcionário
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
         aps <- ("Não requerer aposentadoria")
      fimse
   fimse
fimse

//Impressão em tela do resultado
escreval("Prezado, você possuí ",idade," anos de idade e ", ttrabalho," anos de empresa.")
escreval("Contudo, a orientação é: ", aps, ".")

fimalgoritmo
