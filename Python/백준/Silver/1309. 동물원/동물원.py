N = int(input())

DP = [0 for _ in range(N+1)]

DP[0] = 1
DP[1] = 3

if N > 1:
    for i in range (2, N+1):
        DP[i] = (2*DP[i-1]+DP[i-2])%9901

print(DP[N])