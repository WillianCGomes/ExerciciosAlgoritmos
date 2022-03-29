algoritmo "pgm68"
// Função : Acesso do usuário
// Autor :  Willian Carlos Gomes
// Data : 29/01/2021

// Seção de Declarações
var
codigointerno, codigo, senhainterna, senha: inteiro

inicio

//Leitura do cógigo e senha
escreval("Digite o seu código de usuário:")
leia(codigo)

//Atribuindo valores ao código e a senha corretos
codigointerno<-1234
senhainterna<-9999

//Atribuindo a condição de usuário invalido
se(codigo<>codigointerno)entao
   escreval("Usuário inválido!")
fimse

//Atribuindo a condição para prosseguir com a senha
se(codigo=codigointerno)entao
   escreval("Digite a sua senha:")
   leia(senha)
   //Atribuindo as condições de acesso permitido, e senha incorreta
   se(senha=senhainterna) e (codigo=codigointerno)entao
      escreval("Acesso permitido")
   senao
      se(senha<>senhainterna) e (codigo=codigointerno) entao
         escreval("senha incorreta!")
      fimse
   fimse
fimse
fimalgoritmo
