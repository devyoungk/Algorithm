while True:
    n = int(input())
    if n == -1: 
        break
    A = []
    for i in range(2,n):
        if n%i == 0:
            A.append(i)
    if sum(A)+1 == n:
        B = str(n) + ' = 1'
        for a in A:
            B += ' + ' + str(a)
    else:
        B = str(n) + ' is NOT perfect.'
    print(B)