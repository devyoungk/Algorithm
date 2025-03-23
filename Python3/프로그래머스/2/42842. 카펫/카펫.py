def solution(brown, yellow):
    answer = []
    n = brown + yellow
    for i in range(1, int(n**0.5)+1):
        if n%i == 0:
            if i + n//i == brown//2 + 2:
                return n//i, i

