N, M, B = map(int,input().split())
D = dict()
for _ in range(N):
    A = list(map(int,input().split()))
    for a in A:
        if a in D:
            D[a] += 1
        else:
            D[a] = 1

s = 0
for d in D:
    s += D[d]*d

time = float('inf')
height = 0
targetH = min(D)

for targetH in range(min(D), max(D) + 1):
    Block_now = B
    t = 0
    for d in D:
        hd = targetH - d
        n = D[d]
        if hd > 0:
            t += hd*n
            Block_now -= hd*n
        elif hd < 0:
            Block_now -= hd*n
            t -= 2*hd*n
    if Block_now >= 0:
        if t <= time:
            time = t
            height = targetH
    else:
        break

print(time, height)