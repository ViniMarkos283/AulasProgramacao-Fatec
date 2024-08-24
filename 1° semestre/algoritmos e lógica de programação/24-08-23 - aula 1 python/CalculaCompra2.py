# -----------------------------------------------
# autor.....: marcos oliveira
# data......: 24/08/2023
# objetivo..: calcular o total de uma compra
# versão....: B (rev.0)
# -----------------------------------------------

preco = float(input('preço da mercadoria? '))
qtd = int(input('Quantidade? '))
total = preco * qtd
print(f'Total: R$ {total:.2f}')
