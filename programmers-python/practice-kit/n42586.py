from collections import deque


def solution(progresses,  speeds):
    answer = []
    que = deque([[idx,  val] for idx,  val in enumerate(progresses)])
    while que:
        count = 0
        for x in que:
            x[1] += speeds[x[0]]
        while que and que[0][1] >= 100:
            count += 1
            que.popleft()
        if count > 0:
            answer.append(count)
    return answer
