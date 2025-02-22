def solution(s):
    a = s.split(' ')
    answer = ''
    for x in a:
        for i in range(len(x)):
            if i%2 == 0:
                answer += x[i].upper()
            else:
                answer += x[i].lower()
        answer += ' '
    return answer[:-1]