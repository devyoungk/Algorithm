A = [0, 1, 2]
def solution(n):
    global A
    if n < len(A):
        return A[n]
    for i in range(len(A), n+1):
        A.append((A[i-1]+A[i-2])%1000000007)
    return A[n]%1000000007