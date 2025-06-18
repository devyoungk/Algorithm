N = int(input())
DP = [0 for _ in range(N+1)]
DP[1] = 10
if N > 1:
    X = [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
    DP[2] = sum(X)
    for i in range(3,N+1):
        a = sum(X)
        Z = [a]
        X.sort(reverse=True)
        for x in X:
            a -= x
            if a == 0:
                break
            Z.append(a)
        DP[i] = sum(Z)
        X = Z

print(DP[N]%10007)