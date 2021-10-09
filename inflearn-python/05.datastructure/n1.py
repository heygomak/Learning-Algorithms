stack = []
num,  m = map(int,  input().split())
num = list(map(int,  str(num)))

for i in range(len(num)):
    target = num[i]
    while stack and m > 0 and stack[-1] < target:
        stack.pop()
        m -= 1
    stack.append(target)

if m > 0:
    stack = stack[:-m]

print(''.join(map(str,  stack)))

