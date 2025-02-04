import sys
input = sys.stdin.readline

N, M = map(int,input().split())
A = {}
for i in range(N):
    s = input().strip()
    A[s] = i+1
B = {v: k for k, v in A.items()}
for _ in range(M):
    s = input().strip()
    if s.isdigit():
        print(B[int(s)])     
    else:
        print(A[s])