a, b = map(int,input().split())
N = [0] * a
for _ in range(b) :
    x, y, z = map(int,input().split())
    for i in range(x, y+1):
        N[i-1] = z

print(*N)