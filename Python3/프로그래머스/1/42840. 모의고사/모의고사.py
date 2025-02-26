def s1(answers):
    A = [1, 2, 3, 4, 5]
    cnt = 0
    idx = 0
    for s in answers:
        if idx == 5:
            idx -= 5
        if s == A[idx]:
            cnt += 1
        idx += 1
    return cnt

def s2(answers):
    A = [2, 1, 2, 3, 2, 4, 2, 5]
    cnt = 0
    idx = 0
    for s in answers:
        if idx == 8:
            idx -= 8
        if s == A[idx]:
            cnt += 1
        idx += 1
    return cnt

def s3(answers):
    A = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    cnt = 0
    idx = 0
    for s in answers:
        if idx == 10:
            idx -= 10
        if s == A[idx]:
            cnt += 1
        idx += 1
    return cnt

def solution(answers):
    a = s1(answers)
    b = s2(answers)
    c = s3(answers)
    m = max(a, b, c)
    
    answer = []
    if a == m:
        answer.append(1)
    if b == m:
        answer.append(2)
    if c == m:
        answer.append(3)
    return answer