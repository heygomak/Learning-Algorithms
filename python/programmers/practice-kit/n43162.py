from collections import deque


def solution(n, computers):
    answer = 0
    visited = [0] * n
    for i in range(n):
        if visited[i] != 1:
            q = deque()
            q.append(i)
            while q:
                x = q.popleft()
                visited[x] = 1
                for y in range(n):
                    if x != y and computers[x][y] == 1 and visited[y] == 0:
                        q.append(y)
            answer += 1
    return answer


print(solution(3, [[1, 1, 0], [1, 1, 0], [0, 0, 1]]))
