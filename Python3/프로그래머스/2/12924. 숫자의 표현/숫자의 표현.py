def solution(n):
    A = [0]
    i = 1
    while True:
        if A[-1]+i > n:
            break
        A.append(A[-1]+i)
        i += 1
    
    answer = 1
    for i in range(2, len(A)):
        if (n-A[i])%i == 0:
            answer += 1
    return answer