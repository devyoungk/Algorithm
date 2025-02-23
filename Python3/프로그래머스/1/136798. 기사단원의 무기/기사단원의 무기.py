def solution(number, limit, power):
    answer = 0
    for i in range(1, number+1):
        A = []
        for j in range(1, int(i**0.5)+1):
            if i%j == 0:
                A.append(j)
                A.append(i//j)         
        s = len(set(A))
        if s > limit:
            answer += power
        else:    
            answer += s
    return answer