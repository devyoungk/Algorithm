def solution(today, terms, privacies):
    answer = []
    Today = list(map(int, today.split('.')))
    for i in range(len(privacies)):
        d, t = privacies[i].split()
        D = list(map(int, d.split('.')))
        for x in terms:
            q, w = x.split()
            if t == q:
                D[1] += int(w)
                D[2] -= 1
            while D[1] > 12:
                D[1] -= 12
                D[0] += 1
            if D[2] == 0:
                D[2] = 28
                D[1] -= 1
        
        if Today > D:
            answer.append(i+1)
            
    return answer