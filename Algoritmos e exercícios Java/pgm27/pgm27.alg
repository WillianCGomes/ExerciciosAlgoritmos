algoritmo "pgm27"
// Função : Fábrica de camisetas
// Autor :  Willian Carlos Gomes
// Data : 22/01/2021

// Seção de Declarações 
var
cp, cm, cg, total: real

inicio
//Leitura e atribuições das variáveis
escreval("Quantas camisetas pequenas você deseja? (0 para nenhuma)")
leia(cp)

escreval("Quantas camisetas médias você deseja? (0 para nenhuma)")
leia(cm)

escreval("Quantas camisetas grandes você deseja? (0 para nenhuma)")
leia(cg)

//Cálculo
total <- (cp*10) + (cm*12) + (cg*15)

//Impressão em tela
escreval("O valor arrecadado será de: R$", total)

fimalgoritmo
