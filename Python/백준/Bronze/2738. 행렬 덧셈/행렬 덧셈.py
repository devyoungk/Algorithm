N, M = map(int,input().split())
A = []
B = []
for _ in range(N):
    a = list(map(int, input().split()))
    A.append(a)
for _ in range(N):
    b = list(map(int, input().split()))
    B.append(b)

for i in range(N):
    for j in range(M):
        print(A[i][j]+B[i][j], end=" ")
    print()
