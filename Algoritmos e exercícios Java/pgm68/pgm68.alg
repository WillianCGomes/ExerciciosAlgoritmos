algoritmo "pgm68"
// Fun��o : Acesso do usu�rio
// Autor :  Willian Carlos Gomes
// Data : 29/01/2021

// Se��o de Declara��es
var
codigointerno, codigo, senhainterna, senha: inteiro

inicio

//Leitura do c�gigo e senha
escreval("Digite o seu c�digo de usu�rio:")
leia(codigo)

//Atribuindo valores ao c�digo e a senha corretos
codigointerno<-1234
senhainterna<-9999

//Atribuindo a condi��o de usu�rio invalido
se(codigo<>codigointerno)entao
   escreval("Usu�rio inv�lido!")
fimse

//Atribuindo a condi��o para prosseguir com a senha
se(codigo=codigointerno)entao
   escreval("Digite a sua senha:")
   leia(senha)
   //Atribuindo as condi��es de acesso permitido, e senha incorreta
   se(senha=senhainterna) e (codigo=codigointerno)entao
      escreval("Acesso permitido")
   senao
      se(senha<>senhainterna) e (codigo=codigointerno) entao
         escreval("senha incorreta!")
      fimse
   fimse
fimse
fimalgoritmo
