def isPrime(N):
    for i in range(2, int(N**0.5)+1):
        if N%i == 0:
            return 0
    return 1

A = [0 for _ in range(2*123456+1)]
while True:
    N = int(input())
    if N == 0:
        break
    cnt = 0
    for i in range(N+1, 2*N+1):
        if A[i]:
            cnt += 1
        elif isPrime(i):
            cnt += 1
            A[i] = 1
    print(cnt)