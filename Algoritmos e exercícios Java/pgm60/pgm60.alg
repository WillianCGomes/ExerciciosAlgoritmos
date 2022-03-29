algoritmo "pgm60"
// Função : Ordem crescente
// Autor :  Willian Carlos Gomes
// Data : 28/01/2021

// Seção de Declarações
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

//Condicionais compostas e cálculo
se(A < B) e (B < C) e (C > A) e (C > B) entao
   escreval("A ordem crescente dos números informados é: ",A,B,C)
senao
   se(A < B) e (A < C) e (B > A) e (B > C) entao
      escreval("A ordem crescente dos números informados é: ",A,C,B)
   senao
      se(A > B) e (A < C) e (B < C) e (C > A) entao
         escreval("A ordem crescente dos números informados é: ",B,A,C)
      senao
         se(C < A) e (C < B) e (B > C) e (B > A) entao
            escreval("A ordem crescente dos números informados é: ",C,A,B)
         senao
            se(C < A) e (C < B) e (B < A) e (B > C) entao
               escreval("A ordem crescente dos números informados é: ",C,B,A)
            senao
               se(A > B) e (A > C) e (B < C) e (C < A) entao
                  escreval("A ordem crescente dos números informados é: ",B,C,A)
               fimse
            fimse
         fimse
      fimse
   fimse
fimse
fimalgoritmo
