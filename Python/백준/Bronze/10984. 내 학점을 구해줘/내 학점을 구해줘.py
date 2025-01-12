t = int(input())
for _ in range(t):
    n = int(input())
    x, y = 0, 0
    for _ in range(n):
        a, b = input().split()
        a, b = int(a), float(b)
        x += a
        y += a*b
    print(x, format(y/x, ".1f"))