def solution(s):
    answer = 0
    a = 1
    b = 0
    i = 1
    while i < len(s):
        if s[i] == s[0]:
            a += 1
        else:
            b += 1
        if a == b:
            s = s[i+1:]
            answer += 1
            a = 1
            b = 0
            i = 1         
        else :
            i += 1
    if i == len(s):
        answer += 1
    return answer