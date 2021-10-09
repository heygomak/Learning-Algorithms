def dfs(idx,  sum):
    global res
    if idx == n:
        # 대칭되는 노드의 값이 동일하기 때문에 음수는 고려하지 않는다
        # 동일한 값은 set에서 중복제거 된다
        if 0 < sum <= s:
            res.add(sum)
    else:
        # 1. 해당 무게의 추를 왼쪽에 두는 경우
        dfs(idx + 1,  sum + weight[idx])
        # 2. 해당 무게의 추를 오른쪽에 두는 경우
        dfs(idx + 1,  sum - weight[idx])
        # 3. 해당 무게의 추를 올려두지 않는 경우
        dfs(idx + 1,  sum)


n = int(input())
weight = list(map(int,  input().split()))
s = sum(weight)
res = set()
dfs(0,  0)
print(s - len(res))
