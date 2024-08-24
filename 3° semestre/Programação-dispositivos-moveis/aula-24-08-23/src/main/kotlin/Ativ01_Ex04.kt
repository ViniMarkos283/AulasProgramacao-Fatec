fun main(){
    println("Insira o valor em graus celsius:")
    var celsius = readLine().toString().toInt()
    println("A conversão de celsius para fahrenheit é de: ${(9 * celsius + 160)/5}")
}