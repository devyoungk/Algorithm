import sys
input = sys.stdin.readline

n = int(input())
A = set()
for i in range(n):
    s = input().strip()
    A.add(s)
B = sorted(A, key=lambda x: (len(x), x))
for x in B:
    print(x)