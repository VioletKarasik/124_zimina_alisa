import random

a = [random.randint(0,9999) for x in range(random.randint(50,100))]
b = [random.randint(0,9999) for x in range(random.randint(50,100))]

print("Нет во втором:")
for num in a:
    if num not in b:
        print(num, end=" ")