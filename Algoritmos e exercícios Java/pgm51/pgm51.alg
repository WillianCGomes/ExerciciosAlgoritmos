algoritmo "pgm51"
// Fun��o : Horas extras
// Autor :  Willian Carlos Gomes
// Data : 28/01/2021

// Se��o de Declara��es
var
hrt, vhr, hextra, salariop, salarioe: real

inicio

//leitura das horas trabalhadas e valor
escreval("Digite as horas trabalhadas no m�s: ")
leia(hrt)

escreval("Digite o valor das horas: ")
leia(vhr)

salariop <- (hrt*vhr)

//In�cio das condicionais de c�lculo
se (hrt>160) entao
   hextra <- (hrt-160)
   salarioe <- (vhr*0.5*hextra)+salariop
   escreval("Seu sal�rio ser� de: ", salarioe)
senao
   escreval("Seu sal�rio ser� de: R$", salariop)
fimse

fimalgoritmo
