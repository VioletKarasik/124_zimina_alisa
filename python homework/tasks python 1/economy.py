S = [20, 34, 43, 34]
D = [34, 15, 43, 34, 75, 34]

count = 0
for i, j in list(zip(S, D)):
     if i == j:
         count+=1
print(count)