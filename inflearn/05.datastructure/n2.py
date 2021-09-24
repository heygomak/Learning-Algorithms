arr = input()
stack = []
count = 0

for i in range(arr):
    if arr[i] == "(":
        stack.append(arr[i])
    else:
        stack.pop()
        count += len(stack) if arr[i - 1] == "(" else 1

print(count)

