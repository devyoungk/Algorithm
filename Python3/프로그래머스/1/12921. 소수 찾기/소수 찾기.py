def solution(n):
    answer = 0
    A = True
    for i in range(2, n+1):
        A = True
        for j in range(2,int(i**0.5)+1):
            if i%j == 0:
                A = False
                break
        if A:
            answer += 1
    return answer