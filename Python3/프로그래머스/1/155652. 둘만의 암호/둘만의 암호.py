def solution(s, skip, index):
    A = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z']
    answer = ''
    for a in skip:
        A.remove(a)
    for x in s:
        n = A.index(x)
        idx = n + index
        while idx >= len(A)-1:
            idx -= len(A)
        answer += A[idx]
    return answer