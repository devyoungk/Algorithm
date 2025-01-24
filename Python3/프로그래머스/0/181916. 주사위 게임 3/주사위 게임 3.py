def solution(a, b, c, d):
    D = [a, b, c, d]
    [a, b, c, d] = sorted(D)
    S = set(D)
    answer = 0
    if len(S) == 1:
        answer = 1111* a
    elif len(S) == 2:
        if b != c:
            answer = (c-b)*(b+c)
        elif a == b:
            answer = (10*a+d)**2
        else:
            answer = (10*b+a)**2
    elif len(S) ==  3:
        if a == b:
            answer = c*d
        elif b == c:
            answer = a*d
        else:
            answer = a*b
    else:
        answer = a
            
        
    return answer