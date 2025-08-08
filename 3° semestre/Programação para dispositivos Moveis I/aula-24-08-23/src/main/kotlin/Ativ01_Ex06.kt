fun main(){
    println("digite o raio da lata: ")
    var raio = readLine().toString().toInt()
    println("digite o valor da altura da lata: ")
    var alt = readLine().toString().toInt()

    println("O volume da lata é de: ${3.14159 * (raio * raio) * alt}")
}