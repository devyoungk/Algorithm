def solution(bridge_length, weight, truck_weights):
    t = 0
    B = []
    w = []
    i = 0
    while True:
        t += 1
        for j in range(len(B)):
            B[j] -= 1
        if B and B[0] == 0:
            w = w[1:]
            B = B[1:]
        if i < len(truck_weights) and sum(w) + truck_weights[i] <= weight:
            w.append(truck_weights[i])
            i += 1
            B.append(bridge_length)
        if i == len(truck_weights) and not B:
            break
    return t