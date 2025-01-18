import sys

n = int(sys.stdin.readline())
A = [0] * 10001
for _ in range(n):
    x = int(sys.stdin.readline())
    A[x] += 1

for i in range(1, 10001):
    if A[i] > 0:
        for _ in range(A[i]):
            print(i)