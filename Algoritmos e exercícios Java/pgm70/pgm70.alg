algoritmo "pgm70"
// Função : Média dos exercícios avaliativos
// Autor :  Willian Carlos Gomes
// Data : 29/01/2021

// Seção de Declarações
var
n1, n2, n3, n4, media_aproveitamento: real
conceito: caractere

inicio
//leitura das notas
escreval("Informe a nota 1")
leia(n1)

escreval("Informe a nota 2")
leia(n2)

escreval("Informe a nota 3")
leia(n3)

escreval("Informe a média dos exercícios")
leia(n4)

//cálculo da média
media_aproveitamento <- (((n1) + (n2*2) + (n3*3) + (n4))/7)

//Condicionais compostas
se (media_aproveitamento >= 9) entao  //aplicar conceito A
   conceito <- ("A")
senao
   se (media_aproveitamento >= 7.5) e (media_aproveitamento < 9) entao //aplicar conceito B
      conceito <- ("B")
   senao
      se   (media_aproveitamento >= 6) e (media_aproveitamento < 7.5) entao  //aplicar conceito C
         conceito <- ("C")
      senao  //aplicar conceito D
         conceito <- ("D")
      fimse
   fimse
fimse

//impressão em tela
escreval("Segue o seu resultado: ")
escreva("Conceito ",conceito,".")

fimalgoritmo
