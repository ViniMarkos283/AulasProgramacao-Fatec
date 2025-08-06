a = int(input('quantos iphones?'))
b = int(input('quantas pessoas?'))
q = 0

while a >= b:
    a = a - b
    q += 1
    
print(f'Quociente: {q}')
