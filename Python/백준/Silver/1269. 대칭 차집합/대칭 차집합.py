N, M = map(int,input().split())
A = set(input().split())
B = set(input().split())

cnt = 0
for a in A:
    if a in B:
        cnt += 1
print(N+M-2*cnt)