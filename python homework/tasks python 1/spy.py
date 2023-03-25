def auth(name):
     secret_names = ['Мавпродош', 'Лорнектиф',
                     'Древерол', 'Фиригарпиг', 'Клодобродыч']
     return name in secret_names


user_name = input("Введите имя: ")
if auth(user_name):
    print('Ты – свой. Приветствую, любезный {}!'.format(user_name))
else:
     print('Тут ничего нет. Еще есть вопросы?')