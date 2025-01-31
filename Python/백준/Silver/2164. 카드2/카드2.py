from collections import deque

n = int(input())
A = deque(i+1 for i in range(n))
while len(A) > 1:
    A.popleft()
    A.append(A[0])
    A.popleft()

print(A[0])