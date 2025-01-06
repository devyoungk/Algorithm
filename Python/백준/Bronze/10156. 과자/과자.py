K, N, M = map(int,input().split())
A = K*N - M
if A < 0:
    A = 0
print(A)