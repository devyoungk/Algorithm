import sys
input = sys.stdin.readline

N, M = map(int,input().split())
A = dict()
for _ in range(N):
    s = input().strip()
    if len(s) >= M:
        if s not in A:
            A[s] = 1
        else:
            A[s] += 1
B = sorted(A.items(), key = lambda x:(-x[1],-len(x[0]),x[0]))
for b in B:
    print(b[0])