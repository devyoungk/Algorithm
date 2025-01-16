def solution(X, Y):
    answer =''
    for i in range(9,-1,-1):
        k = str(i)
        a, b = X.count(k), Y.count(k)
        answer += k*min(a,b)
    if answer == '':
        return '-1'
    if answer[0] == '0':
        return '0'
    return answer
        
        