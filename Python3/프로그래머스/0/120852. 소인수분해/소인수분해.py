def solution(n):
    answer = []
    i = 2
    while i <= n:
        if n%i == 0:
            n //= i
            if i not in answer:
                answer.append(i)
        else:
            i += 1     
    return answer