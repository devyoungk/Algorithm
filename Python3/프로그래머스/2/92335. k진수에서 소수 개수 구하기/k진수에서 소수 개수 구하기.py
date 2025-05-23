def isPrime(n):
    if n < 2:
        return False
    for i in range(2,int(n**0.5)+1):
        if n%i == 0:
            return False
    return True

def solution(n, k):
    answer = 0
    s = ''
    while n > 0:
        s = str(n%k) + s
        n //= k
    A = s.split('0')
    for a in A:
        if a:
            x = int(a)
            if isPrime(x):
                print(x)
                answer += 1
    return answer