def solution(n, left, right):
    answer = []
    for i in range(left//n, right//n+1):
        for j in range(n):
            if i == left//n:
                if j < left%n:
                    continue
            x = max(i,j) + 1
            answer.append(x)
            if i == right//n and j == right%n:
                break
            
    
    return answer