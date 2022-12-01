import sys
sys.stdin = open('../input.txt', 'r')


def dfs(num):
    if num == n + 1:
        for i in range(1, n + 1):
            if check[i] == 1:
                print(i, end=' ')
        print()
    else:
        check[num] = 1
        dfs(num + 1)
        check[num] = 0
        dfs(num + 1)


n = int(input())
check = [0] * (n + 1)

dfs(1)
