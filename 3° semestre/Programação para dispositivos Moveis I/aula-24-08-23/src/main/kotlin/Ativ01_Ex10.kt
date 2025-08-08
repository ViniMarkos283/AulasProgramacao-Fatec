fun main(){
    print("Qual a cotação atual do Dólar? ")
    var cota = readLine().toString().toDouble()
    print("Valor em Dólares: US$ ")
    var dolar = readLine().toString().toDouble()

    println("Valor Convertido para reais: R$ ${cota * dolar}")
}