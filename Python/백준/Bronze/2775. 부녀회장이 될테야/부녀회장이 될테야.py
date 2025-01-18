def X(a, b):
    A = [[0] * (b+1) for _ in range(a+1)]
    for i in range(b+1):
        A[0][i] = i
    
    for i in range(1, a+1):
        A[i][0] = 0
        for j in range(1, b+1):
            A[i][j] = A[i][j-1] + A[i-1][j]

    return A[a][b]


T = int(input())
for _ in range(T):
    k = int(input())
    n = int(input())
    print(X(k,n))