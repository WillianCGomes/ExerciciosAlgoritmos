algoritmo "pgm18"
// Fun��o : Percentual
// Autor : Willian Carlos Gomes
// Data : 21/01/2021

// Se��o de Declara��es
var
TotalEleitores, vb, vv, vn, pbrancos, pnulos, pvalidos: real

inicio
//leitura do n�mero de eleitores
escreval("Digite o n�mero de eleitores do munic�pio:")
leia(TotalEleitores)

//leitura dos votos brancos
escreval("Digite o n�mero de votos brancos")
leia(vb)

//leitura dos votos nulos
escreval("Digite o n�mero de votos nulos")
leia(vn)

//leitura dos votos v�lidos
escreval("Digite o n�mero de votos v�lidos")
leia(vv)

//c�lculo de percentual entre votos brancos, nulos e v�lidos
pbrancos <- (100*vb/TotalEleitores)
pnulos <- (100*vn/TotalEleitores)
pvalidos <- (100*vv/TotalEleitores)

//Exibi��o dos resultados em tela
Escreval ("Votos Brancos: ", pbrancos,"%")
Escreval ("Votos Nulos: ",pnulos,"%")
Escreval ("Votos V�lidos: ",pvalidos, "%")

fimalgoritmo

