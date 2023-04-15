import datetime
import time
import csv

file = open('rows_300.csv', mode='w')
writer = csv.writer(file, delimiter=';')
writer.writerow(['#', 'Date and time', 'Second', 'Microsecond'])

for i in range(1, 301):
    now = datetime.datetime.now()
    second = now.second
    microsecond = now.microsecond

    writer.writerow([i, now, second, microsecond])
    time.sleep(0.01)

file.close()