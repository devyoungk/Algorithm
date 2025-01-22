def solution(n, control):
    for s in control:
        if s == 'w':
            n += 1
        elif s == 's':
            n -= 1
        elif s == 'd':
            n += 10
        elif s == 'a':
            n -= 10
    return n