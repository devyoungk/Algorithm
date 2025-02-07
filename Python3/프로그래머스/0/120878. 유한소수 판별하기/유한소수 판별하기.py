def solution(a, b):
    answer = 0
    i = 2
    while i <= a:
        if a%i == 0 and b%i == 0:
            a //= i
            b //= i
        else: i += 1
    
    while b != 1:
        if b%2 == 0:
            b //= 2
        elif b%5 == 0:
            b //= 5
        else: 
            return 2
    return 1