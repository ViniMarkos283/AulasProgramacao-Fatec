// global e alteravel
var teste1 = document.getElementById("num1").value
// local e alteravel
var teste2 = document.getElementById("num2").value
// local e inalteravel, sem valor atribuido, faz ela não iniciar
// const total = teste1 + teste2

// imprimir no console do JS, equivale ao print e o syso
// ctrl + j abre o terminal, node code executa o codigo
// node js é uma extensao do js
// comando cls (significa clean) limpa o console



function soma() {

    // o queryselector pega qulaquer coisa q sirva para identificar alguma coisa 
    // parsefloat converte a variavel

    let teste1 = parseFloat(document.querySelector("#num1").value)
    let teste2 = parseFloat(document.querySelector("#num2").value)

    const total = teste1 + teste2
    console.log("a soma é: "+ total)
    alert("a soma é: "+ total)
}

function sub(){
    let teste1 = parseFloat(document.querySelector("#num1").value)
    let teste2 = parseFloat(document.querySelector("#num2").value)

    const total = teste1 - teste2
    console.log("a subtração é: " + total)
    alert("a subtração é: " + total)
}
function multi(){
    let teste1 = parseFloat(document.querySelector("#num1").value)
    let teste2 = parseFloat(document.querySelector("#num2").value) 

    const total = teste1 * teste2
    console.log("a multiplicação é: " + total)
    alert("a multiplicação é: " + total)
}
function div(){
    let teste1 = parseFloat(document.querySelector("#num1").value)
    let teste2 = parseFloat(document.querySelector("#num2").value) 

    const total = teste1 / teste2
    console.log("a divisão é: " + total)
    alert("a divisão é: " + total)
}

// chamar a função no console, só chamar ela igual no onclick
soma()
sub()
multi()
div()