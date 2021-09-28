from collections import deque

start, end = map(int, input().split())
MAX = 10000
deq = deque([start])
visited = [0] * (MAX + 1)
dist = [0] * (MAX + 1)

while True:
    now = deq.popleft()
    if now == end:
        break
    for next in (now - 1, now + 1, now + 5):
        if 0 < next < MAX:
            if visited[next] == 0:
                deq.append(next)
                visited[next] = 1
                dist[next] += 1

print(dist[end])

