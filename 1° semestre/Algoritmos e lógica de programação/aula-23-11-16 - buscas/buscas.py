from ordenacao_auxiliares import * #importei o outro arquivo para esse, igual as library
from bubble_sort import * # o asterisco importa tudo da biblioteca

# busca linear
def busca_linear(x,L,n):
    i = 0
    while i < n:
        if x == L[i]:
            return True # achou, ent retorna True
        i += 1
    return False        # retorna False caso n encontre

# busca binaria, mais rapida q a linear
def busca_binaria(x,L,n):
    i = 0
    f = n - 1
    while i <= f:
        m = (i + f)// 2
        if x == L[m]: return True
        elif x < L[m]: f = m -1
        else: i = m + 1
    return False
    
def main():
    # L = gera(9)
    L = [50,10,30,40,20,70,90,60,80]
    print(f'L = {L}')
    #bubble_sort(L)
    print(f'L = {L}')
    print(f'50 está em L? {busca_binaria(50,L,len(L))}')
    print(f'99 está em L? {busca_binaria(99,L,len(L))}')

    

    
##    L = [50, 10, 30, 40, 20, 70, 60]
##    print(L)
##    x = int(input('x? '))
##
##    if busca_linear(x, L, len(L)):
##        print(f'{x} foi encontrado!')
##    else:
##        print(f'{x} não foi encontrado!')

main()

#coment out = comenta tudo q está sendo focado pelo mouse
# a busca binaria só roda em sequencias ordenadas!
