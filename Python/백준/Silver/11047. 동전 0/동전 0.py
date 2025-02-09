N, K = map(int,input().split())
A = [int(input()) for _ in range(N)]
cnt = 0
for m in A[::-1]:
    cnt += K//m
    K %= m
print(cnt)