def solution(s):
    answer = []
    s = s[2:len(s)-2]
    A = s.split('},{')
    A = sorted(A, key = lambda x:len(x))
    for x in A:
        X = x.split(',')
        for n in X:
            if int(n) not in answer:
                answer.append(int(n))
    return answer