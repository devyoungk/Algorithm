while True:
    A = []
    S = input()
    if S == '0':
        break
    for s in S:
        A.append(s)
    if A == A[::-1]:
        print('yes')
    else:
        print('no')