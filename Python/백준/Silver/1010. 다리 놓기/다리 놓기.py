T = int(input())
for _ in range(T):
    N, M = map(int,input().split())
    if N == 1:
        print(M)
        continue
    elif N == M:
        print(1)
        continue
    else:
        A = [[1 for _ in range(M+1)]for _ in range(N+1)]
        for i in range(1, N+1):
            for j in range(1, M+1):
                A[i][j] = sum(A[i-1][n] for n in range(i-1,j))
    print(A[-1][-1])