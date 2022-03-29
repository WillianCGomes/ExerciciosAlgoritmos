algoritmo "pgm21"
// Função : Custo total do carro
// Autor :  Willian Carlos Gomes
// Data : 22/01/2021

// Seção de Declarações 
var
cfabrica, cporcentagem, cimpostos, cfinal: real

inicio
//Leitura do valor de fábrica e armazenamento na variavel correspondente
escreval("Digite o valor de fábrica do veículo:")
escreva("R$")
leia(cfabrica)

//Atribuição do valor dos impostos e porcentagem às variaveis correspondentes
cporcentagem <- (cfabrica*0.28)
cimpostos <- (cfabrica*0.45)
cfinal <- (cfabrica + cimpostos + cporcentagem)

//Impressão em tela
escreval("O custo final do veículo é de: R$", cfinal)

fimalgoritmo
