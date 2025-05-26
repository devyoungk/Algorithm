def solution(park, routes):
    B = False
    for i in range(len(park)):
        for j in range(len(park[0])):
            if park[i][j] == 'S':
                B = True
                break
        if B:
            break
                
    for r in routes:
        w, l = r.split()
        F = True
        if w == 'E':
            for x in range(1, int(l)+1):
                if j + x == len(park[0]) or park[i][j+x] == 'X':
                    F = False
                    break
            if F:
                j += x
        elif w == 'W':
            for x in range(1, int(l)+1):
                if j - x == -1 or park[i][j-x] == 'X':
                    F = False
                    break
            if F:
                j -= x
        elif w == 'N':
            for x in range(1, int(l)+1):
                if i - x == -1 or park[i-x][j] == 'X':
                    F = False
                    break
            if F:
                i -= x
        else:
            for x in range(1, int(l)+1):
                if i + x == len(park) or park[i+x][j] == 'X':
                    F = False
                    break
            if F:
                i += x
    return [i, j]