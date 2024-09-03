class Funcionario(){
    var nome: String = ""
    var salarioBruto: Double = 0.0
    var desconto: Double = 0.0
}

fun salarioLiquido():double{
    return salarioBruto - desconto
}
