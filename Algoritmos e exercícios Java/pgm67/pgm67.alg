algoritmo "pgm67"
// Fun��o : Valor de frutas a serem pagos
// Autor :  Willian Carlos Gomes
// Data : 29/01/2021

// Se��o de Declara��es
var
mckg, mokg, pre_mc, pre_mo, pre_total, kgtotal: real

inicio
//leitura do peso adquirido em ma�as e morangos
escreval("Digite o peso de morangos comprados (em quilogramas):")
leia(mckg)

escreval("Digite o peso de ma��s compradas (em quilogramas):")
leia(mokg)

//Condicional para o desconto de frutas acima de 5kg
se (mckg > 5) entao
   pre_mc <- (mckg * 2.20)
senao
   pre_mc <- (mckg * 2.50)
fimse

se (mokg > 5) entao
   pre_mo <- (mckg * 1.50)
senao
   pre_mo <- (mckg * 1.80)
fimse

//C�lculo do pre�o total e peso total
pre_total <- (pre_mc + pre_mo)
kgtotal <- (mckg + mokg)

//Condicional para o desconto de frutas acima de 8kg ou valor superior a R$25,00
se (pre_total > 25) ou (kgtotal > 8) entao
   pre_total <- (pre_total*0.90)
fimse

escreval("O valor a ser pago ser� de: R$", pre_total,".")

fimalgoritmo
