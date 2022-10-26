import re
with open('input_first.txt') as file:
    for line in file:
        print(len(re.findall(r'X-{\\', line)))
#Тесты
#№1
#X-{\
#Ответ: 1
#№2
#Y-{\
#Ответ: 0
#№3
#X-{\\\\\\X\x-{\XXX---{\\X-{\Xx-{\\X-{\X\X-}\X-{//X-{0\
#Ответ: 3
#№4
#X-X-{\{\X-{X-\{\X--------------------{{{{{\
#Ответ: 1
#№5
#X-{\X-{\X-{\X-{\X-{\X-{\X-{\X-{\X-{\X-{\X-{\X-{\X-{\X-{\X-{\X-{\X-{\X-X-{\{\
#Ответ: 18
