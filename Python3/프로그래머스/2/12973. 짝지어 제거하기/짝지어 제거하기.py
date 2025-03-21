def solution(s):
    answer = -1
    A = []
    for x in s:
        if not A:
            A.append(x)
        elif x == A[-1]:
            A.pop()
        else:
            A.append(x)
    return 0 if A else 1