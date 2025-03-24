import sys
input = sys.stdin.readline

N, M = map(int,input().split())
A = set()
for _ in range(N):
    A.add(input())

cnt = 0
for _ in range(M):
    s = input()
    if s in A:
        cnt += 1
print(cnt)