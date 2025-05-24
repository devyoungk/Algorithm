T = int(input())
for t in range(1, T+1):
    cnt = 0
    N = int(input())
    A = list(map(int,input().split()))
    M = max(A)
    A = [M-a for a in A]
    n1, n2 = 0, 0
    for a in A:
        n2 += a//2
        n1 += a%2
    while n2 - n1 > 1:
        if n1 > n2:
            n1 -= 2
            n2 += 1
        else:
            n1 += 2
            n2 -= 1
    if n1 > n2:
        cnt += (2*n1-1)
    else:
        cnt += 2*n2
    print(f'#{t} {cnt}')