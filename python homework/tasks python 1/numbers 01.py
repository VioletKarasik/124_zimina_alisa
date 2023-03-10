import random

def magic(x, list_num):
    sum_nums = sum(list_num)
    return sum_nums % x == 0

x = int(input())
a = [random.randint(0,9999) for x in range(random.randint(5,100))]

print(magic(x,a))