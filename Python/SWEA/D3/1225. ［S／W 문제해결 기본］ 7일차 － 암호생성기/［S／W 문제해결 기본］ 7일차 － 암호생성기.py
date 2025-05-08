for _ in range(1, 11):
    T = int(input())
    print(f'#{T} ', end='')
    A = list(map(int,input().split()))
    i = 0
    while A[-1] > 0:
        x = A[0]-1-i%5
        if x < 0:
            x = 0
        A = A[1:]+[x]
        i += 1
    print(' '.join(map(str,A)))