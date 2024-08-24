# crie um progrma aque peça ao usuario uma quantidade n de itens
# que serão comprados  no mercado, em seguida, solicite o preço de
# cada um dos n itens e ao final exiba a soma e a media total dos peços

n = int(input('quantidade? '))
soma = 0.0

while n > 0:
    preco = float(input('preço? '))
    soma += preco
    n -= 1

# print('total = R$ %.2f' % soma)
# print('total = R$ {:.2f}' .format(soma))
print(f'total = R$ {soma:.2f}')



    
