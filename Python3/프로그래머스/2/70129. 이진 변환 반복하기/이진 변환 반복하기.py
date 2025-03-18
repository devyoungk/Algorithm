def solution(s):
    a = b = 0
    while s != '1':
        a += 1
        b += s.count('0')
        s = s.replace('0','')
        l = len(s)
        s = bin(l)[2:]
    return a, b