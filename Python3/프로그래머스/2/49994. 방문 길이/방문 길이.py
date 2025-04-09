def solution(dirs):
    A = set()
    x, y = 0, 0
    for m in dirs:
        move = [(x,y)]
        if m == 'U' and y != 5:
            y += 1
        elif m == 'D' and y != -5:
            y -= 1
        elif m == 'L' and x != -5:
            x -= 1
        elif m == 'R' and x != 5:
            x += 1
        else:
            continue
        move.append((x,y))
        A.add(tuple(sorted(move)))
    print(A)
    return len(A)