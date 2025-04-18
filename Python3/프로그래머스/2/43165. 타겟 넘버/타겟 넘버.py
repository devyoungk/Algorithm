def solution(numbers, target):
    answer = 0
    A = []
    def sol(i):
        nonlocal answer
        if i == len(numbers):
            if sum(A) == target:
                answer += 1
            return
        
        for j in [1,-1]:
            A.append(j*numbers[i])
            sol(i+1)
            A.pop()
    sol(0)
    return answer