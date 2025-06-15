a = int(input())
b = int(input())
x = 1
i = 1
a %= 1000000007
while b > 0:
    if b%2 ==1:
        x = (x*a)%1000000007
    b //= 2
    a = (a*a) % 1000000007
print(x%1000000007)