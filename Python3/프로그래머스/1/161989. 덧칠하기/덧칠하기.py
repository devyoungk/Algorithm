def solution(n, m, section):
    answer = 0
    while section:
        x = section[0]
        answer += 1
        while section and section[0] < x+m:
            section.pop(0)
    return answer