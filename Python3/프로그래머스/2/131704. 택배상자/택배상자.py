def solution(order):
    belt = []
    sub = []
    idx = 0
    for i in range(1, len(order)+1):
        if i == order[idx]:
            belt.append(i)
            idx += 1
        else:
            sub.append(i)
        while sub and idx < len(order) and order[idx] == sub[-1]:
            belt.append(sub.pop())
            idx += 1
    return len(belt)