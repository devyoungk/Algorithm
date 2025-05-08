N = int(input())
A = []
for _ in range(N):
    S = input()
    l = len(S)
    h = 0
    for s in S:
        if s.isdigit():
            h += int(s)
    A.append([l,h,S])

A.sort(key = lambda x: (x[0], x[1], x[2]))
for a in A:
    print(a[-1])