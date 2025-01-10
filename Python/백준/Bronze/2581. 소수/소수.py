def is_prime(a):
    if a == 1:
        return False
    for i in range(2, int(a**0.5)+1):
        if a%i == 0:
            return False
    return True

m = int(input())
n = int(input())

sum = 0
for i in range (m, n+1):
    if is_prime(i):
        if sum == 0:
            min = i
        sum += i

if sum == 0:
    print(-1)
else:
    print(sum)
    print(min)