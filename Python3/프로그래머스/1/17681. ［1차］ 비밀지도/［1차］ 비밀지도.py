def solution(n, arr1, arr2):
    answer = []
    for i in range(n):
        a = arr1[i]
        b = arr2[i]
        X = bin(a|b)
        s = ''    
        s += ' ' * (n+2-len(X))
        for x in X[2:]:
            if x == '1':
                s += '#'
            else:
                s += ' '
        answer.append(s)
    return answer