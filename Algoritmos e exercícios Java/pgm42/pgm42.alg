algoritmo "pgm42"
// Função : Algoritmo para representar tomada de decisão.
//          Cálculo de IMC
// Autor :  Willian Carlos Gomes
// Data : 27/01/2021

// Seção de Declarações
var
peso, altura, imc: real

inicio

//Leitura das características do usuário
escreval("Informe o seu peso:")
leia(peso)

escreval("Informe o sua altura:")
leia(altura)

//Cálculo do IMC e impressão em tela
imc <- (peso/altura^2)
escreval("Seu IMC é: ", imc,".")

//Condicionais
se (imc < 18.5) entao
   escreval("Você está abaixo do peso normal.")
fimse

se (imc >= 18.5) e (imc <= 24.9) entao
   escreval("Peso normal.")
fimse

se (imc >= 25.0) e (imc <=  29.9) entao
   escreval("Acima do peso.")
fimse

se (imc >= 30.0) e (imc <=  34.9) entao
   escreval("Obesidade nível I.")
fimse

se (imc >= 35.0) e (imc <=  39.9) entao
   escreval("Obesidade nível II.")
fimse

se (imc >= 40.0) entao
   escreval("Obesidade nível III.")
fimse

fimalgoritmo
