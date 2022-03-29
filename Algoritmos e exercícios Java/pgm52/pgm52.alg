algoritmo "pgm52"
// Função : Salário do vendedor
// Autor :  Willian Carlos Gomes
// Data : 28/01/2021

// Seção de Declarações
var
salario,vendas,salarioc,tsalario, vfvendas: real
inicio

//leitura do salário e comissão
escreval("Digite o seu salario, por favor: ")
leia(salario)

escreval("Informe o valor total de vendas:")
leia(vendas)

//Cálculo e condicionais compostas
se (vendas>1500) entao
   salarioc <- (vendas*0.03)
   vfvendas <- ((vendas-1500)*0.05)
   tsalario<- (salario+salarioc+vfvendas)
   escreva("Seu salário total será: R$",tsalario)
senao
   salarioc <- (vendas*0.03)
   tsalario <- (salario+salarioc)
   escreva("Seu salário total será: R$",tsalario)
fimse
fimalgoritmo

fimalgoritmo
