n = int(input())
x = 100
y = 100
for _ in range(n):
    a, b = map(int,input().split())
    if a > b:
        y -= a
    elif a < b:
        x -= b
print(x)
print(y)