def gcd(x, y):
    if y == 0:
        return x
    return gcd(y, x%y)

a, b = map(int, input().split())
c, d = map(int, input().split())

x = a*d + b*c
y = b*d

z = gcd(x,y)

print(f'{x//z} {y//z}')