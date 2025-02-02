def solution(quiz):
    answer = []
    for s in quiz:
        a, b = s.split('=')
        if eval(a) == int(b):
            answer.append('O')
        else:
            answer.append('X')
    return answer