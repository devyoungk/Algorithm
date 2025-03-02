def solution(keymap, targets):
    answer = []
    for t in targets:
        B = []
        for s in t:
            A = []
            for k in keymap:
                if s in k:
                    A.append(k.index(s)+1)
            if not A:
                B.append(-1)
            else:    
                B.append(min(A))
                
        if -1 in B:
            answer.append(-1)
        else:
            answer.append(sum(B))
    return answer