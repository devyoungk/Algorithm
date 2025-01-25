import sys
input = sys.stdin.readline

n = int(input())
A = [list(map(int,input().split())) for _ in range(n)]
A.sort()
for x, y in A:
    print(x, y)