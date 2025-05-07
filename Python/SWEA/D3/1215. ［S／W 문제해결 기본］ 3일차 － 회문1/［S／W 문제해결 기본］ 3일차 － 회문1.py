for t in range(1, 11):
    N = int(input())
    A = []
    for _ in range(8):
        S = input()
        X = []
        for s in S:
            X.append(s)
        A.append(X)
    cnt = 0
    for i in range(8):
        for j in range(9-N):
            s = ''
            for k in range(N):
                s += A[i][j+k]
            if s == s[::-1]:
                cnt += 1
    for i in range(8):
        for j in range(9-N):
            s = ''
            for k in range(N):
                s += A[j+k][i]
            if s == s[::-1]:
                cnt += 1
    
    print(f'#{t} {cnt}')