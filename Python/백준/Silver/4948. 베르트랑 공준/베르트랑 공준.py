A = [1 for _ in range(2*123456+1)]
A[0] = A[1] = 0

for i in range(2, len(A)):
    if A[i] == 0:
        continue
    else:
        for x in range(2*i, len(A), i):
            A[x] = 0

while True:
    N = int(input())
    if N == 0:
        break
    print(sum(A[N+1:2*N+1]))