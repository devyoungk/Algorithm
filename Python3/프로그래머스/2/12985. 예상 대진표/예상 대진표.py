def solution(n,a,b):
    answer = 1
    i = 2
    while True:
        if (a-1)//i == (b-1)//i:
            break
        i *= 2
        answer += 1

    return answer