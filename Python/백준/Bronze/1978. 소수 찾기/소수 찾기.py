def is_prime(a):
    if a == 1:
        return False
    for i in range(2, int(a**0.5)+1):
        if a%i == 0:
            return False
    return True
    
N = int(input())
A = list(map(int,input().split()))
count = 0
for i in range (N):
    if is_prime(A[i]):
        count += 1
print(count)