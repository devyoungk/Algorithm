N = int(input())
A = [i for i in range(1,N) if int(i**0.5) == i**0.5]
DP = [0 for _ in range(N+1)]
DP[1] = 1

for i in range(2,N+1):
    MIN = i
    if int(i**0.5) == i**0.5:
        DP[i] = 1
        continue
    for a in A:
        if a >= i:
            continue
        MIN = min(MIN, DP[i-a] + 1)
    DP[i] = MIN

print(DP[-1])