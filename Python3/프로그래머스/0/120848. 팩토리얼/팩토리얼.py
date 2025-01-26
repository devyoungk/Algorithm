def solution(n):
    i = 1
    x = 1
    while True:
        x *= i
        if x > n:
            return i-1
        i += 1