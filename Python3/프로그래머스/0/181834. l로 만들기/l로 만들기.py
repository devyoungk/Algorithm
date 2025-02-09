def solution(myString):
    answer = ''
    for s in myString:
        if s<"l":
            answer += "l"
        else:
            answer += s
    return answer