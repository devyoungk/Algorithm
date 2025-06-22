N, S, M = map(int,input().split())
V = list(map(int,input().split()))

now = [S]
for i in range(N):
    next = set()
    for n in now:
        if n+V[i] <= M:
            next.add(n+V[i])
        if n-V[i] >= 0:
            next.add(n-V[i])
    if not next:
        break
    now = next

print(max(next)) if next else print(-1)