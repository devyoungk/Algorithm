T = int(input())
dp = [0] * 1000001
dp[0] = 1
dp[1] = 1
dp[2] = 2
dp[3] = 4
L = 3
for _ in range(T):
    N = int(input())
    if dp[N]:
        print(dp[N])
    else:
        for i in range(L+1, N+1):
            dp[i] = (2*dp[i-1]-dp[i-4])%1000000009
        print(dp[N])
        L = N