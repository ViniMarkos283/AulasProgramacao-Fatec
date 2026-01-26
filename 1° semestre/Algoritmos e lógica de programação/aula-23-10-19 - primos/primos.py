n = int(input("n? "))
qtd_divisores = 0
potencial = 1

while potencial <= n:
    if n % potencial == 0:
        qtd_divisores += 1
    potencial += 1
if qtd_divisores == 2:
    print('é primo!')
else:
    print('não é primo!')
