import re
with open('input_second.txt') as file:
    for line in file:
        lt = [x for x in re.split(r'\W', line) if len(x) != 0]
        for i in range(len(lt)):
            for j in range(len(lt)):
                cur_s = ' '.join(lt[i:j + 1])
                if re.fullmatch(r'\bВТ\b(?:[ ]\w*){,5}\bИТМО\b', cur_s):
                    print(cur_s)
        print()
#Тесты
#№1
#А ты знал, что ВТ – лучшая кафедра в ИТМО?
#Ответ: ВТ лучшая кафедра в ИТМО
#№2
#А ты знал, что ВТ – ВТ лучшая кафедра ИТМО? ИТМО
#Ответ: ВТ ВТ лучшая кафедра ИТМО
#ВТ ВТ лучшая кафедра ИТМО ИТМО
#ВТ лучшая кафедра ИТМО
#ВТ лучшая кафедра ИТМО ИТМО
#№3
#ВТ №1 кафедра в университете ИТМО
#Ответ: ВТ 1 кафедра в университете ИТМО
#4
#ВТ такой кафедры уже давно нет в ИТМО, ВТ ИТМО, ВТ -dwdwdw- ИТМО
#Ответ: ВТ ИТМО
#ВТ ИТМО ВТ dwdwdw ИТМО
#ВТ dwdwdw ИТМО
#5
#ВТ уау уа уаа уу вс ИТМО, вт ИТМО, ВТ итмо
#Ответ:
