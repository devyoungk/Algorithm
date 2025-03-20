def solution(n):
    a = bin(n).count('1')
    while True:
        n += 1
        x = bin(n).count('1')
        if x == a:
            break
    return n