n = int(input())
for i in range(n):
    S = input()
    A = []
    flag = True
    for s in S:
        if s == '(':
            A.append(s)
        else:
            if A and A[-1] == '(':
                A.pop()
            else:
                flag = False
                break
    if flag and not A:
        print('YES')
    else:
        print('NO')