fun main(){
    println("quantos anos você tem?")
    var ano = readLine().toString().toInt()
    println("quantos meses faz desde seu ultimo aniversário?")
    var mes = readLine().toString().toInt()
    println("quantos dias faz desde o dia do seu aniversário?")
    var dia = readLine().toString().toInt()

    var total = (ano * 365) + (mes * 30) +dia
    println("você ja viveu aproximadamente $total dias")
}