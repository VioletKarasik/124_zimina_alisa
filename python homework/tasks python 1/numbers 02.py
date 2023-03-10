import random

def eqv(a, b, c):
    eps = 0.0001
    return abs(a + b - c) <= eps

a = random.random() * (99999 - 1000) + 1000 
b = random.random() * (99999 - 1000) + 1000 
c = a + b
print(a,b,c)
print(eqv(a, b, c)) 