def solution(clothes):
    dic = dict()
    answer = 1
    for item in clothes:
        dic[item[1]] = dic.get(item[1],  1) + 1
    for item in dic.values():
        answer *= item
    return answer - 1
