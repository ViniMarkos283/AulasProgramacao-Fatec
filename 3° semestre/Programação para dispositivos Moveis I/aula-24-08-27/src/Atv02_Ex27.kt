/*
27. O cardápio de uma lanchonete é o seguinte:

                       Especificação 	Código 	Preço
                       Cachorro quente 	100 		1,20
                       Bauru simples 	101 		1,30
                       Bauru com ovo 	102 		1,50
                       Hambúrger 		103 		1,20
                       Cheeseburguer 	104 		1,30
                       Refrigerante 		105 		1,00

Faça um programa na Linguagem Kotlin que leia o código do item pedido, 
a quantidade e calcule o valor a ser pago por aquele lanche. 
Considere que a cada execução somente será calculado um item.
*/

fun main(){
    var preco = 0.00
    
    println("Qual é o codigo do produto?")
    var code = readLine().toString().toInt()
    println("Quantos vai levar?")
    var qtd = readLine().toString().toInt()
    
    when(code){
        100 -> preco = 1.2
        101 -> preco = 1.3
        102 -> preco = 1.5
        103 -> preco = 1.2
        104 -> preco = 1.3
        105 -> preco = 1.0
    }
    
    println("O preço total do seu produto é de: R$ ${qtd * preco}")

}