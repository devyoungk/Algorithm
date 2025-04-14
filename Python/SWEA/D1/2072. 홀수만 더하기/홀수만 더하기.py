T = int(input())

for test_case in range(1, T + 1):
    A = list(map(int,input().split()))
    S = 0
    for a in A:
        if a%2 == 1:
            S += a
    print(f'#{test_case} {S}')