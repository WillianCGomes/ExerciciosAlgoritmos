algoritmo "pgm32"
// Função : Quantidade de regrigerante
// Autor :  Willian Carlos Gomes
// Data : 23/01/2021

// Seção de Declarações 
var
r350, r600, r2000, rtotal: real
inicio

//Leitura do número de refrigerantes de cada categoria
escreval("Informe a quantidade comprada de refrigerantes de 350ml:")
leia(r350)

escreval("Informe a quantidade comprada de refrigerantes de 600ml:")
leia(r600)

escreval("Informe a quantidade comprada de refrigerantes de 2 litros:")
leia(r2000)

//Cálculo e conversão para litros
rtotal <- ((r350*350)/1000) + ((r600*600)/1000) + (r2000*2)

//Impressão em tela
escreval("A quantidade de litros comprada foi de:", rtotal, " litros.")

fimalgoritmo
