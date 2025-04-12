def check(A):
    n = len(A)
    b = 0
    w = 0
    for i in range(n):
        b += A[i].count('1')
        w += A[i].count('0')
        if w > 0 and b > 0:
            return 0
    if w == 0:
        return 'blue'
    elif b == 0:
        return 'white'

def split(A):
    n = len(A)
    mid = n//2
    A1 = [a[:mid] for a in A[:mid]]
    A2 = [a[mid:] for a in A[:mid]]
    A3 = [a[:mid] for a in A[mid:]]
    A4 = [a[mid:] for a in A[mid:]]
    return [A1, A2, A3, A4]

def sol(A):
    global blue, white
    result = check(A)
    if result == 'blue':
        blue += 1
    elif result == 'white':
        white += 1
    else:
        for a in split(A):
            sol(a)

N = int(input())
A = [list(input().split()) for _ in range(N)]

blue = 0
white = 0

sol(A)

print(white)
print(blue)