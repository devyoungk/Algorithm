T = int(input())
for i in range(1, T+1):
    print(f'#{i}', end = ' ')
    N = int(input())
    for x in (2, 3, 5, 7, 11):
        cnt = 0
        while N % x == 0:
            N //= x
            cnt += 1
        print(cnt, end = ' ')
    print()