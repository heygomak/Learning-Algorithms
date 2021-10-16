from collections import deque
import sys
sys.stdin = open('input.txt', 'r')


def bfs(a, b):
    count = 0
    q = deque()
    q.append((a, b))
    while q:
        a, b = q.popleft()
        count += 1
        for j in range(4):
            tmp_x = b + dx[j]
            tmp_y = a + dy[j]
            if 0 <= tmp_x < n and 0 <= tmp_y < m and matrix[tmp_y][tmp_x] == 0:
                q.append((tmp_y, tmp_x))
                matrix[tmp_y][tmp_x] = 1
    return count


dy = [-1, 1, 0, 0]
dx = [0, 0, -1, 1]
m, n, k = map(int, input().split())
matrix = [[0] * n for _ in range(m)]
result = []

for _ in range(k):
    x1, y1, x2, y2 = map(int, input().split())
    for y in range(y1, y2):
        for x in range(x1, x2):
            matrix[y][x] = 1

for y in range(m):
    for x in range(n):
        if matrix[y][x] == 0:
            result.append(bfs(y, x))

result.sort()
print(len(result))
print(' '.join(map(str, result)))
