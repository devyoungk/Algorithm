while True:
    X = []
    a, b, c = map(int,input().split())
    if a == b == c == 0:
        break
    X.append(a)
    X.append(b)
    X.append(c)
    X = sorted(X)
    if X[2] >= X[1] + X[0]:
        print('Invalid')
    elif X[0] == X[2]:
        print('Equilateral')
    elif X[1] == X[0] or X[1] == X[2]:
        print('Isosceles')
    else :
        print('Scalene')