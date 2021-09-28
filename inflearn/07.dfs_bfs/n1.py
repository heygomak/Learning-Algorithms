def dfs(day, sum):
    global res
    # 종료 지점
    if day == n + 1:
        if sum > res:
            res = sum
    else:
        # 1. 해당 일자에 상담을 하는 경우
        if day + T[day] <= n + 1:
            dfs(day + T[day], sum + P[day])
        # 2. 해당 일자에 상담을 하지 않는 경우
        dfs(day + 1, sum)


n = int(input)
T, P = [0]
for i in range(n):
    t, p = map(int, input().split())
    T.append(t)
    P.append(p)
res = -1
dfs(1, 0)
print(res)

