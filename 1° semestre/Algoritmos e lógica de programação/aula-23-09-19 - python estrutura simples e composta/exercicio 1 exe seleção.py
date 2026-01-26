value = int(input('valor de 4 digitos: '))
part1 = value//100
part2 = value % 100
soma = part1 + part2
print(f'a soma das partes é de: {soma}')
total = soma * soma
if value == total:
    print("Sim")
else:
    print("Não")
