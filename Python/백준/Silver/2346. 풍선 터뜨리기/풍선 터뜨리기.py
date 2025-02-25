from collections import deque

N = int(input())
A = deque(enumerate(map(int, input().split())))
B = dict()
for i in range(N):
    B[A[i]] = str(i+1)

answer = []

for _ in range(N):
    idx, x = A.popleft()
    answer.append(idx+1)
    if int(x) > 0:
        A.rotate(1-int(x))
    else:
        A.rotate(-int(x))
    
print(' '.join(map(str, answer)))