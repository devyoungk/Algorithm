def solution(topping):
    answer = 0
    R = {}
    for t in topping:
        if t in R:
            R[t] += 1
        else:
            R[t] = 1

    L = {}
    for t in topping[::-1]:
        if t in L:
            L[t] += 1
        else:
            L[t] = 1
        
        R[t] -= 1
        if R[t] == 0:
            R.pop(t)
            
        if len(L) == len(R):
            answer += 1
    return answer