def isprime(n):
    if n < 2:
        return False
    for i in range(2,int(n**0.5)+1):
        if n%i == 0:
            return False
    return True

N = int(input())

for _ in range(N):
    n = int(input())
    while True:
        if isprime(n):
            print(n)
            break
        n += 1