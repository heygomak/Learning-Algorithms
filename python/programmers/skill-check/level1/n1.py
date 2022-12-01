def solution(a,  b):
    answer = 0
    flag = 1 if a < b else -1
    for i in range(a,  b + flag,  flag):
        answer += i
    return answer
