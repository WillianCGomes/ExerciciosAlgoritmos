algoritmo "pgm34"
// Função : Tonel de refresco
// Autor :  Willian Carlos Gomes
// Data : 23/01/2021

// Seção de Declarações 
var
qtdref, lagua, lmaracuja: real

inicio
//Atribuição de valor à variável
escreval("Quantos litros de refresco você deseja?")
leia(qtdref)

//Cálculo
lagua <- (qtdref*0.8)
lmaracuja <- (qtdref*0.2)

//Impressão em tela
escreval("Para", qtdref," litros de refresco, você vai precisar de:")
escreval(lagua," litros de água e", lmaracuja," litros de suco.")

fimalgoritmo
