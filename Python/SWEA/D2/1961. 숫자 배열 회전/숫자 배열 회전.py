def r(A):
    N = len(A)
    B = [[] for _ in range(N)]
    for i in range(N-1, -1, -1):
        for j in range(0, N):
            B[j].append(A[i][j])
    return B

T = int(input())
for t in range(1, T+1):
    N = int(input())
    A = [input().split() for _ in range(N)]
    X = ['' for _ in range(N)]   
    for _ in range(3):
        A = r(A)
        for i in range(N):
            X[i] += ''.join(A[i])+' '
    print(f'#{t}')
    for i in range(N):
        print(X[i])