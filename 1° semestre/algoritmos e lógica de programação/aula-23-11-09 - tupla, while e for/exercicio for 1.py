# crie um programa que solicitee ao usuario 5 preços de
# mercadorias, some os preços e, no final exiba o total
# dessa soma (versao while e for) obs. não use listas

#versao for
total = 0

for i in range(0, 5):
    price = float(input('preço: '))
    total += price

print(f'o total é R${total:.2f}')
