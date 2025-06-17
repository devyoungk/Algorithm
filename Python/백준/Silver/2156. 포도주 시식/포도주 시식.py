N = int(input())
A = [0]
for _ in range(N):
    A.append(int(input()))

DP = [0 for _ in range(N+1)]
DP[1] = A[1]
if N > 1:
    DP[2] = A[1]+A[2]
    for i in range(3,N+1):
        DP[i] = max(DP[i-2]+A[i], DP[i-3]+A[i-1]+A[i], DP[i-1])

print(DP[-1])