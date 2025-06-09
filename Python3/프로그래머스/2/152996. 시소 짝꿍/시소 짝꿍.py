def solution(weights):
    D = dict()
    for w in weights:
        if w in D:
            D[w] += 1
        else:
            D[w] = 1
    answer = 0
    for d in D:
        answer += (D[d]*(D[d]-1))//2
        answer += D[d]*D[d*2] if d*2 in D else 0
        answer += D[d]*D[d*1.5] if d*1.5 in D else 0
        answer += D[d]*D[d*4/3] if d*4/3 in D else 0
    return answer