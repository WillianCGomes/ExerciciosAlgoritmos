algoritmo "prova"

var
//Declaração de variáveis
valorSaque: real
saque: caracter
nota2, nota5, nota10, nota20, nota50, nota100, nota200, controle1, controle2, a: inteiro
//soma : inteiro--------RETIRADO NA CORREÇÃO--------
//resto: inteiro---------RETIRADO NA CORREÇÃO--------
inicio
//Informando do que se trata o algoritmo
escreval("====================================================================")
escreval("               BEM-VINDO À CAIXA ECONÔMICA FEDERAL                  ")
escreval("====================================================================")
escreval("Aqui você pode realizar o saque do valor disponível em sua conta")
escreval("")
escreval("O valor máximo permitido para saque é de R$ 2.000,00")
escreval("")
escreval("Notas disponíveis para saque: ")
escreval("* R$ 2.00")
escreval("* R$ 5.00")
escreval("* R$ 10.00")
escreval("* R$ 20.00")
escreval("* R$ 50.00")
escreval("* R$ 100.00")
escreval("* R$ 200.00")
escreval("")
//Sistema solicita que seja informado o valor que deseja sacar
escreva("Informe o valor que deseja sacar: R$ ")
leia(saque)
escreval("")
//Controla o input do usuário, evita que o usuário insira caracteres
controle2 <- compr(saque)
a <- 1
enquanto (a >= 1) e (a <= controle2) faca
   se (asc(copia(saque, a, 1)) >= 48) e (asc(copia(saque, a, 1)) <= 57) entao
      controle1 <- controle1 + 1
   fimse
   a <- a + 1
fimenquanto
se (controle1 = controle2) entao
   valorSaque <- caracpnum(saque)
fimse
// Sistema verifica o valor d=e saque informado e faz o cálculo para saber quais
//notas vai disponibilizar para o saque. Se o valor informado for menor que 2 e
//maior que 2000 o sistema informa a mensagem de valor inválido.
se ((valorSaque <= 2000) e (valorSaque > 1) e ((valorSaque - int(valorSaque)) = 0) e (int(valorSaque) <> 3) e (controle1 = controle2)) entao
   escreval("Valor solicitado: R$",int(valorSaque))
   se (int(valorSaque) % 2 = 0) entao
      nota2 <- int(valorSaque)\2
   senao
      se ((int(valorSaque) % 5 = 1) ou (int(valorSaque) % 5 = 3)) entao
         nota5 <- (int(valorSaque)\5) - 1
         nota2 <- ((int(valorSaque)%5) + 5)\2
      senao
         nota5 <- int(valorSaque)\5
         nota2 <- (int(valorSaque)%5)\2
      fimse
   fimse
   //calcula a quantidade de notas de 2
   se ((nota2 > 4) ou ((nota2 \ 5) > 0) ) entao
      nota10 <- nota10 + ( nota2 \ 5)
      nota2 <-( nota2 % 5)
   fimse
   //calcula a quantidade de notas de 5
   se ((nota5 > 1) ou ((nota5 \ 2) > 0)) entao
      nota10 <- nota10 + (nota5 \ 2)
      nota5 <- (nota5 % 2)
   fimse
   //calcula a quantidade de notas de 10
   se ((nota10 > 1) ou ((nota10 \ 2) > 0)) entao
      nota20 <- nota20 + (nota10 \ 2)
      nota10 <- (nota10 % 2)
   fimse
   //calcula a quantidade de notas de 20
   se ((nota20 > 2) ou ((nota20 \ 3) > 0)) entao
      nota10 <- nota10 + (nota20 \ 3)
      nota50 <- nota50 + (nota20 \ 3)
      nota20 <- (nota20 % 3)
      se ((nota10 > 1) ou ((nota10 \ 2) > 0)) entao
         nota20 <- nota20 + (nota10 \ 2)
         nota10 <- (nota10 % 2)
         se(nota20 > 1) e (nota10 > 0) entao
            nota20 <- nota20 - 2
            nota10 <- nota10 - 1
            nota50 <- nota50 + 1
         fimse
      fimse
   fimse
   //calcula a quantidade de notas de 50
   se ((nota50 > 1) ou ((nota50 \ 2) > 0)) entao
      se ((nota20 > 2) ou ((nota20 \ 3) > 0)) entao
         nota10 <- nota10 + (nota20 \ 3)
         nota50 <- nota50 + (nota20 \ 3)
         nota20 <- (nota20 % 3)
         se ((nota10 > 1) ou ((nota10 \ 2) > 0)) entao
            nota20 <- nota20 + (nota10 \ 2)
            nota10 <- (nota10 % 2)
            se(nota20 > 1) e (nota10 > 0) entao
               nota20 <- nota20 - 2
               nota10 <- nota10 - 1
               nota50 <- nota50 + 1
            fimse
         fimse
      fimse
      nota100 <- nota100 + (nota50 \ 2)
      nota50 <- (nota50 % 2)
   fimse
   //calcula a quantidade de notas de 100 e 200
   se ((nota100 > 1) ou ((nota100 \ 2) > 0)) entao
      se ((nota50 > 1) ou ((nota50 \ 2) > 0)) entao
         nota100 <- nota100 + (nota50 \ 2)
         nota50 <- (nota50 % 2)
         se ((nota20 > 2) ou ((nota20 \ 3) > 0)) entao
            nota10 <- nota10 + (nota20 \ 3)
            nota50 <- nota50 + (nota20 \ 3)
            nota20 <- (nota20 % 3)
            se ((nota10 > 1) ou ((nota10 \ 2) > 0)) entao
               nota20 <- nota20 + (nota10 \ 2)
               nota10 <- (nota10 % 2)
               se(nota20 > 1) e (nota10 > 0) entao
                  nota20 <- nota20 - 2
                  nota10 <- nota10 - 1
                  nota50 <- nota50 + 1
               fimse
            fimse
         fimse
      fimse
      nota200 <- nota200 + (nota100 \ 2)
      nota100 <- (nota100 % 2)
   fimse
   //soma <- (nota200*200) + (nota100*100) + (nota50*50) + (nota20*20) + (nota10*10) + (nota5*5) + (nota2*2) ---------RETIRADO NA CORREÇÃO--------
   //resto <- int(valorSaque) - soma                                                                            ---------RETIRADO NA CORREÇÃO--------
senao
   escreval("Valor inválido.")
   escreval("**Insira um valor POSITIVO e MENOR que o limite de saque de sua conta!")
   escreval("***Insira APENAS números! Não insira caracteres!")
fimse
//Sistema verifica quais notas vai disponibilizar para o cliente de acordo
//com o valor de saque
se (nota200 <= 0)entao
   escreva("")
senao
   escreval("Notas de R$ 200,00: ",nota200)
fimse
se (nota100 <= 0) entao
   escreva("")
senao
   escreval("Notas de R$ 100,00: ",nota100)
fimse
se (nota50 <= 0) entao
   escreva("")
senao
   escreval("Notas de R$ 50,00: ",nota50)
fimse
se (nota20 <= 0) entao
   escreva("")
senao
   escreval("Notas de R$ 20,00: ",nota20)
fimse
se (nota10 <= 0) entao
   escreva("")
senao
   escreval("Notas de R$ 10,00: ",nota10)
fimse
se (nota5 <= 0) entao
   escreva("")
senao
   escreval("Notas de R$ 5,00: ",nota5)
fimse
se (nota2 <= 0) entao
   escreva("")
senao
   escreval("Notas de R$ 2,00: ",nota2)
fimse
//____________________________---------RETIRADO NA CORREÇÃO--------____________
//se (resto > 0) entao
//   escreval("Você sacou R$",soma)
//   escreval("O valor restante de R$", resto," será devolvido a sua conta")
//fimse
//____________________________________________________________________________
escreval("")
escreval("A Caixa Econômica Federal agradece, obrigado!")
fimalgoritmo
