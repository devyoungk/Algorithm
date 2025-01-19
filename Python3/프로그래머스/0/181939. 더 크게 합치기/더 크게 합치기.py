def solution(a, b):
    s1 = str(a)+str(b)
    s2 = str(b)+str(a)
    answer = int(s1) if int(s1) > int(s2) else int(s2)
    return answer