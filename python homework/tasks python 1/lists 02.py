import random

a = [random.randint(0,9999) for x in range(random.randint(50,100))]
b = [random.randint(0,9999) for x in range(random.randint(50,100))]


res = []
print("Общие числа:")
for num in a:
    if num in b:
        res.append(num)
print(res)