algoritmo "pgm19"
// Função : Reajuste salário
// Autor : Willian Carlos Gomes
// Data : 21/01/2021

// Seção de Declarações
var
salario, percentualreaj, salarionovo, totalreajuste: real

inicio
//leitura do salário e percentual de reajuste
escreval("Digite o salário atual:")
leia(salario)

escreval("Digite o percentual reajustado:")
leia(percentualreaj)

//calculo do reajuste
salarionovo <- (salario*percentualreaj/100)
totalreajuste <- (salario + salarionovo)

//exibição em tela
escreval("O novo salário é: ", totalreajuste)

fimalgoritmo

