import sys
input = sys.stdin.readline

n = int(input())
if n == 0:
    print(0)
else:
    A = []
    for _ in range(n):
        A.append(int(input()))
    A.sort()
    x = int(0.15*n + 0.5)
    B = A[x:n-x]
    print(int((sum(B)/len(B))+0.5))