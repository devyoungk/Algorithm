A = ['WBWBWBWB','BWBWBWBW']*4
B = A[::-1]

N, M = map(int,input().split())
X = []
for _ in range(N):
    X.append(input())
Z = []
for i in range(M-7):
    for j in range(N-7):
        cnta = cntb = 0
        for k in range(i, i+8):
            for l in range(j, j+8):
                if X[l][k] != A[l-j][k-i]:
                    cnta += 1
                if X[l][k] != B[l-j][k-i]:
                    cntb += 1
        Z.append(min(cnta, cntb))
print(min(Z))