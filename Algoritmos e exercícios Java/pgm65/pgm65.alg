algoritmo "pgm65"
// Fun��o : Descontos com combust�vel
// Autor :  Willian Carlos Gomes
// Data : 29/01/2021

// Se��o de Declara��es
var
A, G, qlitros: real
tcombustivel: caractere

inicio

//Obtendo informa��es do usu�rio
escreval("Digite quantos litros de combustivel deseja comprar:")
leia(qlitros)
escreval("Digite A se deseja comprar �lcool, e G se deseja comprar gasolina:")
leia(tcombustivel)

//Poss�veis respostas do sistema/Resultado em tela
se(qlitros<=20) e (tcombustivel="G")entao
   G<-(qlitros*3.30)*0.96
   escreval("O valor a ser pago � de RS", G)
senao
   se(qlitros>20) e (tcombustivel="G")entao
      G<-(qlitros*3.30)*0.94
      escreval("O valor a ser pago � de RS", G)
   senao
      se(qlitros<=20) e (tcombustivel="A")entao
         A<-(qlitros*2.90)*0.97
         escreval("O valor a ser pago � de RS", A)
      senao
         se(qlitros>20) e (tcombustivel="A")entao
            A<-(qlitros*2.90)*0.95
            escreval("O valor a ser pago � de RS", A)
            //Comando que responde caso o combustivel n�o seja especificado
         senao
            se(tcombustivel<>"G") ou (tcombustivel<>"A") entao
               escreval("O combustivel n�o foi especificado corretamente")
            fimse
         fimse
      fimse
   fimse
fimse
fimalgoritmo
