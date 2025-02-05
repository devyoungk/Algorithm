def solution(polynomial):
    A = polynomial.split('+')
    x = []
    n = []
    for a in A:
        b = a.strip()
        if b.endswith('x'):
            x.append(b)
        else:
            n.append(int(b))
    sumx = 0
    for i in x:
        if i == 'x':
            sumx += 1
        else:
            sumx += int(i[:len(i)-1])
    if sumx == 1:
        if n:
            answer = f'x + {sum(n)}'
        else:
            answer = 'x'
    elif sumx: 
        if n:
            answer = f'{sumx}x + {sum(n)}'
        else:
            answer = f'{sumx}x'
    else:
        answer = f'{sum(n)}'
    return answer