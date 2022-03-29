algoritmo "pgm25"
// Função : Cálculo de litros de gasolina
// Autor :  Willian Carlos Gomes
// Data : 22/01/2021

// Seção de Declarações 
var
vlitro, vgasolina, qtdlitros: real

inicio
//Leitura e atribuição das variáveis
escreval("Qual é o valor por litro de gasolina?")
escreva("R$")
leia(vlitro)

escreval("Qual o valor você deseja?")
escreva("R$")
leia(vgasolina)

//Cálculo
qtdlitros <- (vgasolina / vlitro)

//Impressão em tela em tela
escreval("Você conseguirá colocar", qtdlitros," litros de gasolina.")

fimalgoritmo
