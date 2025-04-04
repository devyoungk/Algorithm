def solution(priorities, location):
    answer = 0
    i = 0
    m = max(priorities)
    while True:
        while priorities[i] != m:
            i += 1
            if i == len(priorities):
                i -= len(priorities)
        priorities[i] = 0
        answer += 1
        if i == location:
            return answer
        m = max(priorities)