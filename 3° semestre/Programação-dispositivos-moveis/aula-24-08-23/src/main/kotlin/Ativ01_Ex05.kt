fun main(){
    println("Insira o valor em graus fahrenheit:")
    var f = readLine().toString().toInt()
    println("A conversão de fahrenheit para celsius é de: ${(f -32) * 5/9}")
}