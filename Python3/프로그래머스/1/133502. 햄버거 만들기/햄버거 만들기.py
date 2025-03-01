def solution(ingredient):
    answer = 0
    a = []
    for s in ingredient:
        a.append(s)
        if a[-4:] == [1,2,3,1]:
            answer += 1
            a.pop()
            a.pop()
            a.pop()
            a.pop()
    return answer