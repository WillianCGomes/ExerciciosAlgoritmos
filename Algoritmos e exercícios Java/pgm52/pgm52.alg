algoritmo "pgm52"
// Fun��o : Sal�rio do vendedor
// Autor :  Willian Carlos Gomes
// Data : 28/01/2021

// Se��o de Declara��es
var
salario,vendas,salarioc,tsalario, vfvendas: real
inicio

//leitura do sal�rio e comiss�o
escreval("Digite o seu salario, por favor: ")
leia(salario)

escreval("Informe o valor total de vendas:")
leia(vendas)

//C�lculo e condicionais compostas
se (vendas>1500) entao
   salarioc <- (vendas*0.03)
   vfvendas <- ((vendas-1500)*0.05)
   tsalario<- (salario+salarioc+vfvendas)
   escreva("Seu sal�rio total ser�: R$",tsalario)
senao
   salarioc <- (vendas*0.03)
   tsalario <- (salario+salarioc)
   escreva("Seu sal�rio total ser�: R$",tsalario)
fimse
fimalgoritmo

fimalgoritmo
