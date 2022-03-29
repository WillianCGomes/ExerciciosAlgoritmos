algoritmo "pgm65"
// Função : Descontos com combustível
// Autor :  Willian Carlos Gomes
// Data : 29/01/2021

// Seção de Declarações
var
A, G, qlitros: real
tcombustivel: caractere

inicio

//Obtendo informações do usuário
escreval("Digite quantos litros de combustivel deseja comprar:")
leia(qlitros)
escreval("Digite A se deseja comprar álcool, e G se deseja comprar gasolina:")
leia(tcombustivel)

//Possíveis respostas do sistema/Resultado em tela
se(qlitros<=20) e (tcombustivel="G")entao
   G<-(qlitros*3.30)*0.96
   escreval("O valor a ser pago é de RS", G)
senao
   se(qlitros>20) e (tcombustivel="G")entao
      G<-(qlitros*3.30)*0.94
      escreval("O valor a ser pago é de RS", G)
   senao
      se(qlitros<=20) e (tcombustivel="A")entao
         A<-(qlitros*2.90)*0.97
         escreval("O valor a ser pago é de RS", A)
      senao
         se(qlitros>20) e (tcombustivel="A")entao
            A<-(qlitros*2.90)*0.95
            escreval("O valor a ser pago é de RS", A)
            //Comando que responde caso o combustivel não seja especificado
         senao
            se(tcombustivel<>"G") ou (tcombustivel<>"A") entao
               escreval("O combustivel não foi especificado corretamente")
            fimse
         fimse
      fimse
   fimse
fimse
fimalgoritmo
