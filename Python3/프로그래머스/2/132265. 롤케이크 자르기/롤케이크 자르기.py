def solution(topping):
    answer = 0
    A = {}
    for t in topping:
        if t in A:
            A[t] += 1
        else:
            A[t] = 1
    NL = len(set(topping))
    NR = 0
    B = set()
    for t in topping[::-1]:
        if t not in B:
            B.add(t)
            NR += 1
        if t in A:
            A[t] -= 1
            if A[t] == 0:
                A.pop(t)
                NL -= 1
        if NL == NR:
            answer += 1
        elif NL < NR:
            break
    return answer