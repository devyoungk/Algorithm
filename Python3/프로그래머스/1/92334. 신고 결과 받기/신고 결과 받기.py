def solution(id_list, report, k):
    answer = []
    A = {id: set() for id in id_list}
    B = {id: set() for id in id_list}
    for r in report:
        a, b = r.split()
        if a in A:
            A[a].add(b)
        if b in B:
            B[b].add(a)
    
    for q, w in B.items():
        if len(w) < k:
            for e, r in A.items():
                if q in r:
                    A[e].remove(q)

    for a in A.values():
        answer.append(len(a))
        
    return answer