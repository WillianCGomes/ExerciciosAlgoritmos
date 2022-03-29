algoritmo "pgm29"
// Função : Peso sanduíches
// Autor :  Willian Carlos Gomes
// Data : 23/01/2021
// Seção de Declarações 
var
qtdsd, vtotal: real
inicio
//Leitura do número de sanduíches
Escreval("Qual a quantidade de sanduíches?")
leia(qtdsd)

//Cálculo e conversão de gramas para quilogramas
vtotal <- ((qtdsd * 250)/1000)

//Impressão em tela
Escreval("O peso total de queijo, presunto e hambúrguer é:", vtotal," kg.")

fimalgoritmo
