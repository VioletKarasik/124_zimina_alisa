#задача 1: работа с JSON

import json
import datetime

file = open("age.json")
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