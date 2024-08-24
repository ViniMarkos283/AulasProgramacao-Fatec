fun main(){
    println("Valor Inicial da Prestação:")
    var valorInicial = readLine().toString().toDouble()
    println("Taxa de Juros: ")
    var taxaJuros = readLine().toString().toDouble()
    println("Tempo em Dias: ")
    var tempoDias = readLine().toString().toInt()

    taxaJuros = taxaJuros * 0.01
    var total = valorInicial + (valorInicial * taxaJuros * tempoDias)

    println("Valor Total da Prestação: R$ $total")
}