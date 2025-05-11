N = int(input())
A = list(map(int,input().split()))
M = int(input())

l = 0
r = max(A)
m = (l+r)//2

while l <= r:
    S = 0
    for a in A:
        S += min(m, a)
    if S <= M:
        l = m+1
    else:
        r = m-1
    m = (l+r)//2

print(r)