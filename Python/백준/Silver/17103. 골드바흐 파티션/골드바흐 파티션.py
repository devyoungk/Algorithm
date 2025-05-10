A = [1 for _ in range(1000001)]
A[0] = A[1] = 0

for i in range(2, len(A)):
    if A[i]:
        for x in range(2*i, len(A), i):
            A[x] = 0

T = int(input())
for _ in range(T):
    N = int(input())
    cnt = 0
    for i in range(2, N//2+1):
        if A[i] and A[N-i]:
            cnt += 1
    print(cnt)