algoritmo "pgm28"
// Função : Divisão da conta
// Autor : Willian Carlos Gomes
// Data : 22/01/2021

//Declaração de variáveis
var

   vcarlos, vandre: inteiro
   vfelipe, vtotal: real

inicio

//Obtendo informações do usuário
   escreval ("Digite o valor total:")
   leia (vtotal)
   
//Cálculo da conta

   vcarlos <-(vtotal\33)
   vandre <-(vtotal\33)
   vfelipe <-(vtotal-(vcarlos+vandre))

//Impressão em tela
   escreval ("")
   escreval ("Carlos deve pagar: R$", vcarlos)
   escreval ("Andre deve pagar: R$", vandre)
   escreval ("Felipe deve pagar: R$", vfelipe)

fimalgoritmo
