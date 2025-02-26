def solution(name, yearning, photo):
    answer = []
    for l in photo:
        s = 0
        for n in l:
            if n in name:
                s += yearning[name.index(n)] 
        answer.append(s)        
    return answer