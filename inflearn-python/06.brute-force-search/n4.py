import sys
sys.stdin = open('../input.txt', 'r')


def dfs(v, sub_sum):
    if v == n:
        if sub_sum == (total_sum - sub_sum):
            return True
        return False
    else:
        if sub_sum > total_sum // 2:
            return
        dfs(v + 1, sub_sum)
        dfs(v + 1, sub_sum + arr[v])


n = int(input())
arr = list(map(int, input().split()))
total_sum = sum(arr)

if total_sum % 2 != 0:
    print("NO")

if dfs(0, arr[0]):
    print("YES")
else:
    print("NO")


