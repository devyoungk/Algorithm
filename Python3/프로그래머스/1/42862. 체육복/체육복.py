def solution(n, lost, reserve):
    reserve = sorted(reserve)
    lost = sorted(lost)
    answer = n - len(lost)
    for x in lost[:]:
        if x in reserve:
            lost.remove(x)
            reserve.remove(x)
            answer += 1 
    for x in lost[:]:
        if x-1 in reserve:
            reserve.remove(x-1)
            answer += 1
        elif x+1 in reserve:
            reserve.remove(x+1)
            answer += 1       
    return answer