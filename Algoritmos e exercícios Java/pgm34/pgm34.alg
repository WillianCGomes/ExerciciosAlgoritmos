algoritmo "pgm34"
// Fun��o : Tonel de refresco
// Autor :  Willian Carlos Gomes
// Data : 23/01/2021

// Se��o de Declara��es 
var
qtdref, lagua, lmaracuja: real

inicio
//Atribui��o de valor � vari�vel
escreval("Quantos litros de refresco voc� deseja?")
leia(qtdref)

//C�lculo
lagua <- (qtdref*0.8)
lmaracuja <- (qtdref*0.2)

//Impress�o em tela
escreval("Para", qtdref," litros de refresco, voc� vai precisar de:")
escreval(lagua," litros de �gua e", lmaracuja," litros de suco.")

fimalgoritmo
