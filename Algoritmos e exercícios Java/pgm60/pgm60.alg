algoritmo "pgm60"
// Fun��o : Ordem crescente
// Autor :  Willian Carlos Gomes
// Data : 28/01/2021

// Se��o de Declara��es
var
A, B, C: inteiro

inicio
// Leitura dos valores
escreval("Digite o primeiro valor:")
leia(A)

escreval("Digite o segundo valor:")
leia(B)

escreval("Digite o terceiro valor:")
leia(C)

//Condicionais compostas e c�lculo
se(A < B) e (B < C) e (C > A) e (C > B) entao
   escreval("A ordem crescente dos n�meros informados �: ",A,B,C)
senao
   se(A < B) e (A < C) e (B > A) e (B > C) entao
      escreval("A ordem crescente dos n�meros informados �: ",A,C,B)
   senao
      se(A > B) e (A < C) e (B < C) e (C > A) entao
         escreval("A ordem crescente dos n�meros informados �: ",B,A,C)
      senao
         se(C < A) e (C < B) e (B > C) e (B > A) entao
            escreval("A ordem crescente dos n�meros informados �: ",C,A,B)
         senao
            se(C < A) e (C < B) e (B < A) e (B > C) entao
               escreval("A ordem crescente dos n�meros informados �: ",C,B,A)
            senao
               se(A > B) e (A > C) e (B < C) e (C < A) entao
                  escreval("A ordem crescente dos n�meros informados �: ",B,C,A)
               fimse
            fimse
         fimse
      fimse
   fimse
fimse
fimalgoritmo
