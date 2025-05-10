def isPrime(N):
    for i in range(2, int(N**0.5)+1):
        if N%i == 0:
            return False
    return True

P = set()
while True:
    N = int(input())
    if N == 0:
        break
    cnt = 0
    for i in range(N+1, 2*N+1):
        if i in P:
            cnt += 1
        elif isPrime(i):
            cnt += 1
            P.add(i)
    print(cnt)