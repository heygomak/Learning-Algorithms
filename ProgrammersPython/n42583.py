from collections import deque


def solution(bridge_length, weight, truck_weights):
    time = 0
    cur = deque([0] * bridge_length)
    cur_weight = 0
    while cur:
        time += 1
        cur_weight -= cur.popleft()
        if truck_weights:
            if cur_weight + truck_weights[0] <= weight:
                temp = truck_weights.pop(0)
                cur_weight += temp
                cur.append(temp)
            else:
                cur.append(0)
    return time
