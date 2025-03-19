def solution(k, tangerine):
    answer = 0
    A = dict()
    for x in tangerine:
        if x in A:
            A[x] += 1
        else:
            A[x] = 1
    A = sorted(A.items(), key = lambda x:-x[1])
    i = 0
    for a in A:
        i += a[1]
        answer += 1
        if i >= k:
            break
    return answer