from collections import deque
import copy


def check(q):
    count = 0
    temp = []
    while q:
        s = q.popleft()
        if s == "[" or s == "{" or s == "(":
            count += 1
            if s == "[":
                temp.append("]")
            elif s == "{":
                temp.append("}")
            elif s == "(":
                temp.append(")")
        else:
            count -= 1
            if count < 0:
                return False
            if temp.pop() != s:
                return False
    if count == 0:
        return True
    else:
        return False


def solution(s):
    answer = 0
    q = deque(list(s))
    for i in range(len(s)):
        q.rotate(-1)
        temp = copy.deepcopy(q)
        if check(temp):
            answer += 1
    return answer


print(solution("[)(]"))
