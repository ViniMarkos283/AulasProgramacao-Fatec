# crie um progrma aque peça ao usuario uma quantidade n de itens
# que serão comprados  no mercado, em seguida, solicite o preço de
# cada um dos n itens e ao final exiba a soma total que corresponderá
# ao valor a ser pago pela compra

qtd_n = int(input('quantidade: '))
n = []
i = 0
total = 0

while i < qtd_n:
    n.append(float(input('valor? ')))
    total += n[i]
    i += 1

print(f'sua lista contem os seguintes valores {n}')
print(f'o total dos seus itens é de: {total}')
    
