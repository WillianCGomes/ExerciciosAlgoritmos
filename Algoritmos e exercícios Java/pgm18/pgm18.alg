algoritmo "pgm18"
// Função : Percentual
// Autor : Willian Carlos Gomes
// Data : 21/01/2021

// Seção de Declarações
var
TotalEleitores, vb, vv, vn, pbrancos, pnulos, pvalidos: real

inicio
//leitura do número de eleitores
escreval("Digite o número de eleitores do município:")
leia(TotalEleitores)

//leitura dos votos brancos
escreval("Digite o número de votos brancos")
leia(vb)

//leitura dos votos nulos
escreval("Digite o número de votos nulos")
leia(vn)

//leitura dos votos válidos
escreval("Digite o número de votos válidos")
leia(vv)

//cálculo de percentual entre votos brancos, nulos e válidos
pbrancos <- (100*vb/TotalEleitores)
pnulos <- (100*vn/TotalEleitores)
pvalidos <- (100*vv/TotalEleitores)

//Exibição dos resultados em tela
Escreval ("Votos Brancos: ", pbrancos,"%")
Escreval ("Votos Nulos: ",pnulos,"%")
Escreval ("Votos Válidos: ",pvalidos, "%")

fimalgoritmo

