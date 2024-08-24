fun main(){
    val pi = 3.14159

    println("insira o valor do raio da circunferencia: ")
    var raio = readLine().toString().toInt()
    println("O valor da area da circunferencia é de: ${pi * (raio * raio)}")
}