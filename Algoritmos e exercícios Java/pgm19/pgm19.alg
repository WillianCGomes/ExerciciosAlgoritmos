algoritmo "pgm19"
// Fun��o : Reajuste sal�rio
// Autor : Willian Carlos Gomes
// Data : 21/01/2021

// Se��o de Declara��es
var
salario, percentualreaj, salarionovo, totalreajuste: real

inicio
//leitura do sal�rio e percentual de reajuste
escreval("Digite o sal�rio atual:")
leia(salario)

escreval("Digite o percentual reajustado:")
leia(percentualreaj)

//calculo do reajuste
salarionovo <- (salario*percentualreaj/100)
totalreajuste <- (salario + salarionovo)

//exibi��o em tela
escreval("O novo sal�rio �: ", totalreajuste)

fimalgoritmo

