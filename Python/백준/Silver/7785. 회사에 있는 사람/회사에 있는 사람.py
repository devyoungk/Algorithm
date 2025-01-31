import sys
input = sys.stdin.readline

n = int(input())
C = set()
for i in range(n):
    a, b = input().split()
    if not a in C:
        C.add(a)
    else:
        C.remove(a)
A = sorted(C, reverse=True)
for name in A:
    print(name)