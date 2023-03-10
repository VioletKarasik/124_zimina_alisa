import requests
import urllib.parse

def season_events(number_of_month, year):

    months = ["Январь", "Февраль", "Март"]    
    url = "Категория:{}_{}_Года".format(months[number_of_month - 1], year)
    url = urllib.parse.quote(url)
    url = "https://ru.wikipedia.org/wiki/" + url
    r = requests.get(url)
    body = r.text

    titleIndex = body.find("h2")
    body = body[titleIndex:]
    print(body)



    # file = open("wiki.txt", "w")
    # source = "События"
    # result = "«Вы родились в {} в {} году. {}».".format(months[number_of_month-1], year, source)
    # file.write(result)
    # file.close()

season_events(2, 2000)