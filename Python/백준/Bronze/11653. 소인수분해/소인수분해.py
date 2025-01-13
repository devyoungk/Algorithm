n = int(input())
i = 2
while n >= i:
    if n % i == 0:
        print(i)
        n //= i
    else:
        i += 1