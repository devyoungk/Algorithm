def check(A):
    C = []
    for a in A:
        if not C:
            C.append(a)
        elif (C[-1], a) in (('(', ')'), ('[',']'),('{', '}')):
            C.pop()
        else:
            C.append(a)
    return False if C else True
    
def solution(s):
    answer = 0
    for _ in range(len(s)):
        if check(s):
            answer += 1
        s = s[1:] + s[0]
        
    return answer