def solution(myString):
    answer = []
    while 'x' in myString:
        n = myString.index('x')
        answer.append(n)
        myString = myString[n+1:]
    answer.append(len(myString))
    return answer