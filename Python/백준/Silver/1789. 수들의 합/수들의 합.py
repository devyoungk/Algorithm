S = int(input())
x = 0
i = 1
while True:
    if x + i > S:
        break
    x += i
    i += 1
print(i-1)