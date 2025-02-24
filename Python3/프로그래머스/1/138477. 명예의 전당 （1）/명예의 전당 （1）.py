def solution(k, score):
    top = []
    answer = []
    for s in score:
        top.append(s)
        top.sort()
        if len(top) <= k:
            answer.append(min(top))
        else:
            answer.append(top[-k])
    return answer