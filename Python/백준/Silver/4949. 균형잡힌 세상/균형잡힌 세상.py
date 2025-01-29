while True:
    S = input()
    A = []
    TF = True
    if S == '.':
        break
    for s in S:
        if s in ['(','[']:
            A.append(s)
        elif s == ')':
            if A and A[-1] == '(':
                A.pop()
            else:
                TF = False
                break
        elif s == ']':
            if A and A[-1] == '[':
                A.pop()
            else:
                TF = False
                break
    if TF and not A:
        print('yes')
    else:
        print('no')