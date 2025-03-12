def gcd(x, y):
    while y > 0:
        x, y = y, x%y
    return x

a, b = map(int, input().split())
c, d = map(int, input().split())

x = a*d + b*c
y = b*d

z = gcd(x,y)

print(x//z, y//z)