def solution(operations):
    heap = []
    for operation in operations:
        command,  num = operation.split()
        num = int(num)

        if command == "I":
            heap.append(num)
            for i in range(len(heap) - 1,  0,  -1):
                if heap[i] < heap[i - 1]:
                    temp = heap[i]
                    heap[i] = heap[i - 1]
                    heap[i - 1] = temp

        elif command == "D" and heap:
            if num == 1:
                heap.pop()
            else:
                heap.pop(0)

    if heap:
        return [heap[len(heap) - 1],  heap[0]]
    else:
        return [0,  0]


#print(solution(["I -45",  "I 653",  "D 1",  "I -642",  "I 45",  "I 97",  "D 1",  "D -1",  "I 333"]))
#print(solution(["I 4",  "I 3",  "I 2",  "I 1",  "D 1",  "D 1",  "D -1",  "D -1",  "I 5",  "I 6"]))

''' 
# heapq 사용한 버전 (두 heapq 간의 동기화 X)
def solution(operations):
    count = 0
    min_heap = []
    max_heap = []
    for operation in operations:
        command,  num = operation.split()
        if command == "I":
            heapq.heappush(min_heap,  int(num))
            heapq.heappush(max_heap,  -int(num))
            count += 1
        elif command == "D" and count > 0:
            if num == "1":
                heapq.heappop(max_heap)
            else:
                heapq.heappop(min_heap)
            count -= 1

        print("min_heap : ",  min_heap,  "max_heap : ",  max_heap)

    if count == 0:
        return [0,  0]
    else:
        return [-max_heap[0],  min_heap[0]]
'''
