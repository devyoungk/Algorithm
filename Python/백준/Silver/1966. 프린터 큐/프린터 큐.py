T = int(input())
for _ in range(T):
    N, M = map(int,input().split())
    A = list(map(int,input().split()))
    cnt = 0
    while True:
        if A[0] != max(A):
            A.append(A[0])
            A.pop(0)
        else:
            A.pop(0)
            cnt += 1
            if M == 0:
                break
        M -= 1
        if M < 0:
            M += len(A)
    print(cnt)