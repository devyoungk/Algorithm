a, b, c = map(int,input().split())
x = 1
a %= c
while b > 0:
    if b%2 ==1:
        x = (x*a)%c
    b //= 2
    a = (a*a)%c
print(x%c)