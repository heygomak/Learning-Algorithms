import sys
from collections import deque
sys.stdin = open('../input.txt', 'r')

n = 7
move = [(-1, 0), (0, 1), (1, 0), (0, -1)]
matrix = [list(map(int, input().split())) for _ in range(n)]
distance = [[0] * n for _ in range(n)]
q = deque()
q.append((0, 0))

# 이미 방문한 곳은 벽으로 바꿈
matrix[0][0] = 1

while q:
    temp = q.popleft()
    for i in range(len(move)):
        x = temp[0] + move[i][0]
        y = temp[1] + move[i][1]
        if 0 <= x <= 6 and 0 <= y <= 6 and matrix[x][y] == 0:
            matrix[x][y] = 1
            distance[x][y] = distance[temp[0]][temp[1]] + 1
            q.append((x, y))

if distance[n - 1][n - 1] == 0:
    print(-1)
else:
    print(distance[n - 1][n - 1])
