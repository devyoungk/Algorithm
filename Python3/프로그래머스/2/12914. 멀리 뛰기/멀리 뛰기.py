def solution(n):
    A = [0, 1, 2]
    if n == 1:
        return 1
    for i in range(3,n+1):
        A.append(A[i-1]+A[i-2])
    return A[-1]%1234567