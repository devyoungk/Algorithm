T = int(input())
for _ in range(T):
    n = int(input())
    A = [0 for _ in range(n+1)]
    if n == 0:
        print(1, 0)
        continue
    if n == 1:
        print(0, 1)
        continue
    A[1] = 1 
    for i in range(2, n+1):
        A[i] = A[i-1] + A[i-2]
    print(A[n-1], A[n])