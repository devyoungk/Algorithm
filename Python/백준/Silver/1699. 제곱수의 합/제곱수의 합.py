N = int(input())
A = [i**2 for i in range(1,int((N**0.5)+1))]
DP = [0] * (N+1)
DP[1] = 1

for i in range(2,N+1):
    MIN = i
    for a in A:
        if a > i:
            break
        MIN = min(MIN, DP[i-a] + 1)
    DP[i] = MIN

print(DP[-1])