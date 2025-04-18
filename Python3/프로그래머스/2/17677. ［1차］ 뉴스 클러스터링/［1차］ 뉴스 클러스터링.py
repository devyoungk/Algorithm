def solution(str1, str2):
    str1 = str1.lower()
    str2 = str2.lower()
    answer = 0
    A = []
    B = []
    I = []
    S = []

    for i in range(len(str1)-1):
        s = str1[i:i+2]
        if s.isalpha():
            A.append(str1[i:i+2])
            
    for i in range(len(str2)-1):
        s = str2[i:i+2]
        if s.isalpha():
            B.append(str2[i:i+2])
            
    for a in set(A):
        if a in B:
            n = min(A.count(a),B.count(a))
            for _ in range(n):
                I.append(a)
                
    for a in set(A):
        if a in B:
            n = max(A.count(a),B.count(a))
            for _ in range(n):
                S.append(a)
        else:
            for _ in range(A.count(a)):
                S.append(a)        
    for b in B:
        if b not in A:
            S.append(b)

    if len(S) == 0:
        answer = 65536
    else:
        answer = int(65536*len(I)/len(S))
    return answer