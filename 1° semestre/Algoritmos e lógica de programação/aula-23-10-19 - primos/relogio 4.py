# crie uma função que exiba todos os segundos de todos os
# minutos da primeira hora

from time import sleep

def relogio():
    m = 0
    while m < 60:
        s = 0
        while s < 60:
            print(f'00:{m:02}:{s:02}')
            s += 1
            sleep(0.01)
        m += 1

relogio()
