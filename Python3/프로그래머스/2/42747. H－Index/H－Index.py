def solution(citations):
    A = sorted(citations, reverse = True)
    answer = 0
    for i in range(len(A)):
        if A[i] >= i+1:
            answer = i+1
        else:
            break
            
    return answer