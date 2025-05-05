for t in range(1,11):
    A = [0 for _ in range(100)]
    N = int(input())
    X = list(map(int, input().split()))
    for x in X:
        A[x-1] += 1
    i = 0
    j = 99
    while A[i] == 0:
        i += 1
    while A[j] == 0:
        j -= 1
    for _ in range(N):
        A[i] -= 1
        A[i+1] += 1
        A[j] -= 1
        A[j-1] += 1
        if A[i] == 0:
            i += 1
        if A[j] == 0:
            j -= 1
    print(f'#{t} {j-i}')