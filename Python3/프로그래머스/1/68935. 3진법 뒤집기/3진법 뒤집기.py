def solution(n):
    answer = 0
    while n > 0:
        answer *= 10
        answer += n%3
        n //= 3
    return int(str(answer),3)