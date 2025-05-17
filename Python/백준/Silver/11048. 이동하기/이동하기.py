N, M = map(int,input().split())
A = [list(map(int,input().split())) for _ in range(N)]

for i in range(1, N):
    A[i][0] += A[i-1][0]
for j in range(1, M):
    A[0][j] += A[0][j-1]
for i in range(1, N):
    for j in range(1, M):
        A[i][j] += max(A[i-1][j], A[i][j-1])
print(A[-1][-1])