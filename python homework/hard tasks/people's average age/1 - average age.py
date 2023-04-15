# задача 1: работа с JSON
# вам дан файл из 4 записей о людях, с разными датами рождения.
# прочитать файл, посчитать средний возраст этих людей
# [
#     {
#         "name": "Декабрьский Иван",
#         "birthday": "01/12/2000",
#     },
#     {
#         "name": "Сергеев Илья",
#         "birthday": "25/06/2001",
#     },
#     {
#         "name": "Летняя Мария",
#         "birthday": "29.06.1997",
#     },{
#         "name": "Зимний Максим",
#         "birthday": "1997-12-05",
#     },
# ]

import json
import datetime

file = open('ages.json')
data = json.load(file)

today = datetime.date.today()
total_age = 0
for person in data:
    birthday = person['birthday']
    if '/' in birthday:
        correct_birthday = datetime.datetime.strptime(birthday, '%d/%m/%Y').date()
    elif '.' in birthday:
        correct_birthday = datetime.datetime.strptime(birthday, '%d.%m.%Y').date()
    elif '-' in birthday:
        correct_birthday = datetime.datetime.strptime(birthday, '%Y-%m-%d').date()
    age = (today - correct_birthday).days // 365
    total_age += age

print(total_age // len(data))