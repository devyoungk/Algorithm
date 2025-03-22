def solution(clothes):
    A = dict()
    for a, b in clothes:
        if b in A:
            A[b] += 1
        else:
            A[b] = 1
    n = 1
    for x in A.values():
        n *= (x+1)
    return n - 1