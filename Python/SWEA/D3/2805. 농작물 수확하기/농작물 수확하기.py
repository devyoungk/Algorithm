T = int(input())
for t in range(1, T+1):
    N = int(input())
    A = []
    for _ in range(N):
        S = input()
        x = []
        for s in S:
            x.append(int(s))
        A.append(x)
    S = 0
    for i in range(1+N//2):
        S += sum(A[i][N//2-i:i+N//2+1])
    for i in range(1+N//2,N):
        S += sum(A[i][i-N//2:N//2-i+N])
    print(f'#{t} {S}')