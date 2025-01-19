def solution(a, b):
    s = int(str(a)+str(b))
    x = 2*a*b
    answer = s if s>x else x
    return answer