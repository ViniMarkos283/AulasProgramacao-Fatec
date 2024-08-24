L = [4500.00, 8000.00, 20000.00]
i = 0

while i < len(L):
    L[i] += L[i] * 0.1
    i += 1

print(L)
