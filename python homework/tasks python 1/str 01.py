def search_substr(subst, st):
     subst = subst.lower()
     st = st.lower()

     if subst in st:
         return 'Есть контакт!'
     return 'Мимо!'

str1 = input()
str2 = input()
print(search_substr(str1, str2))