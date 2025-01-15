T = int(input())
for _ in range(T):
    A = []
    B = []
    N = int(input())
    for _ in range(N):
        a, b = input().split()
        A.append(a)
        B.append(int(b))
    print(A[B.index(max(B))])