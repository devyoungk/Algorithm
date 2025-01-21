def solution(code):
    answer = ''
    mode = -1
    for i in range(len(code)):
        if code[i] == '1':
            mode *= -1
        else:
            if (mode < 0 and i%2 == 0) or (mode > 0 and i%2 == 1):
                answer += code[i]
    return answer if not answer == '' else 'EMPTY'