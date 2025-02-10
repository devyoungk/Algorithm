N, M = map(int,input().split())
A = {}
for _ in range(N):
    s, p = input().split()
    A[s] = p

for _ in range(M):
    x = input()
    print(A[x])