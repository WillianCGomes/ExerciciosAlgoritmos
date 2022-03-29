algoritmo "pgm51"
// Função : Horas extras
// Autor :  Willian Carlos Gomes
// Data : 28/01/2021

// Seção de Declarações
var
hrt, vhr, hextra, salariop, salarioe: real

inicio

//leitura das horas trabalhadas e valor
escreval("Digite as horas trabalhadas no mês: ")
leia(hrt)

escreval("Digite o valor das horas: ")
leia(vhr)

salariop <- (hrt*vhr)

//Início das condicionais de cálculo
se (hrt>160) entao
   hextra <- (hrt-160)
   salarioe <- (vhr*0.5*hextra)+salariop
   escreval("Seu salário será de: ", salarioe)
senao
   escreval("Seu salário será de: R$", salariop)
fimse

fimalgoritmo
