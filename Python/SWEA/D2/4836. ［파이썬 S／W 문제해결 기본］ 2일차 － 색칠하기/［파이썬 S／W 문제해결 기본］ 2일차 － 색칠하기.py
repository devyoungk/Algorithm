T = int(input())
for t in range(1, T+1):
    N = int(input())
    A = [[set() for _ in range(10)] for _ in range(10)]
    for _ in range(N):
        r1, c1, r2, c2, color = map(int,input().split())
        for i in range(r1, r2+1):
            for j in range(c1, c2+1):
                A[i][j].add(color)
    s = 0
    for a in A:
        s += a.count({1,2})
    print(f'#{t} {s}')