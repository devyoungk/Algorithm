import sys

n = int(sys.stdin.readline())
A = []
for i in range(n):
    age, name = sys.stdin.readline().split()
    A.append([int(age), i, name])
A.sort()
for i in range(n):
    print(A[i][0], A[i][2])