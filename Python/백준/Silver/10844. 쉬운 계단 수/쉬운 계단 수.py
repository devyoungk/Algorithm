N = int(input())
mod = 1000000000

DP =[[0,0,0,0,0,0,0,0,0,0] for _ in range(N+1)]
DP[1] = [0, 1, 1, 1, 1, 1, 1, 1, 1, 1]

if N > 1:
    for i in range(2,N+1):
        for j in range(1,9):
            DP[i][j] = (DP[i-1][j-1]+DP[i-1][j+1])%mod
        DP[i][0] = DP[i-1][1]
        DP[i][9] = DP[i-1][8]

print(sum(DP[N])%mod)