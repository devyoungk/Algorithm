def solution(n):
    answer = ''
    s = ''
    while n:
        s = str((n-1)%3+1) + s
        n = (n-1)//3
    return s.replace('3','4')