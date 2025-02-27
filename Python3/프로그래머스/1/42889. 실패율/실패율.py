def solution(N, stages):
    A = dict()
    for i in range(N, 0, -1):
        t = 0
        x = 0
        for s in stages:
            if s >= i:
                t += 1
            if s == i:
                x += 1
        if t == 0:
            A[i] = 0
        else:
            A[i] = x/t
    answer = [k for k, v in sorted(A.items(), key=lambda x: (-x[1], x[0]))]
    return answer