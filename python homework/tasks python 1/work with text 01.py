text = input("Введите текст: ")
words = text.split()

words_count = {}
for word in words:
     if words_count.get(word) == None:
         words_count[word] = 1
     else:
         words_count[word]+=1

max_word = words[0]
freq_word = words[0]
max_len = len(words[0])
max_freq = 1
for word in words_count:    
     if len(word) > max_len:
         max_len = len(word)
         max_word = word

     if words_count.get(word) > max_freq:
         max_freq = words_count.get(word)
         freq_word = word

print("Самое часто встречающееся слово:", freq_word)
print("Самое длинное слово:", max_word)