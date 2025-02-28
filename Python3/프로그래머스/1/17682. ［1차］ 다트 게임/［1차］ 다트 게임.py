def solution(dartResult):
    answer = 0
    A = []
    B = []
    C = []
    i = 2
    while i < len(dartResult):
        if dartResult[i].isdigit():
            A.append(dartResult[:i])
            dartResult = dartResult[i:]
            i = 2
        else:
            i += 1
    A.append(dartResult)
    for a in A:
        for i in range(len(a)):
            if not a[i].isdigit():
                B.append([a[:i],a[i:]])
                break
    for i in range(len(B)):
        C.append(int(B[i][0]))
        for x in B[i][1]:
            if x == 'D':
                C[i] = C[i]**2
            elif x == 'T':
                C[i] = C[i]**3
            elif x == '*':
                C[i] *= 2
                if i > 0:
                    C[i-1] *= 2
            elif x == '#':
                C[i] *= -1
    
    return sum(C)