T = int(input())
for i in range(1, T+1):
    N = int(input())
    A = set()
    cnt = 0
    while len(A) < 10:
        cnt += 1
        X = cnt * N
        while X > 0:
            A.add(X % 10)
            X //= 10
    print(f'#{i} {cnt*N}')