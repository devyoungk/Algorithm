def solution(order):
    s = str(order)
    answer = s.count('3')+s.count('6')+s.count('9')
    return answer