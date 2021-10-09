import heapq


def dijkstra(start):
    q = []
    heapq.heappush(q, (0, start))
    distance[start] = 0

    while q:
        dist, cur = heapq.heappop(q)
        if distance[cur] < dist:
            continue
        for next in graph[cur]:
            cost = dist + 1
            if cost < distance[next]:
                distance[next] = cost
                heapq.heappush(q, (cost, next))


M = 10001
a, b = map(int, input().split())
n, m = map(int, input().split())
distance = [M] * (n + 1)
graph = [[] for _ in range(n + 1)]
for _ in range(m):
    x, y = (map(int, input().split()))
    graph[x].append(y)
    graph[y].append(x)

dijkstra(a)

if distance[b] == M:
    print(-1)
else:
    print(distance[b])
