import sys
input = sys.stdin.readline

N, M = map(int,input().split())
H = list(map(int,input().split()))
r = max(H)
l = 0
while l <= r:
    m = (l+r)//2
    x = sum((h - m) if h - m > 0 else 0 for h in H)
    if x >= M:
        l = m+1
    else:
        r = m-1
print(r)