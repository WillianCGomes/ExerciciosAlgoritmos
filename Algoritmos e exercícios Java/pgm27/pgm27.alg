algoritmo "pgm27"
// Fun��o : F�brica de camisetas
// Autor :  Willian Carlos Gomes
// Data : 22/01/2021

// Se��o de Declara��es 
var
cp, cm, cg, total: real

inicio
//Leitura e atribui��es das vari�veis
escreval("Quantas camisetas pequenas voc� deseja? (0 para nenhuma)")
leia(cp)

escreval("Quantas camisetas m�dias voc� deseja? (0 para nenhuma)")
leia(cm)

escreval("Quantas camisetas grandes voc� deseja? (0 para nenhuma)")
leia(cg)

//C�lculo
total <- (cp*10) + (cm*12) + (cg*15)

//Impress�o em tela
escreval("O valor arrecadado ser� de: R$", total)

fimalgoritmo
