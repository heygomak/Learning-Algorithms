from collections import deque

n,  k = map(int,  input().split())
que = deque([i for i in range(1,  n + 1)])

while len(que) > 1:
    for _ in range(k - 1):
        temp = que.popleft()
        que.append(temp)
    que.popleft()

print(que[0])
