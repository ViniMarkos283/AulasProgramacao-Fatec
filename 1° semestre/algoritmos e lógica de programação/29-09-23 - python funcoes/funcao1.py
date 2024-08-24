def exibe_media(n1, n2, n3):
    soma = n1 + n2 + n3
    print(soma / 3)

def retorna_media(num1, num2, num3):
    soma = num1 + num2 + num3
    return soma / 3

a = int(input('1 valor: '))
b = int(input('2 valor: '))
c = int(input('3 valor: '))
print()

resp1 = retorna_media(a, b, c)

x = int(input('1 valor: '))
y = int(input('2 valor: '))
z = int(input('3 valor: '))

resp2 = exibe_media(x, y, z)
print()

print(f'resp1 = {resp1}')
print(f'resp2 = {resp2}')
