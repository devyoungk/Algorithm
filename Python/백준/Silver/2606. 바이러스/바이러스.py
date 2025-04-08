N = int(input())
M = int(input())
A = []

for _ in range(M):
    x, y = map(int,input().split())
    A.append([x,y])

B = [{1}]
Check = {1}

for i in range(N):
    C = set()
    for x, y in A:
        if x in B[-1] and y not in Check:
            C.add(y)
        elif y in B[-1] and x not in Check:
            C.add(x)
    B.append(C)
    Check.update(C)

print(len(Check)-1)