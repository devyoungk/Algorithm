def solution(myString):
    answer = []
    A = sorted(myString.split('x'))
    for a in A:
        if len(a):
            answer.append(a)
    return answer