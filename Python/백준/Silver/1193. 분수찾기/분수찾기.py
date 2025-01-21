n = int(input())
i = 0
while True:
    i += 1
    if n-i <= 0:
        break
    n -= i
if i%2 == 0:
    print(f'{n}/{i-n+1}')
else:
    print(f'{i-n+1}/{n}')