def solution(array):
    A = [0]*1000
    for n in array:
        A[n] += 1
    if A.count(max(A)) > 1:
        answer = -1
    else:
        answer = A.index(max(A))
    return answer