import sys
input = sys.stdin.readline

n = int(input())
A = list(map(int,input().split()))
B = set(A)
x = int(input())

cnt = 0

for s in B:
    if x-s in B:
        cnt += 1

print(cnt//2)