def cumprimento(nome, titulo, genero):
    if genero == 'M' or genero == 'm':
        x = "o"
    elif genero == 'F' or genero == 'f':
        x = "a"
    else:
        x = "e"
    print(f'Bom dia {titulo} {nome}, Seja bem-vind{x}!')

nome = input('nome?')
titulo = input('Titulo?')
genero = input('genero?')

cumprimento(nome, titulo, genero)
