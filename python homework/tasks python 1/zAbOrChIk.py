def make_fence(st):
     res = ''
     for i in range(len(st)):
         if i % 2 == 0:
             res += st[i].lower()
         else:
             res += st[i].upper()
     return res
str1 = input()
print(make_fence(str1))