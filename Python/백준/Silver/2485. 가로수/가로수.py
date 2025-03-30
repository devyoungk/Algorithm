import math
import sys

input = sys.stdin.readline

N = int(input())
A = []
for _ in range(N):
    A.append(int(input()))
B = set()
for i in range(N-1,0,-1):
    B.add(A[i]-A[i-1])

B = list(B)
x = B[0]
for i in range(1, len(B)):
    x = math.gcd(x,B[i])

print((A[-1]-A[0])//x + 1 - N)