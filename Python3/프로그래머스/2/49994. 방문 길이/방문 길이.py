def solution(dirs):
    A = set()
    x, y = 0, 0
    for m in dirs:
        move = [(x,y)]
        if m == 'U':
            y += 1
        elif m == 'D':
            y -= 1
        elif m == 'L':
            x -= 1
        elif m == 'R':
            x += 1
        if x == -6:
            x = -5
        elif x == 6:
            x = 5
        elif y == -6:
            y = -5
        elif y == 6:
            y = 5
        else:
            move.append((x,y))
            A.add(tuple(move))
            A.add(tuple(move[::-1]))
    return len(A)//2