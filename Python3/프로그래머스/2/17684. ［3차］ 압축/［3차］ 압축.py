def solution(msg):
    dic = {chr(65+i):1+i for i in range(26)}
    n = 27
    A = []
    while msg:
        x = msg
        for i in range(len(msg)):
            if x[:len(msg)-i] in dic:
                A.append(dic[x[:len(msg)-i]])
                dic[x[:len(msg)-i+1]] = n
                n += 1
                msg = x[len(msg)-i:]
                break
    return A