def solution(A, B):
    if A == B:
        return 0
    for i in range(len(A)):
        A = A[-1] + A[:-1]
        if A == B:
            return i+1
    return -1