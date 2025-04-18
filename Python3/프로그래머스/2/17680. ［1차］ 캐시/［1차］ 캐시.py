def solution(cacheSize, cities):
    answer = 0
    C = []
    for c in cities:
        c = c.lower()
        if c in C:
            answer += 1
            C.remove(c)
            C.append(c)
        else:
            answer += 5
            C.append(c)
            if len(C) > cacheSize:
                C.pop(0)
    return answer