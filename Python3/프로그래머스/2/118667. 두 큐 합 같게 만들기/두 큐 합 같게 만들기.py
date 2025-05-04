def solution(queue1, queue2):
    answer = 0
    t = (sum(queue1)+sum(queue2))//2
    s = sum(queue1)
    x = len(queue1)
    queue1 = queue1 + [0 for _ in range(len(queue2))]
    i, j = 0, 0
    while s != t:
        if i == len(queue1) or j == len(queue2):
            answer = -1
            break
        if s > t:
            s -= queue1[i]
            i += 1
        else:
            s += queue2[j]
            queue1[x] = queue2[j]
            j += 1
            x += 1
        answer += 1
        
    return answer