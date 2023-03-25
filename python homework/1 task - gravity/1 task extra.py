import requests
import math
import json

def function(g, m1, m2, r):
    f = (g*m1*m2)/(math.pow(r, 2))
    return f

g = 6.6743 * math.pow(10, -11)
m1 = 5.97600 * math.pow(10, 24)
m2 = 420000

req = requests.get("https://api.wheretheiss.at/v1/satellites/25544")
alt = json.loads(req.text).get("altitude")

f = function(g, m1, m2, alt)
print(float(g), float(m1), m2, alt)
print("Сила гравитации между объектами:", f, "Н")