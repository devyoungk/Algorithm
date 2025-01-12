n = 0
max = 0
for _ in range(4):
    a, b = map(int,input().split())
    n += (b-a)
    if n > max:
        max = n
print(max)