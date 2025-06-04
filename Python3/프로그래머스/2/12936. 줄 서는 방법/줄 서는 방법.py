def solution(n, k):
    A = [i+1 for i in range(n)]
    X = 1
    for i in range(1, n):
        X *= i
    answer = []
    for i in range(n-1,0,-1):
        answer.append(A.pop((k-1)//X)) 
        k %= X
        X //= i
    answer.append(A[0])
    return answer