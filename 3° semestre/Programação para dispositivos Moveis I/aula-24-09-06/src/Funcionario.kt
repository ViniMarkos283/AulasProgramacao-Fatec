class Funcionario(){
    var nome: String = ""
    var salarioBruto: Double = 0.0
    var desconto: Double = 0.0

    fun salarioLiquido(): Double{
        return (salarioBruto - desconto)
    }

    fun aumentarSalario(porcent:Double): Double{
        return salarioLiquido() + (salarioBruto * porcent / 100)
    }
}

