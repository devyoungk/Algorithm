import sys
input = sys.stdin.readline

N = int(input())
A = list(map(int,input().split()))
M = int(input())
B = list(map(int,input().split()))

D = {}

for a in A:
    if a in D:
        D[a] += 1
    else:
        D[a] = 1

for b in B:
    if b in D:
        print(D[b], end = ' ')
    else:
        print(0, end = ' ')