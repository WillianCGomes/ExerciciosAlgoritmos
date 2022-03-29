algoritmo "pgm53"
// Função : Saldo cliente
// Autor :  Willian Carlos Gomes
// Data : 28/01/2021

// Seção de Declarações
var
nconta : inteiro
saldo, debito, credito, satual : real

inicio

//Leitura dos dados da conta
escreva ("Informe o número da conta: ")
leia (nconta)

escreva ("Informe o saldo: ")
leia (saldo)

escreva ("Informe o débito: ")
leia (debito)
escreva("Informe o crédito: ")
leia (credito)

//Cálculo do saldo
satual <- ((saldo - debito) + credito)
escreval("Seu saldo é: ", satual)

//Condicionais
se (satual >= 0) entao
   escreval ("Saldo positivo")
senao
   escreval ("Saldo negativo")
fimse
fimalgoritmo
