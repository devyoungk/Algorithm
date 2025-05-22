def solution(msg):
    dic = {chr(65+i):1+i for i in range(26)}
    n = 27
    A = []
    while msg:
        x = msg
        for i in range(len(msg),-1,-1):
            if x[:i] in dic:
                msg = x[i:]
                A.append(dic[x[:i]])
                if msg:
                    dic[x[:i+1]] = n
                    n += 1
                break
    return A