while True:
    A = sorted(list(map(int,input().split())))
    if A[0] == A[1] == A[2] == 0:
        break
    elif A[0]**2 + A[1]**2 == A[2]**2:
        print('right')
    else :
        print('wrong')