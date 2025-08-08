fun main(){
    print("Valor de A: ")
    var A = readLine().toString().toInt()
    print("Valor de B: ")
    var B = readLine().toString().toInt()

    var aux = A
    A = B
    B = aux

    println("OS valores de A e B foram trocados!")
    println("A: $A\nB: $B")
}