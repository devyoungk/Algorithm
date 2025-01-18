def X(a, b):
    A = [list(range(b+1))]
    for i in range(1,a+1):
        B = []
        for j in range(0, b+1):
            c = 0
            for k in range(0, j+1):
                c += A[i-1][k]
            B.append(c)
        A.append(B)
    return(A[a][b])


T = int(input())
for _ in range(T):
    k = int(input())
    n = int(input())
    print(X(k,n))