n = int(input())
if n == 1:
    print(0)
else :
    x = []
    y = []
    for _ in range(n):
        a, b = map(int,input().split())
        x.append(a)
        y.append(b)
    l = max(x) - min(x)
    h = max(y) - min(y)
    print(l*h)