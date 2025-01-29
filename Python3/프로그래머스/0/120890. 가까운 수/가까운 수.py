def solution(array, n):
    answer = 0
    min = 100
    a = sorted(array, reverse=True)
    for x in a:
        if abs(int(x)-n) <= min:
            min = abs(int(x)-n)
            answer = x
    return answer