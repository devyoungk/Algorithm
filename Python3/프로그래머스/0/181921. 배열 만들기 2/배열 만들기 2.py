def solution(l, r):
    answer = []
    for n in range(l, r + 1):
        if not set(str(n)) - set(['0', '5']):
            answer.append(n)
    return answer if answer else [-1]