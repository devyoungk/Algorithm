N, M = map(int,input().split())
X = [None] * N
for i in range(0, N):
    X[i] = i+1
for _ in range(M):
    a, b = map(int,input().split())
    temp = X[a-1:b]
    temp.reverse()
    X[a-1:b] = temp

print(*X)