import requests
import json
import re
import urllib

def saveAll(text):
    links_digits = []
    links_eng_and_digits = []
    links_rus_spaces = []
    other_links = []

    titles = re.findall(r'title="(.*?)"', text)
    
    for title in titles:
        if re.search(r'\d', title):
            links_digits.append(title)
        elif re.search(r'[a-zA-Z]\d', title):
            links_eng_and_digits.append(title)
        elif re.search(r'[а-яА-Я\s]*$',title):
            links_rus_spaces.append(title)
        else:
            other_links.append(title)

    with open('links_digits', 'w') as file:
        json.dump(links_digits, file, ensure_ascii=False)
   
    with open('links_eng_and_digits', 'w') as file:
        json.dump(links_eng_and_digits, file, ensure_ascii=False)

    with open('links_rus_spaces', 'w') as file:
        json.dump(links_rus_spaces, file, ensure_ascii=False)

    with open('other_links', 'w') as file:
        json.dump(other_links, file, ensure_ascii=False)
   

 



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
    saveAll(body) 


season_events(7, 1996) 