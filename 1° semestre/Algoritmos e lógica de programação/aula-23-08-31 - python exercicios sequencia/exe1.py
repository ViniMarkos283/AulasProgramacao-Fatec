# código fonte
preco = float(input('Digite o preço do produto: '))
qtd = float(input('Digite a quantidade: '))

total = (preco * qtd) * 0.9

print(f'O total do produto, junto ao desconto de 10% é de: R$ {total:.2f}')
