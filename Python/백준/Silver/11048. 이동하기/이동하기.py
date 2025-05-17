N, M = map(int,input().split())
A = []
for _ in range(N):
    A.append(list(map(int,input().split())))
for i in range(N):
    for j in range(M):
        if i == 0 and j == 0:
            continue
        elif i == 0:
            A[i][j] += A[i][j-1]
        elif j == 0:
            A[i][j] += A[i-1][j]
        else:
            A[i][j] += max(A[i][j-1], A[i-1][j])
print(A[-1][-1])