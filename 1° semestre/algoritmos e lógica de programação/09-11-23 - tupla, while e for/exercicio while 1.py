# crie um programa que solicitee ao usuario 5 preços de
# mercadorias, some os preços e, no final exiba o total
# dessa soma (versao while e for) obs. não use listas

#versao while
i = 0
total = 0

while i < 5:
    preco = float(input('preço: '))
    total += preco
    i += 1

print(f'o total é R${total:.2f}')

              

