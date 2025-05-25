def cnt(i, N):
    cnt = 0
    while N:
        N //= i
        cnt += N
    return cnt

n, m = map(int,input().split())

print(min(cnt(5,n)-cnt(5,n-m)-cnt(5,m),cnt(2,n)-cnt(2,n-m)-cnt(2,m)))