def solution(myString):
    answer = []
    A = sorted(myString.split('x'))
    return [a for a in A if len(a) != 0]