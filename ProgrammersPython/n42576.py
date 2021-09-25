def solution(participant, completion):
    dic = dict()
    for name in participant:
        dic[name] = dic.get(name, 0) + 1
    for name in completion:
        dic[name] = dic.get(name, 0) - 1
        if dic[name] == 0:
            dic.pop(name)
    return list(dic.keys())[0]
