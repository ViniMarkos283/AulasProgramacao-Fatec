n = int(input("n? "))
potencial = 2

while potencial < n:
    if n % potencial == 0:
        break
    potencial += 1
    
if potencial == n:
    print('é primo!')
else:
    print('não é primo!')
