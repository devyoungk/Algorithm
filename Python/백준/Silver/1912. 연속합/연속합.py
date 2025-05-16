N = int(input())
A = list(map(int,input().split()))

M = A[0]
S = A[0]

for a in A[1:]:
    S = max(a, S+a)
    M = max(M, S)

print(M)