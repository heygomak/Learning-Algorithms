from collections import deque

count = 0
n,  m = map(int,  input().split())
que = deque([(pos,  val) for pos,  val in enumerate(list(map(int,  input().split())))])

print(que)

while True:
    target = que.popleft()
    # any : 조건문 안에 하나라도 참이 존재하면 true 반환
    if any(target[1] < x[1] for x in que):
        que.append(target)
    else:
        count += 1
        if target[0] == m:
            break

print(count)

