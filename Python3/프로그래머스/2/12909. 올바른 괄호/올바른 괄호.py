def solution(s):
    a = 0

    for x in s:
        if x == '(':
            a += 1
        else:
            a -= 1
        if a < 0:
            return False

    return True if a == 0 else False