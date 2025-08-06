def troca(L, i, j):
    temp = L[i]
    L[i] = L[j]
    L[j] = temp
 
def empurra(L, n):
    i = 0
    while i < n-1:
        if L[i] > L[i+1]:
            troca(L, i, i+1)
        i += 1

def bubble_sort(L):
    for n in range(len(L), 1, -1):
        empurra(L, n)
        n -= 1
