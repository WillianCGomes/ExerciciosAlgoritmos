algoritmo "pgm42"
// Fun��o : Algoritmo para representar tomada de decis�o.
//          C�lculo de IMC
// Autor :  Willian Carlos Gomes
// Data : 27/01/2021

// Se��o de Declara��es
var
peso, altura, imc: real

inicio

//Leitura das caracter�sticas do usu�rio
escreval("Informe o seu peso:")
leia(peso)

escreval("Informe o sua altura:")
leia(altura)

//C�lculo do IMC e impress�o em tela
imc <- (peso/altura^2)
escreval("Seu IMC �: ", imc,".")

//Condicionais
se (imc < 18.5) entao
   escreval("Voc� est� abaixo do peso normal.")
fimse

se (imc >= 18.5) e (imc <= 24.9) entao
   escreval("Peso normal.")
fimse

se (imc >= 25.0) e (imc <=  29.9) entao
   escreval("Acima do peso.")
fimse

se (imc >= 30.0) e (imc <=  34.9) entao
   escreval("Obesidade n�vel I.")
fimse

se (imc >= 35.0) e (imc <=  39.9) entao
   escreval("Obesidade n�vel II.")
fimse

se (imc >= 40.0) entao
   escreval("Obesidade n�vel III.")
fimse

fimalgoritmo
