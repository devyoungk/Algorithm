def solution(participant, completion):
    B = dict()
    for c in completion:
        if c in B:
            B[c] += 1
        else:
            B[c] = 1
            
    A = dict()
    for p in participant:
        if p not in B:
            return p
        
        if p in A:
            A[p] += 1
        else:
            A[p] = 1
    
    for x in B.keys():
        if A[x] > B[x]:
            return x