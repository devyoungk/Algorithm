def solution(numLog):
    answer = ''
    for i in range(1,len(numLog)):
        k = numLog[i]-numLog[i-1]
        if k == 1:
            answer += 'w'
        elif k == -1:
            answer += 's'
        elif k == 10:
            answer += 'd'
        else:
            answer += 'a'
    return answer