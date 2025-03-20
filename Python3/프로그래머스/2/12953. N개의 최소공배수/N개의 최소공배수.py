def solution(arr):
    arr.sort()
    answer = arr[-1]
    i = 2
    while True:
        for a in arr:
            if answer%a != 0:
                answer = arr[-1] * i
                i += 1
                break
        else:
            break
    return answer