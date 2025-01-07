n, m = map(int,input().split())

X = [None] * n
for i in range(n):
    X[i] = i+1
    
for _ in range(m):
    a, b = map(int,input().split())
    X[a-1], X[b-1] = X[b-1], X[a-1]

for i in range(n):
    print(X[i], end=" ")