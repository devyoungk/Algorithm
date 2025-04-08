N = int(input())
C = int(input())
A = []
B = [set() for _ in range(N)]
for _ in range(C):
    x, y = map(int,input().split())
    A.append([x,y])

B[0] = set([1])

i = 0
while i < N-1:
    for a in A:
        x = None
        if a[1] in B[i]:
            x = a[0] 
        elif a[0] in B[i]:
            x = a[1]
        if x:
            B[i+1].add(x)
    i += 1

C = set()
for b in B:
    for x in b:
        C.add(x)

print(len(C)-1)