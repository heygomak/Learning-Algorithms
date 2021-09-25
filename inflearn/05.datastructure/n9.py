str1 = input()
str2 = input()
str_dict = dict()

for x in str1:
    str_dict[x] = str_dict.get(x, 0) + 1

for x in str2:
    str_dict[x] = str_dict.get(x, 0) - 1

for x in str1:
    if str_dict.get(x) != 0:
        print("NO")
        break
    else:
        print("YES")

