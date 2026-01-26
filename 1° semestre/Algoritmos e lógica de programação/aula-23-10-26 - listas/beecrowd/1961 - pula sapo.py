def converte(L, tipo):
    i = 0
    while i < len(canos):
        L[i] = tipo(L[i])
        i += 1

def diferenca(x, y):
    if x >= y: return x - y
    else: return y - x

def consegue(canos, p):
    i = 0
    while i < len(canos)-1:
        if diferenca(canos[i], canos[i+1]) > p:
            return False
    i += 1
    return True

# strings vazias retornam false, quando a str tem algo, ent é true

p, n = input().split() # o split gera uma lista com os valores que ele quebra
# unpack: manda os valores quebrados para as variaveis na ordem de recebimento
p, n = int(p), int(n) # é possivel deixar a conversão em 1 linha só

canos = input().split()
converte(canos, int) # é possivel adicionar o tipo q vai ser convertido

if consegue(canos, p):
    print('YOU WIN')
else:
    print('GAME OVER')




