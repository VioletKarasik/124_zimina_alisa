import random

user_name = input("Введите имя: ")
number = random.randint(1, 100)
count = 1

while True:
     user_number = int(input("Введите число: "))
    
     if user_number == number:
         break
     elif user_number > number:
         print("Загаданное число меньше")
     else:
         print("Загаданное число больше")

     count+=1
    
print("Угадали!")
file = open('game.txt', 'a')
line = "Попытки: {} | Имя пользователя: {}\n".format(count, user_name)
file.write(line)
file.close()