import sys
input = sys.stdin.readline

n = int(input())
C = {}
for i in range(n):
    a, b = input().split()
    C[a] = b
    if b == "leave":
        del C[a]

D = sorted(C.items(), reverse=True)
A = dict(D)
for a in A.keys():
    print(a)