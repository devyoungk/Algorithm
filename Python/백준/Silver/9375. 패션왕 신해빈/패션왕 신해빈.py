T = int(input())
for _ in range(T):
    n = int(input())
    A = dict()
    for _ in range(n):
        a, b = input().split()
        if b not in A:
            A[b] = 1
        else:
            A[b] += 1
    if len(A) == 1:
        print(A[b])
    else:
        a = 1
        for i in A.values():
            a *= (i+1)
        print(a-1)