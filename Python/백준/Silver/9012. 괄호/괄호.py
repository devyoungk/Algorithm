n = int(input())
for i in range(n):
    S = input()
    A = []
    for s in S:
        if s == '(':
            A.append(s)
        else:
            if A and A[-1] == '(':
                A.pop()
            else:
                A.append(s)
                break
    if A:
        print('NO')
    else:
        print('YES')