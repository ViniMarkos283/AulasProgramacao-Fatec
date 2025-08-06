# crie um progrma aque peça ao usuario uma quantidade n de itens
# que serão comprados  no mercado, em seguida, solicite o preço de
# cada um dos n itens e ao final exiba a soma, a média e exiba todos os preços que
# forem abaixo dessa média

n = int(input('quantidade? '))
soma = 0.0
qtd = n
precos = [] # iniciando a lista
# a lista é heterogenea, pode ter tipos diferentes de itens(str, int, float...)
# a lista tbm funciona com valores negativos, a lista vai rodar de fim pro começo

while n > 0:
    preco = float(input('preço? '))
    precos.append(preco) # adição do valor na lista
    soma += preco
    n -= 1

    media = soma / qtd

print(f'total = R$ {soma:.2f}')
print(f'média = R$ {media:.2f}')
print('\nPreços abaixo da média: \n')

# percorrendo a lista de preços
i = 0

while i < len(precos): # enquanto a lista for menor q o tamanho do preços
    if precos[i] < media:
        print(f'R$ {precos[i]:.2f}') # so mostra caso o valor seja menor q a media
    i += 1
