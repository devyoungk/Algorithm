import sys
sys.setrecursionlimit(10**6)

def solution(numbers, target):
    answer = 0
    A = []
    def sol(i):
        nonlocal answer
        if len(A) == len(numbers):
            if sum(A) == target:
                answer += 1
            return
        
        for j in [1,-1]:
            A.append(j*numbers[i])
            sol(i+1)
            A.pop()
    sol(0)
    return answer