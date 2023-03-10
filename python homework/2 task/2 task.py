import requests
import urllib.parse

def parseEvents(text, count):
    events = []

    index = text.find('id="mw-pages"') 
    while count > 0 and index != -1:
        a_start = text.find("<li>", index) + 4
        a_end = text.find(">", a_start) + 1
        a_close = text.find("<", a_end)
        events.append(text[a_end:a_close])
        index = a_close
        count -= 1
    return events  

def season_events(number_of_month, year):

    months = ["Январь", "Февраль", "Март", 
              "Апрель", "Май", "Июнь", 
              "Июль", "Август", "Сентябрь", 
              "Октябрь", "Ноябрь", "Январь"]    
    
    # Формирования url
    url = "Категория:{}_{}_года".format(months[number_of_month - 1], year)
    url = "https://ru.wikipedia.org/wiki/" + urllib.parse.quote(url) 

    # Получение страницы
    r = requests.get(url)
    body = r.text

    # Сбор событий
    events = parseEvents(body, 5)
    
    # Запись в файл
    file = open("wiki.txt", "w")
    text = "Вы родились в {} в {} году: \n{}".format(months[number_of_month - 1], year, "\n".join(events))
    file.write(text)
    file.close()

month = int(input())
year = int(input())
season_events(month, year)