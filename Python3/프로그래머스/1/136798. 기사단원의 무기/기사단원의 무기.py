def solution(number, limit, power):
    answer = 1
    for i in range(2, number+1):
        b = True
        s = 1
        for j in range(2, int(i**0.5)+1):
            if i%j == 0:
                s += 1
        s *= 2
        if int(i**0.5) == i**0.5:
            s -= 1
        if s > limit:
            answer += power
        else:    
            answer += s
    return answer