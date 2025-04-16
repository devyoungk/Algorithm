def check(A):
    C = []
    for i in range(len(A)):
        if not C:
            C.append(A[i])
        elif C[-1] == '(' and A[i] == ')':
            C.pop()
        elif C[-1] == '[' and A[i] == ']':
            C.pop()
        elif C[-1] == '{' and A[i] == '}':
            C.pop()
        else:
            C.append(A[i])
    return False if C else True
    
def solution(s):
    answer = 0
    for _ in range(len(s)):
        if check(s):
            answer += 1
        s = s[1:] + s[0]
        
    return answer