# crie uma função que exiba todos os segundos do primeiro
# minuto

from time import sleep

def relogio():
    s = 0
    while s < 60:
        print(f'00:00:{s:02}')
        s += 1
        sleep(0.1)

relogio()
