def coordinate(n):
    if n == 0:
        return [1, 3]
    elif n == '*':
        return [0, 3]
    elif n == '#':
        return [2, 3]
    return [(n-1)%3, (n-1)//3]

def solution(numbers, hand):
    L = '*'
    R = '#'
    answer = ''
    for n in numbers:
        if n in (1, 4, 7):
            L = n
            answer += 'L'
        elif n in (3, 6, 9):
            R = n
            answer += 'R'
        else:
            l = abs(coordinate(L)[0]-coordinate(n)[0])+abs(coordinate(L)[1]-coordinate(n)[1])
            r = abs(coordinate(R)[0]-coordinate(n)[0])+abs(coordinate(R)[1]-coordinate(n)[1])
            if l == r:
                if hand == 'right':
                    answer += 'R' 
                    R = n
                else:
                    answer += 'L'
                    L = n
            else:
                if r < l:
                    answer += 'R' 
                    R = n
                else:
                    answer += 'L'
                    L = n     
    return answer