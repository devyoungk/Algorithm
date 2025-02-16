import sys
input = sys.stdin.readline

N, M = map(int,input().split())
X = list(map(int,input().split()))
A = {0: 0}
for i in range(N):
    A[i+1] = A[i]+X[i] 

for _ in range(M):
    a, b = map(int,input().split())
    print(A[b]-A[a-1])