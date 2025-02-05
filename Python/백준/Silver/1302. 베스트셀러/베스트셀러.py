N = int(input())
X = {}
for _ in range(N):
    s = input()
    if s in X:
        X[s] += 1
    else:
        X[s] = 1
A = sorted(X.items(), key = lambda x:(-x[1], x[0]))
print(A[0][0])