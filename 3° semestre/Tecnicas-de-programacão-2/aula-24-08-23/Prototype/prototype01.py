import copy # n sei o q faz, se vira ae

class Pessoa:
    def __init__ (self, id, nome, idade):
        self.id = id
        self.nome = nome
        self.idade = idade

def clone(self):
    return copy.copy(self) # script do prof, o meu era diferente

# Classe gerenciamentoPessoa para gerenciar instancias de Pessoas:
class GerenciamentoPessoa:
    def __init__(self):
        self.pessoas = {}

    def adicionarPessoa(self, id, nome, idade):
        pessoa = Pessoa(id, nome, idade)
        self.pessoas[id] = pessoa

    def getPessoaById(id):
        pessoaOriginal = self.pessoas[id]
        if pessoaOriginal: return pessoaOriginal.clone()
        else: return None # n tem null, só none

# Criando 
gerencia = GerenciamentoPessoa()

gerencia.adicionarPessoa(1, 'junin', 21)
gerencia.adicionarPessoa(2, 'jobson', 40)
gerencia.adicionarPessoa(3, 'Edson', 30)

pessoaClone1 = gerencia.getPessoaById(1)
if pessoaClone1: pessoaClone1.nome = 'Junin Gameplays'

print('----------- Pessoa original -----------')
print(gerencia.getPessoaById(1).__dict__) # dict cria e grava um dicionario
print(gerencia.getPessoaById(2).__dict__)
print(gerencia.getPessoaById(3).__dict__)

print("----------- Pessoa clonada -----------")
print(pessoaClone1.__dict__)