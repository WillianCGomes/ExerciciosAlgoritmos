algoritmo "pgm69"
// Fun��o : C�lculo de desconto
// Autor :  Willian Carlos Gomes
// Data : 29/01/2021
// Se��o de Declara��es
var
prod: caractere
qtd, preco, total, result, desc: real

inicio
escreval("Informe o nome do produto:")
leia(prod)

escreval("Quantas unidades foram adquiridas?")
leia(qtd)

escreva("Informe o valor: R$")
leia(preco)

se (qtd <= 5) entao
   //haver� desconto de 2%
   total <- (qtd*preco)
   desc<- (total/98)
   result <-(qtd*preco) - desc

   escreval("O desconto no ", prod, " � de: R$",desc)
   escreval("O valor a pagar �: R$",result)
fimse

se (qtd > 5) e (qtd <=10) entao
   //desconto de 3%
   total <- (qtd*preco)
   desc <- (total/97)
   result <-(qtd*preco) - desc

   escreval("O desconto no ", prod, " � de: R$",desc)
   escreval("O valor a pagar �: R$",result)
fimse

se (qtd > 10) entao
   //desconto de 5%
   total <- (qtd*preco)
   desc <- (total/95)
   result <-(qtd*preco) - desc

   escreval("O desconto no ", prod, " � de: R$",desc)
   escreval("O valor a pagar �: R$",result)
fimse

fimalgoritmo
