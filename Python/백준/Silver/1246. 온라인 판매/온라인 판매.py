N, M = map(int,input().split())
P = [int(input()) for _ in range(M)]
P.sort(reverse=True)
M = 0
C = 0
for i in range(min(N,len(P))):
    x = P[i] * (i+1)
    if x > M:
        C = P[i]
        M = x
print(C, M)