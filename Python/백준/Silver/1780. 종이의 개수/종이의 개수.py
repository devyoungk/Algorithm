def divide(A):
    N = len(A)
    B = []
    for i in range(0, N, N//3):
        for j in range(0, N, N//3):
            X = []
            for k in range(0, N//3):
                X.append(A[i+k][j:j+N//3])
            B.append(X)
    return B

def cnt(A):
    N = len(A)
    a, b, c = 0, 0, 0
    for i in range(N):
        for j in range(N):
            if A[i][j] == -1:
                a += 1
            elif A[i][j] == 0:
                b += 1
            else:
                c += 1
            if a*b or b*c or c*a:
                return -1
    if a:
        return '-1'
    elif b:
        return '0'
    else:
        return '1'

x, y, z = 0, 0, 0    

def sol(A):
    global x, y, z
    if cnt(A) == '-1':
        x += 1
    elif cnt(A) == '0':
        y += 1
    elif cnt(A) == '1':
        z += 1
    else:
        A = divide(A)
        for a in A:
            sol(a)

N = int(input())
A = [list(map(int,input().split())) for _ in range(N)]

sol(A)
print(x)
print(y)
print(z)