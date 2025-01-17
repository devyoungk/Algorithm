a, b = map(int,input().split())
x = []
while a > 0:
    if a%b >= 10:
        z = a%b + 55
        x.append(chr(z))
    else: x.append(a%b)
    a //= b

for i in range(len(x)-1,-1,-1):
    print(x[i], end="")