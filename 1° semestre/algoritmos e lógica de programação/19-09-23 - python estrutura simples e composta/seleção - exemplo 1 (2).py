prod = float(input('preço produto: '))
qtd = int(input('Quantidade: '))
total = prod * qtd
if total >= 150.00:
    desconto = 0.15 * total
    total = total - desconto
    print(f'Desconto de 15% ativado: o desconto foi de R$ {desconto:.2f}')
print(f'Total a pagar: R$ {total:.2f}')
