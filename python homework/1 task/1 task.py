import math

def function(g, m1, m2, r):
    f = (g*m1*m2)/(math.pow(r, 2))
    return f

g = 6.6743 * math.pow(10, -11)
m1 = 5.97600 * math.pow(10, 24)
print("Введите массу второй планеты в кг без множителя десятки в степени:")
m2_chislo = float(input())
print("Введите множитель десятки в степени второй планеты:")
m2_stepen = int(input())
m2 = m2_chislo * math.pow(10, m2_stepen)

print("Введите расстояние в км между планетами:")
r_chislo = float(input())
r = r_chislo  * 1000

f = function(g, m1, m2, r)
#print(float(g), float(m1), m2, r)
print("Сила гравитации между планетами:", f, "Н")