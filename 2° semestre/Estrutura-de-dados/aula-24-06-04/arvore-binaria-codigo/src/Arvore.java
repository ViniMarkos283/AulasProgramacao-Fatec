// desafio da aula: contar as duplicatas da arvore, ex: 10 10 10 = 10/3

public class Arvore {
	private NoArvore raiz; 									// nó raiz

	public Arvore() { 										// construtor da arvore, com sua raiz iniciando nula
		raiz = null;
	}

	public void adicionaElemento(int e) {
		NoArvore novo = new NoArvore(e); 					// instancia de um novo nó
		if (raiz == null) 									// se a raiz inicia nula...
			raiz = novo; 									// raiz recebe o valor de novo, cujo seu valor foi atribuido na criação do nó, este valor é recebido pelo parametro
		else { 												// senao...
			NoArvore aux1 = raiz, aux2 = raiz; 				// tanto o aux1 quanto o aux2 vao receber o valor da raiz
			while (aux1 != null && aux1.elemento != e) { 	// enquanto aux1 não for nulo e diferente de E...
				aux2 = aux1; 								// aux2 recebe o aux1
				if (e < aux1.elemento) 						// se o E for menor q o elemento aux1
					aux1 = aux1.esquerda; 					// manda ele pro aux1 da esquerda
				else if (e > aux1.elemento) 
					aux1 = aux1.direita; 					// senao, manda ele pra direita
			}
			if (aux1 != null && e == aux2.elemento) 		// se o aux1 for diferente de null, e o E igual ao elemento aux2...
				aux1.qtd++; 								// alteração da msg de elemento repetido por incremento da qtd dele
			else {
				if (e < aux2.elemento) 						// se o E for menor que o aux2
					aux2.esquerda = novo; 					// aux2 da esquerda recebe o valor de novo
				if (e > aux2.elemento)
					aux2.direita = novo; 					// senão, o da direita que recebe
				System.out.println("Elemento Incluído " + novo.elemento);
			}
		}
	}

	public NoArvore removeMinimo(NoArvore node) {
		if (node == null) {
			System.out.println("ERRO");
		} else if (node.esquerda != null) {
			node.esquerda = removeMinimo(node.esquerda);
			return node;
		} else {
			return node.direita;
		}
		return null;
	}

	public NoArvore encontraMinimo(NoArvore node) {
		if (node != null) {
			while (node.esquerda != null) {
				node = node.esquerda;
			}
		}
		return node;
	}

	public void remove(int e) {
		if (raiz == null) {
			System.out.println("Arvore vazia ");
		} else if (raiz.elemento == e) {
			if (raiz.esquerda != null && raiz.direita != null) {
				System.out.println("Removeu No com o elemento " + raiz.elemento);
				raiz.elemento = encontraMinimo(raiz.direita).elemento;
				raiz.direita = removeMinimo(raiz.direita);
			} else {
				System.out.println("Removeu No com a matricula " + raiz.elemento);
				raiz = (raiz.esquerda != null) ? raiz.esquerda : raiz.direita;
			}
		} else
			remover(raiz, e);

	}

	public NoArvore remover(NoArvore node, int e) {

		if (node == null) {
			System.out.println("Arvore vazia ");
		} else if (e < node.elemento) {
			node.esquerda = remover(node.esquerda, e);
		} else if (e > node.elemento) {
			node.direita = remover(node.direita, e);
		} else if (node.esquerda != null && node.direita != null) {
			System.out.println("Removeu No com o elemento " + node.elemento);
			node.elemento = encontraMinimo(node.direita).elemento;
			node.direita = removeMinimo(node.direita);
		} else {
			System.out.println("Removeu No com a matricula " + node.elemento);
			node = (node.esquerda != null) ? node.esquerda : node.direita;
		}
		return node;
	}

	public void profundidade(NoArvore n) { // pré ordem
		if (n != null) {
			for(int i =1; i <= n.qtd; i++){
			System.out.print(" " + n.elemento);
		}
			profundidade(n.esquerda);
			profundidade(n.direita);
		}
	}

	public void ordemSimetrica(NoArvore n) { // em Ordem
		if (n != null) {
			ordemSimetrica(n.esquerda);
			for(int i =1; i <= n.qtd; i++){
				System.out.print(" " + n.elemento);
			}			
			ordemSimetrica(n.direita);
		}
	}

	public void posOrdem(NoArvore n) {
		if (n != null) {
			posOrdem(n.esquerda);
			posOrdem(n.direita);
			for(int i =1; i <= n.qtd; i++){
				System.out.print(" " + n.elemento);
			}		
		}
	}

	public int soma(NoArvore n) {
		int resp = 0;
		if (n != null) {
			resp = soma(n.esquerda) +
					soma(n.direita) + n.elemento;
		}
		return resp;
	}

	public int conta(NoArvore n) {
		int resp = 0;
		if (n != null) {
			resp = conta(n.esquerda) +
					conta(n.direita) + 1;
		}
		return resp;
	}

	public double media() {
		int s = soma(raiz);
		double c = conta(raiz);
		return s / c;
	}

	public NoArvore obtemRaiz() {
		return raiz;
	}
}