algoritmo "pgm28"
// Fun��o : Divis�o da conta
// Autor : Willian Carlos Gomes
// Data : 22/01/2021

//Declara��o de vari�veis
var

   vcarlos, vandre: inteiro
   vfelipe, vtotal: real

inicio

//Obtendo informa��es do usu�rio
   escreval ("Digite o valor total:")
   leia (vtotal)
   
//C�lculo da conta

   vcarlos <-(vtotal\33)
   vandre <-(vtotal\33)
   vfelipe <-(vtotal-(vcarlos+vandre))

//Impress�o em tela
   escreval ("")
   escreval ("Carlos deve pagar: R$", vcarlos)
   escreval ("Andre deve pagar: R$", vandre)
   escreval ("Felipe deve pagar: R$", vfelipe)

fimalgoritmo
