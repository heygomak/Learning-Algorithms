import heapq

a = []
while True:
    n = int(input())
    if n == -1:
        break
    elif n == 0:
        print(-1) if len(a) == 0 else print(heapq.heappop(a))
    else:
        heapq.heappush(a, n)
