N = int(input())
M = int(input())
A = [[] for _ in range(N+1)]

for _ in range(M):
    x, y = map(int,input().split())
    A[x].append(y)
    A[y].append(x)

Check = {1}
queue = [1]

while queue:
    i = queue.pop()
    for a in A[i]:
        if a not in Check:
            Check.add(a)
            queue.append(a)

print(len(Check)-1)