algoritmo "pgm32"
// Fun��o : Quantidade de regrigerante
// Autor :  Willian Carlos Gomes
// Data : 23/01/2021

// Se��o de Declara��es 
var
r350, r600, r2000, rtotal: real
inicio

//Leitura do n�mero de refrigerantes de cada categoria
escreval("Informe a quantidade comprada de refrigerantes de 350ml:")
leia(r350)

escreval("Informe a quantidade comprada de refrigerantes de 600ml:")
leia(r600)

escreval("Informe a quantidade comprada de refrigerantes de 2 litros:")
leia(r2000)

//C�lculo e convers�o para litros
rtotal <- ((r350*350)/1000) + ((r600*600)/1000) + (r2000*2)

//Impress�o em tela
escreval("A quantidade de litros comprada foi de:", rtotal, " litros.")

fimalgoritmo
