algoritmo "pgm21"
// Fun��o : Custo total do carro
// Autor :  Willian Carlos Gomes
// Data : 22/01/2021

// Se��o de Declara��es 
var
cfabrica, cporcentagem, cimpostos, cfinal: real

inicio
//Leitura do valor de f�brica e armazenamento na variavel correspondente
escreval("Digite o valor de f�brica do ve�culo:")
escreva("R$")
leia(cfabrica)

//Atribui��o do valor dos impostos e porcentagem �s variaveis correspondentes
cporcentagem <- (cfabrica*0.28)
cimpostos <- (cfabrica*0.45)
cfinal <- (cfabrica + cimpostos + cporcentagem)

//Impress�o em tela
escreval("O custo final do ve�culo � de: R$", cfinal)

fimalgoritmo
