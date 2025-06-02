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
targetH = 0

while targetH <= max(D):
    Block_now = B
    t = 0
    for d in D:
        hd = targetH - d
        if hd > 0:
            t += hd*D[d]
            Block_now -= hd*D[d]
        elif hd < 0:
            Block_now -= hd*D[d]
            t -= 2*hd*D[d]
    if Block_now >= 0:
        if t <= time:
            time = t
            height = targetH
    else:
        break
    targetH += 1

print(time, height)