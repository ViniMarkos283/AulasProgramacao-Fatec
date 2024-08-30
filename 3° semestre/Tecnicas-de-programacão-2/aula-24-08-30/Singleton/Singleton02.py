class Carrinho:
    instance = None

    def __init__(self):
        if Carrinho.instance is None: # verifica se existe ou não
            Carrinho.instance = self # cria uma instancia
            self.itens = []
        else:
            raise Exception('Esta clsse é um Singleton')
        
    @staticmethod # só pode ser usado dentro da sua propria classe
    def getInstance():
        if not Carrinho.instance:
            Carrinho()
        return Carrinho.instance
    
    def addItem(self, item):
        self.itens.append(item)

    def getItens(self):
        return self.itens
    
class Produto:
    def __init__(self, nome, preco):
        self.nome = nome
        self.preco = preco

# Exemplo de uso em um e-commerce de loja de roupas:
    # criação dos carrinhos - instanciamento:
carrinho1 = Carrinho.getInstance()
carrinho2 = Carrinho.getInstance()
  
    # Criando produtos para serem comercializados no sistema:
produto1 = Produto('Produto 1', 50.00)
produto2 = Produto('Produto 2', 100.00)
produto3 = Produto('Produto 3', 49.90)
produto4 = Produto('Produto 4', 59.70)

    # Exibindo itens no carrinho 1 e 2 - antes
print('itens do carrinho 1: ')
for item in carrinho1.getItens():
    print(item.nome, ' - ', item.preco)

print('itens do carrinho 2: ')
for item in carrinho2.getItens():
    print(item.nome, ' - ', item.preco)

    # adicionando produtos no carrinho 1
carrinho1.addItem(produto1)
carrinho1.addItem(produto3)

    # Adicionando produtos no carrinho 2
carrinho2.addItem(produto2)
carrinho2.addItem(produto4)

    # Exibindo itens no carrinho 1 e 2 - depois
print('itens do carrinho 1: ')
for item in carrinho1.getItens():
    print(item.nome, ' - ', item.preco)

print('itens do carrinho 2: ')
for item in carrinho2.getItens():
    print(item.nome, ' - ', item.preco)