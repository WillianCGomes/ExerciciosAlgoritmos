algoritmo "pgm53"
// Fun��o : Saldo cliente
// Autor :  Willian Carlos Gomes
// Data : 28/01/2021

// Se��o de Declara��es
var
nconta : inteiro
saldo, debito, credito, satual : real

inicio

//Leitura dos dados da conta
escreva ("Informe o n�mero da conta: ")
leia (nconta)

escreva ("Informe o saldo: ")
leia (saldo)

escreva ("Informe o d�bito: ")
leia (debito)
escreva("Informe o cr�dito: ")
leia (credito)

//C�lculo do saldo
satual <- ((saldo - debito) + credito)
escreval("Seu saldo �: ", satual)

//Condicionais
se (satual >= 0) entao
   escreval ("Saldo positivo")
senao
   escreval ("Saldo negativo")
fimse
fimalgoritmo
